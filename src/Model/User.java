package Model;

import java.util.ArrayList;

public class User {
    private String name;
    private String lastName;
    private String username;
    private String userID;
    private String password;
    private String email;
    private String phoneNumber;
    private static ArrayList<User> loggedUsers = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();

    /*public User() {

    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public void setID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void changePassword(String currentPassword, String newPassword) {

    }

    public void editField(String field, String newValue) {

    }

    public static void login(User user) {

    }

    public static void logout(User user) {

    }
}
