package no.hvl.dat100;

public class Oppgave2 {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3},
						  {4, 5, 6}};
		int[][] matrix1 = {{2, 2, 3},
				  		   {4, 5, 6}};
		//A
		//skrivUtv1(matrix);
		//B
		//tilStreng(matrix);
		//C
		System.out.println(tilStreng(skalar(1, matrix)));
		//D
		System.out.println(erLik(matrix, matrix1));

	}
	public static void skrivUtv1(int[][] matrise) {
		String totListStr = "[";
		String listStrCut = "";
		for(int[] list:matrise) {
			String listStr = "";
			
			for (int i:list) {
				listStr += " ," + i;
			}
			listStrCut = listStr.substring(2,listStr.length());
			
			totListStr += "[" + listStrCut + "], \n";
			
		}
		String finalString = totListStr.substring(0,totListStr.length()-3);
		System.out.println(finalString + "]");
	}
	public static String tilStreng(int[][] matrise) {
		String totListStr = "{ ";
		String listStrCut = "";
		for(int[] list:matrise) {
			String listStr = "";
			
			for (int i:list) {
				listStr += " ," + i;
			}
			listStrCut = listStr.substring(2,listStr.length());
			
			totListStr += "{" + listStrCut + "}, ";
			
		}
		String finalString = totListStr.substring(0,totListStr.length()-2);
		//System.out.println(finalString + "}");
		return finalString + " }";
	}
	public static int[][] skalar(int tall, int[][] matrise) {
		int[][] skalarProdukt = new int[matrise.length][matrise[0].length];
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[0].length; j++) {
				skalarProdukt[i][j] = (matrise[i][j] * tall);
				//System.out.println(skalarProdukt[i][j]);
				//System.out.println(i + " " + j);
			}
		}
		return skalarProdukt;
	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
			for (int i = 0; i<mat1.length; i++) {
				for (int j = 0; j<mat1[0].length; j++) {
					if (mat1[i][j] != mat2[i][j]) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

}