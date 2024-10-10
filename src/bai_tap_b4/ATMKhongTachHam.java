package bai_tap_b4;

import java.util.Scanner;

public class ATMKhongTachHam {
    public static void main(String[] args) {
        final String USERNAME = "techmaster";
        final String PASSWORD = "hoclacoviec";
        final double BALANCE = 1000000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin tài khoản:: ");
        System.out.println("username: ");
        String username = scanner.nextLine();
        System.out.println("password: ");
        String password = scanner.nextLine();

        if(username.equals(USERNAME) && password.equals(PASSWORD)){
            System.out.println("Login success: ");
            System.out.println("1.Xem thông tin tài khoản");
            System.out.println("2.Rút tiền");
            System.out.println("3.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Username: " +USERNAME);
                    System.out.println("Số dư: " +BALANCE);
                    break;
                case 2:
                    System.out.println("Mời bạn nhập số tiền muốn rút: ");
                    double money = Double.parseDouble(scanner.nextLine());
                    if(money>BALANCE){
                        System.out.println("Số tiền rút vượt quá số dư");
                    } else {
                        double amount = 1000-money;
                        System.out.println("Bạn đã rút: " + money + "VNĐ");
                        System.out.println("Tài khoản của bạn còn dư: " + amount + "VNĐ");
                    }
                    break;
                case 3:
                    System.out.println("Thanks!!");
                    break;
            }
        }
    }
}
