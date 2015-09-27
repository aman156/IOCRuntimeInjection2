package com.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.impl.BlankDisc;
import com.interfaces.CompactDisc;

@Configuration
@PropertySource("classpath:/app.properties")
public class ExpressiveConfig1 {

	@Value("${disc.title}")
	private String title;
	@Value("${disc.artist}")
	private String artist;
	
	@Bean
	public CompactDisc disc()
	{
		
		return new BlankDisc(  title,artist );
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
}
