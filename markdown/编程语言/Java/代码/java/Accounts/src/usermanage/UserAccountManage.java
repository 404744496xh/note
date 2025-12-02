package usermanage;

import function.JDBCUtil;

import java.awt.event.ActionEvent;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UserAccountManage {
    private int UserID;
    private String Username;//用户名
    private String UserAccount;//账号
    private String UserPassword;//密码
    private double Balance;//余额
    private String Email;//电子邮箱
    private String CreateTime;//注册时间
    private boolean logStatus=false;//登录状态
    public Connection con=null;
    public ResultSet rs=null;
    public PreparedStatement ps=null;
    //获取链接
    {
        con= JDBCUtil.getConnection();
        try {
            con.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //登录
    public boolean login(String tAccout ,String tPassword){
        boolean f=false;
        try {
            String sql="select * from user where UserAccount=? and UserPassword=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,tAccout);
            ps.setString(2,tPassword);
            rs=ps.executeQuery();
            while (rs.next()){
                UserID=rs.getInt("UserID");
                Username=rs.getString("UserName");
                UserAccount=rs.getString("UserAccount");
                UserPassword=rs.getString("UserPassword");
                Balance=rs.getDouble("Balance");
                Email=rs.getString("Email");
                CreateTime=rs.getString("CreateTime");
                f=true;
            }
            if(f) logStatus=true;
            else System.out.println("账号或密码错误");
            return f;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //注册
    public boolean register(String tName,String tAccout, String tPassword) {
        boolean f=false;
        if(tName==null || tAccout==null || tPassword==null){
            return false;
        }
        try {
            String sql="INSERT INTO user (Username, UserAccount, UserPassword) VALUES (?, ?, ? )";
            ps=con.prepareStatement(sql);
            ps.setString(1,tName);
            ps.setString(2,tAccout);
            ps.setString(3,tPassword);
            int len=ps.executeUpdate();
            f=true;
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return f;
    }
// 1.注销用户
    public boolean logout(String nPassword1) {
        boolean f=false;
        System.out.println("确定要注销？是请输入密码进行验证：");

        if(!nPassword1.equals(UserPassword)) return false;
        try {
            String sql="DELETE FROM user WHERE UserID=?";
            String sql1="DELETE FROM account WHERE UserID=?";
            ps=con.prepareStatement(sql1);
            ps.setInt(1, UserID);
            int len=ps.executeUpdate();
            ps=con.prepareStatement(sql);
            ps.setInt(1, UserID);
            len=ps.executeUpdate();
            f=true;
            con.commit();
            System.out.println("注销成功");
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return f;
    }
//2.修改密码-

    /**
     *
     * @param oldPassword
     * @param newPassword
     * @param newPassword1
     * @return
     */
    public boolean updateUser(String oldPassword,String newPassword,String newPassword1){

        if(oldPassword.equals(UserPassword) && newPassword.equals(newPassword1)){
            UserPassword=newPassword;
            System.out.println("修改成功");
        }else{
            if(!oldPassword.equals(UserPassword)) System.out.println("旧密码错误");
            if(!newPassword.equals(newPassword1)) System.out.println("两次输入密码不一致");
            return false;
        }
        boolean f=false;
        try {
            String sql="UPDATE user SET   UserPassword = ? where UserID = ?";
            ps=con.prepareStatement(sql);
            ps.setString(1, newPassword);
            ps.setInt(2, UserID);
            int len=ps.executeUpdate();
            f=true;
            con.commit();
            System.out.println("修改成功");
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return f;
    }
//3.查询用户信息-
    public  ArrayList queryUser(){
        ArrayList c=new ArrayList();
        System.out.println("用户Id： "+ UserID);c.add(UserID);
        System.out.println("用户名："+Username);c.add(Username);
        System.out.println("账号："+UserAccount);c.add(UserAccount);
        System.out.println("用户密码："+UserPassword);c.add(UserPassword);
        System.out.println("用户余额："+Balance);c.add(Balance);
        System.out.println("用户邮箱："+ Email);c.add(Email);
        System.out.println("创建时间： "+ CreateTime);c.add(CreateTime);
        return c;
    }
    //4.添加账目
    public boolean addAccount(double Amount,String Note){
        boolean f=false;
        try {
            String sql="INSERT INTO account ( Amount, Note ,UserID,CurBalance) VALUES ( ?, ? ,?,?)";
            ps=con.prepareStatement(sql);
            ps.setDouble(1, Amount);
            ps.setString(2, Note);
            ps.setInt(3, UserID);
            ps.setDouble(4, Balance+Amount);
            Balance+=Amount;
            int len=ps.executeUpdate();
            sql="UPDATE user SET   Balance = ? where UserID = ?";
            ps=con.prepareStatement(sql);
            ps.setDouble(1, Balance);
            ps.setInt(2, UserID);
            int len2=ps.executeUpdate();
            f=true;
            System.out.println("添加成功");
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return f;


    }
    //5.查询账目
    public ResultSet queryAccount(String year,String month,String day){
        boolean f=false;
        try {
            String sql="SELECT * FROM account WHERE YEAR(Time)= ? AND ( ? = 'NULL' OR MONTH(Time) = ? ) AND ( ? = 'NULL' OR DAY(Time) = ? ) AND UserID= ? ";
            ps=con.prepareStatement(sql);
            ps.setString(1,year);
            ps.setString(2,month);
            ps.setString(3,month);
            ps.setString(4,day);
            ps.setString(5,day);
            ps.setInt(6,UserID);
            rs=ps.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public int getUserID() {
        return UserID;
    }

    //7.完善用户信息
    public  boolean upUser(String un,String em){
        boolean f=false;
        Username=un;
        Email=em;
        try {
            String sql="UPDATE user SET Username = ?, Email = ? WHERE UserID = ?\n";
            ps=con.prepareStatement(sql);
            ps.setString(1, Username);
            ps.setString(2, Email);
            ps.setInt(3, UserID);
            int len=ps.executeUpdate();
            f=true;
            con.commit();
            System.out.println("修改成功");
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return f;
    }
    //关闭连接
    public void close(){

        try {
            if(con!=null){
                con.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
