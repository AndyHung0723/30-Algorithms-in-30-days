package sort;

public class BubbleSort {

	public static void main(String[] args) {
		double numList[] = {1.5,-2.5,3,7,9,8.3,-10,6.2,-3.4,8.3};
		bubbleSort(numList);
		for(double i : numList) {
			System.out.println(i);
		}
	}
	
	public static void bubbleSort(double array[]) {
		double temp = 0;
		for(int i = 0 ; i < array.length-1 ; i++) {
			for(int j = 0 ; j < array.length-i-1 ; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

}
