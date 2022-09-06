package corejava.address;

public class TestCustomer {

	public static void main(String[] args) {
		Address address = new Address("Ist Main HSR Layout", "Bangalore");
		Address address1 = new Address("Ist Main Electronics city", "Bangalore");
		Customer customer = new Customer();
		Customer customer1 = new Customer();
		customer.setCustomerName("John");

		customer.setResidentialAddress(address);
		customer1.setOfficialAddress(address1);
		System.out.println("Customer :" + customer.getCustomerName());
		System.out.println("Residential Address :" + customer.getResidentialAddress().getAddressDetails());
		System.out.println("Official Address :" + customer1.getOfficialAddress().getAddressDetails1());

	}

}
