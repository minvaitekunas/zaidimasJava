package com.codewars;

public class NumberFun {
    public static long findNextSquare(long sq) {
        long root1;
        long nextroot;
        if (Math.sqrt(sq)%1==0) {
            System.out.println(Math.sqrt(124));
            root1 = (long) Math.sqrt(sq);
            nextroot = root1 + 1;
        }else {
            return -1;
        }
        return (long) (nextroot*nextroot);
    }
}

