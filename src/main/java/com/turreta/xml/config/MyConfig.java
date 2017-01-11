package com.turreta.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;

@Configuration
public class MyConfig
{
	@Bean
	SpringResourceTemplateResolver xmlTemplateResolver(ApplicationContext appCtx) {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();

		templateResolver.setApplicationContext(appCtx);
		templateResolver.setPrefix("classpath:/templates/");
		templateResolver.setSuffix(".xml");
		templateResolver.setTemplateMode("XML");
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setCacheable(false);

		return templateResolver;
	}

	@Bean(name="springTemplateEngine")
	SpringTemplateEngine templateEngine(ApplicationContext appCtx) {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(xmlTemplateResolver(appCtx));
		return templateEngine;
	}
}