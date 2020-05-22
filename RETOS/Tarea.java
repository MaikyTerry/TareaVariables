package tarea;
import java.util.Scanner;
public class Tarea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, promedio, sumpar, sumimpar, contador, num;
		x = 0;
		promedio = 0;
		contador = 0;
		sumimpar = 0;
		sumpar = 0;		
		System.out.println("Introduzca un número");
		num = scan.nextInt();
		while (x <= num) {
			x++;
			if (x % 2 == 0) {
				contador++;
				sumpar+= x;
				promedio = sumpar / contador;
			} else {
				sumimpar+= x;
			}
		}
		System.out.println("el promedio de los números pares es " + promedio);
		System.out.println("La suma de los números impares es " + sumimpar); 
	}
}
