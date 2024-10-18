package bai_tap_b7.service;

import bai_tap_b7.entities.BizStudent;

public class BizStudentService extends StudentService{

    BizStudent bizStudent = new BizStudent();

    public void setBizStudent(BizStudent bizStudent) {
        this.bizStudent = bizStudent;
    }

    @Override
    public double getScore() {
        return ((2*bizStudent.getPointMarketing() + bizStudent.getPointSales())/3);
    }
}
