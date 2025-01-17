package 추상_개념2;

 public class Maincafe extends MyBrand {

	
  private static int myNum=0;
  private boolean takeout;
  private boolean cafaeat ;
	public static String getSligan() {
		return String.format(SLOGAN, "지원 카페집");
	}
	
	public Maincafe( String name, boolean takeout,  boolean cafaeat) {
		super(++myNum, name);
		this.takeout=takeout;
		this.cafaeat=cafaeat;
	}
	
	@Override
	public void takeorder() {
		System.out.printf("지원 카페집은%s합니다. %s", super.info()+(takeout? "테이크 아웃점":"테이크 아웃불가")
		+(cafaeat? "매장에서 드시겠습니까?":""));
		
	}

	@Override
	public void takeOrder() {
		// TODO Auto-generated method stub
		
	}

}
