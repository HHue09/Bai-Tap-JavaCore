package bai_tap_mang_va_doi_tuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tổng số lượng động vật: ");
        int numberAnimal = Integer.parseInt(scanner.nextLine());

        Animal[] animals = new Animal[numberAnimal];

        for (int i = 0; i < numberAnimal; i++) {
            System.out.println("Nhập miêu tả động vật thứ "+(i+1) + ":");

            System.out.println("ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Description: ");
            String description = scanner.nextLine();

            System.out.println("Gender (true for male, false for female): ");
            Boolean gender = Boolean.parseBoolean(scanner.nextLine());

            animals[i] = new Animal(id, name, description, gender);

        }

        System.out.println("\nList of animals: ");
        for (int i = 0; i < numberAnimal; i++) {
            System.out.println(animals[i]);
        }
    }
}
