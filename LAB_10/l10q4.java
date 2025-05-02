import javax.swing.*;

public class l10q4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");
        JLabel confirmLabel = new JLabel("Confirm Password:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JPasswordField confirmField = new JPasswordField();
        JButton registerBtn = new JButton("Register");
        JLabel message = new JLabel();

        nameLabel.setBounds(30, 30, 120, 25);
        emailLabel.setBounds(30, 70, 120, 25);
        passLabel.setBounds(30, 110, 120, 25);
        confirmLabel.setBounds(30, 150, 140, 25);
        nameField.setBounds(170, 30, 150, 25);
        emailField.setBounds(170, 70, 150, 25);
        passField.setBounds(170, 110, 150, 25);
        confirmField.setBounds(170, 150, 150, 25);
        registerBtn.setBounds(120, 190, 100, 30);
        message.setBounds(30, 230, 300, 25);

        registerBtn.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                message.setText("Error: All fields are required.");
            } else if (!email.contains("@")) {
                message.setText("Error: Invalid email.");
            } else if (!pass.equals(confirm)) {
                message.setText("Error: Passwords do not match.");
            } else {
                message.setText("Registration successful!");
            }
        });

        frame.add(nameLabel);
        frame.add(emailLabel);
        frame.add(passLabel);
        frame.add(confirmLabel);
        frame.add(nameField);
        frame.add(emailField);
        frame.add(passField);
        frame.add(confirmField);
        frame.add(registerBtn);
        frame.add(message);

        frame.setSize(380, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
