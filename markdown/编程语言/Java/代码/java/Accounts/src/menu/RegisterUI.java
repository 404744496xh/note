package menu;

import usermanage.UserAccountManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    UserAccountManage instance=null;
    public RegisterUI(UserAccountManage instance) {
        this.instance=instance;
        setTitle("用户注册");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5)); // 添加间距

        JLabel titleLabel = new JLabel("用户注册");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // 文字居中
        add(titleLabel, BorderLayout.NORTH);

        JLabel usernameLabel = new JLabel("用户名：");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("账号：");
        passwordField = new JPasswordField(20);
        JLabel confirmPasswordLabel = new JLabel("密码：");
        confirmPasswordField = new JPasswordField(20);
        JButton registerButton = new JButton("注册");
        JButton returnButton = new JButton("返回"); // 创建返回按钮

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(registerButton);
        panel.add(returnButton); // 将返回按钮添加到面板上

        add(panel, BorderLayout.CENTER);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());
                // 处理注册逻辑
                if(instance.register(username, password, confirmPassword)){
                    JOptionPane.showMessageDialog(RegisterUI.this, "注册成功！");
                    dispose(); // 关闭注册界面
                    UserLoginRegisterUI lrUI=new UserLoginRegisterUI();
                    lrUI.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(RegisterUI.this, "注册失败！(二次密码不一致或用户名已存在）");
                }

            }
        });

        returnButton.addActionListener(new ActionListener() { // 为返回按钮添加事件监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 关闭当前窗口
                UserLoginRegisterUI lrUI=new UserLoginRegisterUI();
                lrUI.setVisible(true);
            }
        });
    }
}
