package _17쓰레드;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Scanner;

class InputMachine implements Runnable {

	private Scanner scan = new Scanner(System.in);
	public static char input;

	@Override
	public void run() {
		System.out.println(">>>>");

	}

}

class StopWatch implements Runnable {

	private int time; // 소요시간 출력

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public void run() {
		System.out.println("[q] quit [h] hold [x] return");

		long preTime = System.currentTimeMillis();

	}

}

public class _05쓰레드실습 {
	public static void main(String[] args) {

		long preTime = System.currentTimeMillis();

		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

		Thread timesThread = new Thread(new StopWatch());

		for (int i = 0; i < sdf.hashCode(); i += 1) {

			try {
				Thread.sleep(1000);
				System.out.println(sdf.format(preTime) + " [ " + i + "sec ]");

			} catch (Exception e) {
				
			}

		}

	}
}