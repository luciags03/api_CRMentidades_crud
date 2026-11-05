
package edu.crm.api_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "edu.crm.api_crud",
    "edu.altair.apicrud"
})
@EnableJpaRepositories(basePackages = "edu.altair.apicrud.repositories")
@EntityScan(basePackages = "edu.altair.apicrud.entities")
public class ApiCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCrudApplication.class, args);
    }

}
