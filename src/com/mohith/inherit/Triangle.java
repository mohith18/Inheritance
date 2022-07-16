package com.mohith.inherit;

import java.util.Scanner;
public class Triangle extends Shape1 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Scanner t1= new Scanner(System.in);
		System.out.println("enter base :");
		System.out.println("enter height : ");
		float base = t.nextFloat();
		float height =t1.nextFloat();
		Triangle.area3(base, height);
	}
}
