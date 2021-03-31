package com.cts.Department.Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Department.Service.entity.Department;
import com.cts.Department.Service.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;	
  
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		log.info("inside save department of DepartmentController");
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId)
	{
		log.info("Inside findDepartmentById method of controller");
		return departmentService.findDepartmentById(departmentId);
	}
}
