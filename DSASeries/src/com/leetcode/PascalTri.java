package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTri {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        if(numRows<=0){
            return res;
        }
        res.add(Arrays.asList(1));
        for(int i = 1; i<numRows;i++){
            Integer[] row = new Integer[i+1];
            Arrays.fill(row,1);
            for(int j=1;j<i;j++){
                row[j] = res.get(i-1).get(j-1) + res.get(i-1).get(j);
            }
            res.add(Arrays.asList(row));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        List<List<Integer>> result = new PascalTri().generate(numRows);
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<result.size();i++){
            sb.append("[");
            List<Integer> row = result.get(i);
            for(int j=0;j< row.size();j++){
                sb.append(row.get(j));
                if(j+1<(row.size())){
                    sb.append(",");
                }
            }
            sb.append("]");
            if(i+1<(result.size())){
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);

    }
}
