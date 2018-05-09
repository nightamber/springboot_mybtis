package xin.mrbear.springboot_mybtis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan(value = "xin.mrbear.springboot_mybtis.mapper")
public class SpringbootMybtisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybtisApplication.class, args);
	}
}
