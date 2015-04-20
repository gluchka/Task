package com.epam.akhadova.Task2;

// ¬ыполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).

public class Task2_9_2 {

	static int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	public static void main(String [] args)
	{
		
		shiftLeft(arr,1);
		print(arr);
		System.out.println();
		shiftRight(arr,1);
		print(arr);
		System.out.println();
		shiftUp(arr, 1);
		print(arr);
		System.out.println();
		shiftDown(arr,1);
		print(arr);
		
	}
	public static int[][] shiftLeft(int[][] arr, int k) {
        if (k > 0)
            for (int i = 0; i < k; i++) {
                arr = shiftLeft(arr);
            }
 
        return arr;
    }
    
    public static int[][] shiftLeft(int[][] arr) {
       for(int i=0; i<arr.length; i++){
    	int tmp = arr[i][0];
        for (int j = 0; j < arr.length-1; j++) {
            arr[i][j]=arr[i][j+1];
        }
        
        arr[i][arr.length - 1] = tmp;
       }
        return arr;
    }
    public static int[][] shiftRight(int[][] arr, int k) {
        if (k > 0)
            for (int i = 0; i < k; i++) {
                arr = shiftRight(arr);
            }
 
        return arr;
    }
 
    public static int[][] shiftRight(int[][] arr) {
    	for(int i=0; i<arr.length; i++){
        	int tmp = arr[i][arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[i][j]=arr[i][j-1];
           }
            
            arr[i][0] = tmp;
           
        }
        return arr;
    }
   
    public static int[][] shiftUp(int[][] arr, int k){
        for (int i = 0; i < k; i++) {
            arr = shiftUp(arr);
        }
        return arr;
    }
    
    public static int[][] shiftUp(int[][] arr) {
    	for(int i=0; i<arr.length; i++){
        	int tmp = arr[0][i];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j][i]=arr[j+1][i];
            }
            
            arr[arr.length - 1][i] = tmp;
           }
        return arr;
    }
    public static int[][] shiftDown(int[][] arr, int k) {
        if (k > 0)
            for (int i = 0; i < k; i++) {
                arr = shiftDown(arr);
            }
 
        return arr;
    }
 
    public static int[][] shiftDown(int[][] arr) {
    	for(int i=0; i<arr.length; i++){
        	int tmp = arr[arr.length-1][i];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j][i]=arr[j-1][i];
           }
            
            arr[0][i] = tmp;
           
        }
        return arr;
    }
    static void print(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    

	}





