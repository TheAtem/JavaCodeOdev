
public class Main {

	public static void main(String[] args) {
		
		Seller seller = new Seller("Hakan");
		
		MobilePhone mobilePhone1 = new MobilePhone("Samsung A71", "Android", "64 MP", true, "6.7 inch", 4000, 10);
		MobilePhone mobilePhone2 = new MobilePhone("Huawei P40", "Android", "48 MP", true, "6.4 inch", 3500, 6);
		MobilePhone mobilePhone3 = new MobilePhone("iphone 11", "iOS", "12 MP", true, "6.1 inch", 9000, 7);
		
		Tablet tablet1 = new Tablet("iPad Pro", "iOS", "12 MP", "11 inch", 14000, 7);
		Tablet tablet2 = new Tablet("Samsung Tab S7", "Android", "13 MP", "12.4 inch", 7700, 8);
		Tablet tablet3 = new Tablet("Lenovo Tab Snapdragon", "Android", "8 MP", "10.1 inch", 2500, 20);
		
		MobilePhone[] mobilePhones = { mobilePhone1, mobilePhone2, mobilePhone3};
		Tablet[] tablets = { tablet1, tablet2, tablet3};
		
		System.out.println("Mobile Phones : ");
		for(MobilePhone mp : mobilePhones) {
			System.out.println(mp.getBrand());
		}

		System.out.println("=============================================");
		
		System.out.println("Tablets : ");
		for(Tablet tablet : tablets) {
			System.out.println(tablet.getBrand());
		}
		
		System.out.println("=============================================");
		
		seller.sellMobilePhone(mobilePhone2, 7);
		seller.sellMobilePhone(mobilePhone3, 7);
		seller.sellMobilePhone(mobilePhone1, 7);

		System.out.println("=============================================");
		
		seller.sellTablet(tablet3, 8);
		seller.sellTablet(tablet2, 8);
		seller.sellTablet(tablet1, 8);
		
	}
}
