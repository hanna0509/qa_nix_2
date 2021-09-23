package ua.com.alevel.entity;

import java.util.List;
import java.util.ArrayList;

public class Department {

    private String Id;
    private String departmentName;
    private String managerLastName;

    public String getId() {
        return Id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }
}
