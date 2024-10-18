package bai_tap_b7.service;

import bai_tap_b7.entities.ITStudent;

public class ITStudentService extends StudentService{

    ITStudent itStudent = new ITStudent();

    public void setItStudent(ITStudent itStudent) {
        this.itStudent = itStudent;
    }

    @Override
    public double getScore() {
        return ((2*itStudent.getPointJava()+itStudent.getPointCSS()+itStudent.getPointHTML())/4);
    }
}
