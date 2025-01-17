package 상속_개념;

class D{
	int d;
	D(){
		System.out.println("D생성");
	}
}
class E extends D{
	int e;
	E(){
		System.out.println("E생성");
	}
}
class F extends E {
	
	int f;
	F(){
		System.out.println("F생성");
	}
}

public class _02상속 {

	public static void main(String[] args) {
		
		F f=new F();
		
	}

}
