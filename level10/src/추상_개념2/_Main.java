package 추상_개념2;

public class _Main {

	public static void main(String[] args) {
		
		System.out.println(Bakery.getSligan());

		Bakery store1=new Bakery( "구미",false);
		Bakery store2=new Bakery( "강남",true);
		
		
	
		
		
		Maincafe store3=new Maincafe("강남",false,true);
		
		
		MyBrand[] mystores= { store1,store2,store3};
		
		
	}

}
