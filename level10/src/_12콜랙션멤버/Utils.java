package _12콜랙션멤버;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Utils {
	Utils() {};
	
	private static Utils instance;
	
	public static Utils getInstance() {
		if(instance == null) instance = new Utils();
		return instance;
	} 
	
	private Scanner sc = new Scanner(System.in);
	private final static String CUR_PATH = System.getProperty("user.dir") + "/src/"+Utils.class.getPackageName()+"//";
	
	public String getCurPath() {
		return CUR_PATH;
	}

	public int getIntValue(String msg, int start, int end) {
		System.out.print(msg);
		int sel = -1;
		try {
			sel = sc.nextInt();
			if(sel < start  || sel > end) {
				System.out.println("범위 오류");
				return -1;
			}
		}catch (Exception e) {
			System.out.println("숫자를 입력해 주세요");
		}
		return sel;
	}
	
	public String getStrValue(String msg) {
		System.out.print(msg);
		return sc.next();
	}
	public void closeScanner() {
		sc.close();
	}
	


	public  void saveDataToFile(String fileName, String data) {
		String file = CUR_PATH + fileName;
		try (FileWriter fw = new FileWriter(CUR_PATH + fileName);) {
			fw.write(data);
			System.out.println(file + "파일저장 성공 ");
		} catch (IOException e) {
			System.out.println(file + "파일저장 실패 ");
			e.printStackTrace();
		}

		
	}
	
	public String loadDataFile(String fileName) {
		String data = "";
		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr);) {
			String line = "";
			while ((line = br.readLine()) != null) {
				data += line + "\n";
			}
			data = data.substring(0, data.length() - 1);
			System.out.println(data);
			System.out.println(fileName + " 데이터 로드 완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(fileName + "데이터 로드 실패");
		}

		return data;
	}

	

	
	
	
}