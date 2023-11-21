package model;
/**
*
*/
import jakarta.persistence.*;
@Entity
@Table(name = "book")

public class Book {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id")
	 private int id;
	 @Column(name = "bookname")
	 private String bookname;
	 @Column(name = "authorname")
	 private String authorname;
	 @Column(name = "isbn")
	 private String isbn;
	 public Book() {
	 }
	 public Book(String bookname, String authorname, String isbn) {
	 this.bookname = bookname;
	 this.authorname = authorname;
	 this.isbn = isbn;
	 }
	 public int getId() {
	 return id;
	 }
	 public void setId(int id) {
	 this.id = id;
	 }
	 public String getBookName() {
	 return bookname;
	 }
	 public void setBookName(String bookname) {
	 this.bookname = bookname;
	 }
	 public String getAuthorName() {
	 return authorname;
	 }
	 public void setAuthorName(String authorname) {
		 this.authorname = authorname;
	 }
	 public String getIsbn() {
	 return isbn;
	 }
	 public void setIsbn(String isbn) {
	 this.isbn = isbn;
	 }
	 @Override
	 public String toString() {
	 return "Book [id=" + id + ", bookname=" + bookname + ", authorname=" +
			 authorname + ", isbn=" + isbn + "]";
	 }

}
