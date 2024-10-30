package lession12_lab4;

import lession12_lab4.entities.Employee;
import lession12_lab4.service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Nhập và xuất danh sách nhân viên");
            System.out.println("2. Xóa nhân viên hoặc cập nhật thông tin nhân viên");
            System.out.println("3. Tìm kiếm nhân viên theo lương");
            System.out.println("4. Sắp xếp nhân viên theo họ tên và thu nhập");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Nhập thông tin nhân viên và thêm vào danh sách
                    int inputChoice;
                    do {
                        System.out.println("Chọn loại nhân viên để nhập thông tin:");
                        System.out.println("1. Nhân viên HC");
                        System.out.println("2. Nhân viên TT");
                        System.out.println("3. Lãnh đạo");
                        System.out.println("0. Thoát");

                        inputChoice = Integer.parseInt(scanner.nextLine());

                        switch (inputChoice) {
                            case 1:
                                employeeService.addEmployee(employeeService.inputInfoNVHC(scanner));
                                break;
                            case 2:
                                employeeService.addEmployee(employeeService.inputInfoNVTT(scanner));
                                break;
                            case 3:
                                employeeService.addEmployee(employeeService.inputInfoLeader(scanner));
                                break;
                            case 0:
                                System.out.println("Thoát khỏi việc nhập nhân viên.");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        }

                    } while (inputChoice != 0);

                    // Xuất danh sách nhân viên
                    employeeService.showList();
                    break;
                case 2:
                    System.out.println("Nhập ID nhân viên cần xóa hoặc cập nhật thông tin:");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.println("Bạn muốn (1) Xóa hoặc (2) Cập nhật?");
                    int actionChoice = Integer.parseInt(scanner.nextLine());

                    if (actionChoice == 1) {
                        employeeService.deleteEmployeeById(id);
                    } else if (actionChoice == 2) {
                        employeeService.updateEmployeeById(id, scanner);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mức lương: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    employeeService.findEmployeeBySalary(salary);
                    break;
                case 4:
                    employeeService.sortEmployeesByNameAndIncome();
                    employeeService.showList();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
