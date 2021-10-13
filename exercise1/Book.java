package exercise1;

public class Book {
	// �ʵ�
	private String title;
	private String author;
	private long price;

	// ������
	public Book() {
	}
	
	public Book(String title, String author, long price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}
	
	//�޼ҵ�
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}	
}
