package com.harsha.interpe2;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double RADIUS = sc.nextDouble();
		double Perimeter = (2*(Math.PI)*RADIUS);
		double area = Math.PI*RADIUS*RADIUS;
		System.out.println("perimeter is " + Perimeter);
		System.out.println("area is " + area);
	}
}

