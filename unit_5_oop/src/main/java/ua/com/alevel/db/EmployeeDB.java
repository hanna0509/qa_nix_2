package ua.com.alevel.db;

import ua.com.alevel.entity.Employee;

import java.util.Arrays;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

public class EmployeeDB {

    private int size = 10;
    private int numberEEs = 0;
    private Employee[] employees = new Employee[size];

    // public EmployeeDB(int k) {
    //     if (k > 0) {
    //         this.employees = new Employee[k];
    //     }else {
    //          throw new IllegalArgumentException("The length should be more than 0!");
    //     }
//    }

    public void create(Employee employee) {

        if (size <= numberEEs) {
            size += size + 10;
            employees = Arrays.copyOf(employees, size);
        }
        for (int i = 0; i < size; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employee.setId(generateId());
                numberEEs++;
                break;
            }
        }
    }

    public void update(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() != null) {
                employees[i].setFirstname(employee.getFirstname());
                employees[i].setLastname(employee.getLastname());
                employees[i].setAge(employee.getAge());
                employees[i].setDepartment(employee.getDepartment());
                break;
            }
        }
    }

    public Employee findById(String id) {
        int i;
        for (i = 0; i < size; i++) {
            if ((employees[i].getId() != null) & (employees[i].getId().equals(id))) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] findAll() {
        return employees;
    }

    public void delete(String id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        for (int j = index; j < size - 1; j++) {
            employees[j] = employees[j + 1];
        }
        employees[size - 1] = null;
    }

    public String generateId() {
        String ts = String.valueOf(System.currentTimeMillis());
        String rand = UUID.randomUUID().toString();
        return DigestUtils.shaHex(ts + rand);
    }
}
