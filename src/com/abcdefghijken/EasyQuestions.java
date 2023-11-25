package com.abcdefghijken;

public class EasyQuestions {
    public static boolean isPalindrome(int x) { // 9. Palindrome Number (Easy)
        String input = String.valueOf(x);
        int lengthOfInput = input.length();

        for (int i = 0; i < lengthOfInput-1; i++) {
            if ((input.charAt(i)) == (input.charAt(lengthOfInput-1))) {
                lengthOfInput--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
