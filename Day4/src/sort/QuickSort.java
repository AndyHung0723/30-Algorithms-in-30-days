package sort;

public class QuickSort {

	public static void main(String[] args) {
		double numList[] = {3,2,7,6,8,10,9,67,44,224,466,43,-94,41,22};
		quickSort(numList, 0, numList.length-1);
		for(double i : numList) {
			System.out.println(i);
		}
	}
	
	public static void quickSort(double array[], int front, int end) {
		if(front < end) {
			int pos = front-1;
			int pivot = end;
			for(int i = front ; i < end ; i++) {
				if(array[pivot] > array[i]) {
					pos++;
					swap(array, pos, i);
				}
			}
			swap(array, pos+1, pivot);
			pivot = pos + 1;
			quickSort(array, front, pivot-1);
			quickSort(array, pivot+1, end);
		}
	}
	
	
	public static void swap(double array[], int n1, int n2) {
		double temp = 0;
		temp = array[n1];
		array[n1] = array[n2];
		array[n2] = temp;
	}

}
