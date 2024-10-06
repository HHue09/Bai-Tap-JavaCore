package bai_tap_b3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int tich = 1;
        if (n == 0){
            System.out.println("Kết quả tích của 0 số nguyên là: 0");
        } else {
            for (int i = 1; i <= n; i++) {
                tich = tich * i;
            }
            System.out.println("Kết quả tích của " + n + " số nguyên là: " + tich);
        }
    }
}
