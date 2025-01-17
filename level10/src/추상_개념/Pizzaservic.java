package 추상_개념;

import java.util.ArrayList;

public class Pizzaservic {

	void orderPizza(ArrayList<Pizza>orederlist) {
		for(Pizza p:orederlist) {
			p.makepizza();
		}
	}
	
}



