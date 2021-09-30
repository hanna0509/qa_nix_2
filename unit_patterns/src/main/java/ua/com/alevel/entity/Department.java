package ua.com.alevel.entity;

import java.util.List;
import java.util.ArrayList;

public class Department extends BaseEntity {

    private String departmentName;
    private String managerLastName;
    private List<String> employeeIds = new ArrayList<>();

    public String getDepartmentName() {
        return departmentName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
        this.employeeIds = employeeIds;
    }
}
