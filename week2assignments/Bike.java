package week2.week2assignments;

public class Bike {
	public void applyBrake() {
		System.out.println("Applied Bike brake");
	}
	public void soundHorn() {
		System.out.println("Sound Bike horn");
	}
	public static void main(String[] args) {
		Bike bikeObj = new Bike();
		bikeObj.applyBrake();
		bikeObj.soundHorn();
		Car carObj = new Car();
		carObj.applyBrake();
		carObj.soundHorn();
	}

}
