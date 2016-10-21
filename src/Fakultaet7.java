
public class Fakultaet7 {

	public static void main(String[] args) {
			int eingabe = 7;
			int loesung = 1;
			
			for (int zaehler = 2; zaehler <= eingabe; zaehler++) {
				loesung = loesung * zaehler;
			}
			
			System.out.println(
					"Die fakultät von " + eingabe + " ist " + loesung + "."
					);
	}
}

