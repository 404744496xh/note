package menu;

import usermanage.UserAccountManage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class MainUI extends JFrame {
    private JTextArea resultTextArea;
    private JScrollPane scrollPane;
    private JButton function1Button, function2Button, function3Button, function4Button, function5Button, function6Button,function7Button,function8Button;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem logoutItem;
    private UserAccountManage instance;
    public MainUI(UserAccountManage instance) {
        this.instance=instance;
        setTitle("主界面");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        resultTextArea = new JTextArea("欢迎使用个人账目管理系统");
        resultTextArea.setEditable(false);
        scrollPane = new JScrollPane(resultTextArea);
        add(scrollPane, BorderLayout.CENTER);

        function1Button = new JButton("注销用户");
        function2Button = new JButton("修改密码");
        function3Button = new JButton("用户信息");
        function4Button = new JButton("添加账目");
        function5Button = new JButton("查询账目(通过时间）");
        function6Button = new JButton("账目统计");
        function7Button = new JButton("完善用户信息");
        function8Button = new JButton("查看账目");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(8, 1));
        buttonPanel.add(function1Button);
        buttonPanel.add(function2Button);
        buttonPanel.add(function3Button);
        buttonPanel.add(function4Button);
        buttonPanel.add(function5Button);
        buttonPanel.add(function6Button);
        buttonPanel.add(function7Button);
        buttonPanel.add(function8Button);
        add(buttonPanel, BorderLayout.WEST);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("文件");
        logoutItem = new JMenuItem("注销");
        fileMenu.add(logoutItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        //注销账号
        function1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultTextArea.append("");
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 2));

                JTextField pwField = new JTextField(5);

                panel.add(new JLabel("您要注销账号吗？是请输入密码验证： "));
                panel.add(pwField);

                int result = JOptionPane.showConfirmDialog(null, panel, "您要注销账号吗？是请输入密码验证：", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String pw = pwField.getText();
                    if(instance.logout(pw)) {
                        JOptionPane.showMessageDialog(null, "注销成功！");
                        dispose(); // 关闭当前窗口
                        UserLoginRegisterUI lrUI=new UserLoginRegisterUI();
                        lrUI.setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "密码错误！");
                    }
                }
            }

        });

        //修改密码
        function2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 2));

                JTextField oldPwField = new JTextField(5);
                JTextField newPwField = new JTextField(5);
                JTextField newPw1Field = new JTextField(5);

                panel.add(new JLabel("旧密码: "));
                panel.add(oldPwField);
                panel.add(new JLabel("新密码: "));
                panel.add(newPwField);
                panel.add(new JLabel("确认密码: "));
                panel.add(newPw1Field);

                int result = JOptionPane.showConfirmDialog(null, panel, "修改密码", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String oldPassword = oldPwField.getText();
                    String newPassword = newPwField.getText();
                    String newPassword1 = newPw1Field.getText();
                    if(instance.updateUser(oldPassword, newPassword, newPassword1)){
                        JOptionPane.showMessageDialog(null, "修改成功！");
                    }else {
                        JOptionPane.showMessageDialog(null, "密码错误！");
                    }
                }
            }
        });

        //查询当前用户
        function3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList c=instance.queryUser();
                resultTextArea.setText("用户Id： "+ c.get(0)+"\n");
                resultTextArea.append("用户名："+c.get(1)+"\n");
                resultTextArea.append("账号："+c.get(2)+"\n");
                resultTextArea.append("用户密码："+c.get(3)+"\n");
                resultTextArea.append("用户余额："+c.get(4)+"\n");
                resultTextArea.append("用户邮箱："+ c.get(5)+"\n");
                resultTextArea.append("创建时间： "+ c.get(6)+"\n");
            }
        });

        //添加账户
        function4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 2));

                JTextField account = new JTextField(5);
                JTextField note = new JTextField(5);

                panel.add(new JLabel("收入或支出（支出为负数）: "));
                panel.add(account);
                panel.add(new JLabel("备注: "));
                panel.add(note);

                int result = JOptionPane.showConfirmDialog(null, panel, "添加账单", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    double accountText = Double.parseDouble(account.getText());
                    String noteText = note.getText();
                    if(instance.addAccount(accountText,noteText)){
                        JOptionPane.showMessageDialog(null, "添加成功！");
                    }else {
                        JOptionPane.showMessageDialog(null, "添加失败！");
                    }
                }
            }
        });

        //查询账目(通过时间）
        function5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 2));

                JTextField year = new JTextField(5);
                JTextField month = new JTextField(5);
                JTextField day = new JTextField(5);

                panel.add(new JLabel("年: "));
                panel.add(year);
                panel.add(new JLabel("月: "));
                panel.add(month);
                panel.add(new JLabel("日: "));
                panel.add(day);

                int result = JOptionPane.showConfirmDialog(null, panel, "查询", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String yearText = year.getText();if(yearText.isEmpty()) yearText="NULL";
                    String monthText = month.getText();if(monthText.isEmpty()) monthText="NULL";
                    String dayText = day.getText();if(dayText.isEmpty()) dayText="NULL";
                    if(yearText.isEmpty()) JOptionPane.showMessageDialog(null, "请填写日期！");
                    else {
                        ResultSet rs=instance.queryAccount(yearText, monthText, dayText);
                        try {
                            //创建表格模型
                            DefaultTableModel model = new DefaultTableModel();
                            // 获取结果集中的列名作为表头
                            ResultSetMetaData metaData = rs.getMetaData();
                            int columnCount = metaData.getColumnCount();
                            for (int i = 1; i <= columnCount; i++) {
                                model.addColumn(metaData.getColumnName(i));
                            }

                            // 填充数据到表格中
                            while (rs.next()) {
                                Object[] rowData = new Object[columnCount];
                                for (int i = 1; i <= columnCount; i++) {
                                    rowData[i - 1] = rs.getObject(i);
                                }
                                model.addRow(rowData);
                            }

                            // 创建表格并设置模型和布局管理器
                            JTable table = new JTable(model);
                            table.setPreferredScrollableViewportSize(new Dimension(300, 200)); // 设置表格大小
                            table.setFillsViewportHeight(true); // 让表格填充整个窗口高度
                            getContentPane().add(new JScrollPane(table), BorderLayout.CENTER); // 将表格添加到滚动窗格中，并设置在中央位置显示
                            setVisible(true);// 显示窗口

                        } catch (SQLException e3) {
                            e3.printStackTrace();
                        }finally {

                            try {
                                if(rs != null){
                                    rs.close();
                                }
                            } catch (SQLException ex) {
                                throw new RuntimeException(ex);
                            }

                        }
                    }
                }
            }
        });

        //账目统计
        function6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userid=instance.getUserID();
                Connection connection = instance.con;
                PreparedStatement ps=null;
                ResultSet resultSet = null;
                try {
                    //查询1：按年获取收入总额和账户数量，并使用子查询计算总支出和账户数量
                    String sql="SELECT YEAR(IncomeTime) as iyear, SUM(Income) as Itotal, t.total as etotal , COUNT(AccountID) as Icout_num, t.cout_num as ecount_num " +
                            "FROM incomeview s  " +
                            "JOIN (SELECT YEAR(ExpenseTime) as eyear, SUM(Expense) as total, COUNT(AccountID) as cout_num  " +
                            "FROM ExpenseView  " +
                            "GROUP BY YEAR(ExpenseTime)) t  " +
                            "ON t.eyear = YEAR(s.IncomeTime) " +
                            "WHERE UserID= ?  " +
                            "GROUP BY YEAR(IncomeTime), t.total, t.cout_num ";
                    ps=connection.prepareStatement(sql);
                    ps.setInt(1,userid);
                    resultSet = ps.executeQuery();
                    while (resultSet.next()) {
                        int iyear = resultSet.getInt("iyear");
                        double itotal = resultSet.getInt("Itotal");
                        int icout_num = resultSet.getInt("Icout_num");
                        double etotal = resultSet.getInt("etotal");
                        int ecout_num = resultSet.getInt("ecount_num");
                        resultTextArea.setText(iyear+"年:" + "  年总收入"+itotal+"  年总支出："+etotal+"  共收入"+icout_num+"笔"+"  共支出"+ecout_num+"笔"+"\n");
                    }
                    resultTextArea.append("\n");


                    // 查询2：按月获取收入总额和账户数量，并使用子查询计算总支出和账户数量
                    sql="SELECT MONTH(IncomeTime) as imonth, SUM(Income) as Itotal, t.total as Etotal, COUNT(AccountID) as Icout_num, t.cout_num as ecount_num FROM incomeview s JOIN (SELECT MONTH(ExpenseTime) as emonth, SUM(Expense) as total, COUNT(AccountID) as cout_num FROM ExpenseView GROUP BY MONTH(ExpenseTime)) t ON t.emonth = MONTH(s.IncomeTime) WHERE UserID= ? GROUP BY MONTH(IncomeTime), t.total, t.cout_num";
                    ps=connection.prepareStatement(sql);
                    ps.setInt(1,userid);
                    resultSet = ps.executeQuery();
                    while (resultSet.next()) {
                        int imonth = resultSet.getInt("imonth");
                        double itotal = resultSet.getInt("Itotal");
                        int icout_num = resultSet.getInt("Icout_num");
                        double etotal = resultSet.getInt("etotal");
                        int ecout_num = resultSet.getInt("ecount_num");
                        resultTextArea.append(imonth+"月:" + "  月总收入"+itotal+"  月总支出："+etotal+"  共收入"+icout_num+"笔"+"  共支出"+ecout_num+"笔"+"\n");
                    }

                    resultTextArea.append("\n");

                    // 查询3：获取最大和最小收入和支出
                    sql="SELECT     \n" +
                            "    MAX(Income) as max_income,     \n" +
                            "    MIN(Income) as min_income,    \n" +
                            "    MAX(Expense) as max_expense,     \n" +
                            "    MIN(Expense) as min_expense,\n" +
                            "\t\tSUM(Income)\tas total_income,\n" +
                            "\t\tSUM(Expense) as total_expense\t\t\n" +
                            "FROM     \n" +
                            "    (    \n" +
                            "        SELECT UserID, Income, NULL AS Expense FROM incomeview    \n" +
                            "        UNION ALL    \n" +
                            "        SELECT UserID, NULL AS Income, Expense FROM ExpenseView    \n" +
                            "    ) AS combined_view    \n" +
                            "WHERE     \n" +
                            "    UserID= ?;";
                    ps=connection.prepareStatement(sql);
                    ps.setInt(1,userid);
                    resultSet = ps.executeQuery();
                    while (resultSet.next()) {
                        double max_income = resultSet.getDouble("max_income");
                        double min_income = resultSet.getDouble("min_income");
                        double max_expense = resultSet.getDouble("max_expense");
                        double min_expense = resultSet.getDouble("min_expense");
                        double  total_income= resultSet.getDouble("total_income");
                        double total_expense = resultSet.getDouble("total_expense");
                        resultTextArea.append("最大收入 " + max_income + "，最小收入 " + min_income + "，最大支出 " + max_expense + "，最小支出 " + min_expense+"\n");
                        resultTextArea.append("总收入: " + total_income + "，总支出: " +total_expense+"\n");
                    }

                    resultTextArea.append("\n");


                } catch (SQLException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        if(ps!=null){
                            ps.close();
                        }
                        if(resultSet!=null){
                            resultSet.close();
                        }
                    } catch (SQLException ee) {
                        ee.printStackTrace();
                    }
                }
            }
        });
        //完善用户信息
        function7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextArea.setText("您点击了功能7按钮\n");
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(3, 2));

                JTextField username = new JTextField(5);
                JTextField email = new JTextField(5);

                panel.add(new JLabel("用户名: "));
                panel.add(username);
                panel.add(new JLabel("电子邮箱: "));
                panel.add(email);

                int result = JOptionPane.showConfirmDialog(null, panel, "完善信息", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String username0 = username.getText();
                    String email0 = email.getText();
                    if(instance.upUser(username0, email0)){
                        System.out.println("更新成功");
                    }else {
                        System.out.println("更新失败");
                    }
                }

            }
        });
        //查询账目
        function8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userid=instance.getUserID();
                Statement stmt=null;
                ResultSet rs = null;
                try {
                    stmt = instance.con.createStatement();
                     rs = stmt.executeQuery("SELECT * FROM Account WHERE UserID = "+userid);// 替换为你的查询语句和表名

                    //创建表格模型
                    DefaultTableModel model = new DefaultTableModel();
                    // 获取结果集中的列名作为表头
                    ResultSetMetaData metaData = rs.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    for (int i = 1; i <= columnCount; i++) {
                        model.addColumn(metaData.getColumnName(i));
                    }

                    // 填充数据到表格中
                    while (rs.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = rs.getObject(i);
                        }
                        model.addRow(rowData);
                    }

                    // 创建表格并设置模型和布局管理器
                    JTable table = new JTable(model);
                    table.setPreferredScrollableViewportSize(new Dimension(300, 200)); // 设置表格大小
                    table.setFillsViewportHeight(true); // 让表格填充整个窗口高度
                    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER); // 将表格添加到滚动窗格中，并设置在中央位置显示
                    setVisible(true);// 显示窗口

                } catch (SQLException e3) {
                    e3.printStackTrace();
                }finally {

                        try {
                            if(rs != null){
                                rs.close();
                            }
                            if(stmt != null){
                                stmt.close();
                            }
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }

                }
            }
        });
        logoutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextArea.setText(""); // 清空文本
                dispose(); // 关闭主界面
                UserLoginRegisterUI loginRegisterUI = new UserLoginRegisterUI();
                loginRegisterUI.setVisible(true);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                instance.close();
                dispose();
            }
        });
    }
}
