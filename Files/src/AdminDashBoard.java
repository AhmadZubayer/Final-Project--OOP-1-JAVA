import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import javax.swing.*;
import javax.swing.table.*;
//import java.awt.*;
//import java.awt.event.*;
import java.io.*;

public class AdminDashBoard implements ActionListener {
    JFrame frame;
    public JPanel panel1, panel2, panel3, panelUi, panelPi, panelSd, panelSi;
    JLabel adminNameLabel, adminIDLabel, phoneNumberLabel, addressLabel, profilePictureLabel;
    JButton userInfoButton, productInfoButton, salesDashboardButton, storeInfoButton, backButton, editProfileButton, logoutButton,deleteButton,A;
    String username, password;
    String[] adminDetails;
    JTable table, productTable, salesTable;
    DefaultTableModel model, productModel, salesModel;
    JScrollPane scrollPane, productScrollPane, salesScrollPane;

    // Table Column Definitions
    private String[] columns = {"Username", "Phone", "Email", "Address", "Password", "Registration Time"};
    private String[] productColumns = {"Category", "Product Name", "Price", "Available Quantity", "Total Sold Quantity"};
    private String[] salesColumns = {"Order ID", "Product Name", "Category", "Quantity Sold", "Price per Unit", "Total Price", "Sale Date", "Customer Name", "Payment Method", "Status"};

    // Table Data Arrays (initially empty)
    private String[][] data = {};
    private String[][] productData = {};
    private String[][] salesData = {};


    public AdminDashBoard(String username, String[] adminDetails, String password) {
        this.username = username;
        this.password = password;
        this.adminDetails = adminDetails;

        frame = new JFrame("Admin Dashboard");
        frame.setSize(1800, 970);
        frame.setLayout(null);

        
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 350, 970);
        panel1.setBackground(Color.decode("#2c3e50"));
        panel1.setLayout(null);
        frame.add(panel1);

        
        panel2 = new JPanel();
        panel2.setBounds(350, 0, 1325, 152);
        panel2.setBackground(Color.decode("#2c3e50"));
        panel2.setLayout(null);
        frame.add(panel2);

       
        panel3 = new JPanel();
        panel3.setBounds(1192, 152, 350, 770);
        panel3.setBackground(Color.decode("#48C9B0"));
        panel3.setLayout(null);
        frame.add(panel3);

        
        panelUi = new JPanel();
        panelUi.setBounds(350, 152, 1285, 770);
        panelUi.setBackground(Color.decode("#de8f07"));
        panelUi.setLayout(null);
        frame.add(panelUi);

        panelPi = new JPanel();
        panelPi.setBounds(350, 152, 1285, 770);
        panelPi.setBackground(Color.decode("#07b6de"));
        panelPi.setLayout(null);
        frame.add(panelPi);

        panelSd = new JPanel();
        panelSd.setBounds(350, 152, 1285, 770);
        panelSd.setBackground(Color.decode("#57965c"));
        panelSd.setLayout(null);
        frame.add(panelSd);

        panelSi = new JPanel();
        panelSi.setBounds(350, 152, 1285, 770);
        panelSi.setBackground(Color.decode("#fcc422"));
        panelSi.setLayout(null);
        frame.add(panelSi);

       
        JLabel adminDashboardLabel = new JLabel("Admin Dashboard");
        adminDashboardLabel.setFont(new Font("Verdana", Font.BOLD, 42));
        adminDashboardLabel.setForeground(Color.decode("#FFFFFF")); // White text
        adminDashboardLabel.setBounds(200, 50, 500, 50);  // Adjust as necessary for alignment
        adminDashboardLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(adminDashboardLabel);

