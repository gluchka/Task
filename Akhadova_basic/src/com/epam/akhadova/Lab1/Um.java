package com.epam.akhadova.Lab1;

public class Um {
	static void multiply(int[][] mas1, int[][] mas2) {if (mas1[0].length != mas2.length || mas1.length == 0|| mas2.length == 0 || mas1 == null || mas2 == null)
			throw new IllegalArgumentException();
		int rows = mas1.length;
		int columns = mas2[0].length;
		int[][] arrRes = new int[rows][columns];
		for (int vRow = 0; vRow < mas1.length; vRow++) {

			for (int i = 0; i < mas2[0].length; i++) {
				int value = 0;
				for (int j = 0; j < mas1[i].length; j++) {
					if (mas1[vRow].length != mas2[j].length)
						throw new IllegalArgumentException();
					value += mas1[vRow][j] * mas2[j][i];
				}
				arrRes[vRow][i] = value;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arrRes[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
