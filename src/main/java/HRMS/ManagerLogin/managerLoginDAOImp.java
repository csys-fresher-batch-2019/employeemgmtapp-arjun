package HRMS.ManagerLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import HRMS.EmployeerDetails.TestConnection;
import HRMS.util.DBException;
import HRMS.util.ErrorMessages;

public class managerLoginDAOImp implements managerLoginDAO {

	public void managerLogin(int empId, String password) throws Exception {

		try(Connection con = TestConnection.getConnection();){
		try(Statement stmt = con.createStatement();){
		if (stmt.executeUpdate("select emp_id from manager_login where emp_id =" + empId) == 1) {

			String sql = "select manager_password from manager_login where emp_id=" + empId;
			ResultSet rs = stmt.executeQuery(sql);
			//System.out.println(sql);
			rs.next();
			String pass = rs.getString("manager_password");
			//System.out.println(pass);
			if (pass.equals(password)) {
				System.out.println("Login success");
			} else {
				System.out.println("Login failed");
			}
		} else {
			System.out.println("Invalid");

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

