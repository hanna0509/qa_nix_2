package ua.com.alevel.dao;

import ua.com.alevel.entity.Department;

import java.util.List;

public interface DepartmentDao {

    void create (Department department);
    void update (Department department);
    void delete (String id);
    Department findById (String id);
    List<Department> findALL();
    }
