package day17_forLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("100'den küçük bir tamsayý giriniz.");
		int girilen=scan.nextInt();
		
		for (int i=1; i<=girilen; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("3'ün ve 5'in katý olduðu için : Java Güzeldir.");
			}else if(i%3==0) {
				System.out.println("3'ün katý olduðu için : Java");
			}else if (i%5==0) {
				System.out.println("5'in katý olduðu için : Güzeldir.");
			}else {
				System.out.println(i);
			}
			
		}
		
		scan.close();
	}

}
