package HRMS.PostExperienceDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import HRMS.EmployeerDetails.TestConnection;

public class PostExperienceDetailsDAOImp implements PostExperienceDetailsDAO{

	public ArrayList<PostExperienceDetails> selectExp(int employeeId) throws Exception {
		// TODO Auto-generated method stub

		Connection com=TestConnection.getConnection();
		String sql="select * from post_experience_details where emp_id = ?";
		PreparedStatement ps=com.prepareStatement(sql);
		//ps.setInt(1, employeeId);
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<PostExperienceDetails> list = new ArrayList<PostExperienceDetails>();
		
		while(rs.next())
		{
			PostExperienceDetails a=new PostExperienceDetails();
		//object.name_in_java=selectQueryobject.get(sql name);
			a.empID=rs.getInt("emp_id");
			a.yearOfExperience=rs.getInt("year_of_experience");
			java.sql.Date date1=java.sql.Date.valueOf("date_of_joining");		
			a.dateOfJoining=rs.getDate("date_of_joining");
			a.dateOfLeaving=rs.getDate("date_of_leaving");
			a.designation=rs.getString("designation");
			a.companyName=rs.getString("company_name");
			
		list.add(a);
		}
		for (PostExperienceDetails employeerDetail : list) {
			System.out.println(employeerDetail);
		}
		return list;
		

		//		LocalDate date=LocalDate.parse(dob);
		//java.sql.Date date1=java.sql.Date.valueOf(a.dob);
		//ps.setDate(9,date1);
	}


	public void addPostExperience(PostExperienceDetails a) throws Exception {
		// TODO Auto-generated method stub
		Connection com=TestConnection.getConnection();
		
		String sql="insert into post_experience_details values(?,?,?,?,?,?)";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);

		ps.setInt(1,a.empID);
		ps.setInt(2,a.yearOfExperience);
		java.sql.Date date=java.sql.Date.valueOf(a.dateOfJoining);
		ps.setDate(3,date);                 //receiving
		java.sql.Date date2=java.sql.Date.valueOf(a.dateOfLeaving);
		ps.setDate(4,date2);
		ps.setString(5,a.designation);
		ps.setString(6, a.companyName);
		
		int row=ps.executeUpdate();
		System.out.println(row);
		
	}
		
	}

	
		

