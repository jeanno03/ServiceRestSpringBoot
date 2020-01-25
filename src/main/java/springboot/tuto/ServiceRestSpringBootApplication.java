package springboot.tuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
    public class ServiceRestSpringBootApplication extends SpringBootServletInitializer {
//public class ServiceRestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRestSpringBootApplication.class, args);
	}
}
