import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("O fereastra");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");

        panel.add(ok);
        panel.add(cancel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
