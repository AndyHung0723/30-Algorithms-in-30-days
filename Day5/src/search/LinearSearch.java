package search;

public class LinearSearch {

	public static void main(String[] args) {
		double numList[] = {3,2,7,6,8};
		double num = 8;
		int index = -1;
		for(int i = 0 ; i < numList.length ; i++) {
			if(numList[i] == num) {
				index = i;
				break;
			}
		}
		
		System.out.println(index == -1 ? "Value not found" : "Value found at position " + (index+1));
	}
}