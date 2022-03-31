package com.Abdinahmen.Springboottutorial.service;

import com.Abdinahmen.Springboottutorial.entity.Department;
import com.Abdinahmen.Springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public  List<Department> fetchDepartmentList();

    public  Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);


}
