

		import java.util.*;

		//public class that roles two Dices
		  public class Exercise2 {

		    public static int dice1;   // Number showing on the first die.
		    public static int dice2;   // Number showing on the second die.

		    public static void main(String[] args){
		           roll();
		       }

		    public static void roll() {
		                   // Roll the dice by setting each of the dice to be
		                   // a random number between 1 and 6.
		        int num = 0;
		        do{
		            dice1 = (int)(Math.random()*6) + 1;
		                   dice2 = (int)(Math.random()*6) + 1;
		        num = num+1;
		        System.out.println(dice1+" , "+dice2);
		        } while (!((dice1 == 1) && (dice2==1)));
		           System.out.println("The number of rolls needed in order to have two 1s: "+ num);
		       
		
	}

}
