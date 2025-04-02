package com.bridgelabz.regex;

import java.util.regex.*;

public class ReplaceBadWords {
    public static void main(String[] args) {
        String[] arr ={"stupid","damn"};
        String input = "This is a damn bad example with some stupid words.";

        for(String str :arr) {
            String regex = "\\b" + str + "\\b";
            input = input.replaceAll(regex,"****");
        }
        System.out.println(input);
    }
}
