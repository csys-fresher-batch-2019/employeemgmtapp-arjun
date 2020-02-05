package HRMS.ProjectDone;

import java.time.LocalDate;
import java.util.Scanner;

public class TestInsertProjectDone {

	public static void main(String[] args) throws Exception {
		
		ProjectDoneDAOImp c=new ProjectDoneDAOImp();
		ProjectDone b=new ProjectDone();
		
		Scanner sc=new Scanner(System.in);
		int projectId=sc.nextInt();
		String projectName=sc.next();
		int teamId=sc.nextInt();
		String projectStartDate=sc.next();
		LocalDate dates=LocalDate.parse(projectStartDate);
		String projectExpectedDate=sc.next();
		LocalDate datess=LocalDate.parse(projectExpectedDate);
	
		
		b.projectId=projectId;
		b.projectName=projectName;
		b.teamId=teamId;
		b.projectStartDate=dates;
		b.projectExpectedDate=datess;
		
		c.addProject(b);
	}
}
