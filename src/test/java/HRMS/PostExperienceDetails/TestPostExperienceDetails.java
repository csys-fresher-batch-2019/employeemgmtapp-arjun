package HRMS.PostExperienceDetails;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class TestPostExperienceDetails {

	public static void main() throws Exception {
		
		PostExperienceDetailsDAOImp c=new PostExperienceDetailsDAOImp();
		PostExperienceDetails b=new PostExperienceDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empID :(Example:4)");
		int empID=sc.nextInt();
		System.out.println("Enter yearOfExperince :(Example:3)");
		int yearOfExperience=sc.nextInt();
		System.out.println("Enter JoiningDate :(YYYY-MM-DD)");
		String dateOfJoining=sc.next();
		LocalDate date=LocalDate.parse(dateOfJoining);
		Date dates = java.sql.Date.valueOf(date);
		System.out.println("Enter LeavingDate :(YYYY-MM-DD)");
		String dateOfLeaving=sc.next();
		LocalDate date2=LocalDate.parse(dateOfLeaving);
		Date dates1 = java.sql.Date.valueOf(date2);
		System.out.println("Enter Designation :(Example:Java Developer)");	
		String designation=sc.next();
		System.out.println("Enter CompanyName :(Example:Chainsys)");
		String companyName=sc.next();
		
		b.empID=empID;
		b.yearOfExperience=yearOfExperience;
		b.dateOfJoining=dates;
		b.dateOfLeaving=dates1;
		b.designation=designation;
		b.companyName=companyName;
		
		c.addPostExperience(b);
	}
}
