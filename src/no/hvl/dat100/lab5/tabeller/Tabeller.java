package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		
		for (int t : tabell) {
			System.out.print(t + " "); 
		}
		
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String resultat="[";
        for(int i = 0; i < tabell.length; i++) {
            if(i == 0) {
                resultat += tabell[i];
            } else {
                resultat += "," + tabell[i];
            }
        }
        resultat += "]";
        return resultat;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum1 = 0;
		
		for (int i = 0; i < tabell.length; i++) {

			sum1 = sum1 + tabell[i];

		}
		
//		int sum2 = 0;
//		
//		int i = 0;
//		
//		while ( i < tabell.length ) { 
//			sum2 = sum2+tabell[i];
//			i++;
//		}
//		System.out.println();
//		
//		System.out.println("Summen av tallene i tabellen blir " + sum2 + ". " + "(Dette var while-løkke");
//		return sum2;
		
//		int sum3 = 0;
//		
//		for (int tall : tabell) {	
//			sum3 = sum3+tall;
//		}
//		System.out.println("Summen av tallene i tabellen blir " + sum3 + ". " + "(Dette var utvided for-løkke)");
//		return sum3;
		
		System.out.print("Summen av tallene i tabellen blir " + sum1 + ". " + "(Dette var vanlig for-løkke)");
		return sum1;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;	
			}

		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return i;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] omvendtTabell = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			int nyIndeks = tabell.length - i - 1;
			omvendtTabell[nyIndeks] = tabell[i];
		}
		return omvendtTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 0; i < tabell.length - 1; i++) {
			if(tabell[i] >= tabell[i+1]) {
				return false;
			}
		}
		return true;
		}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensattTabell = new int[tabell1.length + tabell2.length];
		for(int i = 0; i < tabell1.length; i++) {
			sammensattTabell[i] = tabell1[i];
		}
		for(int i = 0; i < tabell2.length; i++) {
			sammensattTabell[i + tabell1.length] = tabell2[i];
		}
		return sammensattTabell;
	}
}
