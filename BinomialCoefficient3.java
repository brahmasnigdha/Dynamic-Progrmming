// A Dynamic Programming based solution that uses table C[][] to
// calculate the Binomial Coefficient

public class BinomialCoefficient3
{
	static int binomialCoeff(int n, int k)
	{
		int c[][] = new int[n+1][k+1];
		int i, j;

		//Calculate value of Binomial Coefficient in bottom up manner

		for(i = 0; i <= n; i++)
		{
			for(j = 0; j <= min(i, k); j++)
			{
				if(j == 0 || j == i)
					c[i][j] = 1;
				else
					c[i][j] = c[i-1][j-1] + c[i-1][j];
			}
		}
		return c[n][k];
	}
	
	static int min(int a, int b)
	{
		return (a<b)? a:b;
	}

	public static void main(String[] args)
	{
		int n = 5, k = 2;
		System.out.println("Value of C(" + n +" , "+k+") is "+ binomialCoeff(n,k));
	}
}