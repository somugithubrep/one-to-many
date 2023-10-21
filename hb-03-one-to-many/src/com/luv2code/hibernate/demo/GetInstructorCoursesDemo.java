package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorCoursesDemo {
	
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
		
		
		 //start a transcation
		 session.beginTransaction();
		 
		 //get the instructor from db
		 int theId = 10;
		 Instructor tempInstructor = session.get(Instructor.class, theId);
		 
		 System.out.print("Instructor: " + tempInstructor);
		 
		 //get course for the instructor
		 System.out.println("Courses: " + tempInstructor.getCourses());
	
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
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
