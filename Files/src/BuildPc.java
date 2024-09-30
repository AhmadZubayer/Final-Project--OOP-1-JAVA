import javax.swing.*;
import javax.swing.border.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BuildPc implements ActionListener{

    public JFrame fr;
    public JPanel p1,price,cpu,cooler,mb,ram,gpu,storage,psu,casing;
    public JLabel top,lcpu,lcooler,lram,lmb,lgpu,lstorage,lpsu,lcasing;
    public JButton bcpu,bcooler,bram,bmb,bgpu,bstorage,bpsu,bcasing,bprice;
    Font customFont;
    String[] pcC = {"CPU","CPU COOLER","MOTHERBOARD","RAM","GRAPHICS CARD","STORAGE","POWER SUPPLY","CASING"};
    double pr = 0;
    double[] lastSelectedPrice = {0,0,0,0,0,0,0,0};

    public BuildPc()
    {

        Color originalColor = Color.decode("#2C3E50");
        Color hoverColor = Color.decode("#ffbd59");

        /*try
        {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("cstm.ttf")).deriveFont(72f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        }
        catch(IOException | FontFormatException e)
        {
            e.printStackTrace();
        }
        //Border b = BorderFactory.createLineBorder(Color.decode("#c29ffb"),4);*/

        //----

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.decode("#2c3e50"));
        p1.setBounds(0, 0, 1600, 140);

        top = new JLabel();
        top.setText("BUILD YOUR OWN PC!!");
        top.setFont(new Font("Roboto",Font.PLAIN,52));
        top.setForeground(Color.WHITE);
        top.setHorizontalAlignment(JLabel.CENTER);
        top.setVerticalAlignment(JLabel.CENTER);
        top.setBounds(0, 0, 1600, 140);
        p1.add(top);

        price = new JPanel();
        price.setLayout(null);
        price.setBackground(Color.decode("#FFF8F0"));
        price.setBounds(0, 160, 1600, 95);

        String buttonText = "<html>" +
                "PRICE <br>" +  // Display price on one line
                "$ " + pr+  // Display the double value on the next line
                "</html>";

        bprice = new JButton(buttonText);
        bprice.setFont(new Font("Roboto", Font.BOLD, 25));
        bprice.setVerticalAlignment(JButton.TOP);
        bprice.setForeground(Color.WHITE);
        bprice.setBackground(originalColor);
        bprice.setContentAreaFilled(true);
        bprice.setBorderPainted(false);
        bprice.setBounds(1200, 5, 250, 70);
        bprice.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bprice.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bprice.setBackground(originalColor);
            }
        });
        price.add(bprice);

        //-----

        cpu = new JPanel();
        cpu.setLayout(null);
        cpu.setBackground(originalColor);
        cpu.setBounds(150, 260, 1300, 86);
        //cpu.setBorder(b);

        ImageIcon iCpu = new ImageIcon("Files\\ezyzip\\cpu.jpg");
        lcpu = new JLabel();
        lcpu.setForeground(Color.WHITE);
        lcpu.setIcon(iCpu);
        lcpu.setText(pcC[0]);
        lcpu.setBounds(50,0, 1200,84);
        lcpu.setHorizontalTextPosition(JLabel.RIGHT);
        lcpu.setIconTextGap(20);
        lcpu.setFont(new Font("Roboto",Font.PLAIN,20));
        cpu.add(lcpu);

        bcpu = new JButton("ADD");
        bcpu.setFont(new Font("Roboto", Font.BOLD, 20));
        bcpu.setForeground(Color.WHITE);
        bcpu.setBackground(originalColor);
        bcpu.setContentAreaFilled(true);
        bcpu.setBorderPainted(false);
        bcpu.setBounds(1150, 20, 120, 40);
        bcpu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bcpu.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bcpu.setBackground(originalColor);
            }
        });
        cpu.add(bcpu);
        bcpu.addActionListener(this);

        //bcpu = new JButton();
        //bcpu.setIcon(new ImageIcon("btn.png"));
        //bcpu.setBounds(1150,15,120,60);
        //bcpu.addActionListener(this);
        //bcpu.setContentAreaFilled(false);
        //bcpu.setBorderPainted(false);

        cooler = new JPanel();
        cooler.setLayout(null);
        cooler.setBackground(originalColor);
        cooler.setBounds(150, 350, 1300, 86);
        //cooler.setBorder(b);

        ImageIcon iCooler = new ImageIcon("Files\\ezyzip\\cpuCooler.jpg");
        lcooler = new JLabel();
        lcooler.setForeground(Color.WHITE);
        lcooler.setIcon(iCooler);
        lcooler.setText(pcC[1]);
        lcooler.setBounds(50,0, 1200,84);
        lcooler.setHorizontalTextPosition(JLabel.RIGHT);
        lcooler.setIconTextGap(20);
        lcooler.setFont(new Font("Roboto",Font.PLAIN,20));
        cooler.add(lcooler);

        bcooler = new JButton("ADD");
        bcooler.setFont(new Font("Roboto", Font.BOLD, 20));
        bcooler.setForeground(Color.WHITE);
        bcooler.setBackground(originalColor);
        bcooler.setContentAreaFilled(true);
        bcooler.setBorderPainted(false);
        bcooler.setBounds(1150, 20, 120, 40);
        bcooler.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bcooler.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bcooler.setBackground(originalColor);
            }
        });
        cooler.add(bcooler);
        bcooler.addActionListener(this);

        mb = new JPanel();
        mb.setLayout(null);
        mb.setBackground(originalColor);
        mb.setBounds(150, 440, 1300, 86);
        //mb.setBorder(b);

        ImageIcon imb = new ImageIcon("Files\\ezyzip\\mb.jpg");
        lmb = new JLabel();
        lmb.setForeground(Color.WHITE);
        lmb.setIcon(imb);
        lmb.setText(pcC[2]);
        lmb.setBounds(50,0, 1200,84);
        lmb.setHorizontalTextPosition(JLabel.RIGHT);
        lmb.setIconTextGap(20);
        lmb.setFont(new Font("Roboto",Font.PLAIN,24));
        mb.add(lmb);

        bmb = new JButton("ADD");
        bmb.setFont(new Font("Roboto", Font.BOLD, 20));
        bmb.setForeground(Color.WHITE);
        bmb.setBackground(originalColor);
        bmb.setContentAreaFilled(true);
        bmb.setBorderPainted(false);
        bmb.setBounds(1150, 20, 120, 40);
        bmb.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bmb.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bmb.setBackground(originalColor);
            }
        });
        mb.add(bmb);
        bmb.addActionListener(this);

        ram = new JPanel();
        ram.setLayout(null);
        ram.setBackground(originalColor);
        ram.setBounds(150, 530, 1300, 86);
        // ram.setBorder(b);

        ImageIcon iram = new ImageIcon("Files\\ezyzip\\ram.jpg");
        lram = new JLabel();
        lram.setForeground(Color.WHITE);
        lram.setIcon(iram);
        lram.setText(pcC[3]);
        lram.setBounds(50,0, 1200,84);
        lram.setHorizontalTextPosition(JLabel.RIGHT);
        lram.setIconTextGap(20);
        lram.setFont(new Font("Roboto",Font.PLAIN,20));
        ram.add(lram);

        bram = new JButton("ADD");
        bram.setFont(new Font("Roboto", Font.BOLD, 20));
        bram.setForeground(Color.WHITE);
        bram.setBackground(originalColor);
        bram.setContentAreaFilled(true);
        bram.setBorderPainted(false);
        bram.setBounds(1150, 20, 120, 40);
        bram.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bram.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bram.setBackground(originalColor);
            }
        });
        ram.add(bram);
        bram.addActionListener(this);

        gpu = new JPanel();
        gpu.setLayout(null);
        gpu.setBackground(originalColor);
        gpu.setBounds(150, 620, 1300, 86);
        //gpu.setBorder(b);

        ImageIcon igpu = new ImageIcon("Files\\ezyzip\\gpu.jpg");
        lgpu = new JLabel();
        lgpu.setForeground(Color.WHITE);
        lgpu.setIcon(igpu);
        lgpu.setText(pcC[4]);
        lgpu.setBounds(50,0, 1200,84);
        lgpu.setHorizontalTextPosition(JLabel.RIGHT);
        lgpu.setIconTextGap(20);
        lgpu.setFont(new Font("Roboto",Font.PLAIN,20));
        gpu.add(lgpu);

        bgpu = new JButton("ADD");
        bgpu.setFont(new Font("Roboto", Font.BOLD, 20));
        bgpu.setForeground(Color.WHITE);
        bgpu.setBackground(originalColor);
        bgpu.setContentAreaFilled(true);
        bgpu.setBorderPainted(false);
        bgpu.setBounds(1150, 20, 120, 40);
        bgpu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bgpu.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bgpu.setBackground(originalColor);
            }
        });
        gpu.add(bgpu);
        bgpu.addActionListener(this);

        storage = new JPanel();
        storage.setLayout(null);
        storage.setBackground(originalColor);
        storage.setBounds(150, 710, 1300, 86);
        //storage.setBorder(b);

        ImageIcon istorage = new ImageIcon("Files\\ezyzip\\images.jpg");
        lstorage = new JLabel();
        lstorage.setForeground(Color.WHITE);
        lstorage.setIcon(istorage);
        lstorage.setText(pcC[5]);
        lstorage.setBounds(50,0, 1200,84);
        lstorage.setHorizontalTextPosition(JLabel.RIGHT);
        lstorage.setIconTextGap(20);
        lstorage.setFont(new Font("Roboto",Font.PLAIN,20));
        storage.add(lstorage);

        bstorage= new JButton("ADD");
        bstorage.setFont(new Font("Roboto", Font.BOLD, 20));
        bstorage.setForeground(Color.WHITE);
        bstorage.setBackground(originalColor);
        bstorage.setContentAreaFilled(true);
        bstorage.setBorderPainted(false);
        bstorage.setBounds(1150, 20, 120, 40);
        bstorage.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bstorage.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bstorage.setBackground(originalColor);
            }
        });
        storage.add(bstorage);
        bstorage.addActionListener(this);

        psu = new JPanel();
        psu.setLayout(null);
        psu.setBackground(originalColor);
        psu.setBounds(150, 800, 1300, 86);
        //psu.setBorder(b);

        ImageIcon ipsu = new ImageIcon("Files\\ezyzip\\psu.png");
        lpsu = new JLabel();
        lpsu.setForeground(Color.WHITE);
        lpsu.setIcon(ipsu);
        lpsu.setText(pcC[6]);
        lpsu.setBounds(50,0, 1200,84);
        lpsu.setHorizontalTextPosition(JLabel.RIGHT);
        lpsu.setIconTextGap(20);
        lpsu.setFont(new Font("Roboto",Font.PLAIN,20));
        psu.add(lpsu);

        bpsu = new JButton("ADD");
        bpsu.setFont(new Font("Roboto", Font.BOLD, 20));
        bpsu.setForeground(Color.WHITE);
        bpsu.setBackground(originalColor);
        bpsu.setContentAreaFilled(true);
        bpsu.setBorderPainted(false);
        bpsu.setBounds(1150, 20, 120, 40);
        bpsu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bpsu.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bpsu.setBackground(originalColor);
            }
        });
        psu.add(bpsu);
        bpsu.addActionListener(this);

        casing = new JPanel();
        casing.setLayout(null);
        casing.setBackground(originalColor);
        casing.setBounds(150, 890, 1300, 86);
        //casing.setBorder(b);

        ImageIcon icasing = new ImageIcon("Files\\ezyzip\\casing.jpg");
        lcasing = new JLabel();
        lcasing.setForeground(Color.WHITE);
        lcasing.setIcon(icasing);
        lcasing.setText(pcC[7]);
        lcasing.setBounds(50,0, 1200,84);
        lcasing.setHorizontalTextPosition(JLabel.RIGHT);
        lcasing.setIconTextGap(20);
        lcasing.setFont(new Font("Roboto",Font.PLAIN,20));
        casing.add(lcasing);

        bcasing = new JButton("ADD");
        bcasing.setFont(new Font("Roboto", Font.BOLD, 20));
        bcasing.setForeground(Color.WHITE);
        bcasing.setBackground(originalColor);
        bcasing.setContentAreaFilled(true);
        bcasing.setBorderPainted(false);
        bcasing.setBounds(1150, 20, 120, 40);
        bcasing.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bcasing.setBackground(hoverColor);
            }
            public void mouseExited(MouseEvent e) {
                bcasing.setBackground(originalColor);
            }
        });
        casing.add(bcasing);
        bcasing.addActionListener(this);

        //----


        fr = new JFrame();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setSize(1600,1020);
        fr.setLayout(null);
        fr.getContentPane().setBackground(Color.decode("#FFF8F0"));
        fr.add(p1);
        fr.add(price);
        fr.add(cpu);
        fr.add(cooler);
        fr.add(mb);
        fr.add(ram);
        fr.add(gpu);
        fr.add(storage);
        fr.add(psu);
        fr.add(casing);
        fr.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new BuildPc();
    }



    public void actionPerformed(ActionEvent e)
    {
        PcComponents pc = new PcComponents(BuildPc.this);
        if(e.getSource()==bcpu)
        {
            pc.btnCPU.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource()==bcooler)
        {

            pc.btnCooler.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCPU.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource()==bmb)
        {

            pc.btnMotherboard.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnCPU.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource()==bram)
        {

            pc.btnMemory.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnCPU.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource()==bgpu)
        {

            pc.btnGPU.doClick();

            pc.btnCPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource()==bstorage)
        {

            pc.btnStorage.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnCPU.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource()==bpsu)
        {

            pc.btnPowerSupply.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCase.setVisible(false);
            pc.btnCPU.setVisible(false);
        }
        else if(e.getSource()==bcasing)
        {

            pc.btnCase.doClick();

            pc.btnGPU.setVisible(false);
            pc.btnMemory.setVisible(false);
            pc.btnStorage.setVisible(false);
            pc.btnMotherboard.setVisible(false);
            pc.btnCooler.setVisible(false);
            pc.btnCPU.setVisible(false);
            pc.btnPowerSupply.setVisible(false);
        }
        else if(e.getSource() == bprice)
        {

        }
    }

    public void back(String s,int a,double b)
    {
        pcC[a] = s;
        pr = pr - lastSelectedPrice[a];
        pr = pr + b;

        lastSelectedPrice[a] = b;
        String formattedPrice = String.format("%.2f", pr);


        String buttonText = "<html>" +
                "PRICE <br>" +  // Display price on one line
                "$ " +formattedPrice +  // Display the double value on the next line
                "</html>";


        bprice.setText(buttonText);

        if(a == 0)
        {
            lcpu.setText(s);
        }
        else if(a == 1)
        {
            lcooler.setText(s);
        }
        else if(a == 2)
        {
            lmb.setText(s);
        }
        else if(a == 3)
        {
            lram.setText(s);
        }
        else if(a == 4)
        {
            lgpu.setText(s);
        }
        else if(a == 5)
        {
            lstorage.setText(s);
        }
        else if(a==6)
        {
            lpsu.setText(s);
        }
        else if(a==7)
        {
            lcasing.setText(s);
        }
    }
}



