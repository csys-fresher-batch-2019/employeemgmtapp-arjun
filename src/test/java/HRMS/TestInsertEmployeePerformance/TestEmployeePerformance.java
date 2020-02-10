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
		b.setEmpId(sc.nextInt());
		System.out.println("Enter TeamId : ");
		b.setTeamId(sc.nextInt());
		System.out.println("Enter AppraisalCode : ");
		b.setAppraisalCode(sc.next());
		System.out.println("Enter PerformanceRating : ");
		b.setPerformanceRating(sc.nextInt());
		
		c.add(b);
	

	}

}
