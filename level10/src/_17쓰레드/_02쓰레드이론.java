package _17쓰레드;

class BGMPlay extends Thread{
	
	boolean isplay = true;
	
	public void run() {
		for(int i= 1; i <=10 ;i+=1) {
			System.out.println("배경음악이 연주되는 중.... ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _02쓰레드이론 {
	public static void main(String[] args) {
		
		BGMPlay bgmPlay = new BGMPlay();
		
		bgmPlay.start();
		
		for(int i= 1; i <=10 ;i+=1) {
			System.out.println("신나게 게임하는 중 ....");
			if(i == 8) {
				System.out.println(" 앗 엄마다!! ");
				System.out.println("엄마 와서 게임 종료 ㅜㅜ ");
				//bgmPlay.stop();
				bgmPlay.isplay = false;
				break;
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}