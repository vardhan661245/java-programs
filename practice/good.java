package practice;

public class good {

    public static String toPigLatin(String word) 
    {
        word = word.toLowerCase();
        int vowelIndex = -1;
        String vowels = "aeiou";

        // Find first vowel
        for (int i = 0; i < word.length(); i++) 
        {
            if (vowels.indexOf(word.charAt(i)) != -1) 
            {
                vowelIndex = i;
                break;
            }
        }

        if (vowelIndex == 0)
        {
            return word + "way";  // word starts with vowel
        } 
        else if (vowelIndex > 0) 
        {
            return word.substring(vowelIndex) + word.substring(0, vowelIndex) + "ay";
        }
        else 
        {
            return word + "ay"; // no vowels found (edge case)
        }
    }

    public static void main(String[] args) {
        System.out.println(toPigLatin("pig latin"));  // Output: oveglay
    }
}

