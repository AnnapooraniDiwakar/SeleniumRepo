package day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num= 34343;
int i=num;
int temp=0;
for(i=num;i>0;i=i/10) {
  int rem= i%10;
  temp=(temp*10)+rem;
  
}
if(num==temp)
{System.out.println("Given number "+num+"is palindrome");

}
else {
	System.out.println("Given number "+num+"is not a palindrome");
	
}
	}

}
