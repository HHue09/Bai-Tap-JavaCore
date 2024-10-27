package kiem_tra;

import kiem_tra.service.ForgotPasswordService;
import kiem_tra.service.ProfileService;
import kiem_tra.service.RegisterService;
import kiem_tra.service.UserService;

import java.util.Scanner;

public class Main {
    private static UserService userService = new UserService();
    private static RegisterService registerService = new RegisterService(userService);
    private static ProfileService profileService = new ProfileService(userService);
    private static ForgotPasswordService forgotPasswordService = new ForgotPasswordService(userService);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            System.out.println("0 - Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> login();
                case 2 -> register();
                case 0 -> {
                    System.out.println("Tạm biệt!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void login() {
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        if (userService.login(username, password)) {
            userMenu();
        } else {
            System.out.println("1 - Đăng nhập lại");
            System.out.println("2 - Quên mật khẩu");
            System.out.print("Chọn một tùy chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> login();
                case 2 -> forgotPassword();
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void register() {
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        registerService.register(username, email, password);
    }

    private static void forgotPassword() {
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();

        forgotPasswordService.forgotPassword(email, newPassword);
    }

    private static void userMenu() {
        while (userService.isLoggedIn()) {
            System.out.println("\n1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            System.out.print("Chọn một tùy chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> changeUsername();
                case 2 -> changeEmail();
                case 3 -> changePassword();
                case 4 -> userService.logout();
                case 0 -> System.exit(0);
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void changeUsername() {
        System.out.print("Nhập username mới: ");
        String newUsername = scanner.nextLine();
        profileService.changeUsername(newUsername);
    }

    private static void changeEmail() {
        System.out.print("Nhập email mới: ");
        String newEmail = scanner.nextLine();
        profileService.changeEmail(newEmail);
    }

    private static void changePassword() {
        System.out.print("Nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();
        profileService.changePassword(newPassword);
    }
}
