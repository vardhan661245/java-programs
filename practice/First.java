package practice;

public class First {
    public static void main(String[] args) {
        String str = "Java is Amazing! Aardvarks love Apples."; // Sample string
        char target = 'A';
        int count = 0;

      
        char[] charArray = str.toUpperCase().toCharArray();

      
        for (char ch : charArray) {
            if (ch == target) {
                count++;
            }
        }

       
        System.out.println("The letter 'A' appears " + count + " times in the string.");
      
                String str1 = "Java is Amazing! Aardvarks love Apples."; 
                char target1 = 'A';
                int count1 = 0;

           
                str = str.toUpperCase();

              
                for (int i = 0; i < str1.length(); i++)
                {
                    if (str.charAt(i) == target1) 
                    {
                        count1++;
                    }
                }

                
                System.out.println("The letter 'A' appears " + count1 + " times in the string.");
            }
        }



