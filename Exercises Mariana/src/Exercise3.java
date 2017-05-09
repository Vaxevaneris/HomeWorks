import java.util.Scanner;
public class Exercise3{
	public static void main (String args[]){
		Scanner mitsos= new Scanner (System.in);
		System.out.println("Enter number of a :");
		int a=mitsos.nextInt();
		System.out.println("Enter number of b :");
		int b=mitsos.nextInt();
		System.out.println("Enter number of c :");
		int c=mitsos.nextInt();

        int diak=(b*b-4*a*c);
double root=Math.sqrt(diak);
		System.out.println(" apotelesma diakrinoysas "+ (diak));

		if (diak >=0){
		   double exis=((-b + root)/( 2*a ));
		   double exis2=((-b - root)/( 2*a ));
		   System.out.println(" apotelesma 1 "+ (exis));
		   System.out.println(" apotelesma 2 "+ (exis2));
		  }
		else {System.out.println("no solve found");}
}
}