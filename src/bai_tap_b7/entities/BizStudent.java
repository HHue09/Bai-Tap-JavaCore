package bai_tap_b7.entities;

public class BizStudent extends TechMasterStudent {
    private double pointMarketing;
    private double pointSales;

    public BizStudent(String name, String major, double pointMarketing, double pointSales) {
        super(name, major);
        this.pointMarketing = pointMarketing;
        this.pointSales = pointSales;
    }

    public BizStudent() {

    }

    public double getPointMarketing() {
        return pointMarketing;
    }

    public void setPointMarketing(double pointMarketing) {
        this.pointMarketing = pointMarketing;
    }

    public double getPointSales() {
        return pointSales;
    }

    public void setPointSales(double pointSales) {
        this.pointSales = pointSales;
    }
}
