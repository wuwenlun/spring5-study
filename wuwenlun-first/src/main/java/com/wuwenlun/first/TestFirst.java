package com.wuwenlun.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 吴文伦
 * @date 2020/6/23 23:25
 */
public class TestFirst {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService service = context.getBean(TestService.class);
		System.out.println(service+"");
	}
}
