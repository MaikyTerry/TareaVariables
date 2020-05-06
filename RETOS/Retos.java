package retos;
import java.util.Scanner;
public class Retos {
	static double num1, num2, num3;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese tres números");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		if(num1>num2 && num2>num3) {
			System.out.println(num1+" y "+num2+" y "+num3);
		}else{
			if(num1>num3 && num3>num2) {
			System.out.println(num1+" y "+num3+" y "+num2);
		}else{
			System.out.println(num3+" y "+num2+" y "+num1);
			if(num2>num1 && num1>num3) {
				System.out.println(num2+" y "+num1+" y "+num3);
			}else {
				if(num2>num3 && num3>num1) {
					System.out.println(num2+" y "+num3+" y "+num1);
				}else {
					if(num3>num1 && num1>num2) {
						System.out.println(num3+" y "+num1+" y "+num2);
					}else {
						if(num3>num2 && num2>num1) {
							System.out.println(num3+" y "+num2+" y "+num1);
						}
					}
				}
			}
			}
		}
	}
}	