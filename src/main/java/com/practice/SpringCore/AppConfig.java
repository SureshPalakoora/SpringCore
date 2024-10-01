package com.practice.SpringCore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.practice.SpringCore")
public class AppConfig {

	/*
	 * @Bean public Shape getRectangle() { return new Rectangle(); }
	 * 
	 * @Bean public Shape getTriangle() { return new Triangle(); }
	 * 
	 * @Bean public Color getColor() { return new Color(); }
	 */
}
