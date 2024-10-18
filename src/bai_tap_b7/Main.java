package bai_tap_b7;

import bai_tap_b6.entities.Doctor;
import bai_tap_b7.entities.BizStudent;
import bai_tap_b7.entities.ITStudent;
import bai_tap_b7.service.BizStudentService;
import bai_tap_b7.service.ITStudentService;
import bai_tap_b7.service.StudentService;
import bai_tap_b7.service.StudentTechMasterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentTechMasterService studentTechMasterService = new StudentTechMasterService();

        ITStudentService itStudentService = new ITStudentService();
        BizStudentService bizStudentService = new BizStudentService();

        ITStudent itStudents[] = null;
        BizStudent bizStudents[] = null;
        int choose;

        do{
            studentTechMasterService.showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhap tong so sinh vien IT: ");
                    int numberIT = Integer.parseInt(scanner.nextLine());
                    itStudents = new ITStudent[numberIT];
                    System.out.println("------Nhập thông tin sinh vien IT------");
                    for (int i = 0; i < numberIT; i++) {
                        System.out.println("Thông tin sinh vien IT thứ: "+(i+1));
                        ITStudent itStudent = studentTechMasterService.inputInfoIt(scanner);
                        itStudents[i] = itStudent;
                    }
                    break;
                case 2:
                    System.out.println("Nhap tong so sinh vien Biz: ");
                    int numberBiz = Integer.parseInt(scanner.nextLine());
                    bizStudents = new BizStudent[numberBiz];
                    System.out.println("------Nhập thông tin sinh vien Biz------");
                    for (int i = 0; i < numberBiz; i++) {
                        System.out.println("Thông tin sinh vien Biz thứ: "+(i+1));
                        BizStudent bizStudent = studentTechMasterService.inputInfoBiz(scanner);
                        bizStudents[i] = bizStudent;
                    }
                    break;
                case 3:
                    if (itStudents != null) {
                        studentTechMasterService.showListIT(itStudents);
                    } else if (bizStudents != null) {
                        studentTechMasterService.showListBiz(bizStudents);
                    }
                    System.out.println("Chưa có dữ liệu để in.");
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
            }
        }while (choose != 0);
    }
}
