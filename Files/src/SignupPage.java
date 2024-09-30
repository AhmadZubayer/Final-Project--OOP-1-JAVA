import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SignupPage implements ActionListener {

    JButton btnSignUp, btnSignIn;
    JFrame frame;
    JTextField txtUsername, txtPhone, txtEmail, txtAddress;
    JPasswordField txtPass, txtRetypePass;

    public SignupPage() {
        frame = new JFrame("Sign Up");
        frame.setSize(1182, 850);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 641, 850);
        p1.setBackground(Color.decode("#2c3e50"));
        frame.add(p1);

        JLabel imlb2 = new JLabel();
        imlb2.setBounds(100, 200, 450, 250);
        imlb2.setIcon(new ImageIcon("Files\\signuplogo.gif"));
        imlb2.setVisible(true);
        p1.add(imlb2);

        JLabel label1 = new JLabel("IT'S FREE!");
        label1.setFont(new Font("Roboto", Font.BOLD, 50));
        label1.setForeground(Color.decode("#FAF9F6"));
        label1.setBounds(230, 430, 300, 100);
        label1.setVisible(true);
        p1.add(label1);

        JLabel arrowLabel = new JLabel();
        arrowLabel.setBounds(250, 600, 150, 150);
        arrowLabel.setIcon(new ImageIcon("Files\\arrow.gif"));
        arrowLabel.setVisible(true);
        p1.add(arrowLabel);

        JPanel pnlRight = new JPanel();
        pnlRight.setBounds(641, 0, 641, 850);
        pnlRight.setLayout(null);
        pnlRight.setBackground(Color.decode("#DADADA"));
        frame.add(pnlRight);

        JLabel lblUsername = new JLabel("ENTER USERNAME");
        lblUsername.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblUsername.setBounds(30, 100, 240, 35);
        pnlRight.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        txtUsername.setForeground(Color.decode("#2c3e50"));
        txtUsername.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtUsername.setCaretColor(Color.white);
        txtUsername.setBorder(null);
        txtUsername.setOpaque(false);
        txtUsername.setBounds(30, 140, 420, 35);
        pnlRight.add(txtUsername);

        JLabel usernameBar = new JLabel();
        usernameBar.setBounds(30, 175, 420, 3);
        usernameBar.setOpaque(true);
        usernameBar.setBackground(Color.decode("#2c3e50"));
        pnlRight.add(usernameBar);

        JLabel lblPhone = new JLabel("ENTER PHONE NO.");
        lblPhone.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblPhone.setBounds(30, 190, 240, 35);
        pnlRight.add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        txtPhone.setForeground(Color.decode("#2c3e50"));
        txtPhone.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtPhone.setCaretColor(Color.white);
        txtPhone.setBorder(null);
        txtPhone.setOpaque(false);
        txtPhone.setBounds(30, 230, 420, 35);
        pnlRight.add(txtPhone);

        JLabel phoneBar = new JLabel();
        phoneBar.setBounds(30, 265, 420, 3);
        phoneBar.setOpaque(true);
        phoneBar.setBackground(Color.decode("#2c3e50"));
        pnlRight.add(phoneBar);

        JLabel lblEmail = new JLabel("ENTER EMAIL ADDRESS");
        lblEmail.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblEmail.setBounds(30, 280, 240, 35);
        pnlRight.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        txtEmail.setForeground(Color.decode("#2c3e50"));
        txtEmail.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtEmail.setCaretColor(Color.white);
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        txtEmail.setBounds(30, 320, 420, 35);
        pnlRight.add(txtEmail);

        JLabel emailBar = new JLabel();
        emailBar.setBounds(30, 355, 420, 3);
        emailBar.setOpaque(true);
        emailBar.setBackground(Color.decode("#2c3e50"));
        pnlRight.add(emailBar);

        JLabel lblAddress = new JLabel("ENTER ADDRESS");
        lblAddress.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblAddress.setBounds(30, 370, 240, 35);
        pnlRight.add(lblAddress);

        txtAddress = new JTextField();
        txtAddress.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        txtAddress.setForeground(Color.decode("#2c3e50"));
        txtAddress.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtAddress.setCaretColor(Color.white);
        txtAddress.setBorder(null);
        txtAddress.setOpaque(false);
        txtAddress.setBounds(30, 410, 420, 35);
        pnlRight.add(txtAddress);

        JLabel addressBar = new JLabel();
        addressBar.setBounds(30, 445, 420, 3);
        addressBar.setOpaque(true);
        addressBar.setBackground(Color.decode("#2c3e50"));
        pnlRight.add(addressBar);

        JLabel lblPass = new JLabel("ENTER PASSCODE");
        lblPass.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblPass.setBounds(30, 510, 240, 35);
        pnlRight.add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setForeground(Color.decode("#2c3e50"));
        txtPass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtPass.setCaretColor(Color.white);
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        txtPass.setBounds(30, 550, 420, 35);
        pnlRight.add(txtPass);

        JLabel passBar = new JLabel();
        passBar.setBounds(30, 585, 420, 3);
        passBar.setOpaque(true);
        passBar.setBackground(Color.decode("#2c3e50"));
        pnlRight.add(passBar);

        JLabel lblRetypePass = new JLabel("RETYPE PASSCODE");
        lblRetypePass.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblRetypePass.setBounds(30, 600, 240, 35);
        pnlRight.add(lblRetypePass);

        txtRetypePass = new JPasswordField();
        txtRetypePass.setForeground(Color.decode("#2c3e50"));
        txtRetypePass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtRetypePass.setCaretColor(Color.white);
        txtRetypePass.setBorder(null);
        txtRetypePass.setOpaque(false);
        txtRetypePass.setBounds(30, 640, 420, 35);
        pnlRight.add(txtRetypePass);

        JLabel retypePassBar = new JLabel();
        retypePassBar.setBounds(30, 675, 420, 3);
        retypePassBar.setOpaque(true);
        retypePassBar.setBackground(Color.decode("#2c3e50"));
        pnlRight.add(retypePassBar);

        btnSignUp = new JButton();
        btnSignUp.setIcon(new ImageIcon("Files\\Sign Up.png"));
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setBorderPainted(false);
        btnSignUp.setBounds(40, 700, 150, 60);
        pnlRight.add(btnSignUp);
        btnSignUp.addActionListener(this);

        btnSignIn = new JButton();
        btnSignIn.setIcon(new ImageIcon("Files\\Sign In Button Page1.png"));
        btnSignIn.setContentAreaFilled(false);
        btnSignIn.setBorderPainted(false);
        btnSignIn.setBounds(200, 700, 150, 60);
        pnlRight.add(btnSignIn);
        btnSignIn.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp) {
            String username = txtUsername.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();
            String password = new String(txtPass.getPassword());
            String retypePassword = new String(txtRetypePass.getPassword());

            if (!password.equals(retypePassword)) {
                JOptionPane.showMessageDialog(frame, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Capture the current date and time with desired format
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a"); // Correct AM/PM format
            String formattedDateTime = currentDateTime.format(formatter);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                writer.write(username + "," + phone + "," + email + "," + address + "," + password + "," + formattedDateTime);
                writer.newLine();
                JOptionPane.showMessageDialog(frame, "User Registered Successfully!");

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == btnSignIn) {
            frame.dispose();
            new LoginPage3(); // Assume LoginPage2 is your sign-in page
        }
    }
}
