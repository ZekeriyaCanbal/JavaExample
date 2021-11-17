package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Karenin kenar uzunluðunu giriniz :");
		int kenar=scan.nextInt();
		
		System.out.println("Karenin alaný :"+(kenar*kenar));
		System.out.println("Karenin Çevresi :"+(4*kenar));
}

}
