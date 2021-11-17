package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
	/*
	Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde �Sifreniz Kabul edilmistir� yazdirin.
	 - Sifre kucuk harf icermelidir
	 - Sifre buyuk harf icermelidir
	 - Sifre ozel karakter icermelidir
	 - Sifre en az 8 karakter olmalidir.
	*/

		Scanner scan=new Scanner(System.in);
		String sifre="";
		boolean kuHarfKont=false;
		boolean buHarfKont=false;
		boolean ozelKaKont=false;
		boolean uKont=false;
				
		do {
			System.out.println("L�tfen �ifrenizi Giriniz.");
			sifre=scan.nextLine();
			kuHarfKont=kucukHarfKontrol(sifre);
			buHarfKont=buyukHarfkontrol(sifre);
			ozelKaKont=ozelkarakterKontrol(sifre);
			uKont=uzunlukKontrolu(sifre);
			
		}while(!kuHarfKont || !buHarfKont || !ozelKaKont || !uKont);

		System.out.println("�ifreniz Ba�ar�l�d�r.");
		scan.close();
	}

	private static boolean uzunlukKontrolu(String sifre) { // uznluk kontrol� yapar
		boolean uKont=false;
		if (sifre.length()>=8) {
			uKont=true;
		} else {
			System.out.println("�ifreniz en az 8 kaarktereli olmal�d�r.");
		}
		
		return uKont;
	}
	
	

	private static boolean ozelkarakterKontrol(String sifre) { // �zel Karakter Kontrol� Yapar
		boolean ozelKaKont=false;
		
		String harfler=".,;@!'^%&/()=?_|/*}][{�$#�><~";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				ozelKaKont=true;
				break;
			}
		}
		
		if (!ozelKaKont) {
			System.out.println("�ifrenizde en az bir adet �zel karakter olmal�d�r.");
		}
		
		return ozelKaKont;
	}
	

	private static boolean buyukHarfkontrol(String sifre) { // B�y�k Harf Kontrol� Yapar
		boolean buHarfKont=false;
		String harfler="ABC�DEFG�HI�JKLMNO�PRS�TU�VYZXQW";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				buHarfKont=true;
				break;
			}
		}
		
		if (!buHarfKont) {
			System.out.println("�ifrenizde en az bir adet B�Y�K harf olmal�d�r.");
		}
		
		return buHarfKont;
		
	}

	private static boolean kucukHarfKontrol(String sifre) { // K���k Harf Kontrol� Yapar
		
		boolean kuHarfKont=false;
		String harfler="abc�defg�h�ijklmno�prs�tu�vyzxqw";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				kuHarfKont=true;
				break;
			}
		}
		
		if (!kuHarfKont) {
			System.out.println("�ifrenizde en az bir adet k���k harf olmal�d�r.");
		}
		
		return kuHarfKont;
	}

}
