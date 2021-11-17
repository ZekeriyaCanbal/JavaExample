package day03_Variables;

import java.util.Scanner;

public class Soru_Cevaplari3 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Yarý Çap uzunluðunu giriniz :");
		double yaricap=scan.nextDouble();

		double alan=2*3.14*yaricap;
		double cevre=3.14*yaricap*yaricap;
		
		System.out.println("Çemberin çevresi :"+cevre); //Formül :2 * pi * Yarýçap
		System.out.println("Dairenin Alaný :"+alan); //Formül :pi * Yarýçap karesi
}

}
