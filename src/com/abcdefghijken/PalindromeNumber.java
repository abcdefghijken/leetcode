package com.abcdefghijken;

// 9 on Leetcode
public class PalindromeNumber {
//    public boolean isPalindrome(int x) {
//        char[] arr = Integer.toString(x).toCharArray();
//
//        if (arr[0] == '-') return false;
//
//        for (int i = 0; i < arr.length/2; i++) {
//            if (arr[i] != arr[arr.length-1-i]) {
//                return false;
//            }
//        }
//
//        System.out.println("true");
//        return true;
//    }

    public boolean isPalindrome(int x) {
        // If the number is negative or ends with 0 (but isn't 0), it cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Reverse half of the number
        while (x > reversedHalf) {
            reversedHalf = (reversedHalf * 10) + (x % 10);
            x /= 10;
        }

        // Compare the original half with the reversed half
        // For odd lengths, the middle digit doesn't matter, so we divide reversedHalf by 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
