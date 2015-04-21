
import java.util.Arrays;

public class InsertionSorter {
	
	public static void sort(int[] arr) {
		for (int k = 1; k <arr.length; k++) {
		int newElement = arr[k];
		int location = k - 1;
		while (location >= 0 &&arr[location] >newElement) {
		arr[location + 1] = arr[location];
		location--;
		}
//		System.out.println(location + "  "+ k);
		location++;
		System.arraycopy(arr, location, arr, location+1, k - location);
		arr[location] = newElement;
		        }
		    }
	
	public static void main(String[] args) {
		int[] a = { 0,3,2,8,9,5,3,12,-3 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

		}

