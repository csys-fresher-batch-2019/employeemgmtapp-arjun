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
		ps1.setString(3, t.empRole);
		// Date sqlDate1=Date.valueOf(t.teamJoinedDate);
		// ps1.setDate(4, sqlDate1);
		java.sql.Date date = java.sql.Date.valueOf(t.teamJoinedDate);
		ps1.setDate(4, date);
		int row1 = ps1.executeUpdate();

		if (row1 > 0) {
			System.out.println(row1 + " rows UPDATED");
		}
	
	}

	
	public void addSameTeamWithDifferentRole(TeamRoleWork t) throws Exception {
		// TODO Auto-generated method stub
		
			String sql = "update team_role_work set team_exit_on=? where emp_id=? and emp_role=?";
			Connection con = TestConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement(sql);
			Date sqlDate = Date.valueOf(t.teamExitDate);
			System.out.println(sqlDate);
			ps.setDate(1, sqlDate);
			ps.setInt(2, t.empId);
			ps.setString(3,t.empRole);
			// int row = stmt.executUpdate(sql);
			int row = ps.executeUpdate();
			// System.out.printlnrow);
			if (row > 0) {
				System.out.println(row + " rows UPDATED");
			}
		
			String sql1 = "insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?) ";

			PreparedStatement ps1 = con.prepareStatement(sql1);
			ps1.setInt(1, t.teamId);
			ps1.setInt(2, t.empId);
			ps1.setString(3, t.empRole);
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
		ps.setString(4,t.empRole);
		// int row = stmt.executUpdate(sql);
		int row = ps.executeUpdate();
		// System.out.printlnrow);
		if (row > 0) {
			System.out.println(row + " rows UPDATED");
		}
	
	}
}


	/*
 * public ArrayList<TeamRoleWork> selectTeam() throws Exception {
 * 
 * Connection com=TestConnection.getConnection(); String
 * sql="select * from team_role_work"; PreparedStatement
 * ps=com.prepareStatement(sql); System.out.println(sql); ResultSet rs=
 * ps.executeQuery(); ArrayList<TeamRoleWork> list = new
 * ArrayList<TeamRoleWork>();
 * 
 * while(rs.next()) { TeamRoleWork a =new TeamRoleWork();
 * //object.name_in_java=selectQueryobject.get(sql name);
 * a.teamId=rs.getInt("team_id"); a.empId=rs.getInt("emp_id");
 * a.empRole=rs.getString("emp_role"); a.teamJoinedDate
 * =rs.getDate("team_joined_on"); a.teamExitDate=rs.getDate("team_exit_on");
 * //Date dt=Date.valueOf(a.teamJoinedDate); //Date
 * date=Date.valueOf(a.teamExitDate);
 * //a.teamJoinedDate=rs.getDate("team_joined_on");
 * //date=rs.getDate("team_exit_on"); list.add(a); } for (TeamRoleWork
 * teamRoleWork : list) { System.out.println(teamRoleWork); } return list; }
 * 
 * public void addTRWork(TeamRoleWork a) throws Exception {
 * 
 * Connection com=TestConnection.getConnection(); PreparedStatement ps;
 * 
 * String sql1="update team_role_work set team_exit_on=? where emp_id=?";
 * ps=com.prepareStatement(sql1); System.out.println(sql1); java.sql.Date
 * date1=java.sql.Date.valueOf(a.teamJoinedDate); ps.setDate(1,date1);
 * ps.setInt(2,a.empId); ps.executeUpdate();
 * 
 * String
 * sql="insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?)"
 * ; ps=com.prepareStatement(sql); System.out.println(sql);
 * 
 * ps.setInt(1,a.teamId); ps.setInt(2,a.empId); ps.setString(3,a.empRole);
 * java.sql.Date date=java.sql.Date.valueOf(a.teamJoinedDate);
 * ps.setDate(4,date); //receiving System.out.println(ps.executeUpdate()); int
 * row=ps.executeUpdate(); System.out.println(row);
 * 
 * }
 * 
 * public void addNewToTeam(TeamRoleWork a) throws Exception {
 * 
 * Connection com=TestConnection.getConnection(); PreparedStatement ps;
 * 
 * String
 * sql="insert into team_role_work(team_id,emp_id,emp_role,team_joined_on) values(?,?,?,?)"
 * ; ps=com.prepareStatement(sql); System.out.println(sql);
 * 
 * ps.setInt(1,a.teamId); ps.setInt(2,a.empId); ps.setString(3,a.empRole);
 * java.sql.Date date=java.sql.Date.valueOf(a.teamJoinedDate);
 * ps.setDate(4,date); //receiving int row=ps.executeUpdate();
 * System.out.println(row); }
 */
