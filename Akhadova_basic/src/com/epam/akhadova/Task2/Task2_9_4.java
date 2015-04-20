package com.epam.akhadova.Task2;

//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
public class Task2_9_4 {

//	static int[][] mas = { { 4,8,6,8 }, { 10,-4,-1,-7 },
//			{ 7,2,-4,8 }, { 9,4,-7,3} };
//
//	public static void main(String[] args) {
//		summElem(mas,4);
//	}

	public static void summElem(int[][] mas,int n) {
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas[i].length - 1; j++) {
				if (mas[i][j] > 0 && mas[i][j + 1] < 0) {
					while (mas[i][j + 1] < 0 && mas[i][n-1] > 0) {
						sum += mas[i][j + 1];
						j++;
					}
					if(sum == 0 ) break;
					else {System.out.println( " Row " + (i + 1) + " = " + sum + " ");
					break;
					}
				}
			}

		}
	}
}
