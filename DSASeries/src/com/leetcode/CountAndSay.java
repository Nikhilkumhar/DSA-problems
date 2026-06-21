package com.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class CountAndSay {
    public static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            for (int j = 0; j < result.length(); j++) {
                char ch = result.charAt(j);
                int count = 1;
                while (j < result.length() - 1 && result.charAt(j) == result.charAt(j + 1)) {
                    count++;
                    j++;
                }
                next.append(count).append(ch);
            }
            result = next.toString();
        }
        return result;
    }

    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int n = Integer.parseInt(line);

        for (int i = 1; i <= n; i++) {
            System.out.println("countAndSay(" + i + ")=  " + countAndSay(i));
        }

    }
}