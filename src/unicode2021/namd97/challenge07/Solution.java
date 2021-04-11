package unicode2021.namd97.challenge07;

public class Solution {
    private static final String CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERS = "abcdefghijklmnopqrstuvwxyz";
    
    public static String cipher(String input, int key) {
        StringBuffer out = new StringBuffer();
        for (char i : input.toCharArray()){
            if(CAPITALS.indexOf(i) != -1) {
                out.append(CAPITALS.charAt(modulo(CAPITALS.indexOf(i) + key, 26)));
            } else if (LOWERS.indexOf(i) != -1) {
                out.append(LOWERS.charAt(modulo(LOWERS.indexOf(i) + key, 26)));
            } else {
                out.append(i);
            }
        }
        return out.toString();
    }
    
    private static final int modulo(int in, int mod) {
        int out = in % mod;
        if(out < 0) {
            out+=mod;
        }
        return out;
    }
}