package HRMS.employeePerformance;

public class employeePerformance {

	public int empId;
	public int teamId;
	public String appraisalCode;
	public int performanceRating;
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