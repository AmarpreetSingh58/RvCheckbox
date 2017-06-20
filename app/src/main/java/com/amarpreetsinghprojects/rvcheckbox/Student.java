package com.amarpreetsinghprojects.rvcheckbox;

/**
 * Created by kulvi on 06/19/17.
 */

public class Student {
    String name;
    Boolean check;

    public Student(String name, Boolean check) {
        this.name = name;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
