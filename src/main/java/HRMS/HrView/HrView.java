package HRMS.HrView;

public class HrView {

	private int empId;
	private int teamId;
	private String empRole;
	private int performanceRating;
	private String approval;
	private String reasons;
	
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
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	
	
	public HrView(int empId, int teamId, String empRole, int performanceRating, String approval, String reasons) {
		super();
		this.empId = empId;
		this.teamId = teamId;
		this.empRole = empRole;
		this.performanceRating = performanceRating;
		this.approval = approval;
		this.reasons = reasons;
	}
	public HrView() {
		super();
	}
	@Override
	public String toString() {
		return "HrView [empId=" + empId + ", teamId=" + teamId + ", empRole=" + empRole + ", performanceRating="
				+ performanceRating + ", approval=" + approval + ", reasons=" + reasons + "]";
	}
	
	
}
