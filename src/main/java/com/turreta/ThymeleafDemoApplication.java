package com.turreta;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

@SpringBootApplication
public class ThymeleafDemoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ThymeleafDemoApplication.class, args);

		// We used "springTemplateEngine" to name our SpringTemplateEngine
		SpringTemplateEngine engine = (SpringTemplateEngine)appContext.getBean("springTemplateEngine");

		Map<String, String> pinfo = new HashMap<>();
		Context context = new Context();
		context.setVariable("pinfo", pinfo);
		pinfo.put("lastname", "Jordan");
		pinfo.put("firstname", "Michael");
		pinfo.put("country", "USA");

		/*
		 *  Use a particular template passing the context that has
		 *  the values for the place-holders.
		 */
		String content = engine.process("person-details", context);

		// Rendered XML
		System.out.println(content);
	}
}
