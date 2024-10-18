package bai_tap_b7.service;

import bai_tap_b6.entities.Doctor;
import bai_tap_b6.entities.Patient;
import bai_tap_b7.entities.BizStudent;
import bai_tap_b7.entities.ITStudent;

import java.util.Scanner;

public class StudentTechMasterService {

    public void showMenu(){
        System.out.println("1. Nhập thông tin sinh vien IT");
        System.out.println("2. Nhập thông tin sinh vien Biz");
        System.out.println("3. In danh sach");
        System.out.println("0. Thoát");
    }

    public ITStudent inputInfoIt(Scanner scanner){
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap nganh hoc: ");
        String major = scanner.nextLine();
        System.out.println("Nhap diem Java: ");
        double pointJava = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem HTML: ");
        double pointHTML = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem CSS: ");
        double pointCSS = Double.parseDouble(scanner.nextLine());
        return new ITStudent(name, major, pointJava, pointHTML, pointCSS);
    }

    public BizStudent inputInfoBiz(Scanner scanner){
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap nganh hoc: ");
        String major = scanner.nextLine();
        System.out.println("Nhap diem Marketing: ");
        double pointMarketing = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem Sales: ");
        double pointSales = Double.parseDouble(scanner.nextLine());
        return new BizStudent(name, major, pointMarketing, pointSales);
    }

    public void showListIT(ITStudent[] itStudents) {
        System.out.println("Danh sách sinh vien IT:");
        for (ITStudent itStudent : itStudents) {
            ITStudentService itStudentService = new ITStudentService();
            itStudentService.setItStudent(itStudent);
            double score = itStudentService.getScore();
            String hocLuc = itStudentService.getHocLuc();
            System.out.println("Tên: " + itStudent.getName());
            System.out.println("Ngành: " + itStudent.getMajor());
            System.out.println("Điểm Java: " + itStudent.getPointJava());
            System.out.println("Điểm HTML: " + itStudent.getPointHTML());
            System.out.println("Điểm CSS: " + itStudent.getPointCSS());
            System.out.println("Điểm tổng: " + score);
            System.out.println("Học lực: " + hocLuc);
            System.out.println("-----------------------------------");
        }
    }
    public void showListBiz(BizStudent[] bizStudents) {
        System.out.println("Danh sách sinh vien Biz:");
        for (BizStudent bizStudent : bizStudents) {
            BizStudentService bizStudentService = new BizStudentService();
            bizStudentService.setBizStudent(bizStudent);
            double score = bizStudentService.getScore();
            String hocLuc = bizStudentService.getHocLuc();
            System.out.println("Tên: " + bizStudent.getName());
            System.out.println("Ngành: " + bizStudent.getMajor());
            System.out.println("Điểm Marketing: " + bizStudent.getPointMarketing());
            System.out.println("Điểm Sales: " + bizStudent.getPointSales());
            System.out.println("Điểm tổng: " + score);
            System.out.println("Học lực: " + hocLuc);

            System.out.println("-----------------------------------");
        }
    }
}
