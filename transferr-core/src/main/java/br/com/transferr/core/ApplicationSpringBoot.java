package br.com.transferr.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@ComponentScan({"br.com.transferr.core.dao"
	,"br.com.transferr.core.role"
	,"br.com.transferr.core.boot"
	,"br.com.transferr.core.model"
})
*/
@SpringBootApplication
public class ApplicationSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringBoot.class, args);
	}
}
