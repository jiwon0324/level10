package 상속_개념;

//super class


class Parant {

	int num = 100;

	void test1() {
		System.out.println("test1 호출");
	}

	void printnum() {
		System.out.println("num" + num);
	}
}

class child extends Parant {
	int num = 200;

	void test2() {
		System.out.println("test2 호출");
	}

	void printnum() {
		System.out.println("num" + num);
		System.out.println("부모의 num "+super.num);
		super.printnum();
	}
	@Override
	void test1() {
		System.out.println("자식이 변경할 test1호출");
	}
}

public class _03오버라이딩 {

	public static void main(String[] args) {

		Parant p=new Parant();
		child c= new child();
		
		c.printnum();
		c.test1();
	}

}
