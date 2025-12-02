package jdbc;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest{
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs=null;


        //使用资源绑定器绑定配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String urlRb=rb.getString("url");
        String userRb=rb.getString("user");
        String passwordRb=rb.getString("password");
        String deriverRb=rb.getString("driver");
        System.out.println("url :"+urlRb);
        System.out.println("user :"+userRb);
        System.out.println("password :"+passwordRb);
        System.out.println("driver :"+deriverRb);

//第一步：注册驱动
        try {
            // Driver driver=new com.mysql.jdbc. Driver();(8.0以下）

            //Driver driver=new com.mysql.cj.jdbc.Driver();
            //DriverManager.registerDriver(driver);
            Class.forName(deriverRb);//注册驱动的第二种方式（常用）com.mysql.cj.jdbc.Driver
            //因为参数是字符串可以写到配置文件(xxx.properties)里    不用接收返回值 我们主要它加载静态代码块

//第二步：获取链接
            //jdbc：mysql：//[host：port]/[database](8.0以下版本）
            //jdbc:mysql（协议）://localhost(主机的IP地址）:3306（端口号这里是默认）/数据库名?useSSL=false&serverTimezone=UTC(8.0以上）
            //这里直接用的配置文件里的属性
            //String url= "jdbc:mysql://localhost:3306/dbtest?useSSL=false&serverTimezone=UTC";
           //String user="root";
           //String password="248569";


            //com.mysql.cj.jdbc.ConnectionImpl@150c158
            conn= DriverManager.getConnection(urlRb,userRb,passwordRb);
            System.out.println("数据库链接对象："+conn);

//第三步：获取数据库操作对象
            stmt=conn.createStatement();

//第四步：执行SQL语句(DQL DML。。。。)
            //jdbc的SQL语句不用写 ;
            String sql="insert  t_user (loginname,loginPwd,num,no) values ('holle2','2324',424,5)";//sql语句

            //int executeUpdate(String sql);(insert/updata/delete)
            //ResultSet executeQuery(String sql);(select)
            //执行DML语句（insert、delete、update）
            //返回值是影响数据库中的记录条数
            int count=stmt.executeUpdate(sql);
            System.out.println("影响数据库中的记录条数："+count);

            String sql2="select * from dept";
            //返回结果集
            rs=stmt.executeQuery(sql2);
//第五步：处理查询结果(只有第四步是select时才有)

            while(rs.next()){
                //以下标获取1就是第一列（jdbc下标都是从1开始的）
                //String deptno=rs.getString(1);
                //String dname=rs.getString(2);
                //String loc=rs.getString(3);


                //以列的名字获取（注意select中取别名的情况）
                String deptno=rs.getString("deptno");
                String dname=rs.getString("dname");
                String loc=rs.getString("loc");

                System.out.println("id:"+deptno+" name:"+dname+" location:"+loc);

            }
        } catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
//第六步：释放资源
            //遵循从小到大依次关闭
            //尽量在finally中执行
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(stmt!=null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //分开try
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}