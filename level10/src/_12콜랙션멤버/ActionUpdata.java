package _12콜랙션멤버;

import java.util.Scanner;

public class ActionUpdata implements Action {

	Scanner sc = new Scanner(System.in);

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getInstance();
		Utils utils = Utils.getInstance();

		System.out.println("==== [ 수정 ] ==== ");

		System.out.println("ID:");
		String id = sc.next();

		if (!dao.isValidId(id)) {
			System.out.println("PW: ");
			String pw = sc.next();
			if (!dao.isdeletpw(pw)) {
				dao.udataAMember(id, pw);

				System.out.println("-수정 완료-");
			} else {
				System.out.println("다시 입력해주세요");
				return;
			}
		} else {
			System.out.println("없는 아이디 입니");
			return;
		}

	}

}
