package week2.week2assignments;

public class Mobile {

	public void makeCall() {
		String mobileModel = "Mi12";
		float mobileWeight = 15.09f;
		
		System.out.println("This is my Mobile. Mobile model is " + mobileModel + " and Weight is " + mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 15000;
		
		System.out.println("This is my Mobile. Mobile charge is " + isFullCharged + " and Cost is " + mobileCost);
	}
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}

}
