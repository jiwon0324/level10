package _12콜랙션멤버;

public class AcitonPrint implements Action{

	

	@Override
	public void excute() {
		
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.println("==== [ 전체목록 ] ==== ");
              dao.printAllMemberdata();
              System.out.println();
	}

}
