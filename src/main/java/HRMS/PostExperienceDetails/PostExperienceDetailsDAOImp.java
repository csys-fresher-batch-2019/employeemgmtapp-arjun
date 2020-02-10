package HRMS.PostExperienceDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import HRMS.EmployeerDetails.TestConnection;
import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class PostExperienceDetailsDAOImp implements PostExperienceDetailsDAO{

	public ArrayList<PostExperienceDetails> selectExp(int employeeId) throws Exception {
		// TODO Auto-generated method stub

		String sql="select * from post_experience_details where emp_id = ?";

		try(Connection com=TestConnection.getConnection();){
		try(PreparedStatement ps=com.prepareStatement(sql);){
		ps.setInt(1, employeeId);
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<PostExperienceDetails> list = new ArrayList<PostExperienceDetails>();
		
		while(rs.next())
		{
			PostExperienceDetails a=new PostExperienceDetails();
		//object.name_in_java=selectQueryobject.get(sql name);
			a.setEmpID(rs.getInt("emp_id"));
			a.setYearOfExperience(rs.getInt("year_of_experience"));
			a.setDateOfJoining(rs.getDate("date_of_joining"));
			//java.sql.Date date1=java.sql.Date.valueOf("date_of_joining");		
			//a.dateOfJoining = LocalDate.parse(d);
			a.setDateOfLeaving(rs.getDate("date_of_leaving"));
			a.setDesignation(rs.getString("designation"));
			a.setCompanyName(rs.getString("company_name"));
			
		list.add(a);
		}
		for (PostExperienceDetails employeerDetail : list) {
			System.out.println(employeerDetail);
		}
		return list;
		}
		catch(Exception e) {
			throw new DBException(ErrorMessages.PREPARE_FAILURE);
		}
		}
		catch(Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	}

		//		LocalDate date=LocalDate.parse(dob);
		//java.sql.Date date1=java.sql.Date.valueOf(a.dob);
		//ps.setDate(9,date1);


	public void addPostExperience(PostExperienceDetails a) throws Exception {
		
		String sql="insert into post_experience_details values(?,?,?,?,?,?)";
		
		try(Connection com=TestConnection.getConnection();){
		try(PreparedStatement ps=com.prepareStatement(sql);){
		System.out.println(sql);

		ps.setInt(1,a.getEmpID());
		ps.setInt(2,a.getYearOfExperience());
		//java.sql.Date date=java.sql.Date.valueOf(a.dateOfJoining);
		ps.setDate(3,a.getDateOfJoining());                 //receiving
		//java.sql.Date date2=java.sql.Date.valueOf(a.dateOfLeaving);
		ps.setDate(4,a.getDateOfLeaving());
		ps.setString(5,a.getDesignation());
		ps.setString(6, a.getCompanyName());
		
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
	
		

