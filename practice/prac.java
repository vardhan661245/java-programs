package practice;

public class prac {

	public static void main(String[] args) {
                String str="vishnu vardhan reddy";
                String result="";
                for(int i=0;i<str.length();i++)
                {
                	String ch=""+str.charAt(i);
                	if(result.contains(ch))
                	{
                		continue;
                	}
                	result=result+ch;
                }
                System.out.println(result);
	}

}
