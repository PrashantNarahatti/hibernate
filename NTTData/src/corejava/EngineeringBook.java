package corejava;

public class EngineeringBook extends Book {

	private String category;

	public EngineeringBook(String title, String author, float price, String category) {
		super(title, author, price);
		this.category = category;
	}
     
	@Override
	public String toString() {
		return "EngineeringBook [category=" + category + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


}
