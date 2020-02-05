package HRMS.ProjectDone;

import java.time.LocalDate;
import java.util.Scanner;

public class TestUpdateProjectDone {

	public static void main(String[] args) throws Exception {
		
		ProjectDoneDAOImp c=new ProjectDoneDAOImp();
		ProjectDone b=new ProjectDone();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter projectId :");
		int projectId=sc.nextInt();
		System.out.println("Enter projectCompletedDate :");
		String projectCompletedDate=sc.next();
		LocalDate date=LocalDate.parse(projectCompletedDate);
		System.out.println("Enter status :");
		String status=sc.next();
		
		b.projectId=projectId;
		b.projectCompletedDate=date;
		b.status=status;
		
		c.updateProject(b);
		
	}

}
