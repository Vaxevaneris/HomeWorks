import java.util.*;
public class Exercise7{
	public static void main (String [] args){
		Scanner mitsos= new Scanner (System.in);
		System.out.println(" Dose diadiko arithmo ...");
		
		String str=mitsos.nextLine();
		
		String assos="1";
		int counter=0;
		int index=0;
		index=str.indexOf(assos);
		
		while (index >=0){++counter;
						  index +=assos.length();
						  index=str.indexOf(assos, index);
						  if(index==7){break;
						 }
					}
		
		System.out.println("O eptapsifios diadikos arithmos periexei "+counter+" assous");
		char ste= str.charAt(7);
		System.out.println("to 8o psifio einai "+ste);
		
		if (((ste==1)&&(counter%2==1))||((ste==0)&&(counter%2==0))){System.out.println("Parity Check OK ");}
		else{System.out.println("Parity Check OK ");}
	}   
	
	
	
	
}