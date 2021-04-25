
public class Tablet {
	
	String brand;
	String platform;
	String camera;
	String screenSize;
	double price;
	int stock;
	public Tablet(String brand, String platform, String camera, String screenSize, double price, int stock) {
		super();
		this.brand = brand;
		this.platform = platform;
		this.camera = camera;
		this.screenSize = screenSize;
		this.price = price;
		this.stock = stock;
	}
	public void setStock(int amount) {
		this.stock = amount;
	}
	public String getBrand() {
		return brand;
	}
	public String getPlatform() {
		return platform;
	}
	public String getCamera() {
		return camera;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	
	
}
