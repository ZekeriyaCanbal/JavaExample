package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari3 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Yar� �ap uzunlu�unu giriniz :");
		double yaricap=scan.nextDouble();

		double alan=2*3.14*yaricap;
		double cevre=3.14*yaricap*yaricap;
		
		System.out.println("�emberin �evresi :"+cevre); //Form�l :2 * pi * Yar��ap
		System.out.println("Dairenin Alan� :"+alan); //Form�l :pi * Yar��ap karesi
}

}
