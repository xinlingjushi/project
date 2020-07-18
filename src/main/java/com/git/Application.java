package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/**
 * 微服务应用服务启动类 
 * @author Windows10
 *
 */
@SpringBootApplication(scanBasePackages={"com.git","com.sgcc.uap.rest.annotation","com.sgcc.uap.mdd.runtime"})
public class Application {
	//update asdas aaa
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
