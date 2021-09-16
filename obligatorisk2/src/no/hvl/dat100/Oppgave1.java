package no.hvl.dat100;

public class Oppgave1 {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4};
		int[] list1 = {2, 5, 3, 7};

		//A
		skrivUt(list);
		//B
		System.out.println(tilStreng(list));
		//C
		System.out.println(summer(list));
		//D
		System.out.println(finnesTall(list, 8));
		//E
		System.out.println(posisjonTall(list, 2));
		//F
		skrivUt(reverser(list));
		//G
		System.out.println(erSortert(list));
		//H
		skrivUt(settSammen(list, list1));
	}
	//A
	public static void skrivUt(int[] tabell) {
		String string = "";
		for (int i:tabell) {
			string += " ," + i;
		}
		String stringCut = string.substring(2,string.length());
		System.out.println("[" + stringCut + "]");
	}
	//B
	public static String tilStreng(int[] tabell) {
		String string = "";
		for (int i:tabell) {
			string += "," + i;
		}
		String stringCut = string.substring(1,string.length());
		return "[" + stringCut + "]";
	}
	//C
	public static int summer(int[] tabell) {
		int sumFor = 0;
		int sumWhile = 0;
		int sumUtvidedFor = 0;
		int teller = 0;
		for (int i = 0; i<tabell.length + 1; i++) {
			sumFor += i;
		}
		while (teller < tabell.length) {
			sumWhile += tabell[teller];
			teller+=1;
		}
		for (int i:tabell) {
			sumUtvidedFor += i;
		}
		System.out.println(sumFor + ", " + sumWhile + ", " + sumUtvidedFor); //Viser at alle løkkene fungerer
		return sumFor;
	}
	//D
	public static boolean finnesTall (int[] tabell, int tall) {
		for (int i:tabell) {
			if (i == tall) {
				return true;
			}
		}
		return false;
	}
	//E
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}
	//F
	public static int[] reverser(int[] tabell) {
		int[] revTabell = new int[tabell.length];
		for (int i = 0; i<tabell.length; i++) {
			revTabell[i] = tabell[tabell.length-i-1];
		}
		return revTabell;
	}
	//G
	public static boolean erSortert (int[] tabell) {
		for (int i = 1; i<tabell.length; i++) {
			if (tabell[i]<tabell[i-1]) {
				return false;
			}
		}
		return true;
	}
	//H
	public static int[] settSammen(int[] tabell, int[] tabell1) {
		int[] nyTabell = new int[tabell.length + tabell1.length];
		for (int i = 0; i<tabell.length;i++) {
			nyTabell[i] = tabell[i];
		}
		for (int i = 0; i<tabell1.length;i++) {
			nyTabell[i+tabell.length] = tabell1[i];
		}
		return nyTabell;
	}
}
