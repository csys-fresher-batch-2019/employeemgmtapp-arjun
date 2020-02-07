package HRMS.EmployeerDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeerDetailsDAOImp implements EmployeerDetailsDAO {

	public void addEmp(EmployeerDetails a) throws Exception {
		Connection com=TestConnection.getConnection();
		
		String sql="insert into employee_details(emp_id,emp_name,gender,email,mobile,city,branch_of_Study,year_of_graduation,dob,date_of_joining,experience) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);

		ps.setInt(1,a.empId);
		ps.setString(2,a.empName);
		ps.setString(3,a.gender);                          //receiving
		ps.setString(4,a.email);
		ps.setLong(5,a.mobile);
		ps.setString(6, a.city);
		ps.setString(7,a.branchOfStudy);
		ps.setInt(8,a.yearOfGraduation);
		java.sql.Date date1=java.sql.Date.valueOf(a.dob);
		ps.setDate(9,date1);
		java.sql.Date date2=java.sql.Date.valueOf(a.dateOfJoining);
		ps.setDate(10,date2);
		ps.setString(11,a.experience);
		
		int row=ps.executeUpdate();
		System.out.println(row);
		
	}
	public void updateEmp(EmployeerDetails a) throws Exception {
		Connection com=TestConnection.getConnection();		
		String sql="update employee_details set city=?,mobile=?,email=? where emp_id=?";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);
		ps.setInt(4,a.empId);
		ps.setString(3,a.email);
		ps.setLong(2,a.mobile);
		ps.setString(1,a.city);		
		int row=ps.executeUpdate();
		System.out.println(row);
	}
	
	
	public ArrayList<EmployeerDetails> selectEmp() throws Exception {
		// TODO Auto-generated method stub
		Connection com=TestConnection.getConnection();
		String sql="select * from employee_details";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<EmployeerDetails> list = new ArrayList<EmployeerDetails>();
		
		while(rs.next())
		{
			EmployeerDetails b=new EmployeerDetails();
		//object.name_in_java=selectQueryobject.get(sql name);
			b.empId=rs.getInt("emp_id");
			b.empName=rs.getString("emp_name");
			b.gender=rs.getString("gender");
			b.email=rs.getString("email");
			b.mobile=rs.getLong("mobile");
			b.city=rs.getString("city");
			b.branchOfStudy=rs.getString("branch_of_study");
			b.yearOfGraduation=rs.getInt("year_of_graduation");
			b.experience=rs.getString("experience");
		list.add(b);
		}
		for (EmployeerDetails employeerDetails : list) {                
			System.out.println(employeerDetails);           //row by row printing(or passing individual row)
		}
		return list;
	}	
	


}