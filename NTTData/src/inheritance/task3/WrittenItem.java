package inheritance.task3;

abstract class WrittenItem extends Item {
	private String author;

	void setAuthor(String str) {
		author = str;
	}

	String getAuthor() {
		return author;
	}

	public int getidNum() {
		return super.getidNum();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumCopies() {
		return super.getCopies();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
	}
}
