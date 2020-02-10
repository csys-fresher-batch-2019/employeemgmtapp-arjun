package HRMS.TeamRoleWork;
import java.time.LocalDate;

public class TeamRoleWork {

	private int teamId;
	private int empId;
	private String oldEmpRole;
	private String newEmpRole;
	private LocalDate teamJoinedDate;
	private LocalDate teamExitDate;
	
	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getOldEmpRole() {
		return oldEmpRole;
	}

	public void setOldEmpRole(String oldEmpRole) {
		this.oldEmpRole = oldEmpRole;
	}

	public String getNewEmpRole() {
		return newEmpRole;
	}

	public void setNewEmpRole(String newEmpRole) {
		this.newEmpRole = newEmpRole;
	}

	public LocalDate getTeamJoinedDate() {
		return teamJoinedDate;
	}

	public void setTeamJoinedDate(LocalDate teamJoinedDate) {
		this.teamJoinedDate = teamJoinedDate;
	}

	public LocalDate getTeamExitDate() {
		return teamExitDate;
	}

	public void setTeamExitDate(LocalDate teamExitDate) {
		this.teamExitDate = teamExitDate;
	}

	public TeamRoleWork() {
		super();
	}

	@Override
	public String toString() {
		return "TeamRoleWork [teamId=" + teamId + ", empId=" + empId + ", oldEmpRole=" + oldEmpRole + ", newEmpRole="
				+ newEmpRole + ", teamJoinedDate=" + teamJoinedDate + ", teamExitDate=" + teamExitDate + "]";
	}

	
}


/*
create table team_role_work(
team_id number not null,
emp_id number not null,
emp_role varchar2(25) not null,
team_joined_on date not null,
team_exit_on date default null,
constraint team_id_fk foreign key(team_id) references team_details(team_id),
constraint emp_id_prk foreign key(emp_id) references employeer_details(emp_id)
);

*/