package HRMS.TeamRoleWork;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

import HRMS.EmployeerDetails.TestConnection;

public class TeamRoleWorkDAOImp implements TeamRoleWorkDAO {

	public void addNewToTeam(TeamRoleWork t) throws Exception {
		// TODO Auto-generated method stub
		String sql1 = "insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?) ";

		Connection con = TestConnection.getConnection();
		
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setInt(1, t.teamId);
		ps1.setInt(2, t.empId);
		ps1.setString(3, t.newEmpRole);
		//ps1.setString(3, t.newEmpRole);
		// Date sqlDate1=Date.valueOf(t.teamJoinedDate);
		// ps1.setDate(4, sqlDate1);
		java.sql.Date date = java.sql.Date.valueOf(t.teamJoinedDate);
		ps1.setDate(4, date);
		int row1 = ps1.executeUpdate();

		if (row1 > 0) {
			System.out.println(row1 + " rows UPDATED");
		}
	
	}

	
	public void addSameTeamWithDifferentRole(TeamRoleWork t,int newTeamId) throws Exception {
		// TODO Auto-generated method stub
		
			String sql = "update team_role_work set team_exit_on=? where emp_id=? and emp_role=? and team_id=?";
			System.out.println(t.teamId);
			Connection con = TestConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			Date sqlDate = Date.valueOf(t.teamExitDate);
			System.out.println(sqlDate);
			ps.setDate(1, sqlDate);
			ps.setInt(2, t.empId);
			ps.setString(3,t.oldEmpRole);
			ps.setInt(4,t.teamId);
			System.out.println(sql);
			//ps.setString(3,t.newEmpRole);
			// int row = stmt.executUpdate(sql);
			int row = ps.executeUpdate();
			// System.out.printlnrow);
			if (row > 0) {
				System.out.println(row + " rows UPDATED");
			}
			if(newTeamId!=0)
				t.teamId = newTeamId;
		
			String sql1 = "insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?) ";
			int teamId;
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, t.teamId);
			ps1.setInt(2, t.empId);
			ps1.setString(3, t.newEmpRole);
			// Date sqlDate1=Date.valueOf(t.teamJoinedDate);
			// ps1.setDate(4, sqlDate1);
			java.sql.Date date = java.sql.Date.valueOf(t.teamJoinedDate);
			ps1.setDate(4, date);
			int row1 = ps1.executeUpdate();

			if (row1 > 0) {
				System.out.println(row1 + " rows UPDATED");
			}
		
		}

	public void addJobResignOfIndividual(TeamRoleWork t) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update team_role_work set team_exit_on=? where emp_id=? and team_id=? and emp_role=?";
		Connection con = TestConnection.getConnection();
		
		PreparedStatement ps = con.prepareStatement(sql);
		Date sqlDate = Date.valueOf(t.teamExitDate);
		System.out.println(sqlDate);
		ps.setDate(1, sqlDate);
		ps.setInt(2, t.empId);
		ps.setInt(3,t.teamId);
		ps.setString(4,t.oldEmpRole);
		// int row = stmt.executUpdate(sql);
		int row = ps.executeUpdate();
		// System.out.printlnrow);
		if (row > 0) {
			System.out.println(row + " rows UPDATED");
		}
	
	}
}


