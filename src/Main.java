import javax.swing.*;
import java.awt.*;

public class Main {

    public Main() {
        for (int i = 0; i < 100; i++) {
            JFrame frame = new JFrame();
            frame.setSize(900, 500);
            frame.setTitle("))))");
            frame.setLocation((int) (Math.random() * 1800) - 50, (int) (Math.random() * 1060) + 50);
            JLabel label = new JLabel("Адабададибудай!!!!!");
            label.setFont(new Font("arial black", Font.BOLD, 60));
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.add(label);
            frame.setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}
