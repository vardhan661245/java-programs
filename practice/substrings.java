package practice;

public class substrings {

	public static void main(String[] args) {
		// TOpackage strings;


        String text = "hello world this is vishnu";
        //String s1 = "i am learning";
        //String s = "u";
        //String str = "hello world this is vishnu";
        String[] words = text.split(" ");
        System.out.println(text.charAt(0));
        System.out.println(text.length());
        System.out.println(text.substring(0, 7));
        System.out.println(text.trim());
        System.out.println(text.contains("hell"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        //System.out.println(text.equals(str));
        System.out.println(words[2]);
        //System.out.println(text.concat(s));
        System.out.println(text.endsWith(text));
        //System.out.println(s1.indexOf("i", 11));
        System.out.println(text.startsWith("h"));
    }
}

