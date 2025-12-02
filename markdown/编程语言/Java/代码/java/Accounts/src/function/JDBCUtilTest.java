package jdbc;

import function.JDBCUtil;

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
            con= JDBCUtil.getConnection();
            String sql="select * from user ";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+'\t'+rs.getString(3)+'\t'+rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(con,ps,rs);
        }
    }
}
