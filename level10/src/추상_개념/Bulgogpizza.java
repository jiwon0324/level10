package 추상_개념;

public class Bulgogpizza extends Pizza {

	Bulgogpizza(int price,String brand){
		super(price,brand,"불고기 피자");
	}
	
	
	@Override
	void puttopping() {
		System.out.println("불고기");
		
	}
	
	
	

	

}
