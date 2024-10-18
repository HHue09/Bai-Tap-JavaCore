package bai_tap_b7.entities;

public class ITStudent extends TechMasterStudent {
    private double pointJava;
    private double pointHTML;
    private double pointCSS;

    public ITStudent(String name, String major, double pointJava, double pointHTML, double pointCSS) {
        super(name, major);
        this.pointJava = pointJava;
        this.pointHTML = pointHTML;
        this.pointCSS = pointCSS;
    }

    public ITStudent() {

    }

    public double getPointJava() {
        return pointJava;
    }

    public void setPointJava(double pointJava) {
        this.pointJava = pointJava;
    }

    public double getPointHTML() {
        return pointHTML;
    }

    public void setPointHTML(double pointHTML) {
        this.pointHTML = pointHTML;
    }

    public double getPointCSS() {
        return pointCSS;
    }

    public void setPointCSS(double pointCSS) {
        this.pointCSS = pointCSS;
    }
}
