package HRMS.TeamRoleWork;

import java.time.LocalDate;
import java.util.Scanner;

public class TestSameTeamWithDifferentRole {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		TeamRoleWorkDAOImp c=new TeamRoleWorkDAOImp();
		TeamRoleWork b=new TeamRoleWork();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Same Team With Different Role :");
		System.out.println("Enter teamID :(Example:4)");
		b.teamId=sc.nextInt();
		System.out.println("Enter empId :(Example:4)");
		b.empId=sc.nextInt();
		System.out.println("Enter empRole :(Example:sameRole/newRole)");
		b.empRole=sc.next();
		if(b.empRole.equalsIgnoreCase("newRole")) {
			System.out.println("Enter NewEmpRole : ");
			b.empRole=sc.next();
		}
		else
		{
			System.out.println("Enter old EmpRole : ");	
			b.empRole=sc.next();
		}
		b.teamJoinedDate=LocalDate.now();
		System.out.println(b.teamJoinedDate);
		System.out.println("Enter teamJoinedDate :(YYYY-MM-DD)"+b.teamJoinedDate);
		System.out.println("Enter teamExitDate :(YYYY-MM-DD)");
		String teamExitDate=sc.next();
		LocalDate date=LocalDate.parse(teamExitDate);
		b.teamExitDate=date;
		c.addSameTeamWithDifferentRole(b);
		
	}

}
