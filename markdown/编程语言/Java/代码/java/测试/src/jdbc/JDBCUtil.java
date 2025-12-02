package jdbc;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

/*
    JDBC工具类
 */
public class JDBCUtil {
    //1.私有构造方法,因为是工具类不需要建对象
    private JDBCUtil(){};

    //2.声明配置信息变量
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    private static Connection conn;

    //3.静态代码块中实现加载配置文件和注册驱动
    static{
        try{
            ResourceBundle rb = ResourceBundle.getBundle("jdbc");

            //获取信息为变量赋值
            driverClass = rb.getString("driver");
            url = rb.getString("url");
            username = rb.getString("user");
            password = rb.getString("password");

            //注册驱动
            Class.forName(driverClass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //4.获取数据库连接的方法
    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    //5.释放资源的方法
    public static void close(Connection conn, Statement stat, ResultSet rs) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, Statement stat) {
        close(conn,stat,null);
    }
}
