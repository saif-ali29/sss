package com.cts.Department.Service.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.Department.Service.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	Department findByDepartmentId(Long departmentId);
	

	
}
