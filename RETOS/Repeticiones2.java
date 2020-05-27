package unidad2;

import java.util.Scanner;

public class Repeticiones2 {

	public static void main(String[] args) {
		int num, num1, sum, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese la cantidad de numeros a sumar");
		num = scan.nextInt();
		sum = 0;
		i =0;
		// num = 1;
		do {
			System.out.println("ingrese numero");
			num1 = scan.nextInt();
			sum = sum + num1;// acumulador
			i++;
		} while (i != num);
		System.out.println("la suma de sus numeros ingresados es: " + sum);
	}

}
