package hello.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStartApplication {

	public static void main(String[] args) {
		// 톰캣이라는 내장 서버에서 자체적으로 프로그램을 띄운다.
		SpringApplication.run(SpringStartApplication.class, args);
	}

}
