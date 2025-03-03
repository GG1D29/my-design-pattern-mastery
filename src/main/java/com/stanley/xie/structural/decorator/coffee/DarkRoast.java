package com.stanley.xie.structural.decorator.coffee;

public class DarkRoast implements Beverage {

	@Override
	public String getDescription() {
		return "Dark Roast Coffee";
	}

	public double cost() {
		return .99;
	}
}

