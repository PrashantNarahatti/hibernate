package corejava;

public class BookDetails {

	public static void main(String[] args) {
		Book book=new Book("The Power of your subconscious Mind"," Joseph Murphy", 500);
		EngineeringBook be=new EngineeringBook("SDS", "J P Gupta", 500, "Identification");
		System.out.println(book);
		System.out.println("Book Title :"+be.getTitle());
		System.out.println("Book Author :"+be.getAuthor());
		System.out.println("Book Price :"+be.getPrice());
		System.out.println(be);
	}

}

