package 다양성실습;

import java.util.Random;


abstract class Shape {
	String name;
	String color;
	int size;

	Shape(String name, String color, int size) {
		super();
		this.name = name;
		this.color = color;
		this.size=size;
	}

	abstract void draw();

	@Override
	public String toString() {
		return name +"," + color + "," + size;
	}
	
	
}

class Line extends Shape {
	
	
	Line( String color, int size) {
		super("선", color,size);
	}

	
	@Override
	void draw() {
		System.out.println("선을 긋는다 ");
		 System.out.printf("%s (%d)",color,size);
		
	}

	
}

class point extends Shape {

	point( String color, int size) {
		super("점", color,size);
	}

	@Override
	void draw() {
		System.out.println("점을 찍는다");
		 System.out.printf("%s 점(%d)",super.color,super.size);
	}

}
//원
class Circle extends Shape {

	int radius;

	Circle( String color, int size) {
		super("원", color,size);
	}
   
	@Override
	void draw() {
		
		
		
	   System.out.printf("%s (%d)",color,size*size*3.14);

	}

}

class Rect extends Shape {

    
	int height;
	int width;

	Rect( String color, int size) {
		super("네모", color,size);
	}

	@Override
	void draw() {
		System.out.printf("%s (%d)",color,size*size);
	}

}
//삼각형
class Triangle extends Shape {
	Triangle( String color, int size) {
		super("삼각형", color,size);
	}

	int height;
	int width;

	@Override
	void draw() {
		
		 System.out.printf("%s (%d)",color,size*size/2);
	}
}

public class _01도형 {
	public static void main(String[] args) {
		// 모양도 랜덤하게 색깔 사이즈 랜덤해게 도형 10개를 출력하세요 
		// 점 , 선 기존 size 출력 
		// 원, 네모, 세모 => size 넓이를 계산해서 출력 
		
		String[] colors = {"파란색", "빨간색","보라색","분홍색","노란색"};
		
		
	    Shape[] lilt = new Shape[10];
	    
	     
	    Random rd=new Random();
	        
	     
	       
	     for(int i=0;i<lilt.length;i+=1) {
	    	 int rdIdx = rd.nextInt(colors.length); 
	    	  int rdsize=rd.nextInt(100)+1;
	    	  
	    	 int rdnum=rd.nextInt(5);
	    	 
	    	 if(rdnum==0) {
	    		 lilt[i]=new Line(colors[rdIdx],rdsize);
	    	 }else if(rdnum==1) {
	    		 lilt[i]=new point(colors[rdIdx],rdsize);
	    	 }else if(rdnum==2) {
	    		 lilt[i]=new Circle(colors[rdIdx],rdsize);
	    	 }else if(rdnum==3) {
	    		 lilt[i]=new Rect(colors[rdIdx],rdsize);
	    	 }else if(rdnum==4) {
	    		 lilt[i]=new Triangle(colors[rdIdx],rdsize);
	    	 }
	    	 
	    	 System.out.println(lilt[i]);
	    	 
	     }
	    
	
	}
}