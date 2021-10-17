package esprit.fgsc.EMPLOYEESMICROSERVICES;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeesMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesMicroservicesApplication.class, args);
	}

}
