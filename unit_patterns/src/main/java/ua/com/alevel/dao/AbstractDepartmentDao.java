package ua.com.alevel.dao;

import ua.com.alevel.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class AbstractDepartmentDao {

    protected List<Department> departments = new ArrayList<>();

    protected void createDepartment(Department department) {
        department.setId(generateId());
        department.setVisible(true);
        departments.add(department);
    }

    protected void updateDepartment(Department department) {
        if (existById(department.getId())) {
            Department current = findDepartmentById(department.getId());
            current.setId(department.getId());
            current.setDepartmentName(department.getDepartmentName());
            current.setManagerLastName(department.getManagerLastName());
        }
    }

    protected boolean existEmployee(String departmentId, String employeeId) {
        Department current = departments.stream().filter(department -> department.getId().equals(departmentId)).findFirst().get();
        return current.employeeIds().stream().anyMatch(id -> id.equals(employeeId));
    }

    protected void linkEmployee(String departmentId, String employeeId) {
        Department current = departments.stream().filter(department -> department.getId().equals(departmentId)).findFirst().get();
        List<String> employeeIds = current.getEmployeeIds();
        employeeIds.add(employeeId);
    }

    protected void unlinkEmployee(String departmentId, String employeeId) {
        Department current = departments.stream().filter(department -> department.getId().equals(departmentId)).findFirst().get();
        List<String> employeeIds = current.getEmployeeIds();
        employeeIds.removeIf(id -> id.equals(employeeId));
    }

    protected void deleteDepartment(String id) {
        if (existById(id)) {
            Department current = findDepartmentById(id);
            current.setVisible(false);
        }
    }

    protected Department findDepartmentById(String id) {
        return findAllDepartments().stream().filter(department -> department.getId().equals(id)).findFirst().get();
    }

    protected List<Department> findAllDepartments() {
        return departments.stream().filter(Department::getIsVisible).collect(Collectors.toList());
        ;
    }

    private static List<Department> visibleDepartments(List<Department> departments) {
        return departments.stream().filter(Department::getIsVisible).collect(Collectors.toList());
    }

    private String generateId()()

    {
        String id = UUID.randomUUID().toString();
        if (existById(id)) {
            return generateId();
        }
        return id;
    }

    private boolean existById(String id) {
        return departments.stream().anyMatch(department -> department.getId().equals(id));
    }
}
