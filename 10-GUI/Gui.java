import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        /* Baru! */ JButton button = new JButton("Press");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Baru! */ frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
