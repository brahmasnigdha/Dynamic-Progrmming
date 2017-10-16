// Binomial Coefficient

public class BinomialCoefficient1
{
	public static int binomialCoefficient(int n, int k)
	{
		return (int)(factorial(n)/(factorial(n-k)*factorial(k)));
	}

	public static int factorial(int n)
	{
		int fact = 1;
		for(int i = 1;i<=n; i++)
		{
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args)
	{
		System.out.println(binomialCoefficient(4, 2));
	}
}