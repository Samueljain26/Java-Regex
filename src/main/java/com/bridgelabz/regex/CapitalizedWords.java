package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static void main(String[] args) {
            String regex = "\\b[A-Z]+[a-zA-Z0-9]{0,}";
            Pattern pattern = Pattern.compile(regex);

            String input = "My M Name is sAmuel";
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
