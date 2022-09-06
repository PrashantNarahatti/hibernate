package corejava.address;

public class Customer {
	private String customerName;
	private Address residentialAddress;
	private Address officialAddress;

	public Customer() {
		System.out.println("default constructor");
	}

	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
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

	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}

	public String getCustomerDetails1() {
		String customer = customerName + "Customer :" + customerName;
		String address = residentialAddress.getAddressDetails();
		System.out.println("Residential Address :" + address);
		String address1 = officialAddress.getAddressDetails1();
		System.out.println("officialAddress Address :" + address1);
		return customerName;

	}

}
