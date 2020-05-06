package retos;
import java.util.Scanner;
public class Retos {
	static double num1, num2;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese dos números");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		if(num1<=num2) {
			System.out.println(num2+ "," + num1);
		}else {
			System.out.println(num1+ "," + num2);
		}
	}
}
