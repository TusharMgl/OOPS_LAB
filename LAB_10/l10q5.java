import javax.swing.*;

public class l10q5 {
    static int elapsedTime = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel label = new JLabel("Time: 0s");
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton reset = new JButton("Reset");

        label.setBounds(140, 30, 100, 25);
        start.setBounds(30, 80, 80, 30);
        stop.setBounds(130, 80, 80, 30);
        reset.setBounds(230, 80, 80, 30);

        timer = new Timer(1000, e -> {
            elapsedTime++;
            label.setText("Time: " + elapsedTime + "s");
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());
        reset.addActionListener(e -> {
            timer.stop();
            elapsedTime = 0;
            label.setText("Time: 0s");
        });

        frame.add(label);
        frame.add(start);
        frame.add(stop);
        frame.add(reset);

        frame.setSize(350, 180);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
