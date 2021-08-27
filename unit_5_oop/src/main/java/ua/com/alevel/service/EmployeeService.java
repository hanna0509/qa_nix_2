package ua.com.alevel.service;

import ua.com.alevel.dao.EmployeeDao;
import ua.com.alevel.entity.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    public void create(Employee employee) {
        employeeDao.create(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    public Employee findById(String id) {
        return employeeDao.findById(id);
    }

    public Employee[] findAll() {
        return employeeDao.findAll();
    }

    public void delete(String id) {
        employeeDao.delete(id);
    }
}



