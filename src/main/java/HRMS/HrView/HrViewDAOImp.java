package HRMS.HrView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import HRMS.EmployeerDetails.EmployeerDetails;
import HRMS.EmployeerDetails.TestConnection;
import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class HrViewDAOImp implements HrViewDAO{

	public ArrayList<HrView> selectHrView() throws Exception {
		
		String sql="select * from HR_view";
		
		try(Connection com=TestConnection.getConnection();){
		try(PreparedStatement ps=com.prepareStatement(sql);){
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<HrView> list = new ArrayList<HrView>();
		
		while(rs.next())
		{
			HrView b=new HrView();
		//object.name_in_java=selectQueryobject.get(sql name);
			b.setEmpId(rs.getInt("emp_id"));
			b.setTeamId(rs.getInt("team_id"));
			b.setEmpRole(rs.getString("emp_role"));
			b.setPerformanceRating(rs.getInt("performance_rating"));
			b.setApproval(rs.getString("approval"));
			b.setReasons(rs.getString("reasons"));
		list.add(b);
		}
		for (HrView hrView : list) {
			System.out.println(hrView);
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
	

