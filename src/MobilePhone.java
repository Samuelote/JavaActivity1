
public class MobilePhone {
	
	private String manufacturer;
	private String model;
	private double price;
	private String carrier;

	public MobilePhone(String manufacturer, String model, double price, String carrier) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}
	
	public String call(String num) {
		return "I am calling "+num;
	}

	public String text(String message) {
		return message;
	}
	
	public String toString() {
		return "Manufacturer: "+this.manufacturer + "\n" +
				"Model: "+this.model + "\n" +
				"Price: $"+this.price + "\n" +
				"Carrier: "+this.carrier + "\n";
	}
}
