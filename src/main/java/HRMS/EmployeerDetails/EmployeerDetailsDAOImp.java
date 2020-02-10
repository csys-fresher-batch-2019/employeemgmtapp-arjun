package HRMS.EmployeerDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class EmployeerDetailsDAOImp implements EmployeerDetailsDAO {

	
	
	public void addEmp(EmployeerDetails a) throws Exception {
		
		String sql="insert into employee_details(emp_id,emp_name,gender,email,mobile,city,branch_of_Study,year_of_graduation,dob,date_of_joining,experience) values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try(Connection com=TestConnection.getConnection();){
		try(PreparedStatement ps=com.prepareStatement(sql);){
		System.out.println(sql);
		ps.setInt(1,a.getEmpId());
		ps.setString(2,a.getEmpName());
		ps.setString(3,a.getGender());                          //receiving
		ps.setString(4,a.getEmail());
		ps.setLong(5,a.getMobile());
		ps.setString(6, a.getCity());
		ps.setString(7,a.getBranchOfStudy());
		ps.setInt(8,a.getYearOfGraduation());
		java.sql.Date date1=java.sql.Date.valueOf(a.getDob());
		ps.setDate(9,date1);
		java.sql.Date date2=java.sql.Date.valueOf(a.getDateOfJoining());
		ps.setDate(10,date2);
		ps.setString(11,a.getExperience());
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
	public void updateEmp(EmployeerDetails a) throws Exception {
		
		String sql="update employee_details set city=?,mobile=?,email=? where emp_id=?";
		
		try(Connection com=TestConnection.getConnection();){		
		try(PreparedStatement ps=com.prepareStatement(sql);){
		System.out.println(sql);
		ps.setInt(4,a.getEmpId());
		ps.setString(3,a.getEmail());
		ps.setLong(2,a.getMobile());
		ps.setString(1,a.getCity());		
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

	
	
	public ArrayList<EmployeerDetails> selectEmp() throws Exception {
		
		String sql="select * from employee_details";
		
		try(Connection com=TestConnection.getConnection();){
		try(PreparedStatement ps=com.prepareStatement(sql);){
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<EmployeerDetails> list = new ArrayList<EmployeerDetails>();
		
		while(rs.next())
		{
			EmployeerDetails b=new EmployeerDetails();
		//object.name_in_java=selectQueryobject.get(sql name);
			b.setEmpId(rs.getInt("emp_id"));
			b.setEmpName(rs.getString("emp_name"));
			b.setGender(rs.getString("gender"));
			b.setEmail(rs.getString("email"));
			b.setMobile(rs.getLong("mobile"));
			b.setCity(rs.getString("city"));
			b.setBranchOfStudy(rs.getString("branch_of_study"));
			b.setYearOfGraduation(rs.getInt("year_of_graduation"));
			b.setExperience(rs.getString("experience"));
		list.add(b);
		}
		for (EmployeerDetails employeerDetails : list) {                
			System.out.println(employeerDetails);           //row by row printing(or passing individual row)
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
	}