package HRMS.TestInsertEmployeePerformance;

import java.util.Scanner;

import HRMS.employeePerformance.employeePerformance;
import HRMS.employeePerformance.employeePerformanceDAOImp;

public class TestEmployeePerformance {

	public static void main() throws Exception {
		
		employeePerformanceDAOImp c=new employeePerformanceDAOImp();
		employeePerformance b=new employeePerformance();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId : ");
		b.empId=sc.nextInt();
		System.out.println("Enter TeamId : ");
		b.teamId=sc.nextInt();
		System.out.println("Enter AppraisalCode : ");
		b.appraisalCode=sc.next();
		System.out.println("Enter PerformanceRating : ");
		b.performanceRating=sc.nextInt();
		
		c.add(b);
	

	}

}
