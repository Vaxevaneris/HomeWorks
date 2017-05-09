
import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner mitsos=new Scanner(System.in);
	    System.out.println ("Enter 9 digit number...");
	    String  n=mitsos.nextLine();
	    
	    for (int i=0;i<9;i=i+3){
	    String r = n.substring(i, i+1);
	    System.out.print(" "+r+" ");
	        }
	    
	    System.out.println();
	    System.out.print(" ");
	    
	    for (int i=1;i<9;i=i+3){
		     String r = n.substring(i, i+1);
		     System.out.printf(" "+r+" ");
		    }
	    
	    System.out.println();
	    System.out.print("  ");
	    
	    for (int i=2;i<9;i=i+3){
		     String r = n.substring(i, i+1);
		     System.out.printf(" "+r+" ");
		    }
	}
}
