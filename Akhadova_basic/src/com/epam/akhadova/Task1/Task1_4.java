package com.epam.akhadova.Task1;

public class Task1_4 {
	public static void main(String[] args) {
		
		String example = "qwerty";
		String input=null;

		    for (int i = 0; i < args.length; i++){
		       input = args[i];
		    } 
		   
		if (example.equals(input))	{
			System.out.println("the password is accepted!");}
		else System.out.println("incorrect password!");
		}
}
