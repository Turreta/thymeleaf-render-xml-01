package com.turreta.test;

import org.mockito.Mockito;
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
		return Mockito.mock(SpringResourceTemplateResolver.class);
	}

	@Bean(name="springTemplateEngine")
	SpringTemplateEngine templateEngine(ApplicationContext appCtx) {
		return Mockito.mock(SpringTemplateEngine.class);
	}
}