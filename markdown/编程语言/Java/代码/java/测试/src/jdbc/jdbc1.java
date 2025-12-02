package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc1 {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            con=JDBCUtil.getConnection();
            con.setAutoCommit(false);
            String sql="select * from t_user where no<=? for update";
            ps=con.prepareStatement(sql);
            ps.setInt(1,2);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            }
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
