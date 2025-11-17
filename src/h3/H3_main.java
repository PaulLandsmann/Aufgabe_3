package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int max = 523;
		int fix = 275;
		int wartend = 304;
		boolean istVoll = false;
		int frei = max - fix;
		
		if(!(max == fix) && !(wartend == 0)) {
			 
			 
			 if(frei > wartend) {
				 fix = fix + wartend ;
				 frei = frei - wartend;
				 wartend = 0;
				 istVoll = false;
			 }
			 else {
				 fix = fix + frei;
				 wartend = wartend - frei;
				 istVoll = true;
			 }	 
			 
		}
		
		
		if(max == fix || istVoll) {
			System.out.println("Die Veranstalltung ist leider bereits Ausgebucht. Es warten noch " + wartend + " Personen auf einen Platz");
		}
		else {
			System.out.println("Es sind noch " + frei + " Plätze frei.");
		}

	}

}
