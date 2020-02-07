package HRMS.managerLogin;

import java.util.Scanner;

import HRMS.ManagerLogin.managerLoginDAOImp;

public class TestManagerLogin {

	public static void main(String[] args) throws Exception{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empId : ");
		int empId=sc.nextInt();
		System.out.println("Enter password : ");
		String pass=sc.next();
		managerLoginDAOImp o=new managerLoginDAOImp();
		o.managerLogin(empId,pass);
	}

}
