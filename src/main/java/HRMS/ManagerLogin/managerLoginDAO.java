package HRMS.ManagerLogin;

public interface managerLoginDAO {

	//int managerLogin(String username,String password) throws Exception;
	void managerLogin(int empId,String password) throws Exception;
}
