//Write a  program that takes three numbers as input to calculate and print the average of the numbers.

package com.harsha.interpe2;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number : ");
		double a = sc.nextDouble();
		
		System.out.println("Second number : ");
		double b = sc.nextDouble();
		
		System.out.println("Third number : ");
		double c = sc.nextDouble();
		
		double average = (a+b+c)/3;
		
		System.out.println("average is : "+ average);
	}

}
