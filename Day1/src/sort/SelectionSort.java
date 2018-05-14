package sort;

public class SelectionSort {

	public static void main(String[] args) {
		double numList[] = {1.5,-2.5,3,7,9,8.3,-10,6.2,-3.4,8.3};
		SelectionSort(numList);
		for(double i : numList) {
			System.out.println(i);
		}
	}
	
	public static void SelectionSort(double array[]) {
		double temp = 0;
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = i + 1 ; j < array.length ; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	} 

}
