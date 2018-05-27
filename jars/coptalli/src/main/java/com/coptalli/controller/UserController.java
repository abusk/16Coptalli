package com.coptalli.controller.usercontroller;

import com.coptalli.db.dbo.UserCredentials;
import com.coptalli.db.dbo.Users;
import com.coptalli.db.ds.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {

    public static void saveUsers(Users users) throws SQLException {
        try(Connection connection = DataSource.getConnection()) {
            PreparedStatement psmt = connection.prepareStatement("INSERT INTO users(userid, name, password, emailid) values(?,?,?,?)");
            psmt.setString(1, users.getUserId());
            psmt.setString(2, users.getName());
            psmt.setString(3, users.getPassword());
            psmt.setString(4, users.getEmailId());
            psmt.executeUpdate();
        }
    }
    public static boolean authenticate(UserCredentials credentials) throws SQLException {
        try (Connection connection= DataSource.getConnection()) {
            PreparedStatement psmt = connection.prepareStatement("SELECT password FROM users WHERE userid=?");
            psmt.setString(1, credentials.getUserId());
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                rs.first();
                String password = rs.getString("password");
                if (password.equalsIgnoreCase(credentials.getPassword()))
                    return true;
                else return false;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        UserCredentials credentials = new UserCredentials();
        credentials.setUserId("abu24");
        credentials.setPassword("abu1235");
        try {
            boolean re = authenticate(credentials);
            System.out.println(re);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
