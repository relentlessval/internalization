// import necessary libraries for creation of windows
//import java.awt.*;
import javax.swing.*;

public class app {

    public static void main(String[] args) {
        // create a new window
        JFrame frame = new JFrame("Internalization");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(
            new JLabel(
                new ImageIcon("gameAssets/logo.png")
            ));
        JPanel panel1 = new JPanel();
        JButton button = new JButton("Play");
        button.addActionListener(e -> {
            frame.remove(panel1);
            frame.revalidate();
            frame.repaint();
        });
        JButton credButton = new JButton("Credits");
        credButton.addActionListener(e -> {
            frame.remove(panel1);
            frame.revalidate();
            frame.repaint();
            JLabel creditsList = new JLabel("<html>Credits:<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Main Developer: @simplesentai<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Font by <a href=\"https://www.fontourist.com/\">Fontourist</a></html>");
            JPanel creditPanel = new JPanel();
            creditPanel.add(creditsList);
            JButton backButton = new JButton("Back");
            backButton.addActionListener(e2 -> {
                frame.remove(creditPanel);
                frame.revalidate();
                frame.repaint();
                frame.add(panel1);
                frame.revalidate();
                frame.repaint();
            });
            frame.add(creditPanel);
            frame.revalidate();
            frame.repaint();
        });
        panel1.add(button);
        panel1.add(credButton);
        frame.add(panel1).revalidate();
        frame.repaint();
        frame.setVisible(true);
    }
}
