package com.practice.SpringCore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Color implements Design {

	private String colorName;
	
	public String getColorName() {
		return "red";
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	public String toString()
	{
		return "yellow";
	}
	
	public void display()
	{
		System.out.println("The color is red");
	}
}
