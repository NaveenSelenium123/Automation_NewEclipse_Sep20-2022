package pavanYouTubeChannelStringProgram;

public class Video7_Countnoofevenandodd {

	public static void main(String[] args) {
		int num=1235;
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else
			{
				odd_count++;	
			}
			num=num/10;
		}
System.out.println("num of even numbers" +even_count++);
System.out.println("num of odd numbers" +odd_count++);	
	}

}
