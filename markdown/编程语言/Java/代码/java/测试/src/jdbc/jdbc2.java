package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc2 {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;

        try {
            con=JDBCUtil.getConnection();
            con.setAutoCommit(false);

            String sql="update t_user set num=?+num where no<=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,5);
            ps.setInt(2,2);
            int count =ps.executeUpdate();
            System.out.println(count);
            con.commit();
        } catch (SQLException e) {
            if(con!=null){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            throw new RuntimeException(e);
        }
    }
}
