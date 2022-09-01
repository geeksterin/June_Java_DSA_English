package dsa_1st_sept_2022;

public class thisKeywordDemo {

	public static void main(String args[]) {
		Fruit f1 = new Fruit("red",10);
		
		System.out.println(f1.colour); //red
		System.out.println(f1.size); //10
		
		//System.out.println(name);
		
		Fruit f2 = new Fruit("green",20);
		
		System.out.println(f2.colour); //red
		System.out.println(f2.size); //10
		
		System.out.println(f1.colour); //red
		System.out.println(f1.size); //10
		
		
		Car c1 = new Car();
	
		
		c1.setModel("Hyundai");
		c1.setModel("Tata");
		c1.setModel("Toyota");


	

	}
}