        setupStoreInfoPanel();

       
        userInfoButton = new JButton("User Information");
        userInfoButton.setFont(new Font("Roboto", Font.BOLD, 17));
        userInfoButton.setForeground(Color.decode("#FFF8F0"));
        userInfoButton.setBackground(Color.decode("#CD1C35"));
        userInfoButton.setContentAreaFilled(true);
        userInfoButton.setBorderPainted(false);
        userInfoButton.setBounds(35, 220, 280, 40);
        panel1.add(userInfoButton);
        userInfoButton.addActionListener(this);

        productInfoButton = new JButton("Product Information");
        productInfoButton.setFont(new Font("Roboto", Font.BOLD, 17));
        productInfoButton.setForeground(Color.decode("#FFF8F0"));
        productInfoButton.setBackground(Color.decode("#CD1C35"));
        productInfoButton.setContentAreaFilled(true);
        productInfoButton.setBorderPainted(false);
        productInfoButton.setBounds(35, 280, 280, 40);
        panel1.add(productInfoButton);
        productInfoButton.addActionListener(this);

        salesDashboardButton = new JButton("Sales Dashboard");
        salesDashboardButton.setFont(new Font("Roboto", Font.BOLD, 17));
        salesDashboardButton.setForeground(Color.decode("#FFF8F0"));
        salesDashboardButton.setBackground(Color.decode("#CD1C35"));
        salesDashboardButton.setContentAreaFilled(true);
        salesDashboardButton.setBorderPainted(false);
        salesDashboardButton.setBounds(35, 340, 280, 40);
        panel1.add(salesDashboardButton);
        salesDashboardButton.addActionListener(this);

        storeInfoButton = new JButton("Store Info");
        storeInfoButton.setFont(new Font("Roboto", Font.BOLD, 17));
        storeInfoButton.setForeground(Color.decode("#FFF8F0"));
        storeInfoButton.setBackground(Color.decode("#CD1C35"));
        storeInfoButton.setContentAreaFilled(true);
        storeInfoButton.setBorderPainted(false);
        storeInfoButton.setBounds(35, 400, 280, 40);
        panel1.add(storeInfoButton);
        storeInfoButton.addActionListener(this);

        backButton = new JButton("Back to Admin Login");
        backButton.setFont(new Font("Roboto", Font.BOLD, 17));
        backButton.setForeground(Color.decode("#FFF8F0"));
        backButton.setBackground(Color.decode("#CD1C35"));
        backButton.setContentAreaFilled(true);
        backButton.setBorderPainted(false);
        backButton.setBounds(15, 600, 320, 50);
        panel1.add(backButton);
        backButton.addActionListener(this);

        A= new JButton("Admin Profile");
        A.setFont(new Font("Roboto", Font.BOLD, 17));
        A.setForeground(Color.decode("#FFF8F0"));
        A.setBackground(Color.decode("#CD1C35"));
         A.setContentAreaFilled(true);
        A.setBorderPainted(false);
        A.setBounds(35, 460, 280, 40);
        panel1.add(A);
        A.addActionListener(this);

      
        editProfileButton = new JButton("Edit Profile");
        editProfileButton.setFont(new Font("Roboto", Font.BOLD, 17));
        editProfileButton.setForeground(Color.decode("#FFF8F0"));
        editProfileButton.setBackground(Color.decode("#CD1C35"));
        editProfileButton.setContentAreaFilled(true);
        editProfileButton.setBorderPainted(false);
        editProfileButton.setBounds(50, 450, 250, 40);
        panel3.add(editProfileButton);
        editProfileButton.addActionListener(this);

