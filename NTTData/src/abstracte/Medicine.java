package abstracte;

public  class Medicine {
	int price;
	String date;
	
	public void getDetails(String date,int prince)
	{
		System.out.println("Price");
        System.out.println("Expiry date");
	}
	
	public void displayLabel() {
		System.out.println("Company : Globex Pharma");
		System.out.println("Address : Bangalore");
	}

}
