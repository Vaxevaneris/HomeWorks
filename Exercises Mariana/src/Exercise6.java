import java.util.*;
public class Exercise6 {
	public static void main (String[] args){
		
		Scanner mitsos= new Scanner(System.in);
		int a1=0, a2=0, a3=0, a4=0, a5=0, a6=0, a7=0, a8=0, a9=0;
		
		//int pin[]={a1,a2,a3,a4,a5,a6,a7,a8,a9};
		
		System.out.println("dose afm arithmo TIM ");
		System.out.println("o arithmos TIM einai  " +(a1=mitsos.nextInt())+
													(a2=mitsos.nextInt())+
													(a3=mitsos.nextInt())+
													(a4=mitsos.nextInt())+
													(a5=mitsos.nextInt())+
													(a6=mitsos.nextInt())+
													(a7=mitsos.nextInt())+
													(a8=mitsos.nextInt())+
													(a9=mitsos.nextInt()));
		 
		 double din=((a1*Math.pow(2, 8)
			+(a2*Math.pow(2, 7)
			+(a3*Math.pow(2, 6)
			+(a4*Math.pow(2, 5)
			+(a5*Math.pow(2, 4)
			+(a6*Math.pow(2, 3)
			+(a7*Math.pow(2, 2)
			+(a8*Math.pow(2, 1))))))))));
		
		System.out.println(" polaplasiasmos ton 8 psifion me thn dynamis toy 2  "+ din);
		
		double b= din%11;
		double c= b%10;
		System.out.println(" ypolipo toy 11  "+ b);
		System.out.println(" ypolipo toy 10  "+ c);
		if ((a9==c)&&(a9==b)){System.out.println("Tax Identification Number valid "+a1+a2+a3+a4+a5+a6+a7+a8+a9);}
		else {System.out.println("Tax Identification Number not valid "+a1+a2+a3+a4+a5+a6+a7+a8+a9);}
		
		 		
	}
}