package bai_tap_b5;

import java.util.Scanner;

public class TachHamATM {
    public static void main(String[] args) {
        Login login = new Login("techmaster", "hoclacoviec", 1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String username = scanner.nextLine();
        System.out.println("Nhap pass: ");
        String password = scanner.nextLine();

        if(username.equals(login.getUsername()) && password.equals(login.getPassword())){
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    showInfo();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    System.out.println("Thanks!!");
                    break;
            }
        }else {
            System.out.println("Login Failed");
        }
    }

    //hien thi menu cho nguoi dung
    public static void showMenu(){
        System.out.println("Login success");
        System.out.println("\nChọn một tùy chọn:");
        System.out.println("1. Xem thông tin tài khoản");
        System.out.println("2. Rút tiền");
        System.out.println("3. Thoát");
    }

    //rut tien
    public static void withdrawMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền muốn rút: ");
        double money = Double.parseDouble(scanner.nextLine());
        if(money>1000){
            System.out.println("Số tiền rút vượt quá số dư");
        } else {
            double amount = 1000-money;
            System.out.println("Bạn đã rút: " + money + "VNĐ");
            System.out.println("Tài khoản của bạn còn dư: " + amount + "VNĐ");
        }
    }

    //hien thi thong tin tai khoan
    public static void showInfo(){
        System.out.println("Username: techmaster");
        System.out.println("Số dư: 1000VNĐ");
    }

}
