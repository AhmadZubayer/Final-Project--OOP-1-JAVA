import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingPage {
    JFrame frm2;
    ImageIcon imgLoadingIcon;
    JProgressBar progressBar;
    JLabel lblImgLoading, lblWait, lblPercentage, lblWelcome, lblUsername;
    Timer timer;
    int progress = 0;

    LoadingPage(String username) {
        frm2 = new JFrame("Loading...Please Wait");
        frm2.setSize(500, 500);
        frm2.setLayout(null);
        frm2.getContentPane().setBackground(Color.decode("#FFFFFF"));
        frm2.setLocationRelativeTo(null);
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm2.setResizable(false);

        imgLoadingIcon = new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\Loading.gif");
        lblImgLoading = new JLabel(imgLoadingIcon);
        lblImgLoading.setBounds(300, 150, 147, 147);  // Set the bounds of the image
        frm2.add(lblImgLoading);

        lblWelcome = new JLabel("HI THERE ");
        lblWelcome.setBounds(50, 150, 200, 20);  // Position above the progress bar
        lblWelcome.setFont(new Font("Roboto", Font.PLAIN, 19));
        lblWelcome.setForeground(Color.GRAY);
        frm2.add(lblWelcome);

        lblUsername = new JLabel(username + " !");
        lblUsername.setBounds(50, 170, 200, 30);
        lblUsername.setFont(new Font("Roboto", Font.BOLD, 23));
        lblUsername.setForeground(Color.BLACK);
        frm2.add(lblUsername);

        lblWait = new JLabel("<html> Loading... <br/> Please Wait <html/>");
        lblWait.setFont(new Font("Roboto", Font.BOLD, 25));
        lblWait.setBounds(50, 190, 300, 100);
        frm2.add(lblWait);

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 300, 400, 10);
        progressBar.setValue(0);
        progressBar.setStringPainted(false);
        progressBar.setForeground(Color.decode("#3574F0"));
        progressBar.setBackground(Color.decode("#FFF8F0"));

        lblPercentage = new JLabel("0%");
        lblPercentage.setBounds(230, 350, 100, 20);
        lblPercentage.setForeground(Color.BLACK);
        lblPercentage.setFont(new Font("Roboto", Font.BOLD, 22));

        frm2.add(progressBar);
        frm2.add(lblPercentage);
        frm2.setVisible(true);

        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progress += 1;
                progressBar.setValue(progress);
                lblPercentage.setText(progress + "%");
                if (progress >= 100) {
                    timer.stop();
                    frm2.dispose();
                    new HomePage();
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new LoadingPage("username");
    }
}
