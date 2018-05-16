package unique;

public class UniqueArray {

	public static void main(String[] args) {
		String list[] = {"3","2","7","6","8","2"};
		for(String i : uniqueArray(list)) {
			System.out.print(i + " ");
		}
	}
	
	public static String[] uniqueArray(String list[]) {
		for(int i = 0 ; i < list.length ; i++) {
			for(int j = i+1 ; j < list.length ; j++) {
				if(list[i] == list[j]) {
					list = deletArrayElement(list, j);
				}
			}
		}
		return list;
	}
	
	public static String[] deletArrayElement(String list[], int pos) {
		for(int i = pos ; i < list.length - 1 ; i++) {
			swap(list, i, i+1);
		}
		String list2[] = new String[list.length - 1];
		System.arraycopy(list, 0, list2, 0, list2.length);
		list = list2;
		return list2;
	}
	
	public static void swap(String list[], int n1, int n2) {
		String temp = "";
		temp = list[n1];
		list[n1] = list[n2];
		list[n2] = temp;
	}

}
