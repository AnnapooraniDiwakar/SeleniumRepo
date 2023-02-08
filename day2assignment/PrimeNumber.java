package day2assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num = 13;
 boolean flag =false;
 for (int i=2;i<7;i++) {
	 int rem =num%i;
	 if(rem==0) {
		 flag=true;
		 break;
	 }
 }
 if(flag) {
	 System.out.println("Given number "+num+"is not a prime number");
 }
 else {
	 System.out.println("Given number "+num+"is a prime number");
	 
	 
	 
 }
	}

}
