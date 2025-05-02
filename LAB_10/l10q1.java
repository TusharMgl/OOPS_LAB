import javax.swing.*;

public class l10q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        userLabel.setBounds(30, 30, 80, 25);
        passLabel.setBounds(30, 70, 80, 25);
        userField.setBounds(120, 30, 150, 25);
        passField.setBounds(120, 70, 150, 25);
        loginButton.setBounds(120, 110, 80, 30);

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginButton);

        loginButton.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (user.equals("admin") && pass.equals("password")) {
                JOptionPane.showMessageDialog(frame, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Credentials");
            }
        });

        frame.setSize(320, 220);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
