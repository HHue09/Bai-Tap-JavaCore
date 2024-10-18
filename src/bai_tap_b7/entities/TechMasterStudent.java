package bai_tap_b7.entities;

public class TechMasterStudent {
    private String name;
    private String major;

    public TechMasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public TechMasterStudent() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
