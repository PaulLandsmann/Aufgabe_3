package h2;

public class H2_main {

	public static void main(String[] args) {
		int jahr = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 10001);
		boolean schalt = false;
		
		if(jahr %4 == 0 && !(jahr %100 == 0) || jahr %400 == 0) {
			schalt = true;
		}
		else {
			schalt = false;
			
		}
		
		if(schalt == true && jahr >= 2025) System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
		if(schalt == true && jahr < 2025) System.out.println("Das Jahr " + jahr + " war ein Schaltjahr.");
		if(schalt == false && jahr >= 2025) System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr.");
		if(schalt == false && jahr < 2025) System.out.println("Das Jahr " + jahr + " war kein Schaltjahr.");


	}

}
