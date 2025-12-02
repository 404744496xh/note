package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//这个程序两个任务：
//        第一：测试DBUtil是否好用
//        第二：模糊查询怎么写？
public class JDBCUtilTest {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try {
            con=JDBCUtil.getConnection();
            // 错误的写法
            /*    ?不能有‘’
            String sql = "select ename from emp where ename like '_?%'";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "A");
            */
            String sql="select * from t_user where loginName like ?";
            ps=con.prepareStatement(sql);
            ps.setString(1,"_A%");
            rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("loginName")+"\t"+rs.getString("loginPwd")+'\t'+rs.getInt("num")+'\t'+rs.getInt("no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(con,ps,rs);
        }
    }
}
