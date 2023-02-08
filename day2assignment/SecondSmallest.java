package day2assignment;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {23,45,67,32,89,22};
		
		Arrays.sort(array);
		
		System.out.println("Second smallest element in the array is "+array[1]);
		
	}

}
