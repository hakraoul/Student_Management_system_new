import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homePanel extends JDialog{
    private JButton loginButton;
    private JButton registerButton;
    private JPanel homePanel;

    public homePanel(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(homePanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Terminate the dialog when press close button


    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            infoPanel infoObj = new infoPanel(null);

        }
    });
    registerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            RegistrationForm myform = new RegistrationForm(null);
            User user = myform.user;
            if(user!=null){
                System.out.println("Successful registration of: " + user.name);
            }
            else {
                System.out.println("Registration canceled");
            }
        }
    });
        setVisible(true);
}
}
