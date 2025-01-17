package 추상_개념;



public abstract class Pizza {

	int price;
	String brand;
	String name;
	
	
	public Pizza(int price, String brand, String name) {
		super();
		this.price = price;
		this.brand = brand;
		this.name = name;
	}


	void makepizza() {
		 makeDough();
		 puttopping();
		 bakepizza() ;
		 cutizza();
		 putpizza();
	 }
		
	
	void makeDough() {
		System.out.println("피자 도우 만들기");
	}
 abstract void puttopping();
 
 void bakepizza() {
	 System.out.println("굽기");
 }
 void cutizza() {
	 System.out.println("커팅");
 }
	
 void putpizza() {
	 System.out.println("포장");
 }


@Override
public String toString() {
	return "Pizza [price=" + price + ", brand=" + brand + ", name=" + name + "]";
}
	
	
}
