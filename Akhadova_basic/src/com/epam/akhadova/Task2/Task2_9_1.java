package com.epam.akhadova.Task2;

import java.util.Arrays;


//Упорядочить строки (столбцы) матрицы в порядке возрастания значений.

public class Task2_9_1 {
//	static int[][] mas = { { 1, 2, 3, 4 }, { -12, 4, 231, 17 },{124,5476,-54,12},{34,4,342,5} };
//
//	public static void main(String[] args) {
//		increaseRow(mas);
//		increaseColumn(mas);
//	}

	public static void increaseRow(int [][] mas){
	for (int i = 0; i < mas.length; i++, System.out.println()) {
		Arrays.sort(mas[i]);
		for (int j = 0; j < mas[i].length; j++) {
			System.out.print(mas[i][j] + "   ");
		}
	}
	}
	
	public static void increaseColumn(int [][] mas){
				
		int temp;
		  System.out.println();
		  for (int i = 0; i < mas.length; i++) {
		   for (int k=0;k<mas.length; k++)
		    for (int j = 0; j < mas.length-1; j++) {
		    
		     if(mas[j][i]>mas[j+1][i]){
		      temp=mas[j][i];
		      mas[j][i]=mas[j+1][i];
		      mas[j+1][i] = temp;
		    }
		    
		   }
		  }	
		for (int i = 0; i < mas.length; i++, System.out.println()) {
			for (int j = 0; j < mas.length; j++) {
			System.out.print(mas[i][j] + "   ");
			}
		}
		}
	
}