package com.practice.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Border implements Design {


	private  int linewidth;

	public int getLinewidth() {
		return linewidth;
	}

	public void setLinewidth(int linewidth) {
		this.linewidth = linewidth;
	}
	
	
	public void display()
	{
		System.out.println("The linewidth is 2");
	}
	
}
