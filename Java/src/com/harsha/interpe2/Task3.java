//Write a program to print the area and perimeter of a rectangle. 

//Width = 5.5 Height = 8.5

package com.harsha.interpe2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the width");
		double width = sc.nextDouble();
		
		System.out.println("enter the height");
		double height = sc.nextDouble();
		
		double area = height*width;
		double perimeter = 2*(height + width);
		
		System.out.println("area is: "+area);
		System.out.println("perimeter is : "+perimeter);

	}

}
