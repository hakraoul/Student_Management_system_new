package Functions;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.*;

public class Employee {
    private JPanel Main;
    private JTextField tfName;
    private JTextField tfSalary;
    private JTextField tfMobile;
    private JButton saveButton;
    private JTable table1;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField tfID;
    private JScrollPane table_1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee");
        frame.setContentPane(new Employee().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    Connection con;
    PreparedStatement pst;
    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mystore","root","");
            System.out.println("Success");
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    void table_load(){
        try{
            pst = con.prepareStatement("select * from users");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e2){
            e2.printStackTrace();
        }
    }

    public Employee() {
        connect();
        //After load we load table
        table_load();
    saveButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String empname,salary,mobile;
            empname = tfName.getText();
            salary = tfSalary.getText();
            mobile = tfMobile.getText();

            try{
                pst = con.prepareStatement("insert into employee(empname,salary,mobile)value(?,?,?)");
                pst.setString(1,empname);
                pst.setString(2,salary);
                pst.setString(3,mobile);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Added...");
                table_load();
                tfName.setText("");
                tfSalary.setText("");
                tfMobile.setText("");
                tfName.requestFocus();
            }catch (SQLException ex){
                ex.printStackTrace();
            }

        }
    });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String empid = tfID.getText();
                        pst = con.prepareStatement("select empName,salary,mobile from employee where id = ?");
                        pst.setString(1,empid);
                        ResultSet rs = pst.executeQuery();

                        if(rs.next()==true){
                            String empName = rs.getString(1);
                            String empsalary = rs.getString(2);
                            String empmobile = rs.getString(3);

                            tfName.setText(empName);
                            tfSalary.setText(empsalary);
                            tfMobile.setText(empmobile);
                        }else{
                            tfName.setText("");
                            tfName.setText("");
                            tfName.setText("");
                            JOptionPane.showMessageDialog(null,"Invalid Employee ID");
                        }

                }
                catch (SQLException e3){
                    e3.printStackTrace();
                }
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String empID,empname,salary,mobile;
                empname = tfName.getText();
                salary = tfSalary.getText();
                mobile = tfMobile.getText();
                empID = tfID.getText();

                try{
                    pst= con.prepareStatement("update employee set empName = ?,salary = ?,mobile = ? where id = ?");
                    pst.setString(1,empname);
                    pst.setString(2,salary);
                    pst.setString(3,mobile);
                    pst.setString(4,empID);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Updated...");
                    table_load();
                    tfName.setText("");
                    tfSalary.setText("");
                    tfMobile.setText("");
                    tfName.requestFocus();
                }
                catch(SQLException e4){
                    e4.printStackTrace();
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String empid;
                empid=tfID.getText();

                try{
                    pst= con.prepareStatement("delete from employee where id = ?");

                    pst.setString(1,empid);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Deleted...");
                    table_load();
                    tfName.setText("");
                    tfSalary.setText("");
                    tfMobile.setText("");
                    tfName.requestFocus();
                }
                catch (SQLException e5){
                    e5.printStackTrace();
                }
            }
        });
    }
}
