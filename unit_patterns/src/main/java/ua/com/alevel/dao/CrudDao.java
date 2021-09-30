package ua.com.alevel.dao;

import ua.com.alevel.entity.BaseEntity;

import java.util.List;

public interface CrudDao<E extends BaseEntity> {

    void create(E e);
    void update(E e);
    void delete(String id);
    E findById(String id);
    List<E> findAll();
    void link(String departmentId, String employeeId);
    void unlink(String departmentId, String employeeId);
}