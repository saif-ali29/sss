package com.cognizant.userservice.VO;

import com.cognizant.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUserDeptVO {
	private User user;
	private Department department;

}
