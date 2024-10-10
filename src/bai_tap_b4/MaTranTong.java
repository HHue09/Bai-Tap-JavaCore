package bai_tap_b4;

import java.util.Scanner;

public class MaTranTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số hàng của ma trận: ");
        int column = Integer.parseInt(scanner.nextLine());

        int [][] arrA = new int [row][column];
        int [][] arrB = new int [row][column];
        int [][] arrSum = new int [row][column];

        System.out.println("Nhập phần tử cho ma trận A: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("arrA[" + i +"][" + j + "]");
                arrA[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Nhập phần tử cho ma trận B: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("arrB[" + i +"][" + j + "]");
                arrB[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Ma trận tổng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrSum[i][j] = arrA[i][j] + arrB[i][j];

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arrSum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
