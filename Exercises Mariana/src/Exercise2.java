import java.util.Scanner;
public class Exercise2{
	public static void main (String args[]){

		System.out.println("Enter number of 50 euro banknotes: ");
		Scanner mitsos= new Scanner (System.in);
		int penintaEura=mitsos.nextInt();


		System.out.println("Enter number of 20 euro banknotes:");

				int ikosaEura=mitsos.nextInt();


		System.out.println("Enter number of 10 euro banknotes:");

				int dekaEura=mitsos.nextInt();


		System.out.println("Enter number of 5 euro banknotes:");

				int penteEura=mitsos.nextInt();


		System.out.println("Enter number of 2 euro banknotes:");

				int dioEura=mitsos.nextInt();


		System.out.println("Enter number of 1 euro banknotes:");

				int enaEura=mitsos.nextInt();


		System.out.println("50 eura " + penintaEura);
		System.out.println("20 eura " + ikosaEura);
		System.out.println("10 eura " + dekaEura);
		System.out.println("5 eura " + penteEura);
		System.out.println("2 eura " + dioEura);
		System.out.println("1 eura " + enaEura);

		System.out.println(" SYNOLO "+ (penintaEura*50+ikosaEura*20+dekaEura*10+penteEura*5+dioEura*2+1*enaEura) + " EYRO ");
	}
}