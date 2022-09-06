package corejava;

public class TestCustomer {

	public static void main(String[] args) {
		
		Address address=new Address("Ist Main HSR Layout", "Bangalore");
		Customer customer=new Customer();
		customer.setCustomerName("John");
		
		customer.setResidentialAddress(address);
		System.out.println("Customer :"+customer.getCustomerName());
	    System.out.println("Residential Address :"+customer.getResidentialAddress().getAddressDetails()); 
	    
	    //second task
	    
	    Address address1 =new Address("3rd Stage BTM layout", "Bangalore");
	    Customer customer1 = new Customer("Prashant", address1);
	    System.out.println("Customer :"+customer1.getCustomerName());
	    customer1.getCustomerDetails();
		
	    

	}

}
