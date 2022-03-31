package com.Abdinahmen.Springboottutorial.service;

import com.Abdinahmen.Springboottutorial.entity.Department;
import com.Abdinahmen.Springboottutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    private DepartmentService departmentService;

    private DepartmentRepository departmentRepository;


    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("Ahmedabad")
                        .departmentCode("IT-06")
                        .departmentId(1L)
                        .build();
    }

    @Test
    public void whenValidDepartmentName_ThenDepartmentShouldFound(){

        String departmentName = "IT";
        Department found =
                departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());


    }
}