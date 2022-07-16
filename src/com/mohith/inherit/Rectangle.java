package com.mohith.inherit;

import java.util.Scanner;

public class Rectangle extends Shape1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter length : ");
		System.out.println("Enter breadth : ");
		int length = s.nextInt();
		int breadth =s1.nextInt();
		Rectangle.area(length, breadth);

		
	}
}

