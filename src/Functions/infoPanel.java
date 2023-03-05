package Functions;

import javax.swing.*;
import java.awt.*;

public class infoPanel extends JDialog{
    private JLabel userName;
    private JLabel nameLable;
    private JLabel emailLable;
    private JLabel phoneLable;
    private JLabel addressLable;
    private JPanel infoPanel;

    public infoPanel(JFrame parent){
        setTitle("Functions.User Info");
        setContentPane(infoPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Terminate the dialog when press close button

        LoginForm loginForm = new LoginForm(null);
        User user = loginForm.user;
        if(user!=null){
            System.out.println("Successfull Authentication of:");
            System.out.println("        Name: " + user.name);
            System.out.println("        Email: " + user.email);
            System.out.println("        Phone: " + user.phone);
            System.out.println("        Address: " + user.address);

            userName.setText(user.name);
            nameLable.setText(user.name);
            emailLable.setText(user.email);
            phoneLable.setText(user.phone);
            addressLable.setText(user.address);

        }
        else{
            JOptionPane.showMessageDialog(infoPanel.this,
                    "Authentication Canceled");
        }

        setVisible(true);
    }
}
