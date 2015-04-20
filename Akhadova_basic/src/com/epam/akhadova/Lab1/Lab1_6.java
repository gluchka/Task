package com.epam.akhadova.Lab1;

public class Lab1_6 {

	public static void main(String[] args) {
		
		int [][] mas1 = {{2,3,4},{3,4,5},{5,6,7}};
		int [][] mas2 = {{2,3,4},{3,4,8},{5,6,7}};
	
		try
		{
		Um.multiply(mas1, mas2);
		} catch(Exception e)
		{
			System.out.println("обработка исключения");
		}
	}

}
