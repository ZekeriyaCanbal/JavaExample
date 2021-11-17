package day17_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

	// Kullanicidan iki sayi isteyin. 
	// Girilen sayilar ve aralarindaki tum tamsayilari toplayip, 
	// sonucu yazdiran bir program yaziniz
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Birinci sayiyi girin.");
		int sayi1=scan.nextInt();
		
		System.out.println("Ýkinci sayiyi girin.");
		int sayi2=scan.nextInt();
		
		int kucuk=0;
		int buyuk=0;
		
		kucuk=sayi1;
		buyuk=sayi2;
		
		int sonuc=0;
		
		for (int i=sayi1; i<=sayi2; i++) {
			
			sonuc+=i;
			
			System.out.println(sonuc);
		}
		
		
		scan.close();
		
	}

}
