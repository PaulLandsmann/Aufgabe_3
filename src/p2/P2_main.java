package p2;

public class P2_main {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 20;
		int d = 0;
		
		boolean E1 = a == b;
		boolean E2 = a == b || a == c;
		boolean E3 = a + b >= c;
		boolean E4 = a + b + c >= 100;
		
		
		if (E1) d++;
		if (E2) d++;
		if (E3) d++;
		if (E4) d++;

		System.out.println("Anzahl richtiger Eigenschaften: " + d);
	}

}
