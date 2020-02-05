package HRMS.teamLeaderLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import HRMS.EmployeerDetails.TestConnection;

public class teamleaderlogindaoImp implements TeamLeaderLoginDAO {

	public List<teamLeaderLogin> login(int teamId, String password) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Connection con = TestConnection.getConnection();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select team_id from team_leader_login where team_id =" + teamId) == 1) {

			String sql = "select team_password from team_leader_login where team_id=" + teamId;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			String pass = rs.getString("team_password");
			if (pass.equals(password)) {
				System.out.println("Login success");
//				TestEmployeePerformance.main();
			} else {
				System.out.println("Login failed");
			}
		} else {
			System.out.println("Invalid");

		}

		return null;
	}
}

/*employeePerformanceDAOImp ob=new employeePerformanceDAOImp();
employeePerformance ep=new employeePerformance();
System.out.println("Enter EmpId,TeamId,AppraisalCode,PerformanceRating : ");
ep.empId=s.nextInt();
ep.teamId=s.nextInt();
ep.appraisalCode=s.next();
ep.performanceRating=s.nextInt();
ob.add(ep);*/