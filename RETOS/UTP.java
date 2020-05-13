package mayorOMenor;

import java.util.Scanner;

public class UTP {

	public static void main(String[] args) {
		int cate;
		double sue, tsue;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cual es su categortia y su sueldo");
		cate = scan.nextInt();
		sue =scan.nextDouble();
		switch (cate) {
			case 1:
				tsue = sue*1.15;
				System.out.println("su sueldo total sera: "+tsue);
				break;
			case 2:
				tsue = sue*1.10;
				System.out.println("su sueldo total sera: "+tsue);
				break;
			case 3:
				tsue = sue * 1.08;
				System.out.println("su sueldo total sera: "+tsue);
				break;
			case 4:
				tsue = sue * 1.07;
				System.out.println("su sueldo total sera: "+tsue);
				break;
			default :
				System.out.println("ERROR!");				
		}
	}
}
