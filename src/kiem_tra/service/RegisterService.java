package kiem_tra.service;

import kiem_tra.entities.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterService {
    private UserService userService;

    public RegisterService(UserService userService) {
        this.userService = userService;
    }

    public boolean register(String username, String email, String password) {
        if (userService.findUserByUsername(username) != null) {
            System.out.println("Username đã tồn tại.");
            return false;
        }

        if (!isValidEmail(email)) {
            System.out.println("Email không hợp lệ.");
            return false;
        }

        if (userService.findUserByUserEmail(email) != null) {
            System.out.println("Email đã tồn tại.");
            return false;
        }

        if (!isValidPassword(password)) {
            System.out.println("Mật khẩu không hợp lệ. Đảm bảo dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa và 1 ký tự đặc biệt.");
            return false;
        }

        userService.getUsers().add(new User(username, password, email));
        System.out.println("Tạo tài khoản thành công.");
        return true;
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidPassword(String password) {
        return password.length() >= 7 && password.length() <= 15 &&
                password.matches(".*[A-Z].*") && password.matches(".*[.,\\-_;].*");
    }
}
