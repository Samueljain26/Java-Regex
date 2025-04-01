package com.bridgelabz.regex;

import java.util.regex.*;

public class ExtractingDate {
    public static void main(String[] args) {
        String regex = "(0[1-9]|[12][0-9]|3[01])/(0[0-9]|1[0-2])/\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        String input ="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Matcher matcher =pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
