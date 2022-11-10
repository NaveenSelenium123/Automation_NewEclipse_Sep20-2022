package Day07_Array_List;

public class Exe3 {
	public static void main(String[] args) {
		
	
	int [] a =new int[] {10,10,20,50,60,80,60,50};
	System.out.println("Duplicate elements ina array");
	for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i] == a[j])
			System.out.println(a[j]);
	}	
	}
	}
}
