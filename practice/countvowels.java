package practice;

public class countvowels {

	public static void main(String[] args) {
        String str="Hello world";
        int vowels=0,consonants=0;
        str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
        	char ch=str.charAt(i);
        	if(Character.isLetter(ch))
        	{
        		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        			vowels++;
        		else
        		{
        			consonants++;
        		}
        		
        	}
        }
        System.out.println(vowels);
        System.out.println(consonants);
	}

}
