import java.util.Arrays;

public class RemoveDuplicate2 {

	public static void main(String[] args) {

		int[] a = { 1,2,5,2,9,6,4,1,3,6,13,23,16,24,13};

		System.out.println("Unsorted Array=\t" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int x = 0;
		
		System.out.println("Sorted Array= \t" + Arrays.toString(a));

		for (int k = 0; k < a.length - 1; k++) {
			if (a[k] != a[k + 1]) {
				a[x++] = a[k];
			}
		}

		a[x++] = a[a.length - 1];
		
		int[] finalarr = new int[x];

		for (int z = 0; z < finalarr.length; z++) {
			finalarr[z] = a[z];
		}
		System.out.println("Final array=\t" + Arrays.toString(finalarr));
	}
}
