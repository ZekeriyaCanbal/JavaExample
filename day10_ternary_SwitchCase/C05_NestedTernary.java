package day10_ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		
		char cinsiyet='K';
		int yas=57;
		
		String sonuc = cinsiyet=='K' ? (yas>60 ? "Emekli olabilirsin":"Emekli olamazsýn") : (yas>65 ? "Emekli olabilirsin":"emekli olmazsýn") ; 

		System.out.println(sonuc);
	}

}
