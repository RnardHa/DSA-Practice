package com.pm;

import com.pm.arraysAndHashing.*;
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
    }
}