
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HomePage implements ActionListener {
    public JFrame frm3, frmCart;
    public JPanel pnl1, pnlAccount, pnlCart, pnl4, pnl5, pnlConsoles, pnlPCParts ,pnlAccessories, pnlGames;
    public JLabel lblUser, lblAccDetails, lblNAME, lblUserAddress, lblADDRESS, lblUserPhone, lblPHONE, lblUserName, lblCART, lblCartBar, lblUserBar, lblTotalPrice;
    public JButton btnCart, btnUser, btnBack, btnEditDetails,btnProceedToCheckout, btnConsoles, btnPCComponents, btnAccessories, btnGames,  btnBackCart;
    public JButton btnConsole1, btnConsole2, btnConsole3, btnConsole4, btnConsole5,btnConsole6,btnConsole7,btnConsole8;
    public JButton btnPCComponents1, btnPCComponents2, btnPCComponents3, btnPCComponents4, btnPCComponents5,btnPCComponents6,btnPCComponents7,btnPCComponents8;
    public JButton btnAccessories1, btnAccessories2, btnAccessories3, btnAccessories4, btnAccessories5, btnAccessories6, btnAccessories7, btnAccessories8;
    public JButton btnGames1,btnGames2, btnGames3, btnGames4, btnGames5, btnGames6, btnGames7, btnGames8;
    JButton btnPowerSupply, btnPowerSupply1, btnPowerSupply2, btnPowerSupply3, btnPowerSupply4, btnPCBuilder;
    JPanel  pnlPCComponents, pnlButtons, pnlCPU, pnlGPU, pnlMemory, pnlStorage, pnlMotherboard, pnlCase, pnlCooler, pnlPowerSupply ;

    JButton btnCPU, btnGPU, btnMemory, btnStorage, btnMotherboard, btnCase, btnCooler;
    JButton btnCPU1, btnCPU2, btnCPU3, btnCPU4;
    JButton btnGPU1, btnGPU2, btnGPU3, btnGPU4;
    JButton btnMemory1, btnMemory2, btnMemory3, btnMemory4;
    JButton btnStorage1, btnStorage2, btnStorage3, btnStorage4;
    JButton btnMotherboard1, btnMotherboard2, btnMotherboard3, btnMotherboard4;
    JButton btnCase1, btnCase2, btnCase3, btnCase4;
    JButton btnCooler1, btnCooler2, btnCooler3, btnCooler4;
    private static final String CART_FILE = "cart.txt";
    JTextArea cartTextArea;

    //public List<Product> products = new ArrayList<>();


    public HomePage() {
        frm3 = new JFrame("Homepage");
        frm3.getContentPane().setBackground(Color.decode("#FFF8F0"));
        frm3.setSize(1700, 1020);
        frm3.setLayout(null);
        frm3.setLocationRelativeTo(null);
        frm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm3.setResizable(false);

        btnBack = new JButton("< BACK");
        btnBack.setFont(new Font("Roboto", Font.BOLD, 17));
        btnBack.setForeground(Color.WHITE);
        btnBack.setBackground(Color.decode("#2C3E50"));
        btnBack.setContentAreaFilled(true);
        btnBack.setBorderPainted(false);
        btnBack.setBounds(50, 850, 125, 35);
        frm3.add(btnBack);


        pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBackground(Color.decode("#2C3E50"));
        pnl1.setBounds(0, 0, 1700, 80);
        frm3.add(pnl1);

        ImageIcon icong = new ImageIcon("Files\\Gameshop.png");
        JLabel lblGTitle = new JLabel(icong);
        lblGTitle.setBounds(0, 10,600, 55);
        pnl1.add(lblGTitle);

        btnPCBuilder = new JButton("BUILD YOUR OWN PC!");
        btnPCBuilder.setFont(new Font("Roboto", Font.BOLD, 17));
        btnPCBuilder.setForeground(Color.decode("#2C3E50"));
        btnPCBuilder.setBackground(Color.decode("#ff8f01"));
        btnPCBuilder.setContentAreaFilled(true);
        btnPCBuilder.setBorderPainted(false);
        btnPCBuilder.setBounds(950, 30, 300, 35);
        pnl1.add(btnPCBuilder);
        btnPCBuilder.addActionListener(this);

        /*lblUser = new JLabel("Hi "  +" !");
        lblUser.setBounds(1000, 30, 200, 40);
        lblUser.setFont(new Font("Roboto", Font.BOLD, 19));
        lblUser.setForeground(Color.WHITE);
        pnl1.add(lblUser);*/

        btnCart = new JButton();
        btnCart.setIcon(new ImageIcon("Files\\YOUR CART.png"));
        btnCart.setContentAreaFilled(false);
        btnCart.setBorderPainted(false);
        btnCart.setBounds(1430, 3, 120, 70);
        btnCart.addActionListener(this);
        pnl1.add(btnCart);

        lblCartBar = new JLabel();
        lblCartBar.setBounds(1430, 73, 120, 7);
        lblCartBar.setOpaque(true);
        lblCartBar.setBackground(Color.decode("#fe9104"));
        lblCartBar.setVisible(false);
        pnl1.add(lblCartBar);

        btnUser = new JButton();
        btnUser.setIcon(new ImageIcon("Files\\ACCOUNT.png"));
        btnUser.setContentAreaFilled(false);
        btnUser.setBorderPainted(false);
        btnUser.setBounds(1310, 3, 120, 70);
        btnUser.addActionListener(this);
        pnl1.add(btnUser);

        lblUserBar = new JLabel();
        lblUserBar.setBounds(1310, 73, 120, 7);
        lblUserBar.setOpaque(true);
        lblUserBar.setBackground(Color.decode("#fe9104"));
        lblUserBar.setVisible(true);
        pnl1.add(lblUserBar);

        pnlAccount = new JPanel();
        pnlAccount.setLayout(null);
        pnlAccount.setBackground(Color.decode("#2C3E50"));
        pnlAccount.setBounds(1300, 80, 400, 940);
        pnlAccount.setVisible(true);
        frm3.add(pnlAccount);

        lblAccDetails = new JLabel("Account Credentials");
        lblAccDetails.setBounds(30, 20, 250, 30);
        lblAccDetails.setFont(new Font("Roboto", Font.BOLD, 23));
        lblAccDetails.setForeground(Color.WHITE);
        pnlAccount.add(lblAccDetails);

        lblNAME = new JLabel("NAME");
        lblNAME.setBounds(30, 70, 200, 25);
        lblNAME.setFont(new Font("Roboto", Font.PLAIN, 17));
        lblNAME.setForeground(Color.WHITE);
        pnlAccount.add(lblNAME);

        lblUserName = new JLabel("Ahmad Zubayer");
        lblUserName.setBounds(30, 110, 200, 30);
        lblUserName.setFont(new Font("Roboto", Font.BOLD, 20));
        lblUserName.setForeground(Color.WHITE);
        pnlAccount.add(lblUserName);

        lblPHONE = new JLabel("PHONE NUMBER");
        lblPHONE.setBounds(30, 160, 200, 25);
        lblPHONE.setFont(new Font("Roboto", Font.PLAIN, 17));
        lblPHONE.setForeground(Color.WHITE);
        pnlAccount.add(lblPHONE);

        lblUserPhone = new JLabel("0100000000");
        lblUserPhone.setBounds(30, 200, 200, 30);
        lblUserPhone.setFont(new Font("Roboto", Font.BOLD, 20));
        lblUserPhone.setForeground(Color.WHITE);
        pnlAccount.add(lblUserPhone);

        lblADDRESS = new JLabel("ADDRESS");
        lblADDRESS.setBounds(30, 250, 200, 25);
        lblADDRESS.setFont(new Font("Roboto", Font.PLAIN, 17));
        lblADDRESS.setForeground(Color.WHITE);
        pnlAccount.add(lblADDRESS);

        lblUserAddress = new JLabel("AIUB");
        lblUserAddress.setBounds(30, 290, 200, 30);
        lblUserAddress.setFont(new Font("Roboto", Font.BOLD, 20));
        lblUserAddress.setForeground(Color.WHITE);
        pnlAccount.add(lblUserAddress);

        btnEditDetails = new JButton("Edit Account Info");
        btnEditDetails.setFont(new Font("Roboto", Font.BOLD, 17));
        btnEditDetails.setForeground(Color.decode("#2C3E50"));
        btnEditDetails.setBackground(Color.decode("#FFF8F0"));
        btnEditDetails.setContentAreaFilled(true);
        btnEditDetails.setBorderPainted(false);
        btnEditDetails.setBounds(90, 440, 200, 35);
        pnlAccount.add(btnEditDetails);




        pnl4 = new JPanel();
        pnl4.setLayout(null);
        pnl4.setBackground(Color.decode("#000000"));
        pnl4.setBounds(0, 80, 1300, 220);
        frm3.add(pnl4);

        ImageIcon icon = new ImageIcon("Files\\BestSelling.gif");
        JLabel lblBestSell = new JLabel(icon);
        lblBestSell.setBounds(0, 0,100, 220);
        pnl4.add(lblBestSell);

        ImageIcon icon2 = new ImageIcon("Files\\recommended.gif");
        JLabel lblRecommended = new JLabel(icon2);
        lblRecommended.setBounds(1240, 0,60, 220);
        pnl4.add(lblRecommended);

        ImageIcon icon3 = new ImageIcon("Files\\bestselling.png");
        JLabel lblBestselling = new JLabel(icon3);
        lblBestselling.setBounds(120, 0,1020, 220);
        pnl4.add(lblBestselling);

        pnl5 = new JPanel();
        pnl5.setLayout(null);
        pnl5.setBackground(Color.decode("#2C3E50"));
        pnl5.setBounds(0, 300, 1300, 45);
        frm3.add(pnl5);

        btnConsoles = new JButton("GAMING CONSOLES");
        btnConsoles.setFont(new Font("Roboto", Font.BOLD, 17));
        btnConsoles.setForeground(Color.decode("#2C3E50"));
        btnConsoles.setBackground(Color.decode("#FFF8F0"));
        btnConsoles.setContentAreaFilled(true);
        btnConsoles.setBorderPainted(false);
        btnConsoles.setBounds(200, 10, 250, 35);
        pnl5.add(btnConsoles);
        btnConsoles.addActionListener(this);

        btnPCComponents = new JButton("PC COMPONENTS");
        btnPCComponents.setFont(new Font("Roboto", Font.BOLD, 17));
        btnPCComponents.setForeground(Color.decode("#FFF8F0"));
        btnPCComponents.setBackground(Color.decode("#2C3E50"));
        btnPCComponents.setContentAreaFilled(true);
        btnPCComponents.setBorderPainted(false);
        btnPCComponents.setBounds(450, 10, 250, 35);
        pnl5.add(btnPCComponents);
        btnPCComponents.addActionListener(this);

        btnAccessories = new JButton("GAMING ACCESSORIES");
        btnAccessories.setFont(new Font("Roboto", Font.BOLD, 17));
        btnAccessories.setForeground(Color.decode("#FFF8F0"));
        btnAccessories.setBackground(Color.decode("#2C3E50"));
        btnAccessories.setContentAreaFilled(true);
        btnAccessories.setBorderPainted(false);
        btnAccessories.setBounds(700, 10, 260, 35);
        pnl5.add(btnAccessories);
        btnAccessories.addActionListener(this);

        btnGames = new JButton("GAMES");
        btnGames.setFont(new Font("Roboto", Font.BOLD, 17));
        btnGames.setForeground(Color.decode("#FFF8F0"));
        btnGames.setBackground(Color.decode("#2C3E50"));
        btnGames.setContentAreaFilled(true);
        btnGames.setBorderPainted(false);
        btnGames.setBounds(960, 10, 200, 35);
        pnl5.add(btnGames);
        btnGames.addActionListener(this);

        pnlConsoles = new JPanel();
        pnlConsoles.setLayout(new GridLayout(2, 4, 30, 30));
        pnlConsoles.setBackground(Color.decode("#FFF8F0"));
        pnlConsoles.setBounds(0, 345, 1300, 500);

        btnConsole1 = new JButton();
        btnConsole1.setIcon(new ImageIcon("\Files\\Consoles\\PlayStation 5 Pro.png"));
        btnConsole1.setContentAreaFilled(false);
        btnConsole1.setBorderPainted(false);
        btnConsole1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole1.setContentAreaFilled(true);
                btnConsole1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole1.setContentAreaFilled(false);
                btnConsole1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole1);


        btnConsole2 = new JButton();
        btnConsole2.setIcon(new ImageIcon("Files\\Consoles\\PlayStation 5.png"));
        btnConsole2.setContentAreaFilled(false);
        btnConsole2.setBorderPainted(false);
        btnConsole2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole2.setContentAreaFilled(true);
                btnConsole2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole2.setContentAreaFilled(false);
                btnConsole2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole2);


        btnConsole3 = new JButton();
        btnConsole3.setIcon(new ImageIcon("FINAL PROJECT\\Files\\Consoles\\XBOXX.png"));
        btnConsole3.setContentAreaFilled(false);
        btnConsole3.setBorderPainted(false);
        btnConsole3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole3.setContentAreaFilled(true);
                btnConsole3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole3.setContentAreaFilled(false);
                btnConsole3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole3);

        btnConsole4 = new JButton();
        btnConsole4.setIcon(new ImageIcon("FINAL PROJECT\\Files\\Consoles\\XBOXS.png"));
        btnConsole4.setContentAreaFilled(false);
        btnConsole4.setBorderPainted(false);
        btnConsole4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole4.setContentAreaFilled(true);
                btnConsole4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole4.setContentAreaFilled(false);
                btnConsole4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole4);


        btnConsole5 = new JButton();
        btnConsole5.setIcon(new ImageIcon("Files\\Consoles\\Steam.png"));
        btnConsole5.setContentAreaFilled(false);
        btnConsole5.setBorderPainted(false);
        btnConsole5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole5.setContentAreaFilled(true);
                btnConsole5.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole5.setContentAreaFilled(false);
                btnConsole5.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole5);

        btnConsole6 = new JButton();
        btnConsole6.setIcon(new ImageIcon("Files\\Consoles\\Switch.png"));
        btnConsole6.setContentAreaFilled(false);
        btnConsole6.setBorderPainted(false);
        btnConsole6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole6.setContentAreaFilled(true);
                btnConsole6.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole6.setContentAreaFilled(false);
                btnConsole6.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole6);

        btnConsole7 = new JButton();
        btnConsole7.setIcon(new ImageIcon("Files\\Consoles\\Ally.png"));
        btnConsole7.setContentAreaFilled(false);
        btnConsole7.setBorderPainted(false);
        btnConsole7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole7.setContentAreaFilled(true);
                btnConsole7.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole7.setContentAreaFilled(false);
                btnConsole7.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole7);

        btnConsole8 = new JButton();
        btnConsole8.setIcon(new ImageIcon("Files\\Consoles\\PS4.png"));
        btnConsole8.setContentAreaFilled(false);
        btnConsole8.setBorderPainted(false);
        btnConsole8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnConsole8.setContentAreaFilled(true);
                btnConsole8.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnConsole8.setContentAreaFilled(false);
                btnConsole8.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlConsoles.add(btnConsole8);

        frm3.add(pnlConsoles);








        pnlButtons = new JPanel();
        pnlButtons.setLayout(null);
        pnlButtons.setBackground(Color.decode("#FFF8F0"));
        pnlButtons.setBounds(10, 350, 250, 500);
        frm3.add(pnlButtons);
        pnlButtons.setVisible(false);


        Color originalColor = Color.decode("#2C3E50");
        Color hoverColor = Color.decode("#ffbd59");

        btnCPU = new JButton("PROCESSOR");
        btnCPU.setFont(new Font("Roboto", Font.BOLD, 17));
        btnCPU.setForeground(Color.WHITE);
        btnCPU.setBackground(originalColor);
        btnCPU.setContentAreaFilled(true);
        btnCPU.setBorderPainted(false);
        btnCPU.setBounds(0, 0, 225, 35);
        btnCPU.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCPU.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnCPU.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnCPU);


        btnGPU = new JButton("GRAPHICS");
        btnGPU.setFont(new Font("Roboto", Font.BOLD, 17));
        btnGPU.setForeground(Color.WHITE);
        btnGPU.setBackground(originalColor);
        btnGPU.setContentAreaFilled(true);
        btnGPU.setBorderPainted(false);
        btnGPU.setBounds(0, 50, 225, 35);
        btnGPU.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGPU.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnGPU.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnGPU);

        btnMemory = new JButton("MEMORY");
        btnMemory.setFont(new Font("Roboto", Font.BOLD, 17));
        btnMemory.setForeground(Color.WHITE);
        btnMemory.setBackground(originalColor);
        btnMemory.setContentAreaFilled(true);
        btnMemory.setBorderPainted(false);
        btnMemory.setBounds(0, 100, 225, 35);
        btnMemory.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMemory.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnMemory.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnMemory);

        btnStorage = new JButton("STORAGE");
        btnStorage.setFont(new Font("Roboto", Font.BOLD, 17));
        btnStorage.setForeground(Color.WHITE);
        btnStorage.setBackground(originalColor);
        btnStorage.setContentAreaFilled(true);
        btnStorage.setBorderPainted(false);
        btnStorage.setBounds(0, 150, 225, 35);
        btnStorage.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnStorage.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnStorage.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnStorage);

        btnMotherboard = new JButton("MOTHERBOARD");
        btnMotherboard.setFont(new Font("Roboto", Font.BOLD, 17));
        btnMotherboard.setForeground(Color.WHITE);
        btnMotherboard.setBackground(originalColor);
        btnMotherboard.setContentAreaFilled(true);
        btnMotherboard.setBorderPainted(false);
        btnMotherboard.setBounds(0, 200, 225, 35);
        btnMotherboard.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMotherboard.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnMotherboard.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnMotherboard);

        btnCase = new JButton("CASE");
        btnCase.setFont(new Font("Roboto", Font.BOLD, 17));
        btnCase.setForeground(Color.WHITE);
        btnCase.setBackground(originalColor);
        btnCase.setContentAreaFilled(true);
        btnCase.setBorderPainted(false);
        btnCase.setBounds(0, 250, 225, 35);
        btnCase.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCase.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnCase.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnCase);

        btnCooler = new JButton("COOLER");
        btnCooler.setFont(new Font("Roboto", Font.BOLD, 17));
        btnCooler.setForeground(Color.WHITE);
        btnCooler.setBackground(originalColor);
        btnCooler.setContentAreaFilled(true);
        btnCooler.setBorderPainted(false);
        btnCooler.setBounds(0, 300, 225, 35);
        btnCooler.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCooler.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnCooler.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnCooler);

        btnPowerSupply = new JButton("POWER SUPPLY");
        btnPowerSupply.setFont(new Font("Roboto", Font.BOLD, 17));
        btnPowerSupply.setForeground(Color.WHITE);
        btnPowerSupply.setBackground(originalColor);
        btnPowerSupply.setContentAreaFilled(true);
        btnPowerSupply.setBorderPainted(false);
        btnPowerSupply.setBounds(0, 350, 225, 35);
        btnPowerSupply.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnPowerSupply.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                btnPowerSupply.setBackground(originalColor);
            }
        });
        pnlButtons.add(btnPowerSupply);

        pnlCPU = new JPanel();
        pnlCPU.setLayout(new GridLayout(1, 4, 5, 5));
        pnlCPU.setBackground(Color.decode("#FFF8F0"));
        pnlCPU.setBounds(300, 350, 1000, 500);
        pnlCPU.setVisible(false);
        frm3.add(pnlCPU);

        btnCPU1 = new JButton();
        btnCPU1.setIcon(new ImageIcon("Files\\PC Components\\1.png"));
        btnCPU1.setContentAreaFilled(false);
        btnCPU1.setBorderPainted(false);
        btnCPU1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCPU1.setContentAreaFilled(true);
                btnCPU1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCPU1.setContentAreaFilled(false);
                btnCPU1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCPU.add(btnCPU1);


        btnCPU2 = new JButton();
        btnCPU2.setIcon(new ImageIcon("Files\\PC Components\\2.png"));
        btnCPU2.setContentAreaFilled(false);
        btnCPU2.setBorderPainted(false);
        btnCPU2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCPU2.setContentAreaFilled(true);
                btnCPU2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCPU2.setContentAreaFilled(false);
                btnCPU2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCPU.add(btnCPU2);


        btnCPU3 = new JButton();
        btnCPU3.setIcon(new ImageIcon("Files\\PC Components\\3.png"));
        btnCPU3.setContentAreaFilled(false);
        btnCPU3.setBorderPainted(false);
        btnCPU3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCPU3.setContentAreaFilled(true);
                btnCPU3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCPU3.setContentAreaFilled(false);
                btnCPU3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCPU.add(btnCPU3);

        btnCPU4 = new JButton();
        btnCPU4.setIcon(new ImageIcon("Files\\PC Components\\4.png"));
        btnCPU4.setContentAreaFilled(false);
        btnCPU4.setBorderPainted(false);
        btnCPU4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCPU4.setContentAreaFilled(true);
                btnCPU4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCPU4.setContentAreaFilled(false);
                btnCPU4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCPU.add(btnCPU4);

        pnlGPU = new JPanel();
        pnlGPU.setLayout(new GridLayout(1, 4, 30, 30));
        pnlGPU.setBackground(Color.decode("#FFF8F0"));
        pnlGPU.setBounds(300, 350, 1000, 500);
        pnlGPU.setVisible(false);
        frm3.add(pnlGPU);

        btnGPU1 = new JButton();
        btnGPU1.setIcon(new ImageIcon("Files\\PC Components\\5.png"));
        btnGPU1.setContentAreaFilled(false);
        btnGPU1.setBorderPainted(false);
        btnGPU1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGPU1.setContentAreaFilled(true);
                btnGPU1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGPU1.setContentAreaFilled(false);
                btnGPU1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGPU.add(btnGPU1);


        btnGPU2 = new JButton();
        btnGPU2.setIcon(new ImageIcon("Files\\PC Components\\6.png"));
        btnGPU2.setContentAreaFilled(false);
        btnGPU2.setBorderPainted(false);
        btnGPU2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGPU2.setContentAreaFilled(true);
                btnGPU2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGPU2.setContentAreaFilled(false);
                btnGPU2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGPU.add(btnGPU2);


        btnGPU3 = new JButton();
        btnGPU3.setIcon(new ImageIcon("Files\\PC Components\\7.png"));
        btnGPU3.setContentAreaFilled(false);
        btnGPU3.setBorderPainted(false);
        btnGPU3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGPU3.setContentAreaFilled(true);
                btnGPU3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGPU3.setContentAreaFilled(false);
                btnGPU3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGPU.add(btnGPU3);

        btnGPU4 = new JButton();
        btnGPU4.setIcon(new ImageIcon("Files\\PC Components\\8.png"));
        btnGPU4.setContentAreaFilled(false);
        btnGPU4.setBorderPainted(false);
        btnGPU4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGPU4.setContentAreaFilled(true);
                btnGPU4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGPU4.setContentAreaFilled(false);
                btnGPU4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGPU.add(btnGPU4);

        pnlMemory = new JPanel();
        pnlMemory.setLayout(new GridLayout(1, 4, 30, 30));
        pnlMemory.setBackground(Color.decode("#FFF8F0"));
        pnlMemory.setBounds(300, 350, 1000, 500);
        pnlMemory.setVisible(false);
        frm3.add(pnlMemory);

        btnMemory1 = new JButton();
        btnMemory1.setIcon(new ImageIcon("Files\\PC Components\\9.png"));
        btnMemory1.setContentAreaFilled(false);
        btnMemory1.setBorderPainted(false);
        btnMemory1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMemory1.setContentAreaFilled(true);
                btnMemory1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMemory1.setContentAreaFilled(false);
                btnMemory1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMemory.add(btnMemory1);


        btnMemory2 = new JButton();
        btnMemory2.setIcon(new ImageIcon("Files\\PC Components\\10.png"));
        btnMemory2.setContentAreaFilled(false);
        btnMemory2.setBorderPainted(false);
        btnMemory2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMemory2.setContentAreaFilled(true);
                btnMemory2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMemory2.setContentAreaFilled(false);
                btnMemory2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMemory.add(btnMemory2);


        btnMemory3 = new JButton();
        btnMemory3.setIcon(new ImageIcon("Files\\PC Components\\11.png"));
        btnMemory3.setContentAreaFilled(false);
        btnMemory3.setBorderPainted(false);
        btnMemory3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMemory3.setContentAreaFilled(true);
                btnMemory3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMemory3.setContentAreaFilled(false);
                btnMemory3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMemory.add(btnMemory3);

        btnMemory4 = new JButton();
        btnMemory4.setIcon(new ImageIcon("Files\\PC Components\\12.png"));
        btnMemory4.setContentAreaFilled(false);
        btnMemory4.setBorderPainted(false);
        btnMemory4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMemory4.setContentAreaFilled(true);
                btnMemory4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMemory4.setContentAreaFilled(false);
                btnMemory4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMemory.add(btnMemory4);

        pnlStorage = new JPanel();
        pnlStorage.setLayout(new GridLayout(1, 4, 30, 30));
        pnlStorage.setBackground(Color.decode("#FFF8F0"));
        pnlStorage.setBounds(300, 350, 1000, 500);
        pnlStorage.setVisible(false);
        frm3.add(pnlStorage);


        btnStorage1 = new JButton();
        btnStorage1.setIcon(new ImageIcon("Files\\PC Components\\13.png"));
        btnStorage1.setContentAreaFilled(false);
        btnStorage1.setBorderPainted(false);
        btnStorage1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnStorage1.setContentAreaFilled(true);
                btnStorage1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnStorage1.setContentAreaFilled(false);
                btnStorage1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlStorage.add(btnStorage1);


        btnStorage2 = new JButton();
        btnStorage2.setIcon(new ImageIcon("Files\\PC Components\\14.png"));
        btnStorage2.setContentAreaFilled(false);
        btnStorage2.setBorderPainted(false);
        btnStorage2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnStorage2.setContentAreaFilled(true);
                btnStorage2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnStorage2.setContentAreaFilled(false);
                btnStorage2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlStorage.add(btnStorage2);


        btnStorage3 = new JButton();
        btnStorage3.setIcon(new ImageIcon("Files\\PC Components\\15.png"));
        btnStorage3.setContentAreaFilled(false);
        btnStorage3.setBorderPainted(false);
        btnStorage3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnStorage3.setContentAreaFilled(true);
                btnStorage3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnStorage3.setContentAreaFilled(false);
                btnStorage3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlStorage.add(btnStorage3);

        btnStorage4 = new JButton();
        btnStorage4.setIcon(new ImageIcon("Files\\PC Components\\16.png"));
        btnStorage4.setContentAreaFilled(false);
        btnStorage4.setBorderPainted(false);
        btnStorage4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnStorage4.setContentAreaFilled(true);
                btnStorage4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnStorage4.setContentAreaFilled(false);
                btnStorage4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlStorage.add(btnStorage4);

        pnlMotherboard = new JPanel();
        pnlMotherboard.setLayout(new GridLayout(1, 4, 30, 30));
        pnlMotherboard.setBackground(Color.decode("#FFF8F0"));
        pnlMotherboard.setBounds(300, 350, 1000, 500);
        pnlMotherboard.setVisible(false);
        frm3.add(pnlMotherboard);

        btnMotherboard1 = new JButton();
        btnMotherboard1.setIcon(new ImageIcon("Files\\PC Components\\17.png"));
        btnMotherboard1.setContentAreaFilled(false);
        btnMotherboard1.setBorderPainted(false);
        btnMotherboard1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMotherboard1.setContentAreaFilled(true);
                btnMotherboard1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMotherboard1.setContentAreaFilled(false);
                btnMotherboard1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMotherboard.add(btnMotherboard1);


        btnMotherboard2 = new JButton();
        btnMotherboard2.setIcon(new ImageIcon("Files\\PC Components\\18.png"));
        btnMotherboard2.setContentAreaFilled(false);
        btnMotherboard2.setBorderPainted(false);
        btnMotherboard2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMotherboard2.setContentAreaFilled(true);
                btnMotherboard2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMotherboard2.setContentAreaFilled(false);
                btnMotherboard2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMotherboard.add(btnMotherboard2);


        btnMotherboard3 = new JButton();
        btnMotherboard3.setIcon(new ImageIcon("Files\\PC Components\\19.png"));
        btnMotherboard3.setContentAreaFilled(false);
        btnMotherboard3.setBorderPainted(false);
        btnMotherboard3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMotherboard3.setContentAreaFilled(true);
                btnMotherboard3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMotherboard3.setContentAreaFilled(false);
                btnMotherboard3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMotherboard.add(btnMotherboard3);

        btnMotherboard4 = new JButton();
        btnMotherboard4.setIcon(new ImageIcon("Files\\PC Components\\20.png"));
        btnMotherboard4.setContentAreaFilled(false);
        btnMotherboard4.setBorderPainted(false);
        btnMotherboard4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnMotherboard4.setContentAreaFilled(true);
                btnMotherboard4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnMotherboard4.setContentAreaFilled(false);
                btnMotherboard4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlMotherboard.add(btnMotherboard4);

        pnlCase = new JPanel();
        pnlCase.setLayout(new GridLayout(1, 4, 30, 30));
        pnlCase.setBackground(Color.decode("#FFF8F0"));
        pnlCase.setBounds(300, 350, 1000, 500);
        pnlCase.setVisible(false);
        frm3.add(pnlCase);

        btnCase1 = new JButton();
        btnCase1.setIcon(new ImageIcon("Files\\PC Components\\21.png"));
        btnCase1.setContentAreaFilled(false);
        btnCase1.setBorderPainted(false);
        btnCase1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCase1.setContentAreaFilled(true);
                btnCase1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCase1.setContentAreaFilled(false);
                btnCase1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCase.add(btnCase1);


        btnCase2 = new JButton();
        btnCase2.setIcon(new ImageIcon("Files\\PC Components\\22.png"));
        btnCase2.setContentAreaFilled(false);
        btnCase2.setBorderPainted(false);
        btnCase2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCase2.setContentAreaFilled(true);
                btnCase2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCase2.setContentAreaFilled(false);
                btnCase2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCase.add(btnCase2);


        btnCase3 = new JButton();
        btnCase3.setIcon(new ImageIcon("Files\\PC Components\\23.png"));
        btnCase3.setContentAreaFilled(false);
        btnCase3.setBorderPainted(false);
        btnCase3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCase3.setContentAreaFilled(true);
                btnCase3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCase3.setContentAreaFilled(false);
                btnCase3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCase.add(btnCase3);

        btnCase4 = new JButton();
        btnCase4.setIcon(new ImageIcon("Files\\PC Components\\24.png"));
        btnCase4.setContentAreaFilled(false);
        btnCase4.setBorderPainted(false);
        btnCase4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCase4.setContentAreaFilled(true);
                btnCase4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCase4.setContentAreaFilled(false);
                btnCase4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCase.add(btnCase4);



        pnlCooler = new JPanel();
        pnlCooler.setLayout(new GridLayout(1, 4, 30, 30));
        pnlCooler.setBackground(Color.decode("#FFF8F0"));
        pnlCooler.setBounds(300, 350, 1000, 500);
        pnlCooler.setVisible(false);
        frm3.add(pnlCooler);

        btnCooler1 = new JButton();
        btnCooler1.setIcon(new ImageIcon("Files\\PC Components\\25.png"));
        btnCooler1.setContentAreaFilled(false);
        btnCooler1.setBorderPainted(false);
        btnCooler1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCooler1.setContentAreaFilled(true);
                btnCooler1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCooler1.setContentAreaFilled(false);
                btnCooler1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCooler.add(btnCooler1);


        btnCooler2 = new JButton();
        btnCooler2.setIcon(new ImageIcon("Files\\PC Components\\26.png"));
        btnCooler2.setContentAreaFilled(false);
        btnCooler2.setBorderPainted(false);
        btnCooler2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCooler2.setContentAreaFilled(true);
                btnCooler2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCooler2.setContentAreaFilled(false);
                btnCooler2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCooler.add(btnCooler2);


        btnCooler3 = new JButton();
        btnCooler3.setIcon(new ImageIcon("Files\\PC Components\\27.png"));
        btnCooler3.setContentAreaFilled(false);
        btnCooler3.setBorderPainted(false);
        btnCooler3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCooler3.setContentAreaFilled(true);
                btnCooler3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCooler3.setContentAreaFilled(false);
                btnCooler3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCooler.add(btnCooler3);

        btnCooler4 = new JButton();
        btnCooler4.setIcon(new ImageIcon("Files\\PC Components\\28.png"));
        btnCooler4.setContentAreaFilled(false);
        btnCooler4.setBorderPainted(false);
        btnCooler4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCooler4.setContentAreaFilled(true);
                btnCooler4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnCooler4.setContentAreaFilled(false);
                btnCooler4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlCooler.add(btnCooler4);

        pnlPowerSupply = new JPanel();
        pnlPowerSupply.setLayout(new GridLayout(1, 4, 30, 30));
        pnlPowerSupply.setBackground(Color.decode("#FFF8F0"));
        pnlPowerSupply.setBounds(300, 350, 1000, 500);
        pnlPowerSupply.setVisible(false);
        frm3.add(pnlPowerSupply);

        btnPowerSupply1 = new JButton();
        btnPowerSupply1.setIcon(new ImageIcon("Files\\PC Components\\29.png"));
        btnPowerSupply1.setContentAreaFilled(false);
        btnPowerSupply1.setBorderPainted(false);
        btnPowerSupply1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnPowerSupply1.setContentAreaFilled(true);
                btnPowerSupply1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnPowerSupply1.setContentAreaFilled(false);
                btnPowerSupply1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlPowerSupply.add(btnPowerSupply1);


        btnPowerSupply2 = new JButton();
        btnPowerSupply2.setIcon(new ImageIcon("Files\\PC Components\\30.png"));
        btnPowerSupply2.setContentAreaFilled(false);
        btnPowerSupply2.setBorderPainted(false);
        btnPowerSupply2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnPowerSupply2.setContentAreaFilled(true);
                btnPowerSupply2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnPowerSupply2.setContentAreaFilled(false);
                btnPowerSupply2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlPowerSupply.add(btnPowerSupply2);


        btnPowerSupply3 = new JButton();
        btnPowerSupply3.setIcon(new ImageIcon("Files\\PC Components\\31.png"));
        btnPowerSupply3.setContentAreaFilled(false);
        btnPowerSupply3.setBorderPainted(false);
        btnPowerSupply3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnPowerSupply3.setContentAreaFilled(true);
                btnPowerSupply3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnPowerSupply3.setContentAreaFilled(false);
                btnPowerSupply3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlPowerSupply.add(btnPowerSupply3);

        btnPowerSupply4 = new JButton();
        btnPowerSupply4.setIcon(new ImageIcon("Files\\PC Components\\32.png"));
        btnPowerSupply4.setContentAreaFilled(false);
        btnPowerSupply4.setBorderPainted(false);
        btnPowerSupply4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnPowerSupply4.setContentAreaFilled(true);
                btnPowerSupply4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnPowerSupply4.setContentAreaFilled(false);
                btnPowerSupply4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlPowerSupply.add(btnPowerSupply4);





        btnCPU.addActionListener(this);
        btnGPU.addActionListener(this);
        btnMemory.addActionListener(this);
        btnStorage.addActionListener(this);
        btnMotherboard.addActionListener(this);
        btnCooler.addActionListener(this);
        btnCase.addActionListener(this);
        btnPowerSupply.addActionListener(this);




        pnlAccessories = new JPanel();
        pnlAccessories.setLayout(new GridLayout(2, 4, 30, 30));
        pnlAccessories.setBackground(Color.decode("#FFF8F0"));
        pnlAccessories.setBounds(0, 345, 1300, 500);

        btnAccessories1 = new JButton();
        btnAccessories1.setIcon(new ImageIcon("Files\\Consoles\\samsung.png"));
        btnAccessories1.setContentAreaFilled(false);
        btnAccessories1.setBorderPainted(false);
        btnAccessories1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories1.setContentAreaFilled(true);
                btnAccessories1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories1.setContentAreaFilled(false);
                btnAccessories1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories1);


        btnAccessories2 = new JButton();
        btnAccessories2.setIcon(new ImageIcon("Files\\Consoles\\Wheel.png"));
        btnAccessories2.setContentAreaFilled(false);
        btnAccessories2.setBorderPainted(false);
        btnAccessories2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories2.setContentAreaFilled(true);
                btnAccessories2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories2.setContentAreaFilled(false);
                btnAccessories2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories2);


        btnAccessories3 = new JButton();
        btnAccessories3.setIcon(new ImageIcon("Files\\Consoles\\SonyWH.png"));
        btnAccessories3.setContentAreaFilled(false);
        btnAccessories3.setBorderPainted(false);
        btnAccessories3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories3.setContentAreaFilled(true);
                btnAccessories3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories3.setContentAreaFilled(false);
                btnAccessories3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories3);

        btnAccessories4 = new JButton();
        btnAccessories4.setIcon(new ImageIcon("Files\\Consoles\\RazerH.png"));
        btnAccessories4.setContentAreaFilled(false);
        btnAccessories4.setBorderPainted(false);
        btnAccessories4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories4.setContentAreaFilled(true);
                btnAccessories4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories4.setContentAreaFilled(false);
                btnAccessories4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories4);


        btnAccessories5 = new JButton();
        btnAccessories5.setIcon(new ImageIcon("Files\\Consoles\\Steel.png"));
        btnAccessories5.setContentAreaFilled(false);
        btnAccessories5.setBorderPainted(false);
        btnAccessories5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories5.setContentAreaFilled(true);
                btnAccessories5.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories5.setContentAreaFilled(false);
                btnAccessories5.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories5);

        btnAccessories6 = new JButton();
        btnAccessories6.setIcon(new ImageIcon("Files\\Consoles\\RazerM.png"));
        btnAccessories6.setContentAreaFilled(false);
        btnAccessories6.setBorderPainted(false);
        btnAccessories6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories6.setContentAreaFilled(true);
                btnAccessories6.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories6.setContentAreaFilled(false);
                btnAccessories6.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories6);

        btnAccessories7 = new JButton();
        btnAccessories7.setIcon(new ImageIcon("Files\\Consoles\\RazerK.png"));
        btnAccessories7.setContentAreaFilled(false);
        btnAccessories7.setBorderPainted(false);
        btnAccessories7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories7.setContentAreaFilled(true);
                btnAccessories7.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories7.setContentAreaFilled(false);
                btnAccessories7.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories7);

        btnAccessories8 = new JButton();
        btnAccessories8.setIcon(new ImageIcon("Files\\Consoles\\razerv3.png"));
        btnAccessories8.setContentAreaFilled(false);
        btnAccessories8.setBorderPainted(false);
        btnAccessories8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnAccessories8.setContentAreaFilled(true);
                btnAccessories8.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnAccessories8.setContentAreaFilled(false);
                btnAccessories8.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlAccessories.add(btnAccessories8);

        frm3.add(pnlAccessories);

        pnlGames = new JPanel();
        pnlGames.setLayout(new GridLayout(2, 4, 30, 30));
        pnlGames.setBackground(Color.decode("#FFF8F0"));
        pnlGames.setBounds(0, 345, 1300, 500);

        btnGames1 = new JButton();
        btnGames1.setIcon(new ImageIcon("Files\\Consoles\\gta6.png"));
        btnGames1.setContentAreaFilled(false);
        btnGames1.setBorderPainted(false);
        btnGames1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames1.setContentAreaFilled(true);
                btnGames1.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames1.setContentAreaFilled(false);
                btnGames1.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames1);


        btnGames2 = new JButton();
        btnGames2.setIcon(new ImageIcon("Files\\Consoles\\forza5.png"));
        btnGames2.setContentAreaFilled(false);
        btnGames2.setBorderPainted(false);
        btnGames2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames2.setContentAreaFilled(true);
                btnGames2.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames2.setContentAreaFilled(false);
                btnGames2.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames2);


        btnGames3 = new JButton();
        btnGames3.setIcon(new ImageIcon("Files\\Consoles\\flight.png"));
        btnGames3.setContentAreaFilled(false);
        btnGames3.setBorderPainted(false);
        btnGames3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames3.setContentAreaFilled(true);
                btnGames3.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames3.setContentAreaFilled(false);
                btnGames3.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames3);

        btnGames4 = new JButton();
        btnGames4.setIcon(new ImageIcon("Files\\Consoles\\cod.png"));
        btnGames4.setContentAreaFilled(false);
        btnGames4.setBorderPainted(false);
        btnGames4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames4.setContentAreaFilled(true);
                btnGames4.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames4.setContentAreaFilled(false);
                btnGames4.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames4);


        btnGames5 = new JButton();
        btnGames5.setIcon(new ImageIcon("Files\\Consoles\\rdr2.png"));
        btnGames5.setContentAreaFilled(false);
        btnGames5.setBorderPainted(false);
        btnGames5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames5.setContentAreaFilled(true);
                btnGames5.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames5.setContentAreaFilled(false);
                btnGames5.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames5);

        btnGames6 = new JButton();
        btnGames6.setIcon(new ImageIcon("Files\\Consoles\\cp2077.png"));
        btnGames6.setContentAreaFilled(false);
        btnGames6.setBorderPainted(false);
        btnGames6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames6.setContentAreaFilled(true);
                btnGames6.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames6.setContentAreaFilled(false);
                btnGames6.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames6);

        btnGames7 = new JButton();
        btnGames7.setIcon(new ImageIcon("Files\\Consoles\\hi.png"));
        btnGames7.setContentAreaFilled(false);
        btnGames7.setBorderPainted(false);
        btnGames7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames7.setContentAreaFilled(true);
                btnGames7.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames7.setContentAreaFilled(false);
                btnGames7.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames7);

        btnGames8 = new JButton();
        btnGames8.setIcon(new ImageIcon("Files\\Consoles\\edr.png"));
        btnGames8.setContentAreaFilled(false);
        btnGames8.setBorderPainted(false);
        btnGames8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnGames8.setContentAreaFilled(true);
                btnGames8.setBackground(Color.decode("#ffbd59"));
            }
            public void mouseExited(MouseEvent e) {
                btnGames8.setContentAreaFilled(false);
                btnGames8.setBackground(Color.decode("#FFF8F0"));
            }
        });
        pnlGames.add(btnGames8);

        frm3.add(pnlGames);


        btnUser.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnUser.setIcon(new ImageIcon("Files\\ACCOUNT hover.jpg"));

            }

            public void mouseExited(MouseEvent e) {
                btnUser.setIcon(new ImageIcon("Files\\ACCOUNT.png"));
            }
        });

        btnCart.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnCart.setIcon(new ImageIcon("Files\\YOUR CART hover.jpg"));
            }
            public void mouseExited(MouseEvent e) {
                btnCart.setIcon(new ImageIcon("Files\\YOUR CART.png"));
            }
        });

        btnEditDetails.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnEditDetails.setBackground(Color.decode("#fe9104"));
            }

            public void mouseExited(MouseEvent e) {
                btnEditDetails.setBackground(Color.decode("#fff8f0"));
            }
        });



        btnConsole1.addActionListener(this);
        btnConsole2.addActionListener(this);
        btnConsole3.addActionListener(this);
        btnConsole4.addActionListener(this);
        btnConsole5.addActionListener(this);
        btnConsole6.addActionListener(this);
        btnConsole7.addActionListener(this);
        btnConsole8.addActionListener(this);
        btnAccessories1.addActionListener(this);
        btnAccessories2.addActionListener(this);
        btnAccessories3.addActionListener(this);
        btnAccessories4.addActionListener(this);
        btnAccessories5.addActionListener(this);
        btnAccessories6.addActionListener(this);
        btnAccessories7.addActionListener(this);
        btnAccessories8.addActionListener(this);
        btnGames1.addActionListener(this);
        btnGames2.addActionListener(this);
        btnGames3.addActionListener(this);
        btnGames4.addActionListener(this);
        btnGames5.addActionListener(this);
        btnGames6.addActionListener(this);
        btnGames7.addActionListener(this);
        btnGames8.addActionListener(this);
        btnCPU1.addActionListener(this);
        btnCPU2.addActionListener(this);
        btnCPU3.addActionListener(this);
        btnCPU4.addActionListener(this);
        btnGPU1.addActionListener(this);
        btnGPU2.addActionListener(this);
        btnGPU3.addActionListener(this);
        btnGPU4.addActionListener(this);
        btnMemory1.addActionListener(this);
        btnMemory2.addActionListener(this);
        btnMemory3.addActionListener(this);
        btnMemory4.addActionListener(this);
        btnStorage1.addActionListener(this);
        btnStorage2.addActionListener(this);
        btnStorage3.addActionListener(this);
        btnStorage4.addActionListener(this);
        btnMotherboard1.addActionListener(this);
        btnMotherboard2.addActionListener(this);
        btnMotherboard3.addActionListener(this);
        btnMotherboard4.addActionListener(this);
        btnCooler1.addActionListener(this);
        btnCooler2.addActionListener(this);
        btnCooler3.addActionListener(this);
        btnCooler4.addActionListener(this);
        btnCase1.addActionListener(this);
        btnCase2.addActionListener(this);
        btnCase3.addActionListener(this);
        btnCase4.addActionListener(this);
        btnPowerSupply1.addActionListener(this);
        btnPowerSupply2.addActionListener(this);
        btnPowerSupply3.addActionListener(this);
        btnPowerSupply4.addActionListener(this);
        btnBack.addActionListener(this);


        frm3.setVisible(true);
    }

    public static void main(String[] args) {
        new HomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String productDetails = "";
        if (e.getSource() == btnCart) {
            lblCartBar.setVisible(true);
            lblUserBar.setVisible(false);
            cart();
            frmCart.setVisible(true);
            displayCartContents();
        } else if (e.getSource() == btnConsoles) {
            pnlConsoles.setVisible(true);
            pnlGames.setVisible(false);
            pnlAccessories.setVisible(false);
            pnlButtons.setVisible(false);
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            btnConsoles.setForeground(Color.decode("#2C3E50"));
            btnConsoles.setBackground(Color.decode("#FFF8F0"));
            btnPCComponents.setForeground(Color.decode("#FFF8F0"));
            btnPCComponents.setBackground(Color.decode("#2C3E50"));
            btnAccessories.setForeground(Color.decode("#FFF8F0"));
            btnAccessories.setBackground(Color.decode("#2C3E50"));
            btnGames.setForeground(Color.decode("#FFF8F0"));
            btnGames.setBackground(Color.decode("#2C3E50"));
        } else if (e.getSource() == btnPCComponents) {
            pnlConsoles.setVisible(false);
            pnlGames.setVisible(false);
            pnlAccessories.setVisible(false);
            pnlButtons.setVisible(true);
            pnlCPU.setVisible(true);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            btnPCComponents.setForeground(Color.decode("#2C3E50"));
            btnPCComponents.setBackground(Color.decode("#FFF8F0"));
            btnConsoles.setForeground(Color.decode("#FFF8F0"));
            btnConsoles.setBackground(Color.decode("#2C3E50"));
            btnAccessories.setForeground(Color.decode("#FFF8F0"));
            btnAccessories.setBackground(Color.decode("#2C3E50"));
            btnGames.setForeground(Color.decode("#FFF8F0"));
            btnGames.setBackground(Color.decode("#2C3E50"));
        } else if (e.getSource() == btnGames) {
            pnlConsoles.setVisible(false);
            pnlButtons.setVisible(false);
            pnlAccessories.setVisible(false);
            pnlGames.setVisible(true);
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
            btnGames.setForeground(Color.decode("#2C3E50"));
            btnGames.setBackground(Color.decode("#FFF8F0"));
            btnConsoles.setForeground(Color.decode("#FFF8F0"));
            btnConsoles.setBackground(Color.decode("#2C3E50"));
            btnAccessories.setForeground(Color.decode("#FFF8F0"));
            btnAccessories.setBackground(Color.decode("#2C3E50"));
            btnPCComponents.setForeground(Color.decode("#FFF8F0"));
            btnPCComponents.setBackground(Color.decode("#2C3E50"));
        } else if (e.getSource() == btnAccessories) {
            pnlConsoles.setVisible(false);
            pnlButtons.setVisible(false);
            pnlGames.setVisible(false);
            pnlAccessories.setVisible(true);
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
            btnAccessories.setForeground(Color.decode("#2C3E50"));
            btnAccessories.setBackground(Color.decode("#FFF8F0"));
            btnConsoles.setForeground(Color.decode("#FFF8F0"));
            btnConsoles.setBackground(Color.decode("#2C3E50"));
            btnGames.setForeground(Color.decode("#FFF8F0"));
            btnGames.setBackground(Color.decode("#2C3E50"));
            btnPCComponents.setForeground(Color.decode("#FFF8F0"));
            btnPCComponents.setBackground(Color.decode("#2C3E50"));
        } else if (e.getSource() == btnCPU) {
            pnlCPU.setVisible(true);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnGPU) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(true);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnMemory) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(true);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnStorage) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(true);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnMotherboard) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(true);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnCooler) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(true);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnCase) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(true);
            pnlPowerSupply.setVisible(false);
        } else if (e.getSource() == btnPowerSupply) {
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(true);
        }else if(e.getSource() == btnBackCart) {
            frmCart.setVisible(false);
            lblCartBar.setVisible(false);
            lblUserBar.setVisible(true);
        }else  if (e.getSource() == btnConsole1) {
            new Ps5Pro();
        } else if (e.getSource() == btnConsole2) {
            new Ps5();
        } else if(e.getSource() == btnConsole6 ) {
            new NintendoS();
        } else if(e.getSource() == btnConsole5 ) {
            new ValveSteamDeck();
        } else if(e.getSource() == btnConsole4 ) {
            new XboxSeriesS();
        } else if(e.getSource() == btnConsole7 ) {
            new Rog();
        } else if(e.getSource() == btnConsole8 ) {
            new Ps4();
        } else if(e.getSource() == btnConsole3 ) {
            new XboxSeriesX();
        }else  if (e.getSource() == btnAccessories1) {
            new SamsungOA();
        } else if (e.getSource() == btnAccessories2) {
            new Thrustmaster();
        } else if(e.getSource() == btnAccessories3 ) {
            new SonyWH();
        } else if(e.getSource() == btnAccessories4 ) {
            new RazerBP();
        } else if(e.getSource() == btnAccessories5 ) {
            new SteelSeriesAP();
        } else if(e.getSource() == btnAccessories6) {
            new RazerNVP();
        } else if(e.getSource() == btnAccessories7 ) {
            new RazerBVP();
        } else if(e.getSource() == btnAccessories8 ) {
            new RazerWVP();
        } else if(e.getSource() == btnGames1 ) {
            new GTA6();
        } else if(e.getSource() == btnGames3 ) {
            new MicrosoftFS();
        } else if(e.getSource() == btnGames2 ) {
            new FH5();
        } else if(e.getSource() == btnGames4 ) {
            new CoDIW();
        } else if(e.getSource() == btnGames5  ) {
            new RDR2();
        } else if(e.getSource() == btnGames6 ) {
            new Cyberpunk();
        } else if(e.getSource() == btnGames7 ) {
            new HaloIn();
        } else if(e.getSource() == btnGames8 ) {
            new ElderRing();
        } else if(e.getSource() == btnCPU1) {
            productDetails = "AMD RYZEN THREADRPPER PRO...$9999.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnCPU2) {
            productDetails = "AMD RYZEN 9 9950X...$629.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnCPU3) {
            productDetails = "INTEL i9 14900KS...$650.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCPU4) {
            productDetails = "INTEL i9 14900K...$389.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnGPU1) {
            productDetails = "ASUS ROG RTX 4090...$1999.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnGPU2) {
            productDetails = "ASUS ROG STRIX RTX 4080...$1299.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnGPU3) {
            productDetails = "ASUS ROG STRIX RTX 4080 (WHITE)...$1299.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnGPU4) {
            productDetails = "NVIDIA RTX A6000..$4999.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnMemory1) {
            productDetails = "CORSAIR 64GB DDR5...$229.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnMemory2) {
            productDetails = "CORSAIR 96GB DDR5...$379.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnMemory3) {
            productDetails = "CORSAIR 128GB DDR5...$479.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnMemory4) {
            productDetails = "CORSAIR 64GB DDR5 (WHITE)...$279.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnStorage1) {
            productDetails = "SABRENT 8 TB SSD...$1199.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnStorage2) {
            productDetails = "SAMSUNG 980 EVO PRO SSD 1 TB...$99.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnStorage3) {
            productDetails = "CORSAIR MP600 8 TB ...$849.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnStorage4) {
            productDetails = "MSI SPATIUM 4TB...$289.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnMotherboard1) {
            productDetails = "ASUS ROG MAXIMUSS XII...$549.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnMotherboard2) {
            productDetails = "ASUS ROG STRIX B650...$299.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnMotherboard3) {
            productDetails = "GIGABYTE B650E AORUS...$249.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnMotherboard4) {
            productDetails = "MSI MPG z790 Carbon...$469.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCase1) {
            productDetails = "CORSAIR ICUE 500T...$399.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCase2) {
            productDetails = "COOLER MASTER TD500...$389.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCase3) {
            productDetails = "ASUS ROG STRIX HELLOS...$289.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCase4) {
            productDetails = "CORSAIR ICUE 500T (WHITE)...$399.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCooler1) {
            productDetails = "CORSAIR ICUE LCD LIQUID COOLER...$229.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCooler2) {
            productDetails = "CORSAIR ICUE LCD LIQUID COOLER (WHITE)...$229.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCooler3) {
            productDetails = "CORSAIR H100X RGB ELITE...$199.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnCooler4) {
            productDetails = "MSI MAG CORELIQUID...$159.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnPowerSupply1) {
            productDetails = "CORSAIR 1500W PLATINUM...$369.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnPowerSupply2) {
            productDetails = "ROG THOR 1200W PLATINUM...$329.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnPowerSupply3) {
            productDetails = "ROG STRIX 1000W GOLD...$189.99";
            addToCart(productDetails);
        }else if(e.getSource() == btnPowerSupply4) {
            productDetails = "ROG STRIX 1000W GOLD AURA WHITE...$229.99";
            addToCart(productDetails);
        } else if(e.getSource() == btnPCBuilder) {
            new BuildPc();
        } else if (e.getSource() == btnProceedToCheckout) {
            new PurchaseConfirmed();
        }  else if (e.getSource() == btnBack) {
            frm3.dispose();
            new LoginPage2();
        }
    }

    static void addToCart(String productDetails) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CART_FILE, true))) {
            writer.write(productDetails);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cart() {
        frmCart = new JFrame();
        frmCart.setSize(850, 700);
        frmCart.getContentPane().setBackground(Color.decode("#1e1f22"));
        frmCart.setLayout(null);
        frmCart.setLocationRelativeTo(null);
        frmCart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCart.setResizable(false);

        JPanel pnlcarttextArea = new JPanel();
        pnlcarttextArea.setLayout(null);
        pnlcarttextArea.setBackground(Color.decode("#2C3E50"));
        pnlcarttextArea.setBounds(0, 0, 470, 700);
        frmCart.add(pnlcarttextArea);

        ImageIcon icon = new ImageIcon("Files\\YOUR CART1.png");
        JLabel lblImage = new JLabel(icon);
        lblImage.setBounds(10, 10, 400, 120);
        pnlcarttextArea.add(lblImage);

        cartTextArea = new JTextArea();
        cartTextArea.setEditable(false);
        cartTextArea.setLineWrap(true);
        cartTextArea.setWrapStyleWord(true);
        cartTextArea.setFont(new Font("ROBOTO", Font.BOLD, 18));
        cartTextArea.setForeground(Color.decode("#e2e2e2"));
        cartTextArea.setBackground(Color.decode("#2C3E50"));
        cartTextArea.setBounds(20, 180, 400, 450);
        cartTextArea.setBorder(BorderFactory.createEmptyBorder()); 
        pnlcarttextArea.add(cartTextArea);

        lblTotalPrice = new JLabel("Total Price: $0.00");
        lblTotalPrice.setBounds(520, 200, 300, 40); 
        lblTotalPrice.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblTotalPrice.setForeground(Color.decode("#ffbd59"));
        frmCart.add(lblTotalPrice);

        btnProceedToCheckout = new JButton("$ PROCEED TO CHECKOUT >");
        btnProceedToCheckout.setFont(new Font("Roboto", Font.BOLD, 17));
        btnProceedToCheckout.setBackground(Color.decode("#00bf63"));
        btnProceedToCheckout.setForeground(Color.decode("#FFF8F0"));
        btnProceedToCheckout.setContentAreaFilled(true);
        btnProceedToCheckout.setBorderPainted(false);
        btnProceedToCheckout.setBounds(520, 480, 260, 35);

        btnProceedToCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                btnProceedToCheckout.setBackground(Color.decode("#00bf62"));
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                btnProceedToCheckout.setBackground(Color.decode("#00bf63"));
            }
        });

        btnProceedToCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmCart.dispose();
                new PurchaseConfirmed();
            }
        });

        frmCart.add(btnProceedToCheckout);


        btnBackCart = new JButton("BACK");
        btnBackCart.setFont(new Font("Roboto", Font.BOLD, 17));
        btnBackCart.setBackground(Color.decode("#007eff")); 
        btnBackCart.setForeground(Color.decode("#FFF8F0"));
        btnBackCart.setContentAreaFilled(true);
        btnBackCart.setBorderPainted(false);
        btnBackCart.setBounds(520, 530, 260, 35);
        btnBackCart.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnBackCart.setBackground(Color.decode("#00bf62"));
            }

            public void mouseExited(MouseEvent e) {
                btnBackCart.setBackground(Color.decode("#007eff"));
            }
        });
        btnBackCart.addActionListener(this);
        frmCart.add(btnBackCart);

        JButton btnRemoveItem = new JButton("REMOVE ITEM");
        btnRemoveItem.setFont(new Font("Roboto", Font.BOLD, 17));
        btnRemoveItem.setBackground(Color.decode("#ff4d4d"));
        btnRemoveItem.setForeground(Color.decode("#FFF8F0"));
        btnRemoveItem.setContentAreaFilled(true);
        btnRemoveItem.setBorderPainted(false);
        btnRemoveItem.setBounds(650, 60, 160, 35); 
        btnRemoveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemToRemove = JOptionPane.showInputDialog(frmCart, "Enter the item to remove:", "Remove Item", JOptionPane.PLAIN_MESSAGE);
                if (itemToRemove != null && !itemToRemove.trim().isEmpty()) {
                    removeItemFromCart(itemToRemove);
                    displayCartContents(); 
                }
            }
        });
        frmCart.add(btnRemoveItem);


        JButton btnClearCart = new JButton("CLEAR CART");
        btnClearCart.setFont(new Font("Roboto", Font.BOLD, 17));
        btnClearCart.setBackground(Color.decode("#ff4d4d")); 
        btnClearCart.setForeground(Color.decode("#FFF8F0"));
        btnClearCart.setContentAreaFilled(true);
        btnClearCart.setBorderPainted(false);
        btnClearCart.setBounds(650, 10, 160, 35); 
        btnClearCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the cart file
                try (PrintWriter writer = new PrintWriter("cart.txt")) {
                    writer.print(""); // Clear the content of the file
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // Clear the text area
                cartTextArea.setText("");
                lblTotalPrice.setText("Total Price: $0.00"); // Reset the total price label
            }
        });
        frmCart.add(btnClearCart);

        frmCart.setVisible(false);
    }

    private void removeItemFromCart(String itemToRemove) {
        File inputFile = new File(CART_FILE);
        File tempFile = new File("temp_cart.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean itemFound = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(itemToRemove) && !itemFound) {
                    itemFound = true;
                } else {
                    writer.write(line);
                    writer.newLine();
                }
            }

            if (!itemFound) {
                JOptionPane.showMessageDialog(frmCart, "Item not found in cart.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!inputFile.delete()) {
            System.err.println("Could not delete original cart file.");
            return;
        }
        if (!tempFile.renameTo(inputFile)) {
            System.err.println("Could not rename temp cart file.");
        }
    }



    private void displayCartContents() {
        double totalPrice = 0.0;
        StringBuilder cartContents = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(CART_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                cartContents.append(line).append("\n");


                String[] parts = line.split("\\.\\.+\\$");
                if (parts.length == 2) {
                    try {
                        double price = Double.parseDouble(parts[1]);
                        totalPrice += price;
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        cartTextArea.setText(cartContents.toString());
        lblTotalPrice.setText("Total Price: $" + String.format("%.2f", totalPrice));
    }

}

