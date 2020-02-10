package HRMS.employeePerformance;

public class employeePerformance {

	private int empId;
	private int teamId;
	private String appraisalCode;
	private int performanceRating;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getAppraisalCode() {
		return appraisalCode;
	}
	public void setAppraisalCode(String appraisalCode) {
		this.appraisalCode = appraisalCode;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	
	public employeePerformance(int empId, int teamId, String appraisalCode, int performanceRating) {
		super();
		this.empId = empId;
		this.teamId = teamId;
		this.appraisalCode = appraisalCode;
		this.performanceRating = performanceRating;
	}
	public employeePerformance() {
		super();
	}
	@Override
	public String toString() {
		return "employeePerformance [empId=" + empId + ", teamId=" + teamId + ", appraisalCode=" + appraisalCode
				+ ", performanceRating=" + performanceRating + "]";
	}
	
	
}