import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner mitsos=new Scanner(System.in);
	    System.out.println ("Enter 10 digit number...");
	    String  n=mitsos.nextLine();
	    for (int i=0;i<10;i=i+2){
	    String r = n.substring(i, i+1);
	    
	    System.out.printf(" "+r+" ");
	    }
	    System.out.println();
	    System.out.print(" ");
	    for (int i=1;i<10;i=i+2){
		     String r = n.substring(i, i+1);
		     System.out.printf(" "+r+" ");
		}
	  }
}