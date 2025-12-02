
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

 class Sort {
     public boolean flag=false;
     public  int size=10000000;
    public int[] a = new int[size];
     int[] b=new int[size];
    public int n=(int)1e5;//数据个数
    public int m=(int)1e5;//数据范围（0~m-1)
    public int num=0;//计数器
    public int sum=0;//交换次数


    //输出当前排序的进度
    public void display(){
        System.out.print(num+": ");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        num++;
    }


//用冒泡法降序排序----------1
    public void Bubsort(int n) {
        int  t;
        boolean k =true;
        for (int i = 0; i < n - 1; i++) {
            if(flag) display();
            for (int j = 1; j < n - i; j++) {
                if (a[j - 1] < a[j]) {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                    k = false;
                }
            }
            if (k) break;
        }
    }


//选择法降序排序------------2
    public void Choicesort(int n) {
        int t, k;
        for (int i = 0; i < n - 1; i++) {
            if(flag) display();
            k = i;
            for (int j = i + 1; j < n; j++)
                if (a[k] < a[j])
                    k = j;
            if(k!=i) {
                t = a[k];
                a[k] = a[i];
                a[i] = t;
            }
        }
    }


//插入法降序排序----------3
    public void intersort(int n){
        int k,t;
        for(int i=1;i<n;i++){
            if(flag) display();
            int j=i;
            k=a[i];
            while(j>0&&a[j]>a[j-1]) {
                a[j-1]=a[j];
                j--;
            }
            a[j]=k;

        }
    }

//快速排序降序-------4
    public  void quickSort(int low,int high){
        int i,j,temp,t;
        if(flag) display();
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = a[low];
        while (i<j) {
            while (temp<=a[j]&&i<j) {
                j--;
            }
            while (temp>=a[i]&&i<j) {
                i++;
            }
            if (i<j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        a[low] = a[i];
        a[i] = temp;
        quickSort( low, j-1);
        quickSort(j+1, high);
    }

//快速排序优化 生序-----5
    public  void Qsort(int low,int high){
        if(flag) display();
        if(low>=high){
            return ;
        }
        int i=low;
        int j=high;
        int mid=a[(low+high)/2];
        int t;
        while(i<=j){
            while(mid>a[i]) i++;
            while(mid<a[j]) j--;
            if(i<=j){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }
        Qsort(low,j);
        Qsort(i,high);
    }

//桶排序------6
    public  void BucketSort(int low,int high){
        int[] count=new int[101];
        int i,t=0;
        for(i=low;i<=high;i++){
            count[a[i]]++;
        }
        for(i=100;i>=0;i--){
            if(flag) display();
            for(int j=1;j<=count[i];j++,t++){
                a[t]=i;
            }
        }

    }
//归并排序------7
    public void MergeSort(int low,int high){
        int i=low,j=high;
        int mid=(i+j)/2;

        if(i>=j){
            return;
        }

        MergeSort(low,mid);
        MergeSort(mid+1,j);
        if(flag) display();
        merge(low,mid,mid+1,high);
    }

    //二个有序数组的合并（归并要用）
    public void merge(int l1,int h1,int l2,int h2){
        int li=l1,lj=l2;
        int i=l1;
        int[] b=new int[size];
        while(li<=h1&&lj<=h2){
            if(a[li]<a[lj]){
                b[i]=a[li];
                i++;li++;
            }
            else {
                b[i]=a[lj];
                i++;lj++;
            }
        }
        while(li<=h1){
            b[i]=a[li];
            i++;li++;
        }

        while(lj<=h2){
            b[i]=a[lj];
            i++;
            lj++;
        }

        for(int k=l1;k<=h2;k++){
            a[k]=b[k];
        }
    }
//堆排序
     //调整为大（小）根堆
    void HeapAdjust(int start, int end)
    {
        int tmp = a[start];
        for (int i = 2 * start + 1; i <= end; i = i * 2 + 1)
        {
            if (i < end&& a[i] < a[i + 1])//有右孩子并且左孩子小于右孩子
            {
                i++;
            }//i一定是左右孩子的最大值
            if (a[i] > tmp)
            {
                a[start] = a[i];
                start = i;
            }
            else
            {
                break;
            }
        }
        a[start] = tmp;
    }
     void HeapSort(int len)
     {
         if(flag) display();
         //第一次建立大根堆，从后往前依次调整
         for(int i=(len-1-1)/2;i>=0;i--)
         {
             HeapAdjust(i, len - 1);
         }
         if(flag) display();
         //每次将根和待排序的最后一次交换，然后在调整
         int tmp;
         for (int i = 0; i < len - 1; i++)
         {
             tmp = a[0];
             a[0] = a[len - 1-i];
             a[len - 1 - i] = tmp;
             HeapAdjust(0, len - 1-i- 1);
            if(flag) display();
         }
     }

     public void sortTimeRun() {
        double time,ptime;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++)
            b[i]=a[i]=(int)(Math.random()*m);
        num=0;
        boolean f=false;
        while(true){
            int k=sc.nextInt();
            time=System.currentTimeMillis();
            switch(k){
                case 1: Bubsort(n-1);break;
                case 2: Choicesort(n-1);break;
                case 3:intersort(n-1);break;
                case 4:quickSort(0,n-1);break;
                case 5:Qsort(0,n-1);break;
                case 6:BucketSort(0,n-1);break;
                case 7:MergeSort(0,n-1);display();break;
                case 8:HeapSort(n);break;
                default :f=true;break;
            }
            if(f) break;
            ptime=System.currentTimeMillis();
            System.out.print("用时：");
            System.out.println(ptime-time);
            num=0;
            for (int i = 0; i < n; i++)
                a[i]=b[i];
        }
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Sort sort)) return false;
         return flag == sort.flag && size == sort.size && n == sort.n && m == sort.m && num == sort.num && sum == sort.sum && Arrays.equals(a, sort.a) && Arrays.equals(b, sort.b);
     }

     @Override
     public int hashCode() {
         int result = Objects.hash(flag, size, n, m, num, sum);
         result = 31 * result + Arrays.hashCode(a);
         result = 31 * result + Arrays.hashCode(b);
         return result;
     }
 }
