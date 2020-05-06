package ejercicios;
import java.util.Scanner;
public class Ejmpls {
	public static void main(String[] args) {
//		byte b=6;
//		short s=b;
//		System.out.println(s);
//		//-------------------------
//		b=(byte)s;
//		System.out.println(b);
//		//---------------------------
//		int i=1;
//		double d=i;
//		System.out.println(d);
//		
//		i=(int)d;
//		System.out.println(i);
////		--------------------------
//		int codigo=97;
//		char codigoAscii=(char)codigo;
//		System.out.println(codigoAscii);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Cual es el radio del circulo?");
//		int radio = scan.nextInt();
//		double area = 3.14*(Math.pow(radio,2));
//		System.out.println("el area es: "+area);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Ingrese dos números");
//		int num1, num2;
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		if (num1 == num2) {
//			System.out.println("son iguales");
//		}else {
//			System.out.println("no son iguales");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		double num=scan.nextDouble();
		if(num<0) {
			System.out.println("negativo");
		}else {
			System.out.println("positivo");
		}
		
	}
}