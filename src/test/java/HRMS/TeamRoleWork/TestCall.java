package HRMS.TeamRoleWork;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import HRMS.EmployeerDetails.TestConnection;

public class TestCall {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter 0:Add New To A Team : ");
		System.out.println("Enter 1 : Same Team with Different Role :");
		System.out.println("Enter 1 : Different Team with Same Role  :");
		System.out.println("Enter 1 : Different Team with Different Role :");
		System.out.println("Enter 2 : Job Resign :");
	/*	System.out.println("Enter 3 : Same Team with Different Role for 2nd employee :");
		System.out.println("Enter 3 : Different Team with Same Role for 2nd employee :");
		System.out.println("Enter 3 : Different Team with Different Role for 2nd employee :");
		System.out.println("Enter 4 : Job Resign for 2nd employee");*/
		
		Scanner sc=new Scanner(System.in);
		int	check = sc.nextInt();

	switch(check) {
		
		case 0://addNewToTeam
		{
			TeamRoleWorkDAOImp obj=new TeamRoleWorkDAOImp();
			TeamRoleWork b=new TeamRoleWork();
			System.out.println("New to a team(Fresher) :");
			System.out.println("Enter teamID :(Example:4)");
			b.setTeamId(sc.nextInt());
			System.out.println("Enter empId :(Example:4)");
			b.setEmpId(sc.nextInt());
			System.out.println("Enter empRole :(Example:newRole)");
			b.setNewEmpRole(sc.next());
			if(b.getNewEmpRole().equalsIgnoreCase("newRole")) {
				System.out.println("Enter NewEmpRole : ");
				b.setNewEmpRole(sc.next());
			}
			b.setTeamJoinedDate(LocalDate.now());
			System.out.println(b.getTeamJoinedDate());
			System.out.println("Enter teamJoinedDate :(YYYY-MM-DD)"+b.getTeamJoinedDate());
			obj.addNewToTeam(b);
			break;
	}
		case 1:	//addSameTeamWithDifferentRole
				//Different Team with Same Role
				//Different Team with Different Role
			{
				TeamRoleWorkDAOImp c=new TeamRoleWorkDAOImp();
				TeamRoleWork b=new TeamRoleWork();
				
				System.out.println("Same Team With Different Role :");
				System.out.println("Enter teamExitDate :(YYYY-MM-DD)");
				String teamExitDate=sc.next();
				LocalDate date=LocalDate.parse(teamExitDate);
				b.setTeamExitDate(date);
				System.out.println("Enter empId :(Example:4)");
				b.setEmpId(sc.nextInt());
				System.out.println("Enter empRole :(Example:sameRole)");
				b.setOldEmpRole(sc.next());
				if(b.getOldEmpRole().equalsIgnoreCase("oldRole"))
				{
					System.out.println("Enter old EmpRole : ");	
					b.setOldEmpRole(sc.next());
				}
				System.out.println("Enter teamID :(Example:4)");
				b.setTeamId(sc.nextInt());
				System.out.println("Enter empRole :(Example:newRole)");
				b.setNewEmpRole(sc.next());
				if(b.getNewEmpRole().equalsIgnoreCase("newRole")) {
					System.out.println("Enter NewEmpRole : ");
					b.setNewEmpRole(sc.next());
				}
				b.setTeamJoinedDate(LocalDate.now());
				System.out.println(b.getTeamJoinedDate());
				System.out.println("Enter teamJoinedDate :(YYYY-MM-DD)"+b.getTeamJoinedDate());
				System.out.println("Press Y if person shift to new team");
				String val = sc.next();
				int newid = 0;
				if(val.equalsIgnoreCase("Y"))
				{
					System.out.println("Enter new team id:");
					 newid = sc.nextInt();
				}
				c.addSameTeamWithDifferentRole(b,newid);
				break;
			}
		case 2:
		
			{
				TeamRoleWorkDAOImp c=new TeamRoleWorkDAOImp();
				TeamRoleWork b=new TeamRoleWork();
				
				//JobResignOfIndividual
				System.out.println("Enter teamExitDate :(YYYY-MM-DD)");
				String teamExitDate=sc.next();
				LocalDate date=LocalDate.parse(teamExitDate);
				b.setTeamExitDate(date);
				System.out.println("Enter teamID :(Example:4)");
				b.setTeamId(sc.nextInt());
				System.out.println("Enter empId :(Example:4)");
				b.setEmpId(sc.nextInt());
				System.out.println("Enter empRole :(Example:sameRole)");
				b.setOldEmpRole(sc.next());
				if(b.getOldEmpRole().equalsIgnoreCase("sameRole")) 
				{
					System.out.println("Enter old EmpRole : ");	
					b.setOldEmpRole(sc.next());
				}
				
				c.addJobResignOfIndividual(b);
		
				break;
			
			}
			/*case 3:
				{
					TeamRoleWorkDAOImp c=new TeamRoleWorkDAOImp();
					TeamRoleWork b=new TeamRoleWork();
					
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
			
				break;
				}*/

			}
		}
}
