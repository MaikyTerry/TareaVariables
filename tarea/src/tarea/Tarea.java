package tarea;
import java.util.*;
public class Tarea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre completo");
		String nombre = scan.next();
		Scanner ed = new Scanner(System.in);
		System.out.println("Ingrese su edad");
		int edad = ed.nextInt();
		Scanner pre = new Scanner(System.in);
		System.out.println("Ingrese cuanta cantidad de dinero tiene en el banco");
		double precio = pre.nextDouble();
		System.out.println("- Su nombre es "+nombre+"\n- Usted tiene "+edad+" años"+"\n- Usted tiene "+precio+"$ en el banco");

	}

}
