package kiem_tra.service;

import kiem_tra.entities.User;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();
    private User loggedInUser = null;

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }

    public User findUserByUserEmail(String email){
        for (User user : users){
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    public boolean login(String username, String password) {
        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Kiểm tra lại username.");
            return false;
        }

        if (!user.getPassword().equals(password)) {
            System.out.println("Sai mật khẩu.");
            return false;
        }

        loggedInUser = user;
        System.out.println("Chào mừng " + loggedInUser.getUsername() + ", bạn có thể thực hiện các công việc sau:");
        return true;
    }

    public void logout() {
        loggedInUser = null;
        System.out.println("Bạn đã đăng xuất.");
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

}
