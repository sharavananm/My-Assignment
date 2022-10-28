package w1d1;

public class Car {
	public void driveCar()
	{
		System.out.println("Drive Car");
	}
	public void applyBrake()
	{
		System.out.println("Apply Brake");
	}
	public void soundHorn()
	{
		System.out.println("Sound Horn");
	}
	public void isPuncture()
	{
		System.out.println("Puncture");
	}
	
	public static void main(String[] args) {
		Car obj=new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
	}
}
