package HRMS.PostExperienceDetails;

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
		System.out.println("Enter LeavingDate :(YYYY-MM-DD)");
		String dateOfLeaving=sc.next();
		LocalDate date2=LocalDate.parse(dateOfLeaving);
		System.out.println("Enter Designation :(Example:Java Developer)");	
		String designation=sc.next();
		System.out.println("Enter CompanyName :(Example:Chainsys)");
		String companyName=sc.next();
		
		b.empID=empID;
		b.yearOfExperience=yearOfExperience;
		b.dateOfJoining=date;
		b.dateOfLeaving=date2;
		b.designation=designation;
		b.companyName=companyName;
		
		c.addPostExperience(b);
	}
}
