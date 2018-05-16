package reverse;

import static java.lang.System.out;

public class Reserve {

	public static void main(String[] args) {
		out.println(stringReverse("AndyHung"));
		out.println(integerReverse(123456));
		String reverseArray[] = arrayReverse(new String[]{"1","2","ABC","§Ú","5"});
		for(String i : reverseArray) {
			out.print(i);
		}
		out.println();
	}
	
	public static String stringReverse(String target) {
		char targetArray[] = target.toCharArray();
		char reverseArray[] = new char[targetArray.length]; 
		for(int i = targetArray.length - 1, j = 0 ; i >= 0 ; i--, j++) {
			reverseArray[j] =  targetArray[i];
		}
		return String.valueOf(reverseArray);
	}
	
	public static int integerReverse(int target) {
		char targetArray[] = (target + "").toCharArray();
		char reverseArray[] = new char[targetArray.length]; 
		for(int i = targetArray.length - 1, j = 0 ; i >= 0 ; i--, j++) {
			reverseArray[j] =  targetArray[i];
		}
		return Integer.parseInt(String.valueOf(reverseArray));
	}
	
	public static String[] arrayReverse(String target[]) {
		String reverseArray[] = new String[target.length]; 
		for(int i = target.length - 1, j = 0 ; i >= 0 ; i--, j++) {
			reverseArray[j] =  target[i];
		}
		return reverseArray;
	}
	
}
