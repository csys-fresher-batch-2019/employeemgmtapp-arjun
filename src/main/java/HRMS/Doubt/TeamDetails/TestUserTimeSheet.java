package HRMS.TeamDetails;

import java.time.LocalDate;
import java.util.Scanner;

import HRMS.TimeSheet.timeSheet;
import HRMS.TimeSheet.timeSheetDAOImp;

public class TestUserTimeSheet {

	public static void main(String[] args) {
		
		timeSheetDAOImp c=new timeSheetDAOImp();
		timeSheet b=new timeSheet();
		
		Scanner sc=new Scanner(System.in);
		int empId=sc.nextInt();
		String dateOfWorkDone=sc.next();
		LocalDate date=LocalDate.parse(dateOfWorkDone);
		String natureOfWork=sc.next();
		int durationOfWork=sc.nextInt();
	
	
		
	
	}

}
