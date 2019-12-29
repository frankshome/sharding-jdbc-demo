package me.xuhu.demo.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@MapperScan("me.xuhu.demo.sharding.mapper")
@RestController
@SpringBootApplication
public class ShardingJdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcDemoApplication.class, args);
	}


	@RequestMapping("/")
	public String home() {
		return "sharding-demo service is running...";
	}
}
