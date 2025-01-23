package _12콜랙션멤버;

import java.util.Scanner;

public class ActionDelete implements Action {

	Scanner sc=new Scanner(System.in);
	
	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		Utils utils = Utils.getInstance();
		System.out.println("==== [ 삭제 ] ==== ");
		System.out.println("ID");
		String id=sc.next();
	
		if(!dao.isValidId(id)) {
			
			
				
				dao.deletAMember(id);
				dao.printAllMember();
				
				System.out.println(id+"님 삭제 완료");
			}else {
				return;
			}
			
		}
	

}
