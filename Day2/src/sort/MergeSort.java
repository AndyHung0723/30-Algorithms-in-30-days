package sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		double numList[] = {3,2,7,6,8,10,9,67,44,224,466,43,-94,41,22};
		MergeSort(numList, 0, numList.length-1);
		for(double i : numList) {
			System.out.println(i);
		}
	}
	
	public static void MergeSort(double array[], int front, int end) {
		if(front < end) {
			int mid = (front + end) / 2;
			MergeSort(array, front, mid);
			MergeSort(array, mid+1, end);
			Merge(array, front, mid, end);
		}
	}
	
	public static void Merge(double array[], int front, int mid, int end) {
		double tempArray[] = Arrays.copyOf(array, array.length);
		int temp_pos = front;
		int left_pos = front;
		int right_pos = mid+1;
		
		for(int i = 0 ; i < end-front+1 ; i++,temp_pos++) {
			if(left_pos != (mid+1) && (right_pos == (end+1) || array[left_pos] < array[right_pos])) {
				tempArray[temp_pos] = array[left_pos++];
			}else {
				tempArray[temp_pos] = array[right_pos++];
			}
		}
		
		for(int i = 0 ; i < tempArray.length ; i++) {
			array[i] = tempArray[i];
		}
	}
}
