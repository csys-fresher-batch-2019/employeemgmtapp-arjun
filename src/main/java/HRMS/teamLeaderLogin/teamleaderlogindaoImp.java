package HRMS.teamLeaderLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import HRMS.EmployeerDetails.TestConnection;
import HRMS.employeePerformance.employeePerformance;
import HRMS.employeePerformance.employeePerformanceDAOImp;
import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class teamleaderlogindaoImp implements TeamLeaderLoginDAO {

	public List<teamLeaderLogin> login(int teamId, String password) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try(Connection con = TestConnection.getConnection();){
		try(Statement stmt = con.createStatement();){
		if (stmt.executeUpdate("select team_id from team_leader_login where team_id =" + teamId) == 1) {

			String sql = "select team_password from team_leader_login where team_id=" + teamId;
			try(ResultSet rs = stmt.executeQuery(sql);){
			rs.next();
			String pass = rs.getString("team_password");
			if (pass.equals(password)) {
				System.out.println("Login success");
//				TestEmployeePerformance.main();
				employeePerformanceDAOImp ob=new employeePerformanceDAOImp();
				employeePerformance ep=new employeePerformance();
				System.out.println("Enter EmpId,TeamId,AppraisalCode,PerformanceRating : ");
				ep.setEmpId(s.nextInt());
				ep.setTeamId(s.nextInt());
				ep.setAppraisalCode(s.next());
				ep.setPerformanceRating(s.nextInt());
				ob.add(ep);
			} else {
				System.out.println("Login failed");
			}
			
		}
			catch(Exception e) {
				throw new DBException(ErrorMessages.RESULT_SET_FAILURE);
			}
		
	}
		else {
			System.out.println("Invalid");
			}
}
		catch(Exception e) {
			throw new DBException(ErrorMessages.STATEMENT_FAILURE);
		}
		
	}
		catch(Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		return null;
}
}