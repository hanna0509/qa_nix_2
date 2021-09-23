package ua.com.alevel.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Employee {

    private String Id;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private String departmentName;

    public String getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
