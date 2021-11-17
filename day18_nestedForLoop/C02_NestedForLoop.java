package day18_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		System.out.println("10 dan küçük bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<10 && sayi>0) {
		
			for (int satir = 1;  satir<= sayi; satir++) {

				for (int i = 1; i <= satir; i++) {
					System.out.print(i+" ");		
					
				}
				System.out.println("");
			}
		}else {
			System.out.println("10 dan küçük bir pozitif tamsayi giriniz");
		}
		scan.close();
	}

}
