package day17_forLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("100'den k���k bir tamsay� giriniz.");
		int girilen=scan.nextInt();
		
		for (int i=1; i<=girilen; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("3'�n ve 5'in kat� oldu�u i�in : Java G�zeldir.");
			}else if(i%3==0) {
				System.out.println("3'�n kat� oldu�u i�in : Java");
			}else if (i%5==0) {
				System.out.println("5'in kat� oldu�u i�in : G�zeldir.");
			}else {
				System.out.println(i);
			}
			
		}
		
		scan.close();
	}

}
