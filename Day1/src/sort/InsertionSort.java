package sort;

public class InsertionSort {

	public static void main(String[] args) {
		double numList[] = {1.5,-2.5,3,7,9,8.3,-10,6.2,-3.4,8.3};
		insertionSort(numList);
		for(double i : numList) {
			System.out.println(i);
		}
	}
	
	public static void insertionSort(double array[]) {
		double insertVal = 0;
		int j = 0;
		for(int i = 1 ; i < array.length ; i++) {
			insertVal = array[i];
			for(j = i - 1 ; j >= 0 && array[j] > insertVal; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = insertVal;
		}
	}
}