        logoutButton = new JButton("Log out");
        logoutButton.setFont(new Font("Roboto", Font.BOLD, 17));
        logoutButton.setForeground(Color.decode("#FFF8F0"));
        logoutButton.setBackground(Color.decode("#CD1C35"));
        logoutButton.setContentAreaFilled(true);
        logoutButton.setBorderPainted(false);
        logoutButton.setBounds(50, 500, 250, 40);
        panel3.add(logoutButton);
        logoutButton.addActionListener(this);

       
        userInfoButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                userInfoButton.setForeground(Color.decode("#CD1C35"));
                userInfoButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                userInfoButton.setForeground(Color.decode("#FFF8F0"));
                userInfoButton.setBackground(Color.decode("#CD1C35"));
            }
        });

        productInfoButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                productInfoButton.setForeground(Color.decode("#CD1C35"));
                productInfoButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                productInfoButton.setForeground(Color.decode("#FFF8F0"));
                productInfoButton.setBackground(Color.decode("#CD1C35"));
            }
        });

        salesDashboardButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                salesDashboardButton.setForeground(Color.decode("#CD1C35"));
                salesDashboardButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                salesDashboardButton.setForeground(Color.decode("#FFF8F0"));
                salesDashboardButton.setBackground(Color.decode("#CD1C35"));
            }
        });

        storeInfoButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                storeInfoButton.setForeground(Color.decode("#CD1C35"));
                storeInfoButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                storeInfoButton.setForeground(Color.decode("#FFF8F0"));
                storeInfoButton.setBackground(Color.decode("#CD1C35"));
            }
        });

        backButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                backButton.setForeground(Color.decode("#CD1C35"));
                backButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                backButton.setForeground(Color.decode("#FFF8F0"));
                backButton .setBackground(Color.decode("#CD1C35"));
            }
        });

       

        editProfileButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                editProfileButton.setForeground(Color.decode("#CD1C35"));
                editProfileButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                editProfileButton.setForeground(Color.decode("#FFF8F0"));
                editProfileButton.setBackground(Color.decode("#CD1C35"));
            }
        });

        logoutButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                logoutButton.setForeground(Color.decode("#CD1C35"));
                logoutButton.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                logoutButton.setForeground(Color.decode("#FFF8F0"));
                logoutButton.setBackground(Color.decode("#CD1C35"));
            }
        });
        A.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
               A.setForeground(Color.decode("#CD1C35"));
                A.setBackground(Color.decode("#FFF8F0"));
            }

            public void mouseExited(MouseEvent e) {
                A.setForeground(Color.decode("#FFF8F0"));
                A.setBackground(Color.decode("#CD1C35"));
            }
        });
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Check if the click is outside of panel3
                if (panel3.isVisible() && !panel3.getBounds().contains(e.getPoint())) {
                    // Hide panel3 if clicked outside its bounds
                    panel3.setVisible(false);
                }
            }
        });


       
        setupTable();

       
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 50, 1100, 500);  
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));  
        panelUi.add(scrollPane);

     
        deleteButton = new JButton("Delete User");
        deleteButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        deleteButton.setBackground(Color.ORANGE);
        deleteButton.setFocusPainted(false);
        deleteButton.setBounds(950, 570, 150, 40); 
        deleteButton.addActionListener(this);
        panelUi.add(deleteButton);

       
        loadUserData();

       
        setupProductTable();

        
        productScrollPane = new JScrollPane(productTable);
        productScrollPane.setBounds(45, 45, 1100, 550);
        productScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panelPi.add(productScrollPane);
        loadProductData();

        setupSalesDashboardTable();
    
        salesScrollPane = new JScrollPane(salesTable);
        salesScrollPane.setBounds(45, 45, 1100, 550); 
        salesScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
        salesScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
        salesScrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); 
        panelSd.add(salesScrollPane);



        loadSalesData();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //PANEL 3 WORK------------------------------------------------------------------------------------------------------------------------------------------------------------------

       
        profilePictureLabel = new JLabel();
        profilePictureLabel.setBounds(75, 20, 200, 200);
        profilePictureLabel.setOpaque(true);
        profilePictureLabel.setBackground(Color.LIGHT_GRAY);
        profilePictureLabel.setHorizontalAlignment(JLabel.CENTER);
        panel3.add(profilePictureLabel);

        if (adminDetails.length >= 5 && adminDetails[4] != null && !adminDetails[4].isEmpty()) {
            try {
                BufferedImage profileImage = ImageIO.read(new File(adminDetails[4]));
                ImageIcon profileIcon = new ImageIcon(profileImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                profilePictureLabel.setIcon(profileIcon);
            } catch (IOException e) {
                System.out.println("Error loading profile picture: " + e.getMessage());
            }
        }

       
        adminNameLabel = new JLabel("Admin Name: " + adminDetails[0]);
        adminNameLabel.setBounds(50, 240, 250, 30);
        adminNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(adminNameLabel);

        adminIDLabel = new JLabel("Admin ID: " + adminDetails[1]);
        adminIDLabel.setBounds(50, 290, 250, 30);
        adminIDLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(adminIDLabel);

        phoneNumberLabel = new JLabel("Phone Number: " + adminDetails[2]);
        phoneNumberLabel.setBounds(50, 340, 250, 30);
        phoneNumberLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(phoneNumberLabel);

        addressLabel = new JLabel("Address: " + adminDetails[3]);
        addressLabel.setBounds(50, 390, 250, 30);
        addressLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(addressLabel);


      
        panelUi.setVisible(true);
        panelPi.setVisible(false);
        panelSd.setVisible(false);
        panelSi.setVisible(false);
        panel3.setVisible(false);
        frame.revalidate();
        frame.repaint();

        frame.setVisible(true);
    }



    private void setupStoreInfoPanel() {
        // Store Name Label
        JLabel storeNameLabel = new JLabel("Store Name: TechShop");
        storeNameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        storeNameLabel.setBounds(50, 50, 400, 40);
        panelSi.add(storeNameLabel);

        // Store Location Label
        JLabel storeLocationLabel = new JLabel("Location: 1234 Main Street, Dhaka");
        storeLocationLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        storeLocationLabel.setBounds(50, 100, 400, 30);
        panelSi.add(storeLocationLabel);

        // Contact Information
        JLabel storeContactLabel = new JLabel("Contact: (123) 456-7890 | support@techshop.com");
        storeContactLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        storeContactLabel.setBounds(50, 140, 600, 30);
        panelSi.add(storeContactLabel);

        // Operating Hours Label
        JLabel storeHoursLabel = new JLabel("Operating Hours: 9:00 AM - 9:00 PM (Mon - Sat)");
        storeHoursLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        storeHoursLabel.setBounds(50, 180, 600, 30);
        panelSi.add(storeHoursLabel);

        // Store Statistics Section
        JLabel statsLabel = new JLabel("Store Statistics:");
        statsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        statsLabel.setBounds(50, 230, 200, 30);
        panelSi.add(statsLabel);

        // Store Statistics Table
        String[][] storeStatsData = {
                {"Total Products", "500"},
                {"Total Revenue", "$150,000"},
                {"Total Customers", "1200"},
                {"Total Orders", "800"}
        };
        String[] statsColumns = {"Metric", "Value"};
        JTable statsTable = new JTable(storeStatsData, statsColumns);
        statsTable.setFont(new Font("Arial", Font.PLAIN, 16));
        statsTable.setRowHeight(25);
        statsTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        statsTable.setBounds(50, 280, 400, 100);
        panelSi.add(statsTable);

        // Current Promotions Section
        JLabel promotionsLabel = new JLabel("Current Promotions:");
        promotionsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        promotionsLabel.setBounds(50, 400, 250, 30);
        panelSi.add(promotionsLabel);

        JTextArea promotionsTextArea = new JTextArea(
                "- Buy 1 Get 1 Free on Gaming Consoles\n" +
                        "- 20% off on all PC Components\n" +
                        "- Free Shipping on orders above $500"
        );
        promotionsTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        promotionsTextArea.setBounds(50, 450, 500, 100);
        promotionsTextArea.setEditable(false);  // Make it read-only
        panelSi.add(promotionsTextArea);
    }

