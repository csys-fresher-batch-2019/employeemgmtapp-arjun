package HRMS.PostExperienceDetails;

import java.sql.Date;
import java.time.LocalDate;

public class PostExperienceDetails {

	public int empID;
	public int yearOfExperience;
	public Date dateOfJoining;
	public Date dateOfLeaving;
	public String designation;
	public String companyName;
	
	public PostExperienceDetails(int empID, int yearOfExperience, Date dateOfJoining, Date dateOfLeaving,
			String designation, String companyName) {
		super();
		this.empID = empID;
		this.yearOfExperience = yearOfExperience;
		this.dateOfJoining = dateOfJoining;
		this.dateOfLeaving = dateOfLeaving;
		this.designation = designation;
		this.companyName = companyName;
	}

	public PostExperienceDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PostExperienceDetails [empID=" + empID + ", yearOfExperience=" + yearOfExperience + ", dateOfJoining="
				+ dateOfJoining + ", dateOfLeaving=" + dateOfLeaving + ", designation=" + designation + ", companyName="
				+ companyName + "]";
	}
		
		
		
	}


/*
emp_id number not null,
year_of_experience number not null,
date_of_joining timestamp,
date_of_leaving timestamp,
designation varchar2(25) not null,
company_name varchar2(25) not null,
constraint empl_id_fk foreign key(emp_id) references employeer_details(emp_id)

*/