package inheritance.task3;

abstract class Item {
	private int idNum;
	private String title;
	private int numCopies;

	public Item() {
		idNum = 0;
		title = " ";
		numCopies = 0;
	}

	public Item(int idNum, String title, int numCopies) {
		idNum = idNum;
		title = title;
		numCopies = numCopies;
	}

	public int setidNum(int id) {
		idNum = id;
		return id;
	}

	public String setTitle(String str) {
		title = str;
		return str;
	}

	public int setNumCopies(int n) {
		numCopies = n;
		return n;
	}

	public int getidNum() {
		return idNum;
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return numCopies;
	}

	public void checkIn() {
		numCopies = numCopies + 1;
	}

	public void checkOut() {
		numCopies = numCopies - 1;
	}

	public void addItem(int idNum, String str, int n) {
		setidNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

	public String toString() {
		return "ID: " + idNum + " Title: " + title + " Number of Copies: " + numCopies;
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("ID: " + idNum);
		System.out.println("Number of copies: " + numCopies);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Item otherItem = (Item) obj;
		return idNum == otherItem.idNum && title == otherItem.title && numCopies == otherItem.numCopies;
	}

	public void addItem() {
		numCopies++;
	}
}
