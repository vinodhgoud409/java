package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.model.Profile;
import com.app.util.HibernateUtil;

public class Test {
	public static void main(String args []) {
		 Transaction tx=null;
	try(Session ses=HibernateUtil.getsf().openSession()){
		 tx=ses.beginTransaction();
		 Profile p1=new Profile();
		 p1.setProfId(101);
		 p1.setExpTot(3.2);
		 p1.setPltfm("JAVA");
		 p1.setAddr("HYD");
		 Profile p2=new Profile();
		 p2.setProfId(107);
		 p2.setExpTot(3.2);
		 p2.setPltfm(".NET");
		 p2.setAddr("BAN");
		 Employee e1=new Employee();
		 e1.setEmpId(10);
		 e1.setEmpName("AB");
		 e1.setEmpSal(2.2);
		 e1.setPob(p1);
		 Employee e2=new Employee();
		 e2.setEmpId(17);
		 e2.setEmpName("CD");
		 e2.setEmpSal(2.7);
		 e2.setPob(p2);
		 ses.save(p1);
		 ses.save(p2);
		 ses.save(e2);
		 ses.save(e2);
		 tx.commit();
		 System.out.println("done");
	}catch(Exception e){
		tx.rollback();
		e.printStackTrace(); 
	
}
	System.out.println("done");
	
}
}

