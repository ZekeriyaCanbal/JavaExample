package day18_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		
		// Kullan�can Toplamak �zere say�lar isteyin
		//sayi adeti 10' gecerse veya toplam 500 gecerse
		//"bu kadar say� yeter"
		// ..... adet say� girdin Toplam� ..... yazd�r�n.
		
		Scanner scan=new Scanner(System.in);
			
			int sayi=100;
			int toplam=0;
			int sayac=0;
			
			while (toplam<500) {
				System.out.println("Say� giriniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
			}
			
			System.out.println("Toplam "+(sayac)+" adet say� girdiniz ve toplamlar� :"+toplam);
	
			scan.close();
	}

}
