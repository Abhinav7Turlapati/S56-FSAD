package app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import skill2.Employee;
import util.HibernateUtil;

public class MainApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // CREATE
        Employee emp = new Employee(1, "Abhinav", 25000);
        session.save(emp);

        tx.commit();
        session.close();

        System.out.println("Employee record inserted successfully");
    }
}
