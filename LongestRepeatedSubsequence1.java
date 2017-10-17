import java.lang.StringBuilder;

public class LongestRepeatedSubsequence1
{
	static String lrs(String str)
	{
		// lrs : longest repeated Subsequence

		StringBuilder lrs = new StringBuilder(); 

		//convert string to character array
		char[] s1 = str.toCharArray();
		
		int[] table = new int[128];
		
		for(char s : s1)
		{
			table[s]++;
			if(table[s] > 1)
			{
				lrs.append(s);
			}
		}
		
		return lrs.toString();
		
		
		
	}
	
	public static void main(String[] args)
	{
		String str = "aabb";

		System.out.println("Longest repeated subsequence of "+ str + " : "+lrs(str));
		
	}
}