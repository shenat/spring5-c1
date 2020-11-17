package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//一般推荐打包为jar包，jar包需要一个主类，这个就是
@SpringBootApplication//表明这是个spring应用，并且具有启动自动扫描，自动配置，还有类似@Configuration的功能
public class Spring5DemoApplication {

	public static void main(String[] args) {
		//这会创建应用上下文，第一个参数为配置类，第二个参数为命令行参数
		SpringApplication.run(Spring5DemoApplication.class, args);
	}

}
