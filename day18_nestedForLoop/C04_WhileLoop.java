package day18_nestedForLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		
		// Kullanýcýdan toplanmak üzere sayi isteyin 
		// Kullanýcý sýfýra basýncaya kadar sayýlarý alýp
		// toplamaya devam edin
		// kullancý sýfýra bastýðýnda 
		// o ana kadar kaç sayý girdiðini ve girilen sayýlarýn toplamýný yazýn

		Scanner scan=new Scanner(System.in);
			
			int sayi=100;
			int toplam=0;
			int sayac=0;
			
			while (sayi!=0) {
				System.out.println("Sayý giriniz \nsonlandýrmak için sýfýra basýn");
				sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
			}
			
			System.out.println("Toplam "+(sayac-1)+" adet sayý girdiniz ve toplamlarý :"+toplam);
	
			scan.close();
	}

}
