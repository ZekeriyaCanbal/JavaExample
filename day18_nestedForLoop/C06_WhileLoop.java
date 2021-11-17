package day18_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		
		// Kullanýcan Toplamak üzere sayýlar isteyin
		//sayi adeti 10' gecerse veya toplam 500 gecerse
		//"bu kadar sayý yeter"
		// ..... adet sayý girdin Toplamý ..... yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
			
			int sayi=100;
			int toplam=0;
			int sayac=0;
			
			while (toplam<500) {
				System.out.println("Sayý giriniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
			}
			
			System.out.println("Toplam "+(sayac)+" adet sayý girdiniz ve toplamlarý :"+toplam);
	
			scan.close();
	}

}
