package org.tnsif.objects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//driver class
//program to demonstrate on DI in the form of objects
public class DIUsingObjectsExecutor {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("objects.xml");
		Student s=(Student) a.getBean("s1");
		s.print();
		
	}

}
