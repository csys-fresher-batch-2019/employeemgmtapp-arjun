package HRMS.employeePerformance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import HRMS.EmployeerDetails.TestConnection;
import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class employeePerformanceDAOImp implements employeePerformanceDAO {

	public void add(employeePerformance a) throws Exception {
		
		String sql="insert into employee_performance values(?,?,?,?)";
		
		try(Connection com=TestConnection.getConnection();){
		try(PreparedStatement ps=com.prepareStatement(sql);){
		System.out.println(sql);

		ps.setInt(1,a.getEmpId());
		ps.setInt(2,a.getTeamId());
		ps.setString(3,a.getAppraisalCode());                                               //receiving
		ps.setInt(4,a.getPerformanceRating());
		
		int row=ps.executeUpdate();
		System.out.println(row);
		
	}
		catch(Exception e) {
			throw new DBException(ErrorMessages.PREPARE_FAILURE);
		}
	
	}
		catch(Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	}
}


