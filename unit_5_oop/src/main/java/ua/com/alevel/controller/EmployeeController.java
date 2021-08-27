package ua.com.alevel.controller;

import ua.com.alevel.entity.Employee;
import ua.com.alevel.service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("if you want create employee, please enter 1");
        System.out.println("if you want update employee, please enter 2");
        System.out.println("if you want delete employee, please enter 3");
        System.out.println("if you want findById employee, please enter 4");
        System.out.println("if you want findAll employees, please enter 5");
        System.out.println("if you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1":
                create(reader);
                break;
            case "2":
                update(reader);
                break;
            case "3":
                delete(reader);
                break;
            case "4":
                findById(reader);
                break;
            case "5":
                findAll(reader);
                break;
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("EmployeeController.create");
        try {
            System.out.println("Please, enter employee's first name");
            String firstname = reader.readLine();
            System.out.println("Please, enter employee's last name");
            String lastname = reader.readLine();
            System.out.println("Please, enter employee's age");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            System.out.println("Please, enter employee's department");
            String department = reader.readLine();
            Employee employee = new Employee();
            employee.setFirstname(firstname);
            employee.setLastname(lastname);
            employee.setAge(age);
            employee.setDepartment(department);
            employeeService.create(employee);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("UserController.update");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            System.out.println("Please, enter employee's first name");
            String firstname = reader.readLine();
            System.out.println("Please, enter employee's last name");
            String lastname = reader.readLine();
            System.out.println("Please, enter employee's age");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            System.out.println("Please, enter employee's department");
            String department = reader.readLine();
            Employee employee = new Employee();
            employee.setFirstname(firstname);
            employee.setLastname(lastname);
            employee.setAge(age);
            employee.setDepartment(department);
            employeeService.update(employee);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void delete(BufferedReader reader) {
        System.out.println("EmployeeController.delete");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            employeeService.delete(id);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findById(BufferedReader reader) {
        System.out.println("EmployeeController.findById");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            Employee employee = employeeService.findById(id);
            System.out.println("employee = " + employee);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findAll(BufferedReader reader) {
        System.out.println("EmployeeController.findAll");
        Employee[] employees = employeeService.findAll();
        for (Employee employee : employees) {
            System.out.println("employee = " + employee);
        }
    }
}
