package HRMS.EmployeerDetails;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import HRMS.PostExperienceDetails.PostExperienceDetails;
import HRMS.PostExperienceDetails.PostExperienceDetailsDAOImp;
import HRMS.PostExperienceDetails.TestPostExperienceDetails;

public class TestaddEmployeerDetails {

	public static void main(String[] args) throws Exception {
		
		EmployeerDetailsDAOImp c=new EmployeerDetailsDAOImp();
		EmployeerDetails b=new EmployeerDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpID :(Example:4)");
		int empId=sc.nextInt();
		//b.setEmpId(empId);
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
		b.setEmpId(empId);
		b.setEmpName(empName);
		b.setGender(gender);
		b.setEmail(email);
		b.setMobile(mobile);
		b.setCity(city);
		b.setBranchOfStudy(branchOfStudy);
		b.setYearOfGraduation(yearOfGraduation);
		b.setDob(date);
		b.setDateOfJoining(date1);
		b.setExperience(experience);
		c.addEmp(b);
		if(b.getExperience().equalsIgnoreCase("Y"))
		{
			PostExperienceDetailsDAOImp imp=new PostExperienceDetailsDAOImp();
			PostExperienceDetails model=new PostExperienceDetails();
			System.out.println("Enter empId,yearOfExperience,dateOfJoining,dateOfLeaving,designation,companyName : ");
			model.setEmpID(sc.nextInt());
			model.setYearOfExperience(sc.nextInt());
			String JoiningDate=sc.next();
			LocalDate dat=LocalDate.parse(JoiningDate);
			Date dates = java.sql.Date.valueOf(dat);
			model.setDateOfJoining(dates);
			String dateOfLeaving=sc.next();
			LocalDate dat1=LocalDate.parse(dateOfLeaving);
			Date datess = java.sql.Date.valueOf(dat1);
			model.setDateOfLeaving(datess);
			model.setDesignation(sc.next());
			model.setCompanyName(sc.next());
			
			imp.addPostExperience(model);
		
		 
		 
		}
			
	
	}
}