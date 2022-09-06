package corejava;

public class Customer {
	private String customerName;
	private Address residentialAddress;

	public Customer() {
		System.out.println("default constructor");
	}

	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerDetails() {
		String customer = customerName + "Customer :" + customerName;
		String address = residentialAddress.getAddressDetails();
		System.out.println("Residential Address :" + address);
		return customerName;

	}

}
