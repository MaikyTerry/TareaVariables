package mayorOMenor;

import java.util.Scanner;

public class UTP {

	public static void main(String[] args) {
		int nota;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numeor entre 0 y 10");
		nota = scan.nextInt();

		switch (nota) {
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		case 3:
			System.out.println("TRES");
			break;
		case 4:
			System.out.println("CUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;
		case 6:
			System.out.println("SEIS");
			break;
		case 7:
			System.out.println("SIETE");
			break;
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
			System.out.println("NUEVE");
			break;
		case 10:
			System.out.println("EXCELENTE");
			break;

		}

	}
}
