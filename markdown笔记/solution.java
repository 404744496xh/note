import java.util.Arrays;
import java.util.PriorityQueue;

class solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            } else {
                return b[1] - a[1];
            }
        });
        for(int i=0;i<k;i++){
            pq.offer(new int[]{nums[i],i});
        }
        ans[0] = pq.peek()[0];
        for(int i=k;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            while(pq.peek()[1]<=i-k) pq.poll();
            ans[i-k+1] = pq.peek()[0];
        }
        return ans;
    }
    public static void main(String[] args) {
       solution t = new solution();
        System.out.println(Arrays.toString(t.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}