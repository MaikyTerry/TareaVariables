package retos;
import java.util.Scanner;
public class Retos {
	static int num;	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		System.out.println("Ingrese un número");
		num = scan.nextInt();
		if (num < 0) {
			System.out.println("Su numero es negativo");
		}else {
			System.out.println("Su numero es positivo");
		}
	}	
}	