package lession12_lab4.entities;

public class LeaderEmployee extends Employee {
    private double responSalary;

    public LeaderEmployee(int id, String name, double salary, double responSalary) {
        super(id, name, salary);
        this.responSalary = responSalary;
    }

    public double getResponSalary() {
        return responSalary;
    }

    public void setResponSalary(double responSalary) {
        this.responSalary = responSalary;
    }

    @Override
    public double tinhThuNhap() {
        return salary + responSalary;
    }
}
