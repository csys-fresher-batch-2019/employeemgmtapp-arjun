package HRMS.TeamRoleWork;

import java.util.ArrayList;

public interface TeamRoleWorkDAO {

	void addNewToTeam(TeamRoleWork t) throws Exception;
	
	void addSameTeamWithDifferentRole(TeamRoleWork t) throws Exception;

	//void addOscillationOfIndividual(TeamRoleWork t) throws Exception;
	
	void addJobResignOfIndividual(TeamRoleWork t) throws Exception;
	
	//void addSwappingOfTwoEmployees(TeamRoleWork t) throws Exception;
	//void addTeamWorkCase1() throws Exception;

	// ArrayList<TeamRoleWork> selectTeam() throws Exception;

	// void addTRWork(TeamRoleWork a)throws Exception;

	// void addNewToTeam(TeamRoleWork a)throws Exception;
	// void updateTRWork(TeamRoleWork a) throws Exception;

}
