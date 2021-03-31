package spring.gradle.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

	@Bean
	public Employee employee() {
		System.out.println("Employee bean");
//		return new Employee(); // paremeterized constr 
		return new Employee();
	}

//	@Bean
//	@Autowired
//	public Department department() {
//		System.out.println("Department bean");
//		return new Department();
//	}
}
