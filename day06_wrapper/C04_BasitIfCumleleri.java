package day06_wrapper;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
        //         ve dikdortgenin kare olup olmadigini yazdirin
	
		Scanner scan=new Scanner (System.in);
		
		System.out.println("L�tfen Dikd�rtgenin Birinci kenar�n� griniz");
		double kenar1=scan.nextDouble();

		System.out.println("L�tfen Dikd�rtgenin Birinci kenar�n� griniz");
		double kenar2=scan.nextDouble();

		if(kenar1==kenar2) {
			System.out.println("Girilen dikd�rtgen karedir");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("Girilen dikd�rtgendir");
		}
		
	}

}
