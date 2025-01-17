package 추상_개념;

import java.util.ArrayList;

public class Mainpizza {
	public static void main(String[] args) {
		Pizzaservic servic=new Pizzaservic();
		
		ArrayList<Pizza>orderlist= new ArrayList<Pizza>();
		
		orderlist.add(new Bulgogpizza(12000, "피자"));
		
		servic.orderPizza(orderlist);
	}
}
