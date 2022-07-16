package com.mohith.inherit;

public class Shape1 {

	int length;
	int breadth;
	int radius;
	float base;
	float height;

	public static void area(short length, short breadth) {
		System.out.println(length * breadth);
	}

	public static void area(int radius) {
		System.out.println(3.14 * radius * radius);
	}

	public void area2(int length, int breadth) {
		System.out.println(length * breadth);
	}
	public static  void area3(float base, float height) {
		System.out.println((0.5) * base * height);
	}
}
