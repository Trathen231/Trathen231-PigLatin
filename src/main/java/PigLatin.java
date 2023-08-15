
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in) {
        if (in == null || in.isEmpty()) {
            return ""; // Return an empty string for null or empty input
        } 
        
        char firstChar = in.charAt(0);
        String restOfWord = in.substring(1); // Get the substring from index 1 to the end
        
        // Construct the Pig Latin word by moving the first character to the end and adding "ay"
        String pigLatinWord = restOfWord + firstChar + "ay";
        
        return pigLatinWord;
    }
}
