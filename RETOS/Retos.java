package retos;

import java.util.Scanner;

public class Retos {
	static int num1, num2;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese dos números");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		if ( num1 % num2 == 0) {
			System.out.println("Son multiplos");
		}else {
			System.out.println("no son multiplos");
		}
	}
}