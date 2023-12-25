package application;

import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		input.close();
	}

}
