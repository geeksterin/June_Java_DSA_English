package dsa_31st_Aug_2022;

public class FruitClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit mango = new Fruit("yellow",20);
		Fruit banana = new Fruit("yellow",20);
		
		System.out.println(mango==banana);
		
		banana = mango;
		
		System.out.println(mango==banana);
		
		Fruit f3 = new Fruit("black",90);
		Fruit f4 = new Fruit("voilet",89);
		
		Fruit f5 = new Fruit();
		System.out.println(f5.colour);
		
		Fruit f6 = new Fruit("Green",90);
		System.out.println(f6.colour);
		
		f6.colour = "white";
		
		f6.m1();
	}

}
