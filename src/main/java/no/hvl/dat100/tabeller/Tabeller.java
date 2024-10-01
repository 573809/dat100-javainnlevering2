package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tab = "["; 
		for (int i = 0; i < tabell.length; i++) {
			tab += String.valueOf(tabell[i]);
			if (i < tabell.length - 1) {
				tab += ",";
			} 	
		}	
		tab += "]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int i : tabell) {
			if (i == tall) {
				return true;
			} 
		}
		return false;
	}	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int a = 0;
		int b = -1;
		boolean h = true;
		
		while ( a < tabell.length && h) {
			for (int i : tabell) { 
				if (i == tall) {
					b = a;
					h = false;
				} else {
					a++; 
				}	
			}
		}
		return b;
	}

	// f)
	public static int[] reverser(int[] tabell) {
	        int[] motsett = new int[tabell.length];
	        for (int i = 0; i < tabell.length; i++) {
	            motsett[i] = tabell[tabell.length - 1 - i];
	        }
	        return motsett;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false; 
	            }
	        }
	        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] ny = new int[tabell1.length+tabell2.length];
		int a = 0;
		
		for (int i = 0; i < ny.length; i++) {
			if (i < tabell1.length) {
				ny[i] = tabell1[i];
			}  
			if (i >= tabell1.length) {
				ny[i] = tabell2[a];
				a++;
			}
		}
		return ny;
	}
	
//    public static int[] settSammen(int[] tabell1, int[] tabell2) {
//
//        int maksLengde = Math.max(tabell1.length, tabell2.length);
//
//        int[] saman = new int[maksLengde];
//
//        for (int i = 0; i < maksLengde; i++) {
//          
//            if (i < tabell1.length) {
//                saman[i] += tabell1[i]; 
//            }
//          
//            if (i < tabell2.length) {
//                saman[i] += tabell2[i];
//            }
//        }
//        return saman;
//    }
}
