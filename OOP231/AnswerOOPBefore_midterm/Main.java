public class Main {
	//test case
    public static void main(String[] args) {

	    ShowRoom shop = new ShowRoom();
	    shop.showInformation();
	    Customer oat = new Customer("Sahachan",4,60000);
		Customer fax = new Customer("PondMongKong",8,100000);
		Customer kong = new Customer("Passakorn",12,500000);

		shop.addRecord(oat);
		shop.addRecord(fax);
		shop.addRecord(kong);

	    for(int i = 0 ; i < 5 ; i++){
			oat.buyCar(shop.getCar((i%5)+1));
			fax.buyCar(shop.getCar((i%5)+1));
			kong.buyCar(shop.getCar((i%5)+1));
		}

		for(int i = 0 ; i < 5 ; i++){
			oat.rent(shop.getCar((i%5)+1),60);
			fax.rent(shop.getCar((i%5)+1),200);
			kong.rent(shop.getCar((i%5)+1),40);
		}

		for(int i = 0 ; i < 5 ; i++){
			oat.down(shop.getCar((i%5)+1));
			fax.down(shop.getCar((i%5)+1));
			kong.down(shop.getCar((i%5)+1));
		}

		shop.showCustomer();
		shop.showInformation();
	}
}
