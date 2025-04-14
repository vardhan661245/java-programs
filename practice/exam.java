package practice;

public class exam 
{

    public static String toPigLatin(String inpword) 
    {
        inpword = inpword.toLowerCase();
        String vowels = "aeiou";
        int firstVowelIndex = -1;

        // Find first vowel index
        for (int i = 0; i < inpword.length(); i++) 
        {
            if (vowels.indexOf(inpword.charAt(i)) != -1) 
            {
                firstVowelIndex = i;
                break;
            }
        }

        // Rule 1: Word starts with a vowel
        if (firstVowelIndex == 0)
        {
            return inpword + "-yay";
        }

        // Rule 2: Word starts with consonant/consonant cluster
        if (firstVowelIndex > 0)
        {
            String start = inpword.substring(0, firstVowelIndex);
            String end = inpword.substring(firstVowelIndex);
            return end + "-" + start + "ay";
        }

        // No vowels found (edge case)
        return inpword + "-ay";
    }

    public static void main(String[] args) 
    {
        String[] words = {"it", "egg", "hello", "switch", "glove", "pig", "latin"};

        for (String word : words) 
        {
            String pigLatin = toPigLatin(word);
            System.out.println(word + " → " + pigLatin);
        }
    }
}
