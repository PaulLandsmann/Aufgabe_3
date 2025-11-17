package p3;

public class P3_main {

	public static void main(String[] args) {
		int zahl = -71;
		System.out.println(Math.abs(zahl));

		System.out.println(zahl * zahl);
		System.out.println(Math.pow(zahl, 2));
		
		if(zahl %2 == 0) {
			System.out.println("Zahl ist gerade");
		}
		else {
			System.out.println("Zahl ist ungerade");
		}
	}
}
