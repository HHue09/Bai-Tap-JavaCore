package bai_tap_b6;

import bai_tap_b6.entities.Doctor;
import bai_tap_b6.entities.Patient;
import bai_tap_b6.service.ManageHopitalService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageHopitalService manageHopitalService = new ManageHopitalService();

        Doctor[] doctors = null;
        Patient[] patients = null;
        int choose;

        do {
            manageHopitalService.showMenu();
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Nhập tổng số bác sĩ: ");
                    int numberDoctor = Integer.parseInt(scanner.nextLine());
                    doctors = new Doctor[numberDoctor];
                    System.out.println("------Nhập thông tin bác sĩ------");
                    for (int i = 0; i < numberDoctor; i++) {
                        System.out.println("Thông tin bác sĩ thứ: "+(i+1));
                        Doctor doctor = manageHopitalService.inputInfo1(scanner);
                        doctors[i] = doctor;
                    }
                    break;
                case 2:
                    System.out.println("Nhập tổng số bệnh nhân: ");
                    int numberPatient = Integer.parseInt(scanner.nextLine());
                    patients = new Patient[numberPatient];
                    System.out.println("------Nhập thông tin bệnh nhân------");
                    for (int i = 0; i < numberPatient; i++) {
                        System.out.println("Thông tin bệnh nhân thứ: "+(i+1));
                        Patient patient = manageHopitalService.inputInfo2(scanner);
                        patients[i] = patient;
                    }
                    break;
                case 3:
                    if(doctors != null && patients != null){
                        manageHopitalService.showList(doctors, patients);
                    } else {
                        System.out.println("Chưa có dữ liệu để in.");
                    }
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
            }
        } while (choose != 0);
    }
}

