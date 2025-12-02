package jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
/**
 * 作者：杜聚宾
 *
 * JDBC事务机制：
 *      1、JDBC中的事务是自动提交的，什么是自动提交？
 *          只要执行任意一条DML语句，则自动提交一次。这是JDBC默认的事务行为。
 *          但是在实际的业务当中，通常都是N条DML语句共同联合才能完成的，必须
 *          保证他们这些DML语句在同一个事务中同时成功或者同时失败。
 *
 *      2、以下程序先来验证一下JDBC的事务是否是自动提交机制！
 *          测试结果：JDBC中只要执行任意一条DML语句，就提交一次。
 *
 *  重点三行代码？
 *      conn.setAutoCommit(false);
 *      conn.commit();
 *      conn.rollback();
 */
public class JdbcAffair {
    public static void main(String[] args)  {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try {
//1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//2.建立连接
            ResourceBundle rb=ResourceBundle.getBundle("jdbc");
            String url=rb.getString("url");
            String user=rb.getString("user");
            String password=rb.getString("password");
            con=DriverManager.getConnection(url,user,password);

            // 将自动提交机制修改为手动提交
            con.setAutoCommit(false);
//3.获取数据库操作对象
            //查找num的值
            Map<Integer, Integer> num=new HashMap<Integer, Integer>();
            String tsql="select num,no from t_user";
            ps=con.prepareStatement(tsql);
            rs=ps.executeQuery();
            while(rs.next()){
               num.put( rs.getInt(2),rs.getInt(1));
            }

            String sql="update t_user set num=? where no=?";
            ps=con.prepareStatement(sql);
//4.执行sql语句
            ps.setInt(1,num.get(1)-700);//执行第一条update语句
            ps.setInt(2,1);
            int count=ps.executeUpdate();

            ps.setInt(1,num.get(2)+700);//执行第二条update语句
            ps.setInt(2,2);
            count+=ps.executeUpdate();

            System.out.println("转账成功");

            // 程序能够走到这里说明以上程序没有异常，事务结束，手动提交数据
            con.commit(); // 提交事务
        }catch (Exception e){
            // 出现异常回滚事务
            if(con != null) {
                try {
                    System.out.println("出现异常，转账失败");
                    con.rollback();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
