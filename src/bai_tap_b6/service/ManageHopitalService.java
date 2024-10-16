package bai_tap_b6.service;

import bai_tap_b6.entities.Doctor;
import bai_tap_b6.entities.Patient;

import java.time.LocalDate;
import java.util.Scanner;

public class ManageHopitalService {

    public void showMenu(){
        System.out.println("1. Nhập thông tin bác sĩ");
        System.out.println("2. Nhập thông tin bệnh nhân");
        System.out.println("3. In danh sach");
        System.out.println("0. Thoát");
    }

    public Doctor inputInfo1(Scanner scanner){
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chuyên khoa: ");
        String specialty = scanner.nextLine();
        System.out.println("Nhập số giờ làm việc: ");
        int numberWorking = Integer.parseInt(scanner.nextLine());
        return new Doctor(name, age, specialty, numberWorking);
    }

    public Patient inputInfo2(Scanner scanner){
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số bệnh án: ");
        int idMedical = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngày nhập viện: ");
        String startDate = scanner.nextLine();
        return new Patient(name, age, idMedical, startDate);
    }

    public void showList(Doctor[] doctors, Patient[] patients) {
        System.out.println("Danh sách bác sĩ:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        System.out.println("Danh sách bệnh nhân:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