//PANEL UI WORK--------------------------------------------------------------------

    private void setupTable() {
        model = new DefaultTableModel(data, columns);
        table = new JTable(model);
        table.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font size
        table.getTableHeader().setBackground(Color.decode("#FFD700"));
        table.getTableHeader().setForeground(Color.BLACK);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setSelectionForeground(Color.BLACK);
        table.setRowHeight(30);
        table.setGridColor(Color.BLACK);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

       
        table.getColumnModel().getColumn(0).setPreferredWidth(200);  // Username
        table.getColumnModel().getColumn(1).setPreferredWidth(150);  // Phone
        table.getColumnModel().getColumn(2).setPreferredWidth(250);  // Email
        table.getColumnModel().getColumn(3).setPreferredWidth(250);  // Address
        table.getColumnModel().getColumn(4).setPreferredWidth(150);  // Password
        table.getColumnModel().getColumn(5).setPreferredWidth(250);  // Registration Time

        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18)); 
        table.getTableHeader().setBackground(Color.decode("#FFD700")); // Gold color
        // Set border around the table including right-side
        table.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));  
    }
    private void setupProductTable() {
        productModel = new DefaultTableModel(productData, productColumns);
        productTable = new JTable(productModel);

       
        productTable.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font size
        productTable.setRowHeight(30); // Increase row height for better visibility

        
        productTable.getColumnModel().getColumn(0).setPreferredWidth(200);  // Category
        productTable.getColumnModel().getColumn(1).setPreferredWidth(200);  // Product Name
        productTable.getColumnModel().getColumn(2).setPreferredWidth(100);  // Price
        productTable.getColumnModel().getColumn(3).setPreferredWidth(150);  // Available Quantity
        productTable.getColumnModel().getColumn(4).setPreferredWidth(150);  // Total Sold Quantity

        // Set the table header font and color
        productTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18)); // Adjust font size for header
        productTable.getTableHeader().setBackground(Color.decode("#FFD700")); // Gold color
        productTable.getTableHeader().setForeground(Color.BLACK); // Black text
    }
    // Setup Sales Dashboard Table
    private void setupSalesDashboardTable() {
        salesModel = new DefaultTableModel(salesData, salesColumns);
        salesTable = new JTable(salesModel);

        // Set font and row height to match the desired look
        salesTable.setFont(new Font("Arial", Font.PLAIN, 16)); // Adjust font size
        salesTable.setRowHeight(30); // Increase row height for better visibility

        // Disable auto resizing of table columns
        salesTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Set preferred column widths to ensure the table looks properly formatted
        salesTable.getColumnModel().getColumn(0).setPreferredWidth(120);  // Order ID
        salesTable.getColumnModel().getColumn(1).setPreferredWidth(200);  // Product Name
        salesTable.getColumnModel().getColumn(2).setPreferredWidth(180);  // Category
        salesTable.getColumnModel().getColumn(3).setPreferredWidth(130);  // Quantity Sold
        salesTable.getColumnModel().getColumn(4).setPreferredWidth(130);  // Price per Unit
        salesTable.getColumnModel().getColumn(5).setPreferredWidth(130);  // Total Price
        salesTable.getColumnModel().getColumn(6).setPreferredWidth(150);  // Sale Date
        salesTable.getColumnModel().getColumn(7).setPreferredWidth(200);  // Customer Name
        salesTable.getColumnModel().getColumn(8).setPreferredWidth(150);  // Payment Method
        salesTable.getColumnModel().getColumn(9).setPreferredWidth(150);  // Status

        // Set the table header font and color
        salesTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18)); // Adjust font size for header
        salesTable.getTableHeader().setBackground(Color.decode("#FFD700")); // Gold color for header background
        salesTable.getTableHeader().setForeground(Color.BLACK); // Black text for header

        // Ensure the table's preferred size is larger than the scroll pane, triggering the scroll bar
        salesTable.setPreferredScrollableViewportSize(new Dimension(1600, 500));
    }





    private void loadUserData() {
        // Load user data from file (users.txt)
        File file = new File("users.txt");
        if (!file.exists()) {
            System.out.println("No user data file found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void loadProductData() {
        File file = new File("products.txt");
        if (!file.exists()) {
            System.out.println("No product data file found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip header
                    continue;
                }
                String[] product = line.split(",");
                productModel.addRow(product); // Add each product to the table model
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadSalesData() {
        File file = new File("sales.txt");
        if (!file.exists()) {
            System.out.println("No sales data file found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip header
                    continue;
                }
                String[] sales = line.split(",");
                salesModel.addRow(sales); // Add each sale to the table model
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




   
    private void openEditProfileDialog() {
        JFrame editFrame = new JFrame("Edit Profile");
        editFrame.setSize(400, 450);
        editFrame.setLayout(null);

        
        JLabel nameLabel = new JLabel("Admin Name:");
        nameLabel.setBounds(50, 20, 100, 30);
        editFrame.add(nameLabel);

        JLabel idLabel = new JLabel("Admin ID:");
        idLabel.setBounds(50, 70, 100, 30);
        editFrame.add(idLabel);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 120, 100, 30);
        editFrame.add(phoneLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 170, 100, 30);
        editFrame.add(addressLabel);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 220, 100, 30);
        editFrame.add(passwordLabel);

        // Text fields for admin details
        JTextField nameField = new JTextField(adminDetails[0]);
        nameField.setBounds(160, 20, 200, 30);
        editFrame.add(nameField);

        JTextField idField = new JTextField(adminDetails[1]);
        idField.setBounds(160, 70, 200, 30);
        editFrame.add(idField);

        JTextField phoneField = new JTextField(adminDetails[2]);
        phoneField.setBounds(160, 120, 200, 30);
        editFrame.add(phoneField);

        JTextField addressField = new JTextField(adminDetails[3]);
        addressField.setBounds(160, 170, 200, 30);
        editFrame.add(addressField);

        JTextField newPasswordField = new JTextField(password);
        newPasswordField.setBounds(160, 220, 200, 30);
        editFrame.add(newPasswordField);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(50, 300, 100, 40);
        editFrame.add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get new details from the input fields
                String newUsername = nameField.getText();
                String newPassword = newPasswordField.getText();
                String[] newAdminDetails = {newUsername, idField.getText(), phoneField.getText(), addressField.getText(), adminDetails[4]}; // Keep the same image path

                // Update the labels in the main dashboard
                adminNameLabel.setText("Admin Name: " + newAdminDetails[0]);
                adminIDLabel.setText("Admin ID: " + newAdminDetails[1]);
                phoneNumberLabel.setText("Phone Number: " + newAdminDetails[2]);
                addressLabel.setText("Address: " + newAdminDetails[3]);

                // Persist the updated information
                LoginPage2.updateAdminDetails(username, newUsername, newAdminDetails, newPassword);

                // Update local username and password
                username = newUsername;
                password = newPassword;

                editFrame.dispose();  
            }
        });

        editFrame.setVisible(true);
    }





    private void deleteUserFromFile(String username) {
        File inputFile = new File("users.txt");
        File tempFile = new File("temp.txt");


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                // Trim newline when comparing with username
                String trimmedLine = currentLine.trim();
                if (!trimmedLine.startsWith(username + ",")) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

     
        if (!inputFile.delete()) {
            System.out.println("Could not delete file");
            return;
        }
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("Could not rename file");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userInfoButton) {
            panelUi.setVisible(true);
            panelPi.setVisible(false);
            panelSd.setVisible(false);
            panelSi.setVisible(false);
            userInfoButton.setForeground(Color.decode("#CD1C35"));
            userInfoButton.setBackground(Color.decode("#FFF8F0"));
            productInfoButton.setForeground(Color.decode("#FFF8F0"));
            productInfoButton.setBackground(Color.decode("#CD1C35"));
            salesDashboardButton.setForeground(Color.decode("#FFF8F0"));
            salesDashboardButton.setBackground(Color.decode("#CD1C35"));
            storeInfoButton.setForeground(Color.decode("#FFF8F0"));
            storeInfoButton.setBackground(Color.decode("#CD1C35"));

        } else if (e.getSource() == productInfoButton) {
            panelUi.setVisible(false);
            panelPi.setVisible(true);
            panelSd.setVisible(false);
            panelSi.setVisible(false);
            userInfoButton.setForeground(Color.decode("#FFF8F0"));
            userInfoButton.setBackground(Color.decode("#CD1C35"));
            productInfoButton.setForeground(Color.decode("#CD1C35"));
            productInfoButton.setBackground(Color.decode("#FFF8F0"));
            salesDashboardButton.setForeground(Color.decode("#FFF8F0"));
            salesDashboardButton.setBackground(Color.decode("#CD1C35"));
            storeInfoButton.setForeground(Color.decode("#FFF8F0"));
            storeInfoButton.setBackground(Color.decode("#CD1C35"));

        } else if (e.getSource() == salesDashboardButton) {
            panelUi.setVisible(false);
            panelPi.setVisible(false);
            panelSd.setVisible(true);
            panelSi.setVisible(false);
            userInfoButton.setForeground(Color.decode("#FFF8F0"));
            userInfoButton.setBackground(Color.decode("#CD1C35"));
            productInfoButton.setForeground(Color.decode("#FFF8F0"));
            productInfoButton.setBackground(Color.decode("#CD1C35"));
            salesDashboardButton.setForeground(Color.decode("#CD1C35"));
            salesDashboardButton.setBackground(Color.decode("#FFF8F0"));
            storeInfoButton.setForeground(Color.decode("#FFF8F0"));
            storeInfoButton.setBackground(Color.decode("#CD1C35"));
        } else if (e.getSource() == storeInfoButton) {
            panelUi.setVisible(false);
            panelPi.setVisible(false);
            panelSd.setVisible(false);
            panelSi.setVisible(true);
            userInfoButton.setForeground(Color.decode("#FFF8F0"));
            userInfoButton.setBackground(Color.decode("#CD1C35"));
            productInfoButton.setForeground(Color.decode("#FFF8F0"));
            productInfoButton.setBackground(Color.decode("#CD1C35"));
            salesDashboardButton.setForeground(Color.decode("#FFF8F0"));
            salesDashboardButton.setBackground(Color.decode("#CD1C35"));
            storeInfoButton.setForeground(Color.decode("#CD1C35"));
            storeInfoButton.setBackground(Color.decode("#FFF8F0"));
        }
        else if (e.getSource() == backButton) {
            frame.dispose();
            new LoginPage2();
        }

      
        if (e.getSource() == editProfileButton) {
            openEditProfileDialog();
            editProfileButton.setForeground(Color.decode("#CD1C35"));
            editProfileButton.setBackground(Color.decode("#FFF8F0"));
            logoutButton.setForeground(Color.decode("#FFF8F0"));
            logoutButton.setBackground(Color.decode("#CD1C35"));
        } else if (e.getSource() == logoutButton) {
            logoutButton.setForeground(Color.decode("#CD1C35"));
            logoutButton.setBackground(Color.decode("#FFF8F0"));
            editProfileButton.setForeground(Color.decode("#FFF8F0"));
            editProfileButton.setBackground(Color.decode("#CD1C35"));
            frame.dispose();
            new LoginPage2();  
        }
        if (e.getSource() == A) {
            panel3.setVisible(!panel3.isVisible());
        }

        //PANEL UI------------------------
        if (e.getSource() == deleteButton) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String usernameToDelete = table.getValueAt(selectedRow, 0).toString();
                model.removeRow(selectedRow);

            
                deleteUserFromFile(usernameToDelete);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a user to delete.", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }


    }


}
