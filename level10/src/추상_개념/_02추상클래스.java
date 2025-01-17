package 추상_개념;

//부모 클래스==상위클래스==슈퍼클래스
class Pareant{
	int a;
	int b;
}
//자식클래스 ==하위클래스 ==서브클래스
class Child extends Pareant{
	int c;
	int d;
}

public class _02추상클래스 {

	public static void main(String[] args) {
		
		//casting:형변환
		
	 System.out.println((int)10.2324);
		
	 
	 //upcasting:하위클래스가 상위타입 전환 : 자식클래스 객체가 부모클래스 객체 전환
	 
	 Pareant p=new Pareant();
	 Child c=new Child();
	 
	 Pareant parent=new Child();//업케스팅
		
	 //downcasting:
	 
	
	 Child child=(Child)parent;
	 
	
	}

}
