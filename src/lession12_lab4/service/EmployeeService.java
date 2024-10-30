package lession12_lab4.service;

import bai_tap_b6.entities.Doctor;
import bai_tap_b6.entities.Patient;
import lession12_lab4.entities.Employee;
import lession12_lab4.entities.LeaderEmployee;
import lession12_lab4.entities.SaleEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public void showMenu(){
        System.out.println("1. Nhập thông tin NVHC");
        System.out.println("2. Nhập thông tin NVTT");
        System.out.println("3. hập thông tin Truong phong: ");
        System.out.println("0. Thoát");
    }

    public Employee inputInfoNVHC(Scanner scanner){
        System.out.println("Nhap id nv: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten nv: ");
        String name = scanner.nextLine();
        System.out.println("Nhap luong nv: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(id, name, salary) {
            @Override
            public double tinhThuNhap() {
                return salary;
            }
        };
    }

    public SaleEmployee inputInfoNVTT(Scanner scanner){
        System.out.println("Nhap id nv: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten nv: ");
        String name = scanner.nextLine();
        System.out.println("Nhap luong nv: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap doanh so ban hang: ");
        double sales = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap ti le hoa hong: ");
        double commisRate = Double.parseDouble(scanner.nextLine());
        return new SaleEmployee(id, name, salary, sales, commisRate);

    }

    public LeaderEmployee inputInfoLeader(Scanner scanner){
        System.out.println("Nhap id nv: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten nv: ");
        String name = scanner.nextLine();
        System.out.println("Nhap luong nv: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap luong trach nhiem: ");
        double responSalary = Double.parseDouble(scanner.nextLine());
        return new LeaderEmployee(id, name, salary, responSalary);

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Đã thêm nhân viên: " + employee.getName());
    }

    public void showList() {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // 2. Xóa nhân viên theo ID
    public void deleteEmployeeById(int id) {
        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Đã xóa nhân viên có ID: " + id);
    }

    // 3. Cập nhật thông tin nhân viên theo ID
    public void updateEmployeeById(int id, Scanner scanner) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Nhập tên NV mới: ");
                employee.setName(scanner.nextLine());
                System.out.println("Nhập lương NV mới: ");
                employee.setSalary(Double.parseDouble(scanner.nextLine()));

                if (employee instanceof SaleEmployee) {
                    System.out.println("Nhập doanh số mới: ");
                    ((SaleEmployee) employee).setSales(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Nhập tỉ lệ hoa hồng mới: ");
                    ((SaleEmployee) employee).setCommisRate(Double.parseDouble(scanner.nextLine()));
                } else if (employee instanceof LeaderEmployee) {
                    System.out.println("Nhập lương trách nhiệm mới: ");
                    ((LeaderEmployee) employee).setResponSalary(Double.parseDouble(scanner.nextLine()));
                }
                System.out.println("Cập nhật thông tin nhân viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với ID: " + id);
    }

    // 3. Tìm kiếm nhân viên theo lương
    public void findEmployeeBySalary(double salary) {
        System.out.println("Nhân viên có mức lương " + salary + ":");
        for (Employee employee : employees) {
            if (employee.getSalary() == salary) {
                System.out.println(employee);
            }
        }
    }

    // 4. Sắp xếp nhân viên theo họ tên và thu nhập
    public void sortEmployeesByNameAndIncome() {
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::tinhThuNhap).reversed());
        System.out.println("Danh sách nhân viên sau khi sắp xếp:");
        showList();
    }


}
