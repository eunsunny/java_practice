package exercise1;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		
		books[0] = new Book("����1", "������", 12800);
		books[1] = new Book(books[0]);
		books[2] = new Book(books[0]);
		books[3] = new Book(books[0]);
		books[4] = new Book(books[0]);
		
		for(int i=1; i<books.length; i++) {
			books[i].setTitle("����"+(i+1));
		}
		for (Book temp : books) {
			System.out.println(temp.toString());  //toString ��������
		}
	}
}
