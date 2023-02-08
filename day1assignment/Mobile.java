package day1assignment;

public class Mobile {
  public void makeCall() {
	  String mobileModel="Vivo Y22";
	  float mobileWeight=2.5f;
	  System.out.println("Mobile model is "+mobileModel);
	  System.out.println("Mobile weight is "+mobileWeight);
  }
	
	public void sendMsg() {
		boolean isFullyCharged= true;
		int mobileCost=12000;
		System.out.println("Mobile is fully charged "+isFullyCharged);
		
		System.out.println("Mobile cost is "+mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Mobile m= new Mobile();
 m.makeCall();
 m.sendMsg();
 System.out.println("This is my mobile"); 
	}

}
