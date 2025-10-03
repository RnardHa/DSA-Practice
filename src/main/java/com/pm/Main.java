package com.pm;

import com.pm.arraysAndHashing.*;
import com.pm.random.SortIntByNoOf1Bits;
import com.pm.random.UglyNumber;
import com.pm.slidingWindow.*;
import com.pm.stack.DailyTemp;
import com.pm.stack.EvalRPN;
import com.pm.stack.GenerateParentheses;
import com.pm.stack.ValidParentheses;
import com.pm.twoPointers.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Arrays and Hashing");
        System.out.println(i++ + ". Contains duplicate: " + new ContainsDuplicate().solution());
        System.out.println(i++ + ". Valid Anagram: " + new ValidAnagram().solution());
        System.out.println(i++ + ". Two Sum: " + Arrays.toString(new TwoSum().solution()));
        System.out.println(i++ + ". Grouped Anagrams: " + new GroupAnagrams().solution());
        System.out.println(i++ + ". Top K Frequent Elements: " + Arrays.toString(new TopKFrequentElements().solution()));
        System.out.println(i++ + ". Encode and Decode: " + new EncodeAndDecodeString().decode("2#we3#say1#:3#yes"));
        System.out.println(i++ + ". Product of Array Except Self: " + Arrays.toString(new ProductOfArrayExceptSelf().solution()));
        System.out.println(i++ + ". Valid Sudoku: " + new ValidSudoku().solution());
        System.out.println(i++ + ". Longest Consecutive: " + new LongestConsecutiveSequence().solution());

        System.out.println();
        System.out.println("Two Pointers");
        System.out.println(i++ + ". Valid Palindrome: " + new ValidPalindrome().solution());
        System.out.println(i++ + ". Sorted Two Sum: " + Arrays.toString(new SortedTwoSum().solution()));
        System.out.println(i++ + ". Three Sum: " + new ThreeSum().solution());
        System.out.println(i++ + ". Container with most Water: " + new ContainerWithMostWater().solution());
        System.out.println(i++ + ". Trapping Rain Water: " + new TrappingRainWater().solution());

        System.out.println();
        System.out.println("Sliding Window");
        System.out.println(i++ + ". Best Time to Buy and Sell Stock: " + new BestTimeToBuyAndSellStock().solution());
        System.out.println(i++ + ". Longest Substring Without Repeating Characters: " + new LongestSubstringWithoutRepeatingCharacters().solution());
        System.out.println(i++ + ". Longest Repeating Characters: " + new LongestRepeatingCharacterReplacement().solution());
        System.out.println(i++ + ". Permutation in String: " + new PermutationInString().solution());
        System.out.println(i++ + ". Min Window Substring: " + new MinimumWindowSubstring().solution());

        System.out.println();
        System.out.println("Stack");
        System.out.println(i++ + ". Valid Parentheses: " + new ValidParentheses().solution());
        System.out.println(i++ + ". Evaluate RPN: " + new EvalRPN().solution());
        System.out.println(i++ + ". Generate Parentheses: " + new GenerateParentheses().solution());
        System.out.println(i++ + ". Daily Temp: " + Arrays.toString(new DailyTemp().solution()));

        System.out.println();
        System.out.println("Random");
        System.out.println(i++ + ". Sort by no of 1 in Bits: " + Arrays.toString(new SortIntByNoOf1Bits().solution()));
        System.out.println(i++ + ". Ugly Number: " + new UglyNumber().solution());



    }
}