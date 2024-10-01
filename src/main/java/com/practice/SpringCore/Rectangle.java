package com.practice.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
	

	@Autowired
	@Qualifier("border")
	private Design design;

	public Design getDesign() {
		return design;
	}

	public void setDesign(Design design) {
		this.design = design;
	}


	public void draw()
	{
		
		design.display();
	}
}
