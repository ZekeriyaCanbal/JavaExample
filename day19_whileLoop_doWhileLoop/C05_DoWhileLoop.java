package day19_whileLoop_doWhileLoop;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		// Soru 2 ) �m� harfinden baslayarak �c� harfine kadar tum harfleri yazdirin.

		// For loop ile yap�l���
		for (char i = 'm'; i >='c' ; i--) {
			
			System.out.print(i+" ");
		}
		System.out.println();
	
		// While loop ile yap�l���
		char a='m';
		while(a>='c') {
			System.out.print(a+" ");
			a--;
		}
		
		System.out.println();
		
		// Do While loop ile yap�l���
		char z='m';
		do {
			System.out.print(z+" ");
			z--;
		}while(z>='c');
	}

}
