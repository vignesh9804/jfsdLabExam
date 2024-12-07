package com.MYname.jfsd;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class Main {
  public static void main(String[] args) {
try
{   // INHERITANCE BY SINGLE TABLE
  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
     Session session = sessionFactory.openSession();
       Transaction t;
       t=session.beginTransaction();
       FullTimeEmployee e=new FullTimeEmployee();
       e.setEname("rohit");
       e.setEno(17);
       e.setSalary(1000);
       PartTimeEmployee e1=new PartTimeEmployee();
       e1.setEname("khaza");
       e1.setEno(111);
       e1.setPayment(2000);
       session.save(e);
       session.save(e1);
       t.commit();	
       
       System.out.println("retriving the data from employee\n");
         String hql = "from Employee";
         Query query = session.createQuery(hql);
         List results = query.list();
         System.out.println(results);
       
   //INHERITANCE BY SUBCLASS
  /*
  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
   Session session = sessionFactory.openSession();
    Transaction t;
    t=session.beginTransaction();
    
    FullTimeEmployee ft=new FullTimeEmployee();
    ft.setEname("ramesh");
    ft.setEno(109);
    ft.setSalary(10000);
    
    PartTimeEmployee pt=new PartTimeEmployee();
    pt.setEname("raju");
    pt.setEno(110);
    pt.setPayment(20000);
    session.save(ft);
    session.save(pt);
    t.commit();
    */
  }
  finally {}
  }
}