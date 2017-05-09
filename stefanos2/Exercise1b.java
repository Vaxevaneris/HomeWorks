import java.util.*;
public class Exercise1b{
	public static void main (String args[]){
	 Scanner mitsos= new Scanner (System.in);

	int number1, number2;
	System.out.println("Enter number a:");
    number1=mitsos.nextInt();
    System.out.println("Enter number b:");
    number2=mitsos.nextInt();
	int	a= bootcamp (number1, number2);
	System.out.println("apotelesma" + a);

		  }

	public static int bootcamp (int number1, int number2){
	int apotelesma;
	if (number1<number2){
		apotelesma= (int) Math.sqrt(Math.abs(number1-number2));
		}
    else {
		 apotelesma=number1+number2;
		}
	return apotelesma;
	}
}








