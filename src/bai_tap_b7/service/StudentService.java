package bai_tap_b7.service;

import java.util.Scanner;

public abstract class StudentService {

    public abstract double getScore();

    public String getHocLuc(){
        if(getScore() >= 7.5){
            return "HSG";
        } else if (getScore() < 7.5 && getScore() > 6.5) {
            return "HSK";
        }
        return "HSTB";
    }
}
