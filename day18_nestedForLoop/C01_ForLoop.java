package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi isteyin
        // ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
        // (ikinci sayi dahil olmak zorunda degil)

		Scanner scan=new Scanner(System.in);

		System.out.println("Birinci sayý giriniz");
		int sayi1=scan.nextInt();

		System.out.println("Ýkinci sayýyý giriniz");
		int sayi2=scan.nextInt();

		
		if ( sayi1 < sayi2 ) {
			for ( int a=sayi1; a<=sayi2; a+=3) {
				System.out.print(a+" ");
			}
		}else if(sayi1>sayi2) {
			for (int a=sayi1; a>=sayi2; a-=3) {
				System.out.print(a+" ");
			}
		}else {
			System.out.println("Sayýlarý ayný yazdýnýz.");
		}
		scan.close();
	}	

}
