package week1.day1;

public class Mobile {
	public String makeCall (String mobileMode1, float mobileWeight) {
		return mobileMode1+" "+ mobileWeight;
	
	}
	
	public String sendMsg(boolean isFullCharged, int mobileCost) {
		return isFullCharged+" "+mobileCost;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mobile obj=new Mobile();
	String mobileDetails = obj.makeCall("Samsung", 15.2f);
	System.out.println(mobileDetails);
	
	String mobileSpec = obj.sendMsg(true, 1500);
	System.out.println(mobileSpec);
	
	System.out.println("This is my mobile");	

	}

}
