package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin ve 
		// bu sayiyi tam bolen sayilari ve 
		// toplam kac tane olduklarini ekranda yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen B�lenleri bulunacak say�y� giriniz");
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while(bolen<=sayi) {
			if(sayi%bolen==0) {
				System.out.print(bolen+" ");
				sayac++;
			}
			bolen++;
		}
		System.out.println();
		System.out.println(sayi+"'n�n toplam "+sayac+" adet b�leni vard�r.");
				

	}

}
