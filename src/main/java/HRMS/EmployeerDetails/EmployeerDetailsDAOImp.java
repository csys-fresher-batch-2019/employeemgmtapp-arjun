package HRMS.EmployeerDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeerDetailsDAOImp implements EmployeerDetailsDAO {

	public void addEmp(EmployeerDetails a) throws Exception {
		Connection com=TestConnection.getConnection();
		
		String sql="insert into employeer_details(emp_id,emp_name,gender,email,mobile,city,branch_of_Study,year_of_graduation,dob,date_of_joining,experience) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);

		ps.setInt(1,a.empId);
		ps.setString(2,a.empName);
		ps.setString(3,a.gender);                                               //receiving
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
		String sql="update employeer_details set  experience=?,gender=?,emp_name=? where emp_id=?";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);
		ps.setInt(4,a.empId);
		ps.setString(3,a.empName);
		ps.setString(2,a.gender);
		ps.setString(1,a.experience);		
		int row=ps.executeUpdate();
		System.out.println(row);
	}
	
	
	public ArrayList<EmployeerDetails> selectEmp() throws Exception {
		// TODO Auto-generated method stub
		Connection com=TestConnection.getConnection();
		String sql="select * from Employeer_Details";
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
			b.city=rs.getString("city");
			b.experience=rs.getString("experience");
		list.add(b);
		}
		for (EmployeerDetails employeerDetails : list) {                
			System.out.println(employeerDetails);                //row by row printing(or passing individual row)
		}
		return list;
	}	
	/*public ArrayList<EmployeerDetails> selectOneEmp(int employeeId) throws Exception {
		// TODO Auto-generated method stub
		Connection com=TestConnection.getConnection();
		String sql="select * from Employeer_Details where empId = ?";
		PreparedStatement ps=com.prepareStatement(sql);
		ps.setInt(1, employeeId);
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<EmployeerDetails> list = new ArrayList<EmployeerDetails>();
		
		while(rs.next())
		{
			EmployeerDetails a=new EmployeerDetails();
		//object.name_in_java=selectQueryobject.get(sql name);
			a.empId=rs.getInt("emp_id");
			a.empName=rs.getString("emp_name");
			a.gender=rs.getString("gender");
			a.city=rs.getString("city");
			
	
		list.add(a);
		}
		for (EmployeerDetails employeerDetail : list) {
			System.out.println(employeerDetail);
		}
		return list;
		
		
	}*/
	
	/*public void deleteEmp(String empName) throws Exception {
	Connection com=TestConnection.getConnection();		
	String sql="delete from employeer_details where emp_name=?";
	PreparedStatement ps=com.prepareStatement(sql);
	System.out.println(sql);
	ps.setString(1,empName);		
	int row=ps.executeUpdate();
	System.out.println(row);
}*/


}