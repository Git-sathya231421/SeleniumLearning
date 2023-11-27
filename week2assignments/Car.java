package week2.week2assignments;

public class Car {

	public void applyBrake() {
		System.out.println("Applied Car brake");
	}
	public void soundHorn() {
		System.out.println("Sound Car horn");
	}
	public static void main(String[] args) {
		Car carObj = new Car();
		carObj.applyBrake();
		carObj.soundHorn();
	}

}
