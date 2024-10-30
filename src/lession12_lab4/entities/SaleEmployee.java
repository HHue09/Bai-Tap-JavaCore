package lession12_lab4.entities;

public class SaleEmployee extends Employee {
    private double sales;
    private double commisRate;

    public SaleEmployee(int id, String name, double salary, double sales, double commisRate) {
        super(id, name, salary);
        this.sales = sales;
        this.commisRate = commisRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(double commisRate) {
        this.commisRate = commisRate;
    }

    @Override
    public double tinhThuNhap() {
        return salary+sales*commisRate;
    }
}
