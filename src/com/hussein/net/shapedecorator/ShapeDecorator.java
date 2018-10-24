package com.hussein.net.shapedecorator;

import com.hussein.net.decorator.Shape;

public abstract class ShapeDecorator implements Shape {

	
	protected Shape decoratedShape;
	
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
           decoratedShape.draw();
	}

}
