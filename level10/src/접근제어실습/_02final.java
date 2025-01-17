package 접근제어실습;

class Test{
	int num1;
	int num2;
	Test(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	void printnum() {
		System.out.println(num1);
	}
	
}
class Parent{
	int num=10;
	
	final void printnum() {
		System.out.println(num);
	}
}
class child extends Parent{
	 void printnum() {
		 System.out.println("num");
	 }
}

public class _02final {

	public static void main(String[] args) {
		
		final Parant p=new Parant();
	}

}
