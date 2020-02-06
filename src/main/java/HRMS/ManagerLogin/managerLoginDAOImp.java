package HRMS.ManagerLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import HRMS.EmployeerDetails.TestConnection;

public class managerLoginDAOImp implements managerLoginDAO {

	public void managerLogin(int empId, String password) throws Exception {

		Connection con = TestConnection.getConnection();
		Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select emp_id from manager_login where emp_id =" + empId) == 1) {

			String sql = "select manager_password from manager_login where emp_id=" + empId;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			String pass = rs.getString("manager_password");
			if (pass.equals(password)) {
				System.out.println("Login success");
			} else {
				System.out.println("Login failed");
			}
		} else {
			System.out.println("Invalid");

		}

		
		}

	}

