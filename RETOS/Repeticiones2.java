package unidad2;
import java.util.Scanner;
public class Repeticiones2 {

	public static void main(String[] args) {
		int num, i;
		Scanner scan = new Scanner(System.in);
		i = 0;
		//num = 1;
		do {
			System.out.println("ingrese un numero");
			num = scan.nextInt();
			//num=num+1;//contador
			i=i+num;//acumulador
			if (num == 0)
				System.out.println(i);
		}
		while(num > 0);
		
	}

}
