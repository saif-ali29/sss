package com.cognizant.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;

}
