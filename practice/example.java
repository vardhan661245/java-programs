package practice;

public class example {

	public static void main(String[] args) {
		String str = "abcabcabcabc";
        int countA = 0, countB = 0, countC = 0;

		
		  for (int i = 0; i < str.length(); i++) 
		  { 
			  char ch = str.charAt(i); 
			  if (ch =='a') 
			  { 
				  countA++; 
			  } 
			  else if (ch == 'b') 
			  {
				  countB++; } 
			  else if (ch == 'c') 
			  {
		      countC++;
		       } 
			  }
		  
		  System.out.println("a appears: " + countA + " times");
		  System.out.println("b appears: " + countB + " times");
		  System.out.println("c appears: " + countC + " times");
		 
//        String s="javaseleniumclasses";
//        for(int i=0;i<=s.length()-1;i++)
//        {
//        	int countA=1;
//        
//        	if(s.charAt(i)!='#')
//        	{
//        		for(int j=i+1;j<s.length()-1;j++)
//        		{
//        			if(s.charAt(i)==s.charAt(j))
//        			{
//        				countA++;
//        			}
//        		}
//        		
//        	}
//        	if(countA>1)
//        	{
//        		System.out.println(s.charAt(i)+"----------------->"+countA);
//        	}
//        	 s= s.replace(s.charAt(i), '#');
//        }
      
  }

	}



