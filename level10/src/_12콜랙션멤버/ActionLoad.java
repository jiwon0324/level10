package _12콜랙션멤버;

public class ActionLoad implements Action{

	
	@Override
	public void excute( ) {
		MemberDAO dao = MemberDAO.getInstance();
		Utils utils = new Utils();
		utils.loadDataFile("memberdata.txt");
	}

}
