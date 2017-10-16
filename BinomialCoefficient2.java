// Binomial Coefficient 2

public class BinomialCoefficient2
{
	public static int binomialCoefficient(int n, int k)
	{
		if(n == k || k == 0)
		{
			return 1;
		}
		
		return (binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k));
	}

	public static void main(String[] args)
	{
		System.out.println(binomialCoefficient(4,2));
	}
}