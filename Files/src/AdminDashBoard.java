import javax.swing.*;
import java.awt.Color;
class FrameInfo {

    public FrameInfo() {

        JFrame j = new JFrame("Admin Dashboard");
        
        j.setSize(1725, 970);
        j.setLayout(null);
        j.setVisible(true);

        JPanel panel1, panel2,panel3, panel4;


        panel1 = new JPanel();
        panel1.setBounds(0, 0, 430, 970); // (x: 0, y: 0, width: 430, height: 970)
        panel1.setBackground(new Color(5, 11, 211));
        j.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(430, 0, 1295, 200); // (x: 430, y: 0, width: 1295, height: 200)
        panel2.setBackground(new Color(0, 128, 0));
        j.add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(1295, 200, 430, 770); // (x: 1295, y: 200, width: 430, height: 770)
        panel3.setBackground(new Color(255, 0, 0));
        j.add(panel3);

        panel4 = new JPanel();
        panel4.setBounds(430, 200, 865, 770); // (x: 430, y: 200, width: 865, height: 770)
        panel4.setBackground(new Color(0, 204, 204));
        j.add(panel4);

        // Create Buttons
        JButton userInfoButton = new JButton("User Information");
        userInfoButton.setBounds(50, 220, 330, 40); // Set position and size
        userInfoButton.setBackground(new Color(0, 255, 0)); // Set background color
        panel1.add(userInfoButton);

        JButton productInfoButton = new JButton("Product Information");
        productInfoButton.setBounds(50, 280, 330, 40); // Adjust position below the previous button
        productInfoButton.setBackground(new Color(0, 255, 0));
        panel1.add(productInfoButton);

        JButton salesDashboardButton = new JButton("Sales Dashboard");
        salesDashboardButton.setBounds(50, 340, 330, 40);
        salesDashboardButton.setBackground(new Color(0, 255, 0));
        panel1.add(salesDashboardButton);

        JButton storeInfoButton = new JButton("Store Info");
        storeInfoButton.setBounds(50, 400, 330, 40);
        storeInfoButton.setBackground(new Color(0, 255, 0));
        panel1.add(storeInfoButton);

        JButton backButton = new JButton("Back to Admin Login");
        backButton.setBounds(30, 600, 370, 50); // Set further down
        backButton.setBackground(new Color(255, 0, 0));
        panel1.add(backButton);

        // Create Buttons for Panel 3
JButton changePasswordButton = new JButton("Change Password");
changePasswordButton.setBounds(50, 100, 330, 40); // Adjusted y-position
changePasswordButton.setBackground(new Color(0, 255, 0)); 
panel3.add(changePasswordButton);

JButton editUsernameButton = new JButton("Edit Username");
editUsernameButton.setBounds(50, 160, 330, 40); // Adjusted y-position
editUsernameButton.setBackground(new Color(0, 255, 0)); 
panel3.add(editUsernameButton);

JButton editPhoneNumberButton = new JButton("Edit Phone Number");
editPhoneNumberButton.setBounds(50, 220, 330, 40); // Adjusted y-position
editPhoneNumberButton.setBackground(new Color(0, 255, 0)); 
panel3.add(editPhoneNumberButton);

JButton logoutButton = new JButton("Logout");
logoutButton.setBounds(50, 280, 330, 60); // Adjusted y-position to fit within the panel
logoutButton.setBackground(new Color(255, 0, 0)); 
panel3.add(logoutButton);


        
        
    }
}

public class AdminDashBoard {
    public static void main(String[] args) {
        FrameInfo A= new FrameInfo(); 
    }
}
