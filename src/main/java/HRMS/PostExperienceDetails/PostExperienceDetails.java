package HRMS.PostExperienceDetails;

import java.sql.Date;
import java.time.LocalDate;

public class PostExperienceDetails {

	private int empID;
	private int yearOfExperience;
	private Date dateOfJoining;
	private Date dateOfLeaving;
	private String designation;
	private String companyName;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
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


