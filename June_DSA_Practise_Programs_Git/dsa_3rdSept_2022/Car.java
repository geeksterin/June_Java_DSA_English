package dsa_3rdSept_2022;

public abstract class Car {

	void turnOnParkingSensor(){
		System.out.println("In turnOnParkingSensor()");
	}
	
	abstract String findGPS();
	
	Car(){
		System.out.println("in abstract class constrctaor");
	}
}
