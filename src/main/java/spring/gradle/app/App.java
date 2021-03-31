package spring.gradle.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		// 1. Annotation based Configuration
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		Employee employee = ctx.getBean(Employee.class);
		employee.setName("Abc");
		System.out.println(employee.toString());

		// 2. XML based Configuration
//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
//
//		Employee emp = context.getBean("emp", Employee.class);
//		System.out.println(emp.toString());
//
//		Employee e2 = context.getBean("emp", Employee.class);
//		System.out.println(e2.toString());
//
//		emp.setName("aaa");
//		System.out.println(emp.toString());
//		System.out.println(e2.toString());
//
//		e2.setName("bbb");
//		System.out.println(emp.toString());
//		System.out.println(e2.toString());

		// 3. Java based Configuration
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
//
//		Employee emp = ctx.getBean(Employee.class);
//		emp.setName("Zzz");
//		System.out.println(emp.toString());
//		Employee emp2 = ctx.getBean(Employee.class);
//		System.out.println(emp2.toString());

	}

}
