package HRMS.employeePerformance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import HRMS.EmployeerDetails.TestConnection;

public class employeePerformanceDAOImp implements employeePerformanceDAO {

	public void add(employeePerformance a) throws Exception {
		
		Connection com=TestConnection.getConnection();
		
		String sql="insert into employee_performance values(?,?,?,?)";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);

		ps.setInt(1,a.empId);
		ps.setInt(2,a.teamId);
		ps.setString(3,a.appraisalCode);                                               //receiving
		ps.setInt(4,a.performanceRating);
		
		int row=ps.executeUpdate();
		System.out.println(row);
		
	}

	
	}


