import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage implements ActionListener {
    JFrame frmF;
    JPanel pnlFdown;
    JButton btn;
    JLabel lblF;
    public FirstPage() {
        frmF = new JFrame("Start Page");
        frmF.setSize(1280, 930);
        frmF.getContentPane().setBackground(Color.decode("#03060c"));
        frmF.setLocationRelativeTo(null);
        frmF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmF.setLayout(null);
        frmF.setResizable(false);

        pnlFdown = new JPanel();
        pnlFdown.setLayout(null);
        pnlFdown.setBackground(Color.decode("#28aadc"));
        pnlFdown.setBounds(0, 680, 1280, 250);
        frmF.add(pnlFdown);

        lblF = new JLabel("DISCOVER GEAR FOR GAMERS. BY GAMERS.");
        lblF.setFont(new Font("Roboto", Font.BOLD, 28));
        lblF.setForeground(Color.decode("#28aadc"));
        lblF.setBounds(30, 600, 760, 30);
        frmF.add(lblF);


        frmF.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[]args) {
        new FirstPage();
    }
}
