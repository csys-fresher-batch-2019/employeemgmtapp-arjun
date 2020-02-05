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
		System.out.println("Enter empName :");
		String empName=sc.next();
		System.out.println("Enter gender :");
		String gender=sc.next();
		System.out.println("Enter experience :");
		String experience=sc.next();
		//object.table1name=table4presentname;
		b.empId=empId;
		b.empName=empName;
		b.gender=gender;
		b.experience=experience;
	
	
	c.updateEmp(b);
	}
}

