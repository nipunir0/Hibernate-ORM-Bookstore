package main;
import java.util.List;
import dao.IBookDao;
import dao.BookDao;
import model.Book;


public class App {
	/**
	* @param args
	*/
	public static void main(String[] args) {
	BookDao bookDao = new BookDao();
	 // test saveBook
	
	 Book book =  new  Book("To Kill a Mockingbird", "Harper Lee", "2014-56");
	 Book book2 = new  Book("The Great Gatsby", "F. Scott Fitzgerald", "254-9856");
	 Book book3 = new  Book("Call me by your name", "André Aciman", "998745-254");
	 Book book4 = new  Book("The Catcher in the Rye", "J.D. Salinger", "996445-254");
	 Book book5 = new  Book("Pride and Prejudice", "Jane Austen", "7898745-254");
	 Book book6 = new  Book("The Hobbit", " J.R.R. Tolkien", "988745-254");
	 Book book7 = new  Book("The Great Expectations", " Charles Dickens", "5488745-254");
	 Book book8 = new  Book("Brave New World", " Aldous Huxley", "2488745-254");
	 Book book9 = new  Book("The Alchemist", " Paulo Coelho", "6978745-254");
	 Book book10 = new Book("The Da Vinci Code", " Dan Brown", "748745-254");
	 
	 bookDao.saveBook(book);
	 bookDao.saveBook(book2);
	 bookDao.saveBook(book3);
	 bookDao.saveBook(book4);
	 bookDao.saveBook(book5);
	 bookDao.saveBook(book6);
	 bookDao.saveBook(book7);
	 bookDao.saveBook(book8);
	 bookDao.saveBook(book9);
	 bookDao.saveBook(book10);
	 
	 // test updateBook
	 book.setBookName("Go Set a Watchman");
	 bookDao.updateBook(book);
	 
	 // test getBookById
	 Book book21 = bookDao.getBookById(book.getId());
	 System.out.println(book21);
	 
	 // test getAllBooks
	 List <Book> books = bookDao.getAllBooks();
	 
	 for (Book s: books) {
		 System.out.println(s);
	 }
	 
	 // test deleteBook
	 bookDao.deleteBook(3);
	 }
}


