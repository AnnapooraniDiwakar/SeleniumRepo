package day2assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,7,6,8};
		
		int length=array.length;
		
		Arrays.sort(array);
		for(int i=0;i<length;i++) {
			if(array[i]!=i+1) {
				System.out.println("Missing element in the array is "+(i+1));
				break;
			}
		}
	}

}
