package Employee;

import multiUserLogin.User;

import java.sql.*;

public class GetData {
    public User getAuthenticatedEmployee(String email, String password) {
        User admin = null;

        final String DB_URL = "jdbc:mysql://localhost/oop";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME,PASSWORD);
            //Connection to database successfull...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM user WHERE email='"+email+"' AND password= '"+password+"'";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                admin = new User();
                admin.email = resultSet.getString("email");
                admin.password = resultSet.getString("password");
                admin.username = resultSet.getString("username");
                admin.ID = resultSet.getString("id");
                admin.department = resultSet.getString("department");
                admin.position = resultSet.getString("position");
                admin.salary = resultSet.getString("salary");
            }
            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return admin;
    }
}
