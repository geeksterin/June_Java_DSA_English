package dsa_1st_sept_2022;

public class Car {

     private String model; //backgate
     private String fuelType;
     private float price;
     
	public void setModel(String model) {
		System.out.println("current value is "+this.model);
		System.out.println(Thread.currentThread().getName());

		this.model = model;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public float getPrice() {
		return price;
	}
	
}
