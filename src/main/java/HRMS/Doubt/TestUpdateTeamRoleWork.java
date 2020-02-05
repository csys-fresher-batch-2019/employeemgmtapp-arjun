package HRMS.TeamRoleWork;

import java.time.LocalDate;
import java.util.Scanner;

public class TestUpdateTeamRoleWork {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         TeamRoleWorkDAOImp t=new TeamRoleWorkDAOImp();
         TeamRoleWork c=new TeamRoleWork();
         
         Scanner sc=new Scanner(System.in);
         int empId=sc.nextInt();
         String teamExitDate=sc.next();
         LocalDate dates=LocalDate.parse(teamExitDate);
         
         c.empId=empId;
         c.teamExitDate=dates;
         
        t.updateTRWork(c);         
	}

}
