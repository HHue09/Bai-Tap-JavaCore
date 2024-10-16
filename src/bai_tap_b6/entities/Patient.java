package bai_tap_b6.entities;

import java.time.LocalDate;

public class Patient extends Person {
    private int idMedical;
    private String  startDate;

    public Patient(String name, int age, int idMedical, String startDate) {
        super(name, age);
        this.idMedical = idMedical;
        this.startDate = startDate;
    }

    public int getIdMedical() {
        return idMedical;
    }

    public void setIdMedical(int idMedical) {
        this.idMedical = idMedical;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "idMedical=" + idMedical +
                ", startDate='" + startDate + '\'' +
                "} " + super.toString();
    }
}
