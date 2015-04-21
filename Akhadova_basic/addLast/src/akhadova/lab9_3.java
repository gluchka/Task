
public class lab9_3 {
	// 9.3. Найти и вывести наибольшее число возрастающих элементов
		// матрицы, идущих подряд.
	public static void main(String [] args){
		int [][] matrix = {{12,3,2},{3,4,5},{11,88,999}};
		findIncrease(matrix);
		
	}
	private static void findIncrease(int[][] mas) {

		String [][] result=new String [mas.length][2];
		int count = 0;
		
		for (int i = 0; i < mas.length; i++) {
			for(int j=0; j<mas[0].length-1; j++){
					if(mas[i][j+1]<=mas[i][j]){
					count=0;
					result[i][0]="";
					result[i][1]=Integer.toString(count);
					}
				else{
					if(count==0) {
						result[i][0]=String.valueOf(mas[i][j]);
						count++;
					}
					result[i][0]+="  " + String.valueOf(mas[i][j+1]);
					count++;
					result[i][1]=Integer.toString(count);
					}
			}
			count=0;
			
			}
		findMax(result);
	}
			

private static void findMax(String[][] result) {
	int max =Integer.parseInt(result[0][1]);
	int pos=0;
	for(int i =0; i<result.length;i++){
		if(max<Integer.parseInt(result[i][1])){max=Integer.parseInt(result[i][1]); pos=i;}
	}
	System.out.println("Ряд:  " + result[pos][0]);
	System.out.println("Count=  " + result[pos][1]);
}
}
