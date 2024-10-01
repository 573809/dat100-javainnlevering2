package no.hvl.dat100.matriser;

public class Matriser {
	public static void main(String[] args) {
		int[][] tabell1 = {
				{1,2,3},
				{2,3,3},
				{2,3,3}
		};
		int[][] tabell2 = {
				{1,2,3},
				{2,3,3},
				{2,3,3},
		};
		
		int[][] t = multipliser(tabell1,tabell2);
		
		skrivUt(t);
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.print("[");
		for (int i = 0; i < matrise.length; i++) {
			System.out.print("[");
			for (int a = 0; a < matrise[i].length; a++) {
				if (a < matrise[i].length-1) {
					System.out.print(matrise[i][a]+",");
				} else {
					System.out.print(matrise[i][a] + "]");
				}
			}
			if (i < matrise.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String h = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int a = 0; a < matrise[i].length; a++) {
				h += matrise[i][a] + " ";
			}
			h += "\n";
		}
		return h;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] ny = new int[matrise.length][]; // Tabell som held same mengd med rekker.

		// Definerar lengda for kvar rekke.
		for (int a = 0; a < matrise.length; a++) {
		    ny[a] = new int[matrise[a].length]; // Lage ei ny rekke med same lengde. Den legg rekka inn i ny[a].
		}	
	
		for (int i = 0; i < matrise.length; i++) {
		    for (int b = 0; b < matrise[i].length; b++) {
		    	ny[i][b] = matrise[i][b]*tall; 
		    }
		}
		 return ny;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if (a.length != b.length) {
			return false;             
		}
		
		//Sidan den ikkje har returnert false veit vi at a og b har lik mengd rekker.
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
		}
		
		//Lengdene til rekkene er like lange.
		for (int f = 0; f < a.length; f++) {
			for (int j = 0; j < a[f].length; j++) {
				if (a[f][j] != b[f][j]) {
					return false;
				} 
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] ny = new int[matrise.length][];

		for (int a = 0; a < matrise.length; a++) {
		    ny[a] = new int[matrise[a].length];
		}
		
		int u = 0;
		int y = 0;
		
		for (int i = 0; i < matrise.length; i++) {
			for (int s = 0; s < matrise[i].length; s++) {
					ny[i][s] = matrise[u][y];
					u++;
			}
			u = 0;
			y++;
		}
		return ny;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] ny = new int [a.length][];
		
		for (int y = 0; y < a.length; y++) {   
			ny[y] = new int[a[y].length];		 //Kvifor kan eg ikkje skrive ny[y] = new int[b[y].length]; ?
		}										 //Etter definisjonen skal det vere rett å bruke matrise b sin lengde.
		
		for (int w = 0; w < a.length; w++) {     //For matrix multiplication, the number of columns 
			if (a[w].length != b.length) {       //in the first matrix must be equal to the number of rows 
				return ny; 						 //in the second matrix. The result matrix has the number of rows 
			} 									 //of the first and the number of columns of the second matrix.
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					ny[i][j] += a[i][k] * b[k][j];
				}
			}
		}
	return ny;
	}
}
