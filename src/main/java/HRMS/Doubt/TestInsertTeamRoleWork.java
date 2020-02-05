package HRMS.TeamRoleWork;

import java.time.LocalDate;
import java.util.Scanner;

import HRMS.TeamRoleWork.TeamRoleWorkDAOImp;

public class TestInsertTeamRoleWork  {

	public static void main(String[] args) throws Exception{
		
		TeamRoleWorkDAOImp c=new TeamRoleWorkDAOImp();
		TeamRoleWork b=new TeamRoleWork();
		
		Scanner sc=new Scanner(System.in);
		int teamId=sc.nextInt();
		int empId=sc.nextInt();
		String empRole=sc.next();
		String teamJoinedDate=sc.next();
		LocalDate date=LocalDate.parse(teamJoinedDate);
		//String teamExitDate=sc.next();
		//LocalDate date2=LocalDate.parse(teamExitDate);
				
		b.teamId=teamId;
		b.empId=empId;
		b.empRole=empRole;
		b.teamJoinedDate=date;
		//b.teamExitDate=date2;
		
		c.addTRWork(b);
	}
	
}
