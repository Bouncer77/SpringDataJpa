package pro.kosenkov.spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringDataJpaApplication.class, args);
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

}
