package com.bridgelabz.regex;

import java.util.regex.*;

public class HexColorCode {
    public static void main(String[] args) {
        String regex ="^[#]+[a-zA-Z0-9]{6}";
        Pattern pattern = Pattern.compile(regex);
        String input ="#FF0088";
        Matcher matcher = pattern.matcher(input);
        System.out.println(input + " is validate: " + matcher.matches());
    }
}
/*#FF0088 is validate: true
 */