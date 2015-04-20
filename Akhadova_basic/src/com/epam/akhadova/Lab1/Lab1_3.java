package com.epam.akhadova.Lab1;


//bubble_sort_inverted
public class Lab1_3 {
	
		public static void main(String [] args){
			
			int arr[] = {9,8,7,6,10,5,4,3,2,1};
			
			Bubble.sort(arr);
		}
		}

		class Bubble {
		public static void sort(int[] arr) {
		
			for (int barrier = 0; barrier < arr.length - 1; barrier++) {
				for (int index = arr.length - 1; index > barrier; index--) {
						if (arr[index] <arr[index - 1]) {
								int tmp = arr[index];
								arr[index] = arr[index - 1];
								arr[index - 1] = tmp;
		                }
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
