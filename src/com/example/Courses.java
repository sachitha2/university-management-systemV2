package com.example;

public class Courses {

    private String cCode;
    private String cName;
    private int lecId;

    public Courses(String cCode, String cName, int lecId) {
        this.cCode = cCode;
        this.cName = cName;
        this.lecId = lecId;
    }



    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getLecId() {
        return lecId;
    }

    public void setLecId(int lecId) {
        this.lecId = lecId;
    }


}
