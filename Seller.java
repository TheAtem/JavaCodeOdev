
public class Seller {
	
	String name;
	
	public Seller(String name) {
		this.name = name;
	}
	
	public void sellTablet(Tablet tablet, int amount) {
		if(tablet.getStock() >= amount) {
			System.out.println(tablet.getBrand() + " marka tabletten " + amount + " adet satýldý.");
			tablet.setStock(tablet.getStock()-amount);
		}else {
			System.out.println(tablet.getBrand() + " marka tabletten yeterli sayýda bulunmamaktadýr.");
			System.out.println(tablet.getBrand() + " marka tabletten " + tablet.getStock() + " adet alabilirsiniz.");
		}
	}
	public void sellTablet(Tablet tablet) {
		if(tablet.getStock() > 0) {
			System.out.println(tablet.getBrand() + " marka tabletten 1 adet satýldý.");
			tablet.setStock(tablet.getStock()-1);
		}else {
			System.out.println(tablet.getBrand() + " marka tablet stoklarda tükenmiþtir.");
		}
	}
	
	public void sellMobilePhone(MobilePhone mobilePhone, int amount) {
		if(mobilePhone.getStock() >= amount) {
			System.out.println(mobilePhone.getBrand() + " marka telefondan " + amount + " adet satýldý.");
			mobilePhone.setStock(mobilePhone.getStock()-amount);
		}else {
			System.out.println(mobilePhone.getBrand() + " marka telefondan yeterli sayýda bulunmamaktadýr.");
			System.out.println(mobilePhone.getBrand() + " marka telefondan " + mobilePhone.getStock() + " adet alabilirsiniz.");
		}
	}
	public void sellMobilePhone(MobilePhone mobilePhone) {
		if(mobilePhone.getStock() > 0) {
			System.out.println(mobilePhone.getBrand() + " marka telefondan 1 adet satýldý.");
			mobilePhone.setStock(mobilePhone.getStock()-1);
		}else {
			System.out.println(mobilePhone.getBrand() + " marka telefon stoklarda tükenmiþtir.");
		}
	}
}