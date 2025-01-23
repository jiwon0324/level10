package _12콜랙션멤버;

public class ActionSave implements Action {

	

	@Override
	public void excute() {

		MemberDAO dao = MemberDAO.getInstance();
		Utils utils = new Utils();

		utils.saveDataToFile("memberdata.txt",dao.memberallListData());
	}

}
