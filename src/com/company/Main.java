package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        System.out.println(del(56, 23));
        System.out.println(sum(34, 56));
    }

    public static Integer del(Integer a, Integer b) {
        return a - b;
    }

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
