package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {

		topla(2,4,3,5);
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("Dört Sayýnýn toplamý : "+(sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("Üç Sayýnýn toplamý : "+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, int sayi2) {

		System.out.println("Ýki Sayýnýn toplamý : "+(sayi1+sayi2));
		
	}

}
