package com.practice.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Shape shape = (Shape)
		 * context.getBean("rectangle");
		 */
		 
			  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
			  Shape shape=(Shape) context.getBean(Rectangle.class);
              shape.draw();
       
    }
}
