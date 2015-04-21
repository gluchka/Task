

public class lab9_8 {
	public static void main(String [] args){
		int [][] mas = {{12,3,2},{0,4,8,0,5},{11,88,999}};
		zeroMatrix(mas);
		
	}
	public static void zeroMatrix(int[][] mas) {
		
		for (int i = 0; i < mas.length; i++) {
			for(int j=0; j<mas[0].length-1; j++){
				if(mas[i][j]==0){
					
					int k=j;
					while(k!=mas[0].length){
					mas[i][j]=mas[i][j+1];
					k++;}
					mas[i][mas[i].length-1]=0;
				}
					
				}
				}
		
		for (int i = 0; i < mas.length; i++) {
			for(int j=0; j<mas[i].length; j++){
			System.out.print(mas[i][j]+"  ");
			}
		System.out.println();	
		}
			
	
	}
}
