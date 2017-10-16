// Fibonacci space optimization

public class Fibonacci3
{
	public static int fib(int n)
	{
		int f = 0;

		int first = 0;
		
		int second = 1;

		for(int i = 2; i <= n; i++)
		{
			f = first + second;
			first = second;
			second = f;
		}

		return f;
	}
	
	public static void main(String[] args)
	{
		System.out.println(fib(9));
	}
}