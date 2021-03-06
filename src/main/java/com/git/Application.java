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
	//ssh commit master
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
