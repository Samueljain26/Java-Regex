package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpace {
    public static void main(String[] args) {
        String regex = "\\s{2,}";
        Pattern pattern = Pattern.compile(regex);

        String input = "My  Name is   samuel";
        Matcher matcher = pattern.matcher(input);
        String result = matcher.replaceAll(" ");
        System.out.println(result);
        }
    }

