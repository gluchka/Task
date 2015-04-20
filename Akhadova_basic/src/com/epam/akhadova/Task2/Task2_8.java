package com.epam.akhadova.Task2;
import java.util.Scanner;

//¬ывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
public class Task2_8 {

	// static int [] mas ={2345,98,777};
	public static void main(String[] args) {

		mass(input());

	}

	public static int input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimension of the array ");
		int a = in.nextInt();// считываем целое число
		in.close();
		return a;
	}

	public static void mass(int a) {
		int[][] array = new int[a][a];
		int y = 1;
		for (int i = 0; i < a ; i++) {
			for (int j = 0; j < a ; j++) {
				array[i][j] = y;
				y++;
			}
		}

		for (int i = 0; i < a ; i++, System.out.println()) {
			for (int j = 0; j < a ; j++) {
				System.out.print(array[i][j]+" ");
			}
		}
	}

}

