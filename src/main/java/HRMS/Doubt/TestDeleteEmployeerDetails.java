package HRMS.EmployeerDetails;

import java.util.Scanner;

public class TestDeleteEmployeerDetails {

public static void main(String[] args) throws Exception {
		
		EmployeerDetailsDAOImp c=new EmployeerDetailsDAOImp();
		//EmployeerDetails e=new EmployeerDetails();
		
		Scanner sc=new Scanner(System.in);
		String empName=sc.next();
		c.deleteEmp(empName);
	}
}
