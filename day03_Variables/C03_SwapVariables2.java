package day03_Variables;

public class C03_SwapVariables2 {

	public static void main(String[] args) {

		int sayi1=10;
		int sayi2=20;
		
		sayi1=sayi1-sayi2;
		sayi2=sayi1+sayi2;
		sayi1=sayi2-sayi1;
		
		
		
		System.out.println("Say� 1 : "+sayi1 + " ve Say� 2 : "+sayi2);		

	}

}
