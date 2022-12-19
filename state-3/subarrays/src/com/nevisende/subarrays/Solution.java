package com.nevisende.subarrays;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] nums = new int[arrayLength];
        int total = 0;
        for (int i = 0; i < arrayLength; i++) {
            int stdinNumber = input.nextInt();
            nums[i] = stdinNumber;
            total += stdinNumber;
        }
        int lineNumber = 0;
        if (total < 0) {
            for (int i = 0; i < nums.length; i++) {
                int totalLine = 0;

                for (int j = i; j < nums.length; j++) {
                    totalLine += nums[j];
                    if (totalLine < 0) lineNumber++;
                }

            }
        }

        if (total > 0) {
            for (int i = 0; i < nums.length; i++) {
                int totalLine = 0;
                for (int j = i; j < nums.length; j++) {
                    totalLine += nums[j];
                    if (totalLine > 0) lineNumber++;
                }

            }
        }
        System.out.print(lineNumber);


        input.close();
    }
}
