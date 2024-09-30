import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PcComponents implements ActionListener {
    JFrame frm3;
    public JPanel  pnlButtons, pnlCPU, pnlGPU, pnlMemory, pnlStorage, pnlMotherboard, pnlCase, pnlCooler, pnlPowerSupply  ;
    JButton btnCPU, btnGPU, btnMemory, btnStorage, btnMotherboard, btnCase, btnCooler,btnPowerSupply;
    JButton btnCPU1, btnCPU2, btnCPU3, btnCPU4;
    JButton btnGPU1, btnGPU2, btnGPU3, btnGPU4;
    JButton btnMemory1, btnMemory2, btnMemory3, btnMemory4;
    JButton btnStorage1, btnStorage2, btnStorage3, btnStorage4;
    JButton btnMotherboard1, btnMotherboard2, btnMotherboard3, btnMotherboard4;
    JButton btnCase1, btnCase2, btnCase3, btnCase4;
    JButton btnCooler1, btnCooler2, btnCooler3, btnCooler4;
    JButton btnPowerSupply1,btnPowerSupply2,btnPowerSupply3,btnPowerSupply4;
    String[] scpu = {"AMD RYZEN THREADRPPER PRO","AMD RYZEN 9 9950X","INTEL i9 14900KS","INTEL i9 14900K"};
    String[] scooler = {"CORSAIR ICUE LCD LIQUID COOLER","CORSAIR ICUE LCD LIQUID COOLER (WHITE)","CORSAIR H100X RGB ELITE","MSI MAG CORELIQUID"};
    String[] sram = {"CORSAIR 64GB DDR5","CORSAIR 96GB DDR5","CORSAIR 128GB DDR5","CORSAIR 64GB DDR5 (WHITE)"};
    String[] smb = {"ASUS ROG MAXIMUSS XII","ASUS ROG STRIX B650","GIGABYTE B650E AORUS","MSI MPG z790 Carbon"};
    String[] sgpu = {"ASUS ROG RTX 4090","ASUS ROG STRIX RTX 4080","ASUS ROG STRIX RTX 4080 (WHITE)","NVIDIA RTX A6000"};
    String[] sstorage = {"SABRENT 8 TB SSD","SAMSUNG 980 EVO PRO SSD 1 TB","CORSAIR MP600 8 TB","MSI SPATIUM 4TB"};
    String[] spsu = {"CORSAIR 1500W PLATINUM","ROG THOR 1200W PLATINUM","ROG STRIX 1000W GOLD","ROG STRIX 1000W GOLD AURA WHITE"};
    String[] scasing = {"CORSAIR ICUE 500T","COOLER MASTER TD500","ASUS ROG STRIX HELLOS","CORSAIR ICUE 500T (WHITE)"};

    double[] pcpu = {9999.99,629.99,650.99,389.99};
    double[] pcooler = {229.99,229.99,199.99,159.99};
    double[] pram = {229.99,379.99,479.99,279.99};
    double[] pmb = {549.99,299.99,249.99,469.99};
    double[] pgpu = {1999.99,1299.99,1299.99,4999.99};
    double[] pstorage = {1199.99,99.99,849.99,289.99};
    double[] ppsu = {369.99,329.99,189.99,229.99};
    double[] pcasing = {399.99,389.99,289.99,399.99};

    BuildPc bc;

    public PcComponents(BuildPc bc) {
        this.bc = bc;

        frm3 = new JFrame();
        frm3.getContentPane().setBackground(Color.decode("#FFF8F0"));
        frm3.setSize(1300, 500);
        frm3.setLayout(null);
        frm3.setLocationRelativeTo(null);
        frm3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frm3.setResizable(false);

        frm3.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frm3.setVisible(false);
            }
        });


        pnlButtons = new JPanel();
        pnlButtons.setLayout(null);
        pnlButtons.setBackground(Color.decode("#FFF8F0"));
        pnlButtons.setBounds(10, 50, 250, 500);
        frm3.add(pnlButtons);


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
        pnlCPU.setBounds(300, 0, 1000, 500);
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
        btnCPU1.addActionListener(this);
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
        btnCPU2.addActionListener(this);
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
        btnCPU3.addActionListener(this);
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
        btnCPU4.addActionListener(this);
        pnlCPU.add(btnCPU4);

        pnlGPU = new JPanel();
        pnlGPU.setLayout(new GridLayout(1, 4, 30, 30));
        pnlGPU.setBackground(Color.decode("#FFF8F0"));
        pnlGPU.setBounds(300, 0, 1000, 500);
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
        btnGPU1.addActionListener(this);
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
        btnGPU2.addActionListener(this);
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
        btnGPU3.addActionListener(this);
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
        btnGPU4.addActionListener(this);
        pnlGPU.add(btnGPU4);

        pnlMemory = new JPanel();
        pnlMemory.setLayout(new GridLayout(1, 4, 30, 30));
        pnlMemory.setBackground(Color.decode("#FFF8F0"));
        pnlMemory.setBounds(300, 0, 1000, 500);
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
        btnMemory1.addActionListener(this);
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
        btnMemory2.addActionListener(this);
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
        btnMemory3.addActionListener(this);
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
        btnMemory4.addActionListener(this);
        pnlMemory.add(btnMemory4);

        pnlStorage = new JPanel();
        pnlStorage.setLayout(new GridLayout(1, 4, 30, 30));
        pnlStorage.setBackground(Color.decode("#FFF8F0"));
        pnlStorage.setBounds(300, 0, 1000, 500);
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
        btnStorage1.addActionListener(this);
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
        btnStorage2.addActionListener(this);
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
        btnStorage3.addActionListener(this);
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
        btnStorage4.addActionListener(this);
        pnlStorage.add(btnStorage4);

        pnlMotherboard = new JPanel();
        pnlMotherboard.setLayout(new GridLayout(1, 4, 30, 30));
        pnlMotherboard.setBackground(Color.decode("#FFF8F0"));
        pnlMotherboard.setBounds(300, 0, 1000, 500);
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
        btnMotherboard1.addActionListener(this);
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
        btnMotherboard2.addActionListener(this);
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
        btnMotherboard3.addActionListener(this);
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
        btnMotherboard4.addActionListener(this);
        pnlMotherboard.add(btnMotherboard4);

        pnlCase = new JPanel();
        pnlCase.setLayout(new GridLayout(1, 4, 30, 30));
        pnlCase.setBackground(Color.decode("#FFF8F0"));
        pnlCase.setBounds(300, 0, 1000, 500);
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
        btnCase1.addActionListener(this);
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
        btnCase2.addActionListener(this);
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
        btnCase3.addActionListener(this);
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
        btnCase4.addActionListener(this);
        pnlCase.add(btnCase4);



        pnlCooler = new JPanel();
        pnlCooler.setLayout(new GridLayout(1, 4, 30, 30));
        pnlCooler.setBackground(Color.decode("#FFF8F0"));
        pnlCooler.setBounds(300, 0, 1000, 500);
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
        btnCooler1.addActionListener(this);
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
        btnCooler2.addActionListener(this);
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
        btnCooler3.addActionListener(this);
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
        btnCooler4.addActionListener(this);
        pnlCooler.add(btnCooler4);

        pnlPowerSupply = new JPanel();
        pnlPowerSupply.setLayout(new GridLayout(1, 4, 30, 30));
        pnlPowerSupply.setBackground(Color.decode("#FFF8F0"));
        pnlPowerSupply.setBounds(300, 0, 1000, 500);
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
        btnPowerSupply1.addActionListener(this);
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
        btnPowerSupply2.addActionListener(this);
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
        btnPowerSupply3.addActionListener(this);
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
        btnPowerSupply4.addActionListener(this);
        pnlPowerSupply.add(btnPowerSupply4);





        btnCPU.addActionListener(this);
        btnGPU.addActionListener(this);
        btnMemory.addActionListener(this);
        btnStorage.addActionListener(this);
        btnMotherboard.addActionListener(this);
        btnCooler.addActionListener(this);
        btnCase.addActionListener(this);
        btnPowerSupply.addActionListener(this);




        frm3.setVisible(true);
    }

   /* public void addToCart(String s)
    {

    }*/

    /*public static void main(String[] args) {
        new PcComponents();
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        String productDetails = "";
        if (e.getSource() == btnCPU) {
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
        }
        else if (e.getSource() == btnPowerSupply){
            pnlCPU.setVisible(false);
            pnlGPU.setVisible(false);
            pnlMemory.setVisible(false);
            pnlStorage.setVisible(false);
            pnlMotherboard.setVisible(false);
            pnlCooler.setVisible(false);
            pnlCase.setVisible(false);
            pnlPowerSupply.setVisible(true);
        }
        else if(e.getSource() == btnCPU1)
        {
            productDetails = "AMD RYZEN THREADRPPER PRO...$9999.99";
            HomePage.addToCart(productDetails);
            bc.back(scpu[0] , 0 , pcpu[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCPU2)
        {
            productDetails = "AMD RYZEN 9 9950X...$629.99";
            HomePage.addToCart(productDetails);
            bc.back(scpu[1] , 0 , pcpu[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCPU3)
        {
            productDetails = "INTEL i9 14900KS...$650.99";
            HomePage.addToCart(productDetails);
            bc.back(scpu[2] , 0 , pcpu[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCPU4)
        {
            productDetails = "INTEL i9 14900K...$389.99";
            HomePage.addToCart(productDetails);
            bc.back(scpu[3] , 0 , pcpu[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnGPU1)
        {
            productDetails = "ASUS ROG RTX 4090...$1999.99";
            HomePage.addToCart(productDetails);
            bc.back(sgpu[0] , 4 , pgpu[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnGPU2)
        {
            productDetails = "ASUS ROG STRIX RTX 4080...$1299.99";
            HomePage.addToCart(productDetails);
            bc.back(sgpu[1] , 4 , pgpu[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnGPU3)
        {
            productDetails = "ASUS ROG STRIX RTX 4080 (WHITE)...$1299.99";
            HomePage.addToCart(productDetails);
            bc.back(sgpu[2] , 4 , pgpu[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnGPU4)
        {
            productDetails = "NVIDIA RTX A6000..$4999.99";
            HomePage.addToCart(productDetails);
            bc.back(sgpu[3] , 4 , pgpu[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCooler1)
        {
            productDetails = "CORSAIR ICUE LCD LIQUID COOLER...$229.99";
            HomePage.addToCart(productDetails);
            bc.back(scooler[0] , 1 , pcooler[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCooler2)
        {
            productDetails = "CORSAIR ICUE LCD LIQUID COOLER (WHITE)...$229.99";
            HomePage.addToCart(productDetails);
            bc.back(scooler[1] , 1 , pcooler[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCooler3)
        {
            productDetails = "CORSAIR H100X RGB ELITE...$199.99";
            HomePage.addToCart(productDetails);
            bc.back(scooler[2] , 1 , pcooler[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCooler4)
        {
            productDetails = "MSI MAG CORELIQUID...$159.99";
            HomePage.addToCart(productDetails);
            bc.back(scooler[3] , 1 , pcooler[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMotherboard1)
        {
            productDetails = "ASUS ROG MAXIMUSS XII...$549.99";
            HomePage.addToCart(productDetails);
            bc.back(smb[0] , 2 , pmb[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMotherboard2)
        {
            productDetails = "ASUS ROG STRIX B650...$299.99";
            HomePage.addToCart(productDetails);
            bc.back(smb[1] , 2 , pmb[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMotherboard3)
        {
            productDetails = "GIGABYTE B650E AORUS...$249.99";
            HomePage.addToCart(productDetails);
            bc.back(smb[2] , 2 , pmb[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMotherboard4)
        {
            productDetails = "MSI MPG z790 Carbon...$469.99";
            HomePage.addToCart(productDetails);
            bc.back(smb[3] , 2 , pmb[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMemory1)
        {
            productDetails = "CORSAIR 64GB DDR5...$229.99";
            HomePage.addToCart(productDetails);
            bc.back(sram[0] , 3 , pram[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMemory2)
        {
            productDetails = "CORSAIR 96GB DDR5...$379.99";
            HomePage.addToCart(productDetails);
            bc.back(sram[1] , 3 , pram[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMemory3)
        {
            productDetails = "CORSAIR 128GB DDR5...$479.99";
            HomePage.addToCart(productDetails);
            bc.back(sram[2] , 3 , pram[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnMemory4)
        {
            productDetails = "CORSAIR 64GB DDR5 (WHITE)...$279.99";
            HomePage.addToCart(productDetails);
            bc.back(sram[3] , 3, pram[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnStorage1)
        {
            productDetails = "SABRENT 8 TB SSD...$1199.99";
            HomePage.addToCart(productDetails);
            bc.back(sstorage[0] , 5 , pstorage[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnStorage2)
        {
            productDetails = "SAMSUNG 980 EVO PRO SSD 1 TB...$99.99";
            HomePage.addToCart(productDetails);
            bc.back(sstorage[1] , 5 , pstorage[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnStorage3)
        {
            productDetails = "CORSAIR MP600 8 TB ...$849.99";
            HomePage.addToCart(productDetails);
            bc.back(sstorage[2] , 5 , pstorage[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnStorage4)
        {
            productDetails = "MSI SPATIUM 4TB...$289.99";
            HomePage.addToCart(productDetails);
            bc.back(sstorage[3] , 5 , pstorage[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnPowerSupply1)
        {
            productDetails = "CORSAIR 1500W PLATINUM...$369.99";
            HomePage.addToCart(productDetails);
            bc.back(spsu[0] , 6 , ppsu[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnPowerSupply2)
        {
            productDetails = "ROG THOR 1200W PLATINUM...$329.99";
            HomePage.addToCart(productDetails);
            bc.back(spsu[1] , 6, ppsu[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnPowerSupply3)
        {
            productDetails = "ROG STRIX 1000W GOLD...$189.99";
            HomePage.addToCart(productDetails);
            bc.back(spsu[2] , 6 , ppsu[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnPowerSupply4)
        {
            productDetails = "ROG STRIX 1000W GOLD AURA WHITE...$229.99";
            HomePage.addToCart(productDetails);
            bc.back(spsu[3] , 6 , ppsu[3]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCase1)
        {
            productDetails = "CORSAIR ICUE 500T...$399.99";
            HomePage.addToCart(productDetails);
            bc.back(scasing[0] , 7 , pcasing[0]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCase2)
        {
            productDetails = "COOLER MASTER TD500...$389.99";
            HomePage.addToCart(productDetails);
            bc.back(scasing[1] , 7 , pcasing[1]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCase3)
        {
            productDetails = "ASUS ROG STRIX HELLOS...$289.99";
            HomePage.addToCart(productDetails);
            bc.back(scasing[2] , 7 , pcasing[2]);
            frm3.setVisible(false);
        }
        else if(e.getSource() == btnCase4)
        {
            productDetails = "CORSAIR ICUE 500T (WHITE)...$399.99";
            HomePage.addToCart(productDetails);
            bc.back(scasing[3] , 7 , pcasing[3]);
            frm3.setVisible(false);
        }



    }
    public JPanel getPnlButtons() {
        return pnlButtons;
    }
    public JPanel getPnlCPU() {
        return pnlCPU;
    }
    public JPanel getPnlGPU() {
        return pnlGPU;
    }
    public JPanel getPnlMemory() {
        return pnlMemory;
    }
    public JPanel getPnlStorage() {
        return pnlStorage;
    }
    public JPanel getPnlMotherboard() {
        return pnlMotherboard;
    }
    public JPanel getPnlCooler() {
        return pnlCooler;
    }
    public JPanel getPnlCase(){
        return pnlCase;
    }
    public JPanel getPnlPowerSupply(){
        return pnlPowerSupply;
    }

    public void focusOnButton(JButton button) {
        button.requestFocus(); // Request focus on the specified button
    }
}