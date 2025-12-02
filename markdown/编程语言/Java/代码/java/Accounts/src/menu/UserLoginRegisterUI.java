package menu;

import usermanage.UserAccountManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLoginRegisterUI extends JFrame {
    private UserAccountManage instance=new UserAccountManage();
    private JTextField usernameField;
    private JPasswordField passwordField;

    public UserLoginRegisterUI() {
        setTitle("用户登录");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5)); // 添加间距

        JLabel titleLabel = new JLabel("用户登录");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // 文字居中
        add(titleLabel, BorderLayout.NORTH);

        JLabel usernameLabel = new JLabel("用户名:");
        usernameField = new JTextField(30);
        JLabel passwordLabel = new JLabel("密码:");
        passwordField = new JPasswordField(30);
        JButton loginButton = new JButton("登录");
        JButton registerButton = new JButton("注册");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        add(panel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 模拟登录逻辑
                boolean loginSuccess = instance.login(usernameField.getText(),passwordField.getText()); // 假设登录成功

                if (loginSuccess) {
                    JOptionPane.showMessageDialog(UserLoginRegisterUI.this, "登录成功！");
                    MainUI mainUI = new MainUI(instance);
                    mainUI.setVisible(true);
                    dispose(); // 关闭登录界面
                } else {
                    JOptionPane.showMessageDialog(UserLoginRegisterUI.this, "登录失败！");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RegisterUI registerUI = new RegisterUI(instance);
                registerUI.setVisible(true);
            }
        });
    }
}



