package ua.com.alevel.dao;

import ua.com.alevel.db.EmployeeDB;
import ua.com.alevel.entity.Employee;

public class EmployeeDao {

    private EmployeeDB employeeDB = new EmployeeDB();

    public void create(Employee employee) {
        employeeDB.create(employee);
    }

    public void update(Employee employee) {
        employeeDB.update(employee);
    }

    public Employee findById(String id) {
        return employeeDB.findById(id);
    }

    public Employee[] findAll() {
        return employeeDB.findAll();
    }

    public void delete(String id) {
        employeeDB.delete(id);
    }
}
