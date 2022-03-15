package com;

import java.util.Scanner;

public class ScannerUtil {
    private final static Scanner input = new Scanner(System.in);

    public static String getString(String text) {
        System.out.print(text);
        return input.next();
    }

    public static int getInt(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static Long getLong(String text) {
        System.out.print(text);
        return input.nextLong();
    }

}