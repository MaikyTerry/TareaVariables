package mayorOMenor;

import java.util.Scanner;

public class UTP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		double num = scan.nextDouble();
		if (num < 0) {
			System.out.println("negativo");
		} else {
			if (num > 0) {
				System.out.println("positivo");
			} else {
				System.out.println("NEUTRO");
			}
		}
	}
}
