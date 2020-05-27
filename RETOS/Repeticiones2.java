package unidad2;

import java.util.Scanner;

public class Repeticiones2 {

	public static void main(String[] args) {
		int alum, edad, sum, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese la cantidad DE ALUMNOS");
		alum = scan.nextInt();
		sum = 0;
		i = 0;
		// num = 1;
		do {
			System.out.println("ingrese la edad del alumno");
			edad = scan.nextInt();
			sum = sum + edad;// acumulador
			i++;
		} while (i != alum);
		System.out.println("la suma de sus numeros ingresados es: " + (sum)/alum);
	}

}
