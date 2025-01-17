package 추상_개념;

//클래스 설계: 상태(statae=> data),행동(기능==method)

// 단 하나라도 미완성 된 메서드가 있으면 추상화 클래스로 만들어 저야한

abstract class A{
	//미완성된 메서드=> body{} 가 존재하지 않는다.
	abstract void printanything();
	
	//완성된 메서드
	void printsometing() {
		System.out.println("some");
	}
}
//추상클래스를 상속받은 클래스는 반드시 미완성된 클래슬를 완성 시켜줘야된

class B extends A{

	@Override
	void printanything() {
		// TODO Auto-generated method stub
	System.out.println("나는 b야");
	}
	
}

public class _01추상클래스 {

	public static void main(String[] args) {
//		추상클래스는 미완성된 클래스 이기때무네 객체 생성 불가
//		A a=new A();
		
		B b=new B();
		
		b.printanything();
		b.printsometing();
	}

}
