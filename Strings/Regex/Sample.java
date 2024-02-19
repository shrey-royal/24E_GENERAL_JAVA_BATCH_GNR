import java.util.regex.*;

public class Sample {
    public static void main(String[] args) {
        //1st way
        // Pattern p = Pattern.compile(".s.");  //. represents single character
        // Matcher m = p.matcher("ash");
        // boolean b = m.matches();
        // System.out.println(b);

        //2nd way
        // boolean b = Pattern.compile(".s.").matcher("ash").matches();
        // System.out.println(b);

        //3rd way
        // boolean b = Pattern.matches(".s..", "asha");
        // System.out.println(b);

        //Character Class
        // System.out.println(Pattern.matches("[amd]", "abcd"));
        // System.out.println(Pattern.matches("[amd]", "a"));
        // System.out.println(Pattern.matches("[amd]", "amma"));
        // System.out.println(Pattern.matches("[^amd]", "ryzen"));
    
        
        //Quantifiers
        // System.out.println(Pattern.matches("[a-zA-Z0-9[^\\s]]{0,10}", "AMD RYZen"));
        // System.out.println(Pattern.matches("[^am[d]+]+", "ddddhyey"));
        // System.out.println(Pattern.matches("[dhye]*", "dhyey"));

        //MetaCharacters

        // System.out.println(Pattern.matches("[^as]*", "B n i"));
        // [0-9]* == \\d == [^\\D]*
        // System.out.println(Pattern.matches("^[\\D\\s]*$", "Shrye K"));

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "dhye32"));
    }
}