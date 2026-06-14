package com.leetcode;

public class CommonDiv {

    public String gcdOfString(String str1, String str2){
        if((str1+str2).equals(str2+str1)){
            int a = str1.length();
            int b = str2.length();
            int gcd = gcd(a,b);
            return str1.substring(0,gcd);
        }else {
            return "";
        }
    }
    int gcd(int a, int b){
        while (b%a!=0){
            int rem = b%a;
            b = a;
            a = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        CommonDiv cd = new CommonDiv();
        String str1 = "ABABABABAB";
        String str2 = "ABAB";
        System.out.println(cd.gcdOfString(str1,str2));

    }
}
