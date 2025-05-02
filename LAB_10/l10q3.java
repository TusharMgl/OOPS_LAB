import javax.swing.*;

public class l10q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> taskList = new JList<>(model);
        JScrollPane scroll = new JScrollPane(taskList);
        JTextField taskField = new JTextField();
        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        taskField.setBounds(20, 20, 200, 25);
        addBtn.setBounds(230, 20, 80, 25);
        scroll.setBounds(20, 60, 200, 150);
        removeBtn.setBounds(230, 60, 80, 25);

        addBtn.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeBtn.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                model.remove(selected);
            }
        });

        frame.add(taskField);
        frame.add(addBtn);
        frame.add(scroll);
        frame.add(removeBtn);
        frame.setSize(340, 270);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
