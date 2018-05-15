package sort;

public class HeapSort {

	public static void main(String[] args) {
		double numList[] = {3,2,7,6,8,94,4,10,107,109,5};
		HeapSort(numList);
		for(double i : numList) {
			System.out.println(i);
		}
	}
	
	public static void HeapSort(double array[]) {
		//Array to max heap tree
		for(int i = (int)Math.floor(array.length/2)-1 ; i >= 0 ; i--) {
			Heapify(array,i,array.length-1);
		}
		//Sort
		for(int i = array.length-1 ; i > 0 ; i--) {
			swap(array, 0, i);
			Heapify(array, 0, i-1);
		}
	}
	
	public static void Heapify(double array[], int node, int length) {
		//Compared the Max Node of subtree
		int maxNode = node;
		if(2*node+1 <= length && array[maxNode] < array[2*node+1]) {
			maxNode = 2*node+1;
		}
		if(2*node+2 <= length && array[maxNode] < array[2*node+2]) {
			maxNode = 2*node+2;
		}
		//swap and heapify
		if(maxNode != node) {
			swap(array, node, maxNode);
			Heapify(array,maxNode,length);
		}
	}
	
	public static void swap(double a[], int n1, int n2) {
		double temp = 0;
		temp = a[n1];
		a[n1] = a[n2];
		a[n2] = temp;
	}
}
