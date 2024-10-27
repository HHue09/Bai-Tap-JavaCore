package kiem_tra.service;

import kiem_tra.entities.User;

public class ForgotPasswordService {
    private UserService userService;

    public ForgotPasswordService(UserService userService) {
        this.userService = userService;
    }

    public boolean forgotPassword(String email, String newPassword) {
        User user = userService.findUserByUserEmail(email);
        if (user == null) {
            System.out.println("Email chưa tồn tại.");
            return false;
        }

        RegisterService registerService = new RegisterService(userService);
        if (!registerService.isValidPassword(newPassword)) {
            System.out.println("Mật khẩu không hợp lệ.");
            return false;
        }

        user.setPassword(newPassword);
        System.out.println("Mật khẩu đã được thay đổi.");
        return true;
    }
}
