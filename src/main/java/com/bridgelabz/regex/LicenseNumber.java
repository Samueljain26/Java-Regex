package com.bridgelabz.regex;

import java.util.regex.*;

public class LicenseNumber {
    public static void main(String[] args) {
        String regex ="^[A-Z]{2}+[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        String input="CH0079";
        Matcher matcher =pattern.matcher(input);

        System.out.println(input + "is validate:" + matcher.matches());
    }
}
/*CH0079is validate:true
 */