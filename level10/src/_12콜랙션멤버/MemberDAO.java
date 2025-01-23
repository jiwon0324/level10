package _12콜랙션멤버;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class MemberDAO {

	private ArrayList<Member> memberList;

	private MemberDAO() {
		memberList = new ArrayList<Member>();
	}

	private static MemberDAO instance;

	public static MemberDAO getInstance() {
		if (instance == null)
			instance = new MemberDAO();
		return instance;
	}

	public boolean isDataExsit() {
		return memberList.size() != 0;
	}

	private int getMemberIdxById(String id) {

		if (!isDataExsit())
			return -1;
		int idx = 0;
		for (Member m : memberList) {
			if (m.getId().equals(id))
				return idx;
			idx += 1;
		}
		return -1;
	}

	public boolean isValidId(String id) {
		return getMemberIdxById(id) == -1;
	}

	private int getMemberIdxBypw(String pw) {

		if (!isDataExsit())
			return -1;
		int idx = 0;
		for (Member m : memberList) {
			if (m.getPw().equals(pw))
				return idx;
			idx += 1;
		}
		return -1;
	}

	public boolean isdeletpw(String pw) {
		return getMemberIdxBypw(pw) == -1;
	}

	public void deletAMember(String id) {
		for (int i = 0; i < memberList.size(); i += 1) {
			if (memberList.get(i).getId().equals(id)) {
				memberList.remove(i);
			}
		}
	}

	public void udataAMember(String id, String pw) {
		Scanner sc = new Scanner(System.in);
		for (Member m : memberList) {
			if (m.getId().equals(id) || m.getPw().equals(pw)) {
				System.out.println("변경할 이름:");
				String name = sc.next();

				m.setName(name);
				System.out.printf("%s %s %s\n", m.getId(), m.getPw(), m.getName());
			}
		}
	}

	public String printAllMemberdata() {

		TreeSet[] treeSets = { 
				new TreeSet<>()
		};

		for (Member p : memberList) {
			for (TreeSet ts : treeSets) {
				ts.add(p);
			}
		}

		for (TreeSet ts : treeSets) {
			for (Object p : ts) {
				System.out.println(p);

			}

		}
		return null;

	}
	public String memberallListData() {
		String data = "";
		for (Member m : memberList)
			data += m.saveData();
		return data;
	}

	public void addAMember(String id, String pw, String name) {
		insertAMember(new Member(id, pw, name));

	}

	private void insertAMember(Member member) {
		memberList.add(member);
	}

	public void printAllMember() {
		for (Member m : memberList)
			System.out.println(m);
	}
}