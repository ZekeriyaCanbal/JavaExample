package day16_forLoop;

import java.util.Scanner;

public class C07_ForLoop {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("100'den k���k bir tamsay� giriniz.");
		double girilen=scan.nextDouble();
		int sayi=(int) girilen;
		
		if (girilen<0) {
			System.out.println("negatif say� girmek yok. ");
		} else if (sayi!=girilen) {
			System.out.println("Tam say� giriniz");
		} else if (sayi>100) {
			System.out.println("L�tfen 100'den k���k say� giriniz");
		}else {
			for (int i=1; i<=girilen; i++) {
				if (i%3==0 || i%5==0) {
					if (i%3==0) {
						System.out.println(i+" --> 3 �n kat�d�r ");	
					}else {
						System.out.println(i+" --> 5 in kat�d�r ");
					}
				}
			}
			
		}
			
		scan.close();
	}

}
