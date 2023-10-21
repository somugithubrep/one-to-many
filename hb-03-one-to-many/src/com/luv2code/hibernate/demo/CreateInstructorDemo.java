package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {
	
	private static final SharedSessionContract factory = null;

	public static void main(String[] args) {
	
		
		//create session factory
		SessionFactory factory = new Configuration()
				                .configure("hibernate.cfg.xml")
				                .addAnnotatedClass(Instructor.class)
				                .addAnnotatedClass(InstructorDetail.class)
				                .addAnnotatedClass(Course.class)
				                .buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();

	try {
		//create the objects
		
		
		Instructor tempInstructor =
				new Instructor("sanu","char","sanu@luv2code.com");
		
		InstructorDetail tempInstructorDetail=
				new InstructorDetail("http://www.youtube.com",
						"video game!!!");
		
		//associate the objects
		tempInstructor.setInstructordetail(tempInstructorDetail);
		
		 //start a transcation
		 session.beginTransaction();
		 
		 //save the instructor
		 //
		 //Note:tis will also save the details object
		 //because of cascadeType.ALL
		 System.out.println("Saving instructor: " + tempInstructor);
		 session.save(tempInstructor);
		 
	
		 //commit transcation
		 session.getTransaction().commit();
		 
		 System.out.println("done!...");
		 
	 }
	 finally {
		 
		 //add clean up code
		 session.clear();
		 
		 
		 
		 factory.close();
	 }
} 
	 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
