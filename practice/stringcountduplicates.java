package practice;

public class stringcountduplicates {

	public static void main(String[] args) 
	{
		String str="vishnu vardhan reddy";
		char target='a';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==target)
			{
				count++;
			}
		}
		System.out.println(count);
        
	}

}
