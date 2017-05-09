
public class Circle {
private int x;
private int y;
private int r;
private static final double pi=3.14;
public static int count;
public int  getX(){return x;}
public int getY(){return y;}
public int getR(){return r;}
public void setX(int x){this.x=x;}
public void setY(int y){this.y=y;}
public void set(int r){this.r=r;}


Circle(){                               //methodos contsractor arxikopoiei tis times ton metavliton 
	x=0;									// me etimes times
	y=0;
	r=5;
}
 Circle(int x, int y, int r){
	 this.x=x;
	 this.y=y;
	 this.r=r;
	 	 
 }
 
 
public void printCircleDetails(){
	System.out.println("I am a circle at point("+x+" , "+y+") with radious"+r);
} 
Circle (int x, int y){
	this();
	this.x=x;
	this.y=y;
	
}
public double calculateArea(){
	double e=(pi*r*r);
	return e;
}
public double calculatePerimeter(){
 double p=(2*pi*r);
 return (p);
}
 
public boolean cocentric(Circle ena, Circle dyo){
	 if (ena.getX()==dyo.getX()&&ena.getY()==dyo.getY()){return(true);}
	 else {return(false);
	 }
	 
   }
}
