/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thltm_finaltest.model;

/**
 *
 * @author thinhle
 */
public class Teacher {
    String name;
    String birthday;
    String schoolName;
    String code;

    public Teacher(String name, String birthday, String schoolName, String code) {
        this.name = name;
        this.birthday = birthday;
        this.schoolName = schoolName;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
