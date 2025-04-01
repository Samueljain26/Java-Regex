package com.bridgelabz.regex;

import java.util.regex.*;

public class ValidateName {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9_]{5,15}$";
        Pattern pattern =Pattern.compile(regex);
        String input ="HelloWorld23";
            Matcher matcher = pattern.matcher(input);
            System.out.println(input + " is valid: " + matcher.matches());
    }
}
/*HelloWorld23 is valid: true
 */