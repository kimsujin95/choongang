package com.database;

import java.util.List;

import com.database.DAO.EmployeesDAO;
import com.database.dto.EmployeeDTO;

public class Employees {
	public static void main(String[] args) {
		EmployeesDAO dao = new EmployeesDAO();
		List<EmployeeDTO> list = dao.selectList();
	
		for (EmployeeDTO employeeDTO : list) {
			System.out.printf("%3d   ", employeeDTO.getEmp_no());
			System.out.printf("%10s  ", employeeDTO.getBirth_date());
			System.out.printf("%-15s  ", employeeDTO.getFirst_name());
			System.out.printf("%-15s  ", employeeDTO.getLast_name());
			System.out.printf("%2c  ", employeeDTO.getGender());
			System.out.printf("%10s\n", employeeDTO.getHire_date());
		}
	}
}
