
public class problem1 {
	public static void main(String[] args) {
	int sum = 0;
	int i =1;
			for( i=1; i <=999; i++)
			{  if(i % 3 == 0)
			   {
			     sum += i;
			     continue;
			   }
			if( i % 5 ==0)
			   {
			     sum += i;
			     continue;
			   }
			}
			System.out.print(sum);
}
}