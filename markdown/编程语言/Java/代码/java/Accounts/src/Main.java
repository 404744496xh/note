import menu.UserLoginRegisterUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserLoginRegisterUI ui = new UserLoginRegisterUI();
                ui.setVisible(true);
            }
        });

    }
}