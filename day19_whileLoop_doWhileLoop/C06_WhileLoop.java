package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
	/*
	Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
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
			System.out.println("Lütfen þifrenizi Giriniz.");
			sifre=scan.nextLine();
			kuHarfKont=kucukHarfKontrol(sifre);
			buHarfKont=buyukHarfkontrol(sifre);
			ozelKaKont=ozelkarakterKontrol(sifre);
			uKont=uzunlukKontrolu(sifre);
			
		}while(!kuHarfKont || !buHarfKont || !ozelKaKont || !uKont);

		System.out.println("Þifreniz Baþarýlýdýr.");
		scan.close();
	}

	private static boolean uzunlukKontrolu(String sifre) { // uznluk kontrolü yapar
		boolean uKont=false;
		if (sifre.length()>=8) {
			uKont=true;
		} else {
			System.out.println("Þifreniz en az 8 kaarktereli olmalýdýr.");
		}
		
		return uKont;
	}
	
	

	private static boolean ozelkarakterKontrol(String sifre) { // Özel Karakter Kontrolü Yapar
		boolean ozelKaKont=false;
		
		String harfler=".,;@!'^%&/()=?_|/*}][{½$#£><~";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				ozelKaKont=true;
				break;
			}
		}
		
		if (!ozelKaKont) {
			System.out.println("Þifrenizde en az bir adet özel karakter olmalýdýr.");
		}
		
		return ozelKaKont;
	}
	

	private static boolean buyukHarfkontrol(String sifre) { // Büyük Harf Kontrolü Yapar
		boolean buHarfKont=false;
		String harfler="ABCÇDEFGÐHIÝJKLMNOÖPRSÞTUÜVYZXQW";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				buHarfKont=true;
				break;
			}
		}
		
		if (!buHarfKont) {
			System.out.println("Þifrenizde en az bir adet BÜYÜK harf olmalýdýr.");
		}
		
		return buHarfKont;
		
	}

	private static boolean kucukHarfKontrol(String sifre) { // Küçük Harf Kontrolü Yapar
		
		boolean kuHarfKont=false;
		String harfler="abcçdefgðhýijklmnoöprsþtuüvyzxqw";
		
		for (int i = 0; i < sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				kuHarfKont=true;
				break;
			}
		}
		
		if (!kuHarfKont) {
			System.out.println("Þifrenizde en az bir adet küçük harf olmalýdýr.");
		}
		
		return kuHarfKont;
	}

}
