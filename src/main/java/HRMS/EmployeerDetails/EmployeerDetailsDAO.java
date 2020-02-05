package HRMS.EmployeerDetails;

import java.util.ArrayList;

public interface EmployeerDetailsDAO {

	void addEmp(EmployeerDetails a) throws Exception;
	
	void updateEmp(EmployeerDetails a) throws Exception;
	
	//void deleteEmp(String empName) throws Exception;
	
	ArrayList<EmployeerDetails> selectEmp() throws Exception;
}
