package HRMS.TeamRoleWork;
import java.time.LocalDate;

public class TeamRoleWork {

	int teamId;
	int empId;
	String empRole;
	LocalDate teamJoinedDate;
	LocalDate teamExitDate;
	public TeamRoleWork(int teamId, int empId,String empRole,LocalDate teamJoinedDate, LocalDate teamExitDate) {
		super();
		this.teamId = teamId;
		this.empId = empId;
		this.empRole = empRole;
		this.teamJoinedDate = teamJoinedDate;
		this.teamExitDate = teamExitDate;
	}
	public TeamRoleWork() {
		super();
	}
	@Override
	public String toString() {
		return "TeamRoleWork [teamId=" + teamId + ", empId=" + empId + ", empRole=" + empRole + ", teamJoinedDate="
				+ teamJoinedDate + ", teamExitDate=" + teamExitDate + "]";
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