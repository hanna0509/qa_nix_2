package ua.com.alevel.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private Date birthDay;
    private boolean isVisible;
    private List<String> departmentIds = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
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

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }
}
