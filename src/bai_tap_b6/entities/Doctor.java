package bai_tap_b6.entities;

public class Doctor extends Person {
    private String specialty;
    private int numberWorking;

    public Doctor(String name, int age, String specialty, int numberWorking) {
        super(name, age);
        this.specialty = specialty;
        this.numberWorking = numberWorking;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getNumberWorking() {
        return numberWorking;
    }

    public void setNumberWorking(int numberWorking) {
        this.numberWorking = numberWorking;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + specialty + '\'' +
                ", numberWorking=" + numberWorking +
                "} " + super.toString();
    }
}
