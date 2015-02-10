
public class problem2 {
	public static void main(String[] args) {
	int Fib1 = 0;
	int Fib2 = 1;
	int NextFib = 0;
	int sum = 0;

	while( (NextFib < 4000000))
	{
	    if(NextFib % 2 == 0)
	    {
	        sum += NextFib;
	    }
	    Fib1=Fib2;
	    Fib2=NextFib;
	    NextFib=Fib1 + Fib2;
	}
	System.out.print(sum);

}
}