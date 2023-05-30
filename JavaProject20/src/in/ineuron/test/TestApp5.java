package in.ineuron.test;

import java.io.IOException;
import java.lang.module.Configuration;
import java.util.List;

import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.query.Query;

import com.mysql.cj.xdevapi.SessionFactory;

import in.ineuron.model.Product;

import in.ineuron.util.HibernateUtil;

public class TestApp5 {

	static int id1;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException {

		Session session = null;
		org.hibernate.Transaction transaction = null;
		int count = 0;
		boolean flag = false;

		// int id=0;

		try {
			session = HibernateUtil.getSession();

			transaction = session.beginTransaction();

			// Prepare Query object to hold HQL
			Query query = session.createQuery("UPDATE in.ineuron.model.Product SET qty=qty+:newQty WHERE pid=:id");
			Query query1 = session.createQuery("FROM in.ineuron.model.Product");

			List<Product> products = query1.list();

			// process the List Object
			products.forEach(System.out::println);

			System.out.println("enter the id to be updated::");

			@SuppressWarnings("resource")
			int id = new Scanner(System.in).nextInt();

			id1 = id;

			System.out.println("enter the new qty to be updated::");
			@SuppressWarnings("resource")
			int newQty = new Scanner(System.in).nextInt();

			// Set the Parameter values
			query.setParameter("newQty", newQty);
			query.setParameter("id", id);

			// Execute the query
			count = query.executeUpdate();
			flag = true;

			if (flag) {
				transaction.commit();
				System.out.println("No of rows affected is :: " + count);
			} else {
				transaction.rollback();
				System.out.println("No of rows affected is :: " + count);

			}

		} catch (HibernateException he) {
			he.printStackTrace();
			flag = false;
		} finally {
			
			getStudent(id1);
			HibernateUtil.closeSession(session);
		}

		//System.in.read();
		

	}

	public static void getStudent(int id) {
		Session session = null;
		try {
			session = HibernateUtil.getSession();

			// Prepare Query object to hold HQL
			Query<Product> query = session.createQuery("FROM in.ineuron.model.Product WHERE pid=:id ");// select * from
																										// product;
			query.setParameter("id", id);
			// Execute the query
			List<Product> product = query.list();

			// process the List Object
			product.forEach(System.out::println);

		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
