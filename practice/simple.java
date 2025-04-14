package practice;

public class simple {
public static void main(String[] args) {
     String str="javaAAA languageaaa";
     char t='a';
     int count=0;
     str.toUpperCase();
     for(int i=0;i<str.length();i++)
     {
    	 if(str.charAt(i)==t)
    		 count++;
    	 
     }
     System.out.println(count);

   }
}
