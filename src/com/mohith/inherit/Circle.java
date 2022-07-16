package com.mohith.inherit;

import java.util.Scanner;

public class Circle extends Shape1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter r : ");
		int radius = sc.nextInt();
		Circle.area(radius);

	}
}
