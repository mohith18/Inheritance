package com.mohith.inherit;

public class Shape2Impl implements Shape2 {

	@Override
	public void area(int l, int b) {
		System.out.println(l * b);

	}

	@Override
	public void area(int r) {
		System.out.println(3.14 * r * r);

	}

} 
