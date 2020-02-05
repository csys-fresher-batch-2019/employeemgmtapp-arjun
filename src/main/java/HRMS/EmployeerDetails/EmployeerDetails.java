package HRMS.EmployeerDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeerDetails {

	int empId;
	String empName;
	String gender;
	String email;
	long mobile;
	String city;
	String branchOfStudy;
	int yearOfGraduation;
	LocalDate dob; //2010-01-01
	LocalDate dateOfJoining;
	String experience;
	public EmployeerDetails(int empId, String empName, String gender, String email, long mobile, String city,
			String branchOfStudy, int yearOfGraduation, LocalDate dob, LocalDate dateOfJoining, String experience) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.branchOfStudy = branchOfStudy;
		this.yearOfGraduation = yearOfGraduation;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "EmployeerDetails [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", email=" + email
				+ ", mobile=" + mobile + ", city=" + city + ", branchOfStudy=" + branchOfStudy + ", yearOfGraduation="
				+ yearOfGraduation + ", dob=" + dob + ", dateOfJoining=" + dateOfJoining + ", experience=" + experience
				+ "]";
	}
	public EmployeerDetails() {
		super();
	}
	
	
}


/*
create table employeer_details(
emp_id number,
emp_name varchar2(30) not null,
gender char(1) not null,
email varchar2(25) not null,
mobile number unique,
city varchar2(30) not null,
branch_of_study varchar2(25) not null,
year_of_graduation number not null,
dob date not null,
date_of_joining timestamp not null,
experience char(1) not null,
constraint emp_id_pk primary key(emp_id),
constraint gender_ck check(gender in('M','F')),
constraint experience_cq check(experience in('Y','N'))
);




*/