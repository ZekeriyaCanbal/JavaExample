package day17_forLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin 
		// ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		Scanner scan=new Scanner(System.in);

		System.out.println("10 'dan küçük deðer girin.");
		int sayi=scan.nextInt();

		int sayi1=1;
		System.out.print(sayi+"!=");
		for (int i=sayi; i>0; i--) {
			sayi1*=i;
			System.out.print(i+"*");
		}
		System.out.println("="+sayi1);
	}

}
