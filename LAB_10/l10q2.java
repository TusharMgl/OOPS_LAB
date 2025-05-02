import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class l10q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField textField = new JTextField();
        JPanel panel = new JPanel();
        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", "C", "=", "+"
        };

        textField.setBounds(20, 20, 240, 30);
        panel.setBounds(20, 60, 240, 200);
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        for (String txt : buttons) {
            JButton btn = new JButton(txt);
            panel.add(btn);
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = btn.getText();
                    if (command.equals("C")) {
                        textField.setText("");
                    } else if (command.equals("=")) {
                        try {
                            textField.setText("" + eval(textField.getText()));
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    } else {
                        textField.setText(textField.getText() + command);
                    }
                }
            });
        }
        frame.add(textField);
        frame.add(panel);
        frame.setSize(300, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static double eval(String expression) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Object result = engine.eval(expression);
        return Double.parseDouble(result.toString());
    }
}
