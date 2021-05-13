
public class ProductPrinter {

	//This is a nested for loop within a for loop
	public static void main(String args[]) {
		int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
		int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int h = 0; h < arr2.length; h++) {
				System.out.println(arr1[i] * arr2[h]);
				
			}
		}
	}
}
