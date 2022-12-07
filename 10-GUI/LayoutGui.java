import javax.swing.*;
import java.awt.*;

public class LayoutGui {
    public static void main(String[] args) {
        // Definisi standar window
        JFrame frame = new JFrame("My Layout App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        // Mengatur panel bagian bawah
        JPanel bottomPanel = new JPanel();
        JButton helloButton = new JButton("Hello");
        JButton worldButton = new JButton("World");
        bottomPanel.add(helloButton);
        bottomPanel.add(worldButton);

        // Mengatur panel bagian atas
        JPanel topPanel = new JPanel();
        JTextField textField = new JTextField(15);
        JLabel label = new JLabel("Tulis disini");
        topPanel.add(label);
        topPanel.add(textField);

        // Menambahkan panel yang dibuat dan mengaktifkan window
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.setVisible(true);
    }
}
