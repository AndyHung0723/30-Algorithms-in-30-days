package search;

public class BinarySearch {

	public static void main(String[] args) {
		double numList[] = {1.5,-2.5,3,7,9,8.3,-10,6.2,-3.4,8.3};
		SelectionSort(numList);
		for(double i : numList) {
			System.out.print(i + " ");
		}
		double target = 8.3;
		System.out.println("\n" + BinarySearch(numList, target));
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
	
	public static int BinarySearch(double array[], double target) {
		int middle = 0;
		int left = 0;
		int right = array.length - 1;
		while(left <= right) {
			middle = (right+left)/2;
			if(target == array[middle]) {
				return middle;
			}else if(target > array[middle]) {
				left = middle+1;
			}else if(target < array[middle]) {
				right = middle-1;
			}
		}
		return -1;
	}
}
