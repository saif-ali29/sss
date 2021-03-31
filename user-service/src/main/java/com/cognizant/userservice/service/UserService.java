package com.cognizant.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.userservice.VO.Department;
import com.cognizant.userservice.VO.ResponseUserDeptVO;
import com.cognizant.userservice.entity.User;
import com.cognizant.userservice.repository.UserRepository;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public ResponseUserDeptVO getUserWithDepartment(Long userId) {
		log.info("Inside saveUser of UserService");
		ResponseUserDeptVO vo=new ResponseUserDeptVO();
		User user= userRepository.findByUserId(userId);
	
		Department department=restTemplate.getForObject("http://localhost:8085/departments/" +user.getDeptId() , Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

	



}
