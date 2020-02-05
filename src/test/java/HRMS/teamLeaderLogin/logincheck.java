package HRMS.teamLeaderLogin;

import java.util.Scanner;

import HRMS.teamLeaderLogin.teamleaderlogindaoImp;

public class logincheck {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter teamid");
		int id = sc.nextInt();
		System.out.println("Enter password");
		String pass = sc.next();
		teamleaderlogindaoImp obj = new teamleaderlogindaoImp();
		obj.login(id, pass);
	}

}
