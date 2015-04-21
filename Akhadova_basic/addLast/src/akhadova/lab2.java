

import java.util.Arrays;

public class lab2 {
	public static int[] merge(int[] fst, int[] snd) {

		int[] result = new int[fst.length + snd.length];
		int fstIndex = 0;
		int sndIndex = 0;
		while (fstIndex + sndIndex != result.length) {
		if (fst[fstIndex] <snd[sndIndex]) {
		result[fstIndex + sndIndex] = fst[fstIndex];
		fstIndex++;
		            } else {
		result[fstIndex + sndIndex] = snd[sndIndex];
		sndIndex++;
		}
		if (fstIndex == fst.length) {
			System.arraycopy(snd, sndIndex, result, fstIndex + sndIndex, (snd.length - sndIndex));
			//System.out.println(i+ "   "+ result[fstIndex + sndIndex]);

			break;
		}
		if (sndIndex == snd.length) {
			System.arraycopy(fst, fstIndex, result, fstIndex + sndIndex, (fst.length - fstIndex));
			break;
		}
		        }
		return result;

	}

	public static void main(String[] args) {

		int[] first = { 1, 3, 3, 6, 7, 9 };
		int[] second = { 1, 3, 5 ,9};
		int[] res = merge(first, second);
		System.out.println(Arrays.toString(res));

	}


}
