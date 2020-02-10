package HRMS.TeamRoleWork;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

import HRMS.EmployeerDetails.TestConnection;
import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class TeamRoleWorkDAOImp implements TeamRoleWorkDAO {

	public void addNewToTeam(TeamRoleWork t) throws Exception {
		// TODO Auto-generated method stub
		String sql1 = "insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?) ";

		try(Connection con = TestConnection.getConnection();){
		try(PreparedStatement ps1 = con.prepareStatement(sql1);){
		ps1.setInt(1, t.getTeamId());
		ps1.setInt(2, t.getEmpId());
		ps1.setString(3, t.getNewEmpRole());
		//ps1.setString(3, t.newEmpRole);
		// Date sqlDate1=Date.valueOf(t.teamJoinedDate);
		// ps1.setDate(4, sqlDate1);
		java.sql.Date date = java.sql.Date.valueOf(t.getTeamJoinedDate());
		ps1.setDate(4, date);
		int row1 = ps1.executeUpdate();

		if (row1 > 0) {
			System.out.println(row1 + " rows UPDATED");
		}
	}
		catch(Exception e) {
			throw new DBException(ErrorMessages.PREPARE_FAILURE);
		}
		}
		catch(Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	}

	
	public void addSameTeamWithDifferentRole(TeamRoleWork t,int newTeamId) throws Exception {
		// TODO Auto-generated method stub
		
			String sql = "update team_role_work set team_exit_on=? where emp_id=? and emp_role=? and team_id=?";
			System.out.println(t.getTeamId());
			try(Connection con = TestConnection.getConnection();){
			try(PreparedStatement ps = con.prepareStatement(sql);){
			Date sqlDate = Date.valueOf(t.getTeamExitDate());
			System.out.println(sqlDate);
			ps.setDate(1, sqlDate);
			ps.setInt(2, t.getEmpId());
			ps.setString(3,t.getOldEmpRole());
			ps.setInt(4,t.getTeamId());
			System.out.println(sql);
			//ps.setString(3,t.newEmpRole);
			// int row = stmt.executUpdate(sql);
			int row = ps.executeUpdate();
			// System.out.printlnrow);
			if (row > 0) {
				System.out.println(row + " rows UPDATED");
			}
			if(newTeamId!=0)
				t.setTeamId(newTeamId);
		
			String sql1 = "insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?) ";
			int teamId;
			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, t.getTeamId());
			ps1.setInt(2, t.getEmpId());
			ps1.setString(3, t.getNewEmpRole());
			// Date sqlDate1=Date.valueOf(t.teamJoinedDate);
			// ps1.setDate(4, sqlDate1);
			java.sql.Date date = java.sql.Date.valueOf(t.getTeamJoinedDate());
			ps1.setDate(4, date);
			int row1 = ps1.executeUpdate();

			if (row1 > 0) {
				System.out.println(row1 + " rows UPDATED");
			}
		}
			catch(Exception e) {
				throw new DBException(ErrorMessages.PREPARE_FAILURE);
			}
			}
			catch(Exception e) {
				throw new DBException(ErrorMessages.CONNECTION_FAILURE);
			}
	}

	public void addJobResignOfIndividual(TeamRoleWork t) throws Exception {
		// TODO Auto-generated method stub
		String sql = "update team_role_work set team_exit_on=? where emp_id=? and team_id=? and emp_role=?";
		try(Connection con = TestConnection.getConnection();){
		try(PreparedStatement ps = con.prepareStatement(sql);){
		Date sqlDate = Date.valueOf(t.getTeamExitDate());
		System.out.println(sqlDate);
		ps.setDate(1, sqlDate);
		ps.setInt(2, t.getEmpId());
		ps.setInt(3,t.getTeamId());
		ps.setString(4,t.getOldEmpRole());
		// int row = stmt.executUpdate(sql);
		int row = ps.executeUpdate();
		// System.out.printlnrow);
		if (row > 0) {
			System.out.println(row + " rows UPDATED");
		}	
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


