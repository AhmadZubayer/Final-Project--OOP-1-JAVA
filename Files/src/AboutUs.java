import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUs {
    public AboutUs() {
        JFrame frame = new JFrame("About Us");
        frame.setSize(1150, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        ImageIcon imageIcon = new ImageIcon("Files\\About Us.png");

        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 1150, 650);
        frame.setLayout(null);
        frame.add(imageLabel);

        JButton btnBackP = new JButton("< BACK");
        btnBackP.setFont(new Font("Roboto", Font.BOLD, 17));
        btnBackP.setForeground(Color.WHITE);
        btnBackP.setBackground(Color.decode("#2C3E50"));
        btnBackP.setContentAreaFilled(true);
        btnBackP.setBorderPainted(false);
        btnBackP.setBounds(520, 680, 125, 35);
        frame.add(btnBackP);

        btnBackP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                //new HomePage();
            }
        });

        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new AboutUs();

    }
}