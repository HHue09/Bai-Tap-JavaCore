package kiem_tra.service;

public class ProfileService {
    private UserService userService;

    public ProfileService(UserService userService) {
        this.userService = userService;
    }

    public boolean changeUsername(String newUsername) {
        if (userService.findUserByUsername(newUsername) != null) {
            System.out.println("Username đã tồn tại.");
            return false;
        }

        userService.getLoggedInUser().setUsername(newUsername);
        System.out.println("Username đã được thay đổi thành công.");
        return true;
    }

    public boolean changeEmail(String newEmail) {
        RegisterService registerService = new RegisterService(userService);
        if (!registerService.isValidEmail(newEmail)) {
            System.out.println("Email không hợp lệ.");
            return false;
        }

        if (userService.findUserByUserEmail(newEmail) != null) {
            System.out.println("Email đã tồn tại.");
            return false;
        }

        userService.getLoggedInUser().setEmail(newEmail);
        System.out.println("Email đã được thay đổi thành công.");
        return true;
    }

    public boolean changePassword(String newPassword) {
        RegisterService registerService = new RegisterService(userService);
        if (!registerService.isValidPassword(newPassword)) {
            System.out.println("Mật khẩu không hợp lệ. Đảm bảo dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa và 1 ký tự đặc biệt.");
            return false;
        }

        userService.getLoggedInUser().setPassword(newPassword);
        System.out.println("Mật khẩu đã được thay đổi thành công.");
        return true;
    }
}
