package ua.com.alevel.dao;

import ua.com.alevel.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractEmployeetDao {

    protected List<Employee> employees = new ArrayList<>();

    AbstractDepartmentDao departmentDao = new csvDepartmentDao();

    protected void createEmployee(Employee employee) {
        employee.setId(generateId());
        employees.add(employee);
    }

    protected void updateEmployee(Employee employee)  {
        if (existById(employee.getId())) {
            Employee current = findEmployeeById(employee.getId());
            current.setId(employee.getId());
            current.setFirstName(employee.getFirstName());
            current.setLastName(employee.getLastName());
            current.setBirthDay(employee.getBirthDay());
            current.setDepartmentIds(employee.getDepartmentIds());
        }
    }

    protected void linkDepartment(String departmentId, String employeeId) {
        Employee current = employees.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst().get();
        List<String> departmentIds = current.getDepartmentIds();
        departmentIds.add(departmentId);
    }

    protected void unlinkDepartment(String departmentId, String employeeId) {
        Employee current = employees.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst().get();
        List<String> departmentIds = current.getDepartmentIds();
        departmentIds.removeIf(id -> id.equals(departmentId));
    }

    protected void deleteEmployee(String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    protected Employee findEmployeeById(String id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().get();
    }

    protected List<Employee> findAllEmployees() {
        return employees;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        if (existById(id)) {
            return generateId();
        }
        return id;
    }

    private boolean existById(String id) {
        return employees.stream().anyMatch(employee -> employee.getId().equals(id));
    }
}
