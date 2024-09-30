import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage3 implements ActionListener {
    public JFrame frm;
    public JPanel pnlLeft, pnlRight;
    public JLabel lbl1, lbl2, lbl3, lblPnl3, lblPnl1, lblPnl2, txtBoxBar, passBoxBar, AdminLbl1, lblIAdminImg,lblErrorFace, lblError;
    public JTextField txtBx1;
    public JPasswordField pass;
    public JButton btnDarkMode, btnSignIn, btnSignUp, btnAdminSignIn,  btnCustomerSignIn, btnErrorClose, btnAboutUs;
    private boolean isDarkMode = false;

    LoginPage3() {
        frm = new JFrame("Log In Page");
        frm.setLayout(null);
        frm.setSize(950, 650);
        frm.getContentPane().setBackground(Color.decode("#2c3e50"));
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);

        pnlLeft = new JPanel();
        pnlLeft.setLayout(null);
        pnlLeft.setBackground(Color.decode("#2c3e50"));
        pnlLeft.setBounds(0, 0, 550, 650);
        frm.add(pnlLeft);

        pnlRight = new JPanel();
        pnlRight.setLayout(null);
        pnlRight.setBackground(Color.decode("#FFF8F0"));
        pnlRight.setBounds(550, 0, 430, 650);
        frm.add(pnlRight);

        ImageIcon icon = new ImageIcon("Files\\Untitled design.gif");
        JLabel lblImage = new JLabel(icon);
        lblImage.setBounds(0, 0, 550, 315);
        pnlLeft.add(lblImage);

        lbl1 = new JLabel("Hello Customer");
        lbl1.setFont(new Font("Roboto", Font.BOLD, 28));
        lbl1.setForeground(Color.LIGHT_GRAY);
        lbl1.setBounds(30, 350, 360, 30);
        pnlLeft.add(lbl1);

        lbl2 = new JLabel("<html>Welcome to <br/>Online Departmental Store </html>");
        lbl2.setFont(new Font("Roboto", Font.BOLD, 25));
        lbl2.setForeground(Color.LIGHT_GRAY);
        lbl2.setBounds(30, 390, 360, 70);
        pnlLeft.add(lbl2);

        lbl3 = new JLabel("Please Log in to Continue >>> ");
        lbl3.setFont(new Font("Roboto", Font.BOLD, 32));
        lbl3.setForeground(Color.WHITE);
        lbl3.setBounds(30, 470, 450, 90);
        pnlLeft.add(lbl3);

        btnAboutUs = new JButton("About Us >");
        btnAboutUs.setFont(new Font("Roboto" , Font.BOLD, 17));
        btnAboutUs.setForeground(Color.BLACK); // Set text color
        btnAboutUs.setBackground(Color.decode("#F7AC22")); // Set background fill color using hex code
        btnAboutUs.setContentAreaFilled(true);
        btnAboutUs.setBorderPainted(false);
        btnAboutUs.setBounds(30, 560, 125, 25);
        btnAboutUs.addActionListener(e -> aboutus());
        pnlLeft.add(btnAboutUs);

        btnDarkMode = new JButton();
        btnDarkMode.setIcon(new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\LightMode.png"));
        btnDarkMode.setFont(new Font("Roboto", Font.BOLD, 16));
        btnDarkMode.setContentAreaFilled(false);
        btnDarkMode.setBorderPainted(false);
        btnDarkMode.setBounds(220, 10, 150, 130);
        pnlRight.add(btnDarkMode);
        btnDarkMode.addActionListener(e -> turnOnDarkMode());

        lblPnl1 = new JLabel("Enter Username");
        lblPnl1.setFont(new Font("Roboto", Font.PLAIN, 20));
        lblPnl1.setBounds(30, 130, 240, 35);
        pnlRight.add(lblPnl1);

        txtBx1 = new JTextField();
        txtBx1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        txtBx1.setForeground(Color.decode("#CD1C35"));
        txtBx1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        txtBx1.setCaretColor(Color.white);
        txtBx1.setBorder(null);
        txtBx1.setOpaque(false);
        txtBx1.setBounds(30, 170, 320, 35);
        pnlRight.add(txtBx1);

        txtBoxBar = new JLabel();
        txtBoxBar.setBounds(30, 205, 320, 3);
        txtBoxBar.setOpaque(true);
        txtBoxBar.setBackground(Color.decode("#CD1C35"));
        pnlRight.add(txtBoxBar);

        lblPnl2 = new JLabel("Enter Passcode");
        lblPnl2.setFont(new Font("Roboto", Font.PLAIN, 20));
        lblPnl2.setBounds(30, 225, 240, 35);
        pnlRight.add(lblPnl2);

        pass = new JPasswordField();
        pass.setForeground(Color.decode("#CD1C35"));
        pass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass.setCaretColor(Color.white);
        pass.setBorder(null);
        pass.setOpaque(false);
        pass.setBounds(30, 265, 320, 35);
        pnlRight.add(pass);

        passBoxBar = new JLabel();
        passBoxBar.setBounds(30, 300, 320, 3);
        passBoxBar.setOpaque(true);
        passBoxBar.setBackground(Color.decode("#CD1C35"));
        pnlRight.add(passBoxBar);

        btnSignIn = new JButton();
        btnSignIn.setIcon(new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\Sign In Button Page1.png"));
        btnSignIn.setContentAreaFilled(false);
        btnSignIn.setBorderPainted(false);
        btnSignIn.setBounds(40, 340, 150, 60);
        pnlRight.add(btnSignIn);
        btnSignIn.addActionListener(e -> signIn());

        btnSignUp = new JButton();
        btnSignUp.setIcon(new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\Sign Up.png"));
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setBorderPainted(false);
        btnSignUp.setBounds(170, 340, 150, 60);
        pnlRight.add(btnSignUp);
        btnSignUp.addActionListener(this);


        ImageIcon iconErrorFace = new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\ErrorFace.png");
        lblErrorFace = new JLabel(iconErrorFace);
        lblErrorFace.setBounds(25, 420, 50, 60);
        pnlRight.add(lblErrorFace);
        lblErrorFace.setVisible(false);

        lblError = new JLabel("<html>No credentials Entered<br/>Please try again to continue...</html>");
        lblError.setFont(new Font("Roboto", Font.PLAIN, 18 ));
        lblError.setForeground(Color.WHITE);
        lblError.setBackground(Color.decode("#C94F4F"));
        lblError.setOpaque(true);
        lblError.setBounds(75, 420, 240, 60);
        pnlRight.add(lblError);
        lblError.setVisible(false);

        btnErrorClose = new JButton();
        btnErrorClose.setIcon(new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\ErrorClosed.png"));
        btnErrorClose.setContentAreaFilled(false);
        btnErrorClose.setBorderPainted(false);
        btnErrorClose.setBounds(315, 420, 50, 60);
        pnlRight.add(btnErrorClose);
        btnErrorClose.setVisible(false);
        btnErrorClose.addActionListener(e -> pressErrorClose());


        lblPnl3 = new JLabel("Not a customer?");
        lblPnl3.setFont(new Font("Roboto", Font.PLAIN, 18));
        lblPnl3.setBounds(60, 510, 180, 35);
        pnlRight.add(lblPnl3);

        btnAdminSignIn = new JButton("Log in as Admin");
        btnAdminSignIn.setFont(new Font("Roboto", Font.BOLD, 18));
        btnAdminSignIn.setContentAreaFilled(false);
        btnAdminSignIn.setBorderPainted(false);
        btnAdminSignIn.setForeground(Color.decode("#217F33"));
        btnAdminSignIn.setBounds(165, 510, 200, 35);
        pnlRight.add(btnAdminSignIn);
        btnAdminSignIn.addActionListener(e -> AdminLogIn());

        btnCustomerSignIn = new JButton("Back to Customer Log In");
        btnCustomerSignIn.setFont(new Font("Roboto", Font.BOLD, 18));
        btnCustomerSignIn.setContentAreaFilled(false);
        btnCustomerSignIn.setBorderPainted(false);
        btnCustomerSignIn.setForeground(Color.decode("#217F33"));
        btnCustomerSignIn.setBounds(80, 510, 250, 35);
        pnlRight.add(btnCustomerSignIn);
        btnCustomerSignIn.setVisible(false);
        btnCustomerSignIn.addActionListener(e -> CustomerLogin());



        ImageIcon iconAdmin = new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\AdminFrm1.png");
        JLabel lblIAdminImg = new JLabel(iconAdmin);
        lblIAdminImg.setBounds(480, 20, 450, 450);
        frm.add(lblIAdminImg);

        AdminLbl1 = new JLabel("Admin Log In");
        AdminLbl1.setFont(new Font("Roboto", Font.BOLD, 32));
        AdminLbl1.setForeground(Color.WHITE);
        AdminLbl1.setBounds(610, 420, 450, 90);
        frm.add(AdminLbl1);

        frm.setVisible(true);
    }

    private void turnOnDarkMode() {
        Color pnlBgColor, lblColor, lblPnlColor, inputBgColor, inputTextColor;


        isDarkMode = !isDarkMode;

        if (isDarkMode) {
            // Set dark mode colors
            pnlBgColor = Color.decode("#212121");
            lblColor = Color.BLACK;
            lblPnlColor = Color.WHITE;
            inputBgColor = Color.decode("#2F2F2F");
            inputTextColor = Color.WHITE;
            btnDarkMode.setIcon(new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\DarkMode.png"));
        } else {

            pnlBgColor = Color.decode("#FFF8F0");
            lblColor = Color.WHITE;
            lblPnlColor = Color.BLACK;
            inputBgColor = Color.WHITE;
            inputTextColor = Color.BLACK;
            btnDarkMode.setIcon(new ImageIcon("D:\\OneDrive - American International University-Bangladesh\\Docs\\Codes\\JAVA\\OOP-1 Java Semester 3\\FINAL PROJECT\\Files\\LightMode.png"));
        }


        pnlRight.setBackground(pnlBgColor);
        lbl1.setForeground(lblColor);
        lbl2.setForeground(lblColor);
        lbl3.setForeground(lblColor);
        lblPnl3.setForeground(lblPnlColor);
        lblPnl1.setForeground(lblPnlColor);
        lblPnl2.setForeground(lblPnlColor);
        txtBx1.setBackground(inputBgColor);
        txtBx1.setForeground(inputTextColor);
        pass.setBackground(inputBgColor);
        pass.setForeground(inputTextColor);
    }




    private void AdminLogIn() {
        pnlLeft.setVisible(false);
        lblPnl3.setVisible(false);
        btnAdminSignIn.setVisible(false);
        btnSignUp.setVisible(false);
        btnSignIn.setBounds(110, 340, 150, 60);
        btnCustomerSignIn.setVisible(true);


        final int targetX = 0;
        final int animationSpeed = 16;

        Timer timer = new Timer(8, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentX = pnlRight.getX();
                if (currentX > targetX) {
                    int newX = Math.max(targetX, currentX - animationSpeed);
                    pnlRight.setLocation(newX, pnlRight.getY());

                    if (newX == targetX) {
                        ((Timer) e.getSource()).stop();
                    }
                }
            }
        });

        timer.start();
    }

    private void CustomerLogin() {
        btnCustomerSignIn.setVisible(false);
        btnAdminSignIn.setVisible(true);
        btnSignUp.setVisible(true);
        btnSignIn.setBounds(40, 340, 150, 60);

        final int targetX = 550;
        final int animationSpeed = 16;

        Timer timer = new Timer(8, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentX = pnlRight.getX();
                if (currentX < targetX) {
                    int newX = Math.min(targetX, currentX + animationSpeed);
                    pnlRight.setLocation(newX, pnlRight.getY());


                    if (newX == targetX) {
                        ((Timer) e.getSource()).stop();

                        pnlLeft.setVisible(true);
                        lblPnl3.setVisible(true);
                    }
                }
            }
        });

        timer.start();
    }

    private void pressErrorClose() {
        lblErrorFace.setVisible(false);
        lblError.setVisible(false);
        btnErrorClose.setVisible(false);
    }


    private void signIn() {
        String username = txtBx1.getText();
        String password = new String(pass.getPassword());
        if (username.isEmpty() || password.isEmpty()) {
            lblErrorFace.setVisible(true);
            lblError.setVisible(true);
            btnErrorClose.setVisible(true);
        } else {
            frm.dispose();  // Close login page
            new LoadingPage(username);
        }
    }

    private void signUp() {
        frm.dispose();
        new SignupPage();
    }

    public static void main(String[] args) {
        new LoginPage3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp) {
            signUp();
        }
    }

    private void aboutus() {
        //frm.dispose();
        new AboutUs();
    }
}
