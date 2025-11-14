package p1;

public class P1_main {

	
	public static void main(String[] args) {
		int wuerfel = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 7);
		
		if(wuerfel == 1 || wuerfel == 4) {
			System.out.print("Gewonnen!");
			
		}
		
		if(wuerfel == 2) {
			System.out.print("Verloren!");
		}
		
		if(wuerfel == 5) {
			System.out.print("Unentschieden!");
		}
		
		if(wuerfel == 3 || wuerfel == 6) {
			System.out.print("Unklar!");
		}
	}

}
