package pro.kosenkov.spring_data_jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "pro.kosenkov.spring_data_jpa.repository")
public class PersistenceConfig {
}
