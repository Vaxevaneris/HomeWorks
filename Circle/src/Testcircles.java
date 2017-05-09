
public class Testcircles {

	public static void main(String[] args) {
		  Circle circle1=new Circle();
		  circle1.printCircleDetails();
		  
		  circle1.setX(9);
		  circle1.setY(3);
		  circle1.printCircleDetails();
		  
		  Circle circle2=new Circle(5,7,3);
		  circle2.printCircleDetails();
		  
		  Circle circle3=new Circle(9,1);
		  circle3.printCircleDetails();
		  
		  circle1.calculateArea();
		  circle1.printCircleDetails();
		  System.out.println("Emvado is "+circle1.calculateArea());
		  System.out.println("Perimetros is "+circle1.calculatePerimeter());
		 
		  circle2.calculateArea();
		  circle2.printCircleDetails();
		  System.out.println("Emvado is "+circle2.calculateArea());
		  System.out.println("Perimetros is "+circle2.calculatePerimeter());
		  
		  circle3.calculateArea();
		  circle3.printCircleDetails();
		  System.out.println("Emvado is "+circle3.calculateArea());
		  System.out.println("Perimetros is "+circle3.calculatePerimeter());
		  
		  
		  Circle copy1 = new Circle(8,2,9);
		  Circle copy2 = new Circle(8,2,9);
		  copy1.printCircleDetails();
		  copy2.printCircleDetails();
		  copy1=new Circle(3,3,8);
		  copy1.printCircleDetails();
		  copy2.printCircleDetails();
		  System.out.println(copy1.cocentric(copy1, circle2));
		  System.out.println(Circle.count);
		  
	}

	

}
