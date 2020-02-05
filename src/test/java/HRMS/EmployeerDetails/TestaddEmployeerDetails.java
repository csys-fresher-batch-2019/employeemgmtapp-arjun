package HRMS.EmployeerDetails;

import java.time.LocalDate;
import java.util.Scanner;

import HRMS.PostExperienceDetails.TestPostExperienceDetails;

public class TestaddEmployeerDetails {

	public static void main(String[] args) throws Exception {
		
		EmployeerDetailsDAOImp c=new EmployeerDetailsDAOImp();
		EmployeerDetails b=new EmployeerDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpID :(Example:4)");
		int empId=sc.nextInt();
		System.out.println("Enter EmpName :(Example:Arjun Kumar A E)");
		String empName=sc.next();
		System.out.println("Enter Gender :(M/F/Others)");
		String gender=sc.next();
		System.out.println("Enter Email :(Example:arjun@gmail.com)");
		String email=sc.next();
		System.out.println("Enter MobileNumber :(Example:9898988998)");
		long mobile=sc.nextLong();
		System.out.println("Enter City :(Example:Madurai)");
		String city=sc.next();
		System.out.println("Branch :(MECH,CSE,ECE,EEE,Mechatronics,Others)");
		String Other="Others";
		String branchOfStudy=sc.next();
		if(branchOfStudy.equals(Other)) {
			System.out.print("branchOfStudy = ");
			String str=sc.next();
		}
		System.out.println("Enter YearOfGraduation :(YYYY)");
		int yearOfGraduation=sc.nextInt();
		System.out.println("Enter DOB :(YYYY-MM-DD)");
		String dob=sc.next();
		LocalDate date=LocalDate.parse(dob);
		System.out.println("Enter DateOfJoining :(YYYY-MM-DD)");
		String dateOfJoining=sc.next();
		LocalDate date1=LocalDate.parse(dateOfJoining);
		System.out.println("Enter Whether Experienced Person or Not :(Y/N)");
		String experience=sc.next();
		//object.table1name=table4presentname;                 //passing(or data giving)
		b.empId=empId;
		b.empName=empName;
		b.gender=gender;
		b.email=email;
		b.mobile=mobile;
		b.city=city;
		b.branchOfStudy=branchOfStudy;
		b.yearOfGraduation=yearOfGraduation;
		b.dob=date;
		b.dateOfJoining=date1;
		b.experience=experience;
		c.addEmp(b);
		if(b.experience.equalsIgnoreCase("Y"))
		{
			TestPostExperienceDetails.main();
		}
			
	
	}
}