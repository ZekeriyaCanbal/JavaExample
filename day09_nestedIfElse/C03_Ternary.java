package day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		
		int x=10;
		String tekmiCiftmi=x%2==0 ? "�ift Say�d�r" : "Tek Say�d�r";
		System.out.println(tekmiCiftmi);
		
		x-=1;
		System.out.println(x%2==0 ? "�ift Say�d�r" : "Tek Say�d�r");
		
	}

}
