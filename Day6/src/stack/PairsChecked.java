package stack;
import java.util.Scanner;
import java.util.Stack;

public class PairsChecked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the statement to be checked¡G");
		String stat = sc.nextLine();
		if(isPairs(stat)) {
			System.out.println("This statement is perfect!");
		}else {
			System.out.println("This statement is not good!");
		}
	}
	
	public static boolean isPairs(String statement) {
		Stack stack = new Stack();
		char stat_array[] = statement.toCharArray();
		for(int i = 0 ; i < stat_array.length ; i++) {
			if(stat_array[i] == '{') {
				stack.push(stat_array[i]);
			}else if(stat_array[i] == '}') {
				if(stack.isEmpty()) {
					return false;
				}else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
}
