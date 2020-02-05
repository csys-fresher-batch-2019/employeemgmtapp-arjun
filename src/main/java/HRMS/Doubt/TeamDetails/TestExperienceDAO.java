package HRMS;

public class TestExperienceDAO {

	public static void main(String[] args) {
		Experience e1=new Experience();
		e1.setEmpId(1);
		e1.setEmpName("ARJUN");
		e1.setEmail("a.com");
		e1.setBranchOfStudy("MECH");
		e1.setExperience(ExperienceStatus.Y);
		Experience e2=new Experience();
		e2.setEmpId(3);
		e2.setEmpName("ARJUNa");
		e2.setEmail("ar.com");
		e2.setBranchOfStudy("MECHANICAL");
		e2.setExperience(ExperienceStatus.N);
		
		ExperienceDAO.insert(e1);
		ExperienceDAO.insert(e2);
		
		
	}
}
