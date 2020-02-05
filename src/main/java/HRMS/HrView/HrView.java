package HRMS.HrView;

public class HrView {

	int empId;
	int teamId;
	String empRole;
	int performanceRating;
	String approval;
	String reasons;
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
