package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentByID(long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentByID(Long departmentId);

    public Department updateDepartmentById(long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
