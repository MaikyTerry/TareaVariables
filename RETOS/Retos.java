package retos;

import java.util.Scanner;

public class Retos {
	static int num1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 9999");
		num1 = scan.nextInt();
		if (num1<10){
			System.out.println("El numero tiene una cifra");
		}else {
			if (num1<100) {
				System.out.println("El numero tiene dos cifra");
			}else {
				if (num1<1000) {
					System.out.println("El numero tiene tres cifra");
				}else {
					if (num1<10000) {
						System.out.println("El numero tiene cuatro cifras");
					}
				}
			}
		}
	}
}