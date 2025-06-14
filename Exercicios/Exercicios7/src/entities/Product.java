package entities;

public class Product {
	public String name;
	public double value;
	public int quantity;


	public Product(String name, double value, int quantity){
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}


	public double calcPrice(){
		return this.value * quantity;
	}

}
