package JumpingStatement_Day10;

public class SystemExit {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if( i== 4) {
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("End");
	}

}
