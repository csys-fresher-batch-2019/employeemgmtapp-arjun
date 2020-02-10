package HRMS.EmployeerDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeerDetails {

	private int empId;
	private String empName;
	private String gender;
	private String email;
	private long mobile;
	private String city;
	private String branchOfStudy;
	private int yearOfGraduation;
	private LocalDate dob; //2010-01-01
	private LocalDate dateOfJoining;
	private String experience;
	private int yearOfExperience;
	private LocalDate dateOfLeaving;
	private String designation;
	private String companyName;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranchOfStudy() {
		return branchOfStudy;
	}
	public void setBranchOfStudy(String branchOfStudy) {
		this.branchOfStudy = branchOfStudy;
	}
	public int getYearOfGraduation() {
		return yearOfGraduation;
	}
	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public LocalDate getDateOfLeaving() {
		return dateOfLeaving;
	}
	public void setDateOfLeaving(LocalDate dateOfLeaving) {
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
	
	public EmployeerDetails(int empId, String empName, String gender, String email, long mobile, String city,
			String branchOfStudy, int yearOfGraduation, LocalDate dob, LocalDate dateOfJoining, String experience,
			int yearOfExperience, LocalDate dateOfLeaving, String designation, String companyName) {
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
		this.yearOfExperience = yearOfExperience;
		this.dateOfLeaving = dateOfLeaving;
		this.designation = designation;
		this.companyName = companyName;
	}
	public EmployeerDetails() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeerDetails [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", email=" + email
				+ ", mobile=" + mobile + ", city=" + city + ", branchOfStudy=" + branchOfStudy + ", yearOfGraduation="
				+ yearOfGraduation + ", dob=" + dob + ", dateOfJoining=" + dateOfJoining + ", experience=" + experience
				+ ", yearOfExperience=" + yearOfExperience + ", dateOfLeaving=" + dateOfLeaving + ", designation="
				+ designation + ", companyName=" + companyName + "]";
	}
	
	
	
	
}


