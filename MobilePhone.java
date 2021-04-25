
public class MobilePhone {
	
	String brand;
	String platform;
	String camera;
	boolean isTouchScreen;
	String screenSize;
	double price;
	int stock;
	public MobilePhone(String brand, String platform, String camera, boolean isTouchScreen, String screenSize,
			double price, int stock) {
		super();
		this.brand = brand;
		this.platform = platform;
		this.camera = camera;
		this.isTouchScreen = isTouchScreen;
		this.screenSize = screenSize;
		this.price = price;
		this.stock = stock;
	}
	public void setStock(int amount) {
		this.stock = amount;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public String getPlatform() {
		return this.platform;
	}
	public String getCamera() {
		return this.camera;
	}
	public boolean isTouchScreen() {
		return this.isTouchScreen;
	}
	public String getScreenSize() {
		return this.screenSize;
	}
	public double getPrice() {
		return this.price;
	}
	public int getStock() {
		return this.stock;
	}


	
}
