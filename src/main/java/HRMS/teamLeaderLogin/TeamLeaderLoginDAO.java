package HRMS.teamLeaderLogin;

import java.util.List;

public interface TeamLeaderLoginDAO  {

	List<teamLeaderLogin> login(int teamId,String password) throws Exception;
	
	
}
