package ua.com.alevel.dao;

import ua.com.alevel.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    void create(Employee employee);
    void update(Employee employee);
    void delete (String id);
    Employee findById (String id);
    Employee findByFirstName (String firstName);
    List<Employee> findALL();
    List<Employee> findByDepartmentName(String departmentName);

}
