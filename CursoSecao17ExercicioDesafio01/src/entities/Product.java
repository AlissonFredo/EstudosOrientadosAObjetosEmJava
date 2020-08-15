package entities;

public class Product {

	private String name;
	private double value;
	private Integer amount;
	
	public Product() {
		
	}

	public Product(String name, double value, Integer amount) {
		super();
		this.name = name;
		this.value = value;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public double valueTotal() {
		return value * amount; 
	}
}
