
public class problem6 {
	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		int a=0;
		int b=0;
		int c=0;
				for( i=1; i <=100; i++)
				{
				a += i*i;
				}
				for ( i=1; i <=100; i++)
				{c = c+i;
				b=c*c;
				}
		sum = b - a;
	System.out.println(sum);
				}
				
}
