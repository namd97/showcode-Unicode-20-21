/**
 * 
 */
package unicode2021.namd97.challenge13;

// scored 100%

/**
 * @author Duncan Nam
 *
 */
import java.util.*;

public class Solution {
    private static final String LOWERS = "abcdefghijklmnopqrstuvwxyz";
    
    public static String generateChainCode(String input) {
        // create output StringBuffer
        StringBuffer out = new StringBuffer();
        
        // break the input into words, divided by spaces
        String[] words = input.split(" ");
        
        // enter for loop
        for (int j = 0; j < words.length; j++) {
            // if not looking at the first entry in the loop, then add a space first.
            String word = words[j];
            if (j != 0) {
                out.append(" ");
            }
            
            // determine the positions of the capitals in the word
            // then convert the entire word to lowercase
            List<Integer> capitalPositions = new ArrayList<Integer>();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isUpperCase(c)) {
                    capitalPositions.add(i);
                }
            }
            word = word.toLowerCase();
            
            // determine the positions of the punctuation,
            // store the positions and the punctuation character separately,
            // then remove all punctuation from the word
            List<Character> punctuation = new ArrayList<Character>();
            List<Integer> punctuationPosition = new ArrayList<Integer>();
            for (int i = 0; i < word.length(); i++) {
                if (LOWERS.indexOf(word.charAt(i)) == -1) {
                    punctuation.add(word.charAt(i));
                    punctuationPosition.add(i);
                }
            }
            word = word.replaceAll("[^a-z]", "");
            
            // sort the remaining characters into alphabetical order
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            word = new String(charArray);
            
            // rebuild the new word
            StringBuffer newWord = new StringBuffer();
            int wordPosition = 0;
            for (int i = 0; i < words[j].length(); i++) {
                if (punctuationPosition.contains(i)) {
                    newWord.append(punctuation.get(punctuationPosition.indexOf(i)));
                } else if (capitalPositions.contains(i)) {
                    newWord.append(word.toUpperCase().charAt(wordPosition));
                    wordPosition++;
                } else {
                    newWord.append(word.charAt(wordPosition));
                    wordPosition++;
                }
            }
            
            // add the word to the output
            out.append(newWord.toString());
            // exit for loop
        }
        
        // return output
        return out.toString();
    }
}