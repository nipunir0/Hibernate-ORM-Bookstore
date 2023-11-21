package dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.persistence.criteria.CriteriaQuery;
import model.Book;
import util.HibernateUtil;

public class BookDao {
	 public void saveBook(Book book) {
	 Transaction transaction = null;
	 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	 // start the transaction
	 transaction = session.beginTransaction();
	 
	 session.persist(book);
	 // commit the transaction
	 transaction.commit();
	 } catch (Exception e) {
	 if (transaction != null) {
	 transaction.rollback();
	 }
	 }
	 }
	 public void updateBook(Book book) {
	 Transaction transaction = null;
	 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	 // start the transaction
	 transaction = session.beginTransaction();
	 
	 session.merge(book);
	 // commit the transaction
	 transaction.commit();
	 } catch (Exception e) {
	 if (transaction != null) {
	 transaction.rollback();
	 }
	 }
	 }
	 public Book getBookById(long id) {
	 Transaction transaction = null;
	 Book book = null;
	 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		 
		// start the transaction
		 transaction = session.beginTransaction();
		 
		 book = session.get(Book.class, id);
		 
		 // commit the transaction
		 transaction.commit();
		 } catch (Exception e) {
		 if (transaction != null) {
		 transaction.rollback();
		 }
		 }
		 return book;
		 }
		 public List < Book > getAllBooks() {
		 Transaction transaction = null;
		 List < Book > book = null;
		 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		 // start the transaction
		 transaction = session.beginTransaction();
		 // get students
		 CriteriaQuery<Book> cq = session.getCriteriaBuilder().createQuery(Book.class);
		 cq.from(Book.class);
		 book =session.createQuery(cq).getResultList();
		 transaction.commit();
		 } catch (Exception e) {
		 if (transaction != null) {
		 transaction.rollback();
		 }
		 }
		 return book;
		 }
		 
		 public void deleteBook(long id) {
		 Transaction transaction = null;
		 Book book = null;
		 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		 // start the transaction
		 transaction = session.beginTransaction();
		 book = session.get(Book.class, id);
		 // get student object
		 session.remove(book);
		
		 // commit the transaction
		 transaction.commit();
		 } catch (Exception e) {
		 if (transaction != null) {
		 transaction.rollback();
		 }
		 }
		 }
	

}
