package Arrays_Day13;

public class TwoDArray {
public static void main(String[] args) {
	int b[] [] =new int [2][2];
	b[0] [0] =10;
	b[0] [1] =20;
	b[1] [0] =30;
	b[1] [1] =40;
	System.out.println("=============");
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[i][j]);
		}
	}
}
}
