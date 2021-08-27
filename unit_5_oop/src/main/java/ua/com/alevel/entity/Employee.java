package ua.com.alevel.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String id;
    private int age;
    private String firstname;
    private String lastname;
    private String department;

    @Override
    public String toString() {
        return "Employee {" +
                "id: '" + id + '\'' +
                ", first name: '" + firstname + '\'' +
                ", last name: '" + lastname + '\'' +
                ", age: '" + age + '\'' +
                ", department: '" + department + '\'' +
                "}";
    }
}
