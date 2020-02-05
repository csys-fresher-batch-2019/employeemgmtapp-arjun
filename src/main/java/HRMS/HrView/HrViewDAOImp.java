package HRMS.HrView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import HRMS.EmployeerDetails.EmployeerDetails;
import HRMS.EmployeerDetails.TestConnection;

public class HrViewDAOImp implements HrViewDAO{

	public ArrayList<HrView> selectHrView() throws Exception {
		
		Connection com=TestConnection.getConnection();
		String sql="select * from HR_view";
		PreparedStatement ps=com.prepareStatement(sql);
		System.out.println(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<HrView> list = new ArrayList<HrView>();
		
		while(rs.next())
		{
			HrView b=new HrView();
		//object.name_in_java=selectQueryobject.get(sql name);
			b.empId=rs.getInt("emp_id");
			b.teamId=rs.getInt("team_id");
			b.empRole=rs.getString("emp_role");
			b.performanceRating=rs.getInt("performance_rating");
			b.approval=rs.getString("approval");
			b.reasons=rs.getString("reasons");
		list.add(b);
		}
		for (HrView hrView : list) {
			System.out.println(hrView);
		}
		return list;
		
	}

	
}
