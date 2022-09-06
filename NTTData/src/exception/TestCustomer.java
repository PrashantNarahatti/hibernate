package exception;

public class TestCustomer {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		Customer customer=new Customer("CN123", "Pranu", "Gold");
        System.out.println(customer.getCustNo());
        System.out.println(customer.getCustName());
        System.out.println(customer.getCategory());
	}

}
