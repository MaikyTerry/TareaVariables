package mayorOMenor;

import java.util.Scanner;

public class UTP {

	public static void main(String[] args) {
		int sueldo;
		double ns, sf;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su sueldo");
		sueldo = scan.nextInt();
		if (sueldo<1000) {
			ns=sueldo*0.15;
			sf=sueldo +ns;
			System.out.println("Su sueldo nuevo sueldo sera: "+sf);
		}else
			System.out.println("su sueldo es el mismo: "+sueldo);
		
	}
}
