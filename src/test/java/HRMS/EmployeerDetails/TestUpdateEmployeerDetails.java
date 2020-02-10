package HRMS.EmployeerDetails;

import java.time.LocalDate;
import java.util.Scanner;

public class TestUpdateEmployeerDetails {

public static void main(String[] args) throws Exception {
		
		EmployeerDetailsDAOImp c=new EmployeerDetailsDAOImp();
		EmployeerDetails b=new EmployeerDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empId :");
		int empId=sc.nextInt();
		System.out.println("Enter email :");
		String email=sc.next();
		System.out.println("Enter mobile :");
		Long mobile=sc.nextLong();
		System.out.println("Enter city :");
		String city=sc.next();
		//object.table1name=table4presentname;
		b.setEmpId(empId);
		b.setEmail(email);
		b.setMobile(mobile);
		b.setCity(city);
	
	
	c.updateEmp(b);
	}
}

