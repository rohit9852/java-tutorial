package string;

public class NaivePattern {
	public static void search(String text,String pat)
	{
		int n=text.length();
		int m=pat.length();
		for(int i=0;i<=n-m;i++ )
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(text.charAt(i+j)!=pat.charAt(j))
					break;
				
			}
			if(j==m)
			{
				System.out.println("Pattern found at index"+i);
			}
		}
	}

	public static void main(String[] args) {
		String text="AABAACAADAABAAABAA";
		String pat="AABA";
		search(text,pat);
		// TODO Auto-generated method stub

	}

}
