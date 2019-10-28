package string;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeks";
		String s1="egeks";
		int m=s.length();
		int n=s1.length();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(s.charAt(i)!=s1.charAt(j))
				{
					System.out.println("no of index"+i);
				}
			}
		}

	}

}
