
	import java.util.*;
public class Exercise3{
	public static void main (String args []) {
		int[] array1= new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] array2= new int[]{1,2,3,4,5,6,7,8,9,10};
		int i=0;


		for (int s=0; s<10; s++){
		i=0;
			for (int o=0; o<10; o++){
				array2[o]=array1[o];
				}
			for(int k=1; k<10; k++){
				if (k<9) {array1[k]=array2[i];
		        		  i=i+1;
				}
				else {
						array1[0]=array2[9];
						array1[9]=array2[8];

					  }
				}
		        System.out.println(Arrays.toString(array1));
		}
		
		

	}

}
