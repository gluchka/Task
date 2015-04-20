package com.epam.akhadova.Lab1;

//selection_sort_optimized
public class Lab1_4 {
	
	public static void main(String [] args){
		
		int arr[] = {9,8,7,6,10,5,4,3,2,1};
		sort(arr);
		
	}
	
	
	
	public static void sort(int[] arr) {
		int in=0;
		
		for (int barrier = 0; barrier <arr.length - 1; barrier++) {
			int min = arr[barrier];
			in=barrier;
		//	for (int index = barrier + 1; index <arr.length; index++) {
				for (int index = in + 1; index <arr.length; index++) {
				System.out.print("min= "+ min+ "  arr=  "+arr[index]);
				if (arr[index]<min) {
					min = arr[index];
				in=index;
				} 
				System.out.println("     min= "+ min + "   in=  "+in);
		 }
			if(in!=0 || in!=barrier){
			int tmp = arr[in];
			arr[in] = arr[barrier];
			arr[barrier] = tmp;
			}
			for (int i : arr){
				System.out.print(i+ "  ");
			}
			System.out.println();
		 }
		for (int i : arr){
			System.out.print(i+ "  ");
		}
		    }
}
