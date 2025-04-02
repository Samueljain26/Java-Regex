package com.bridgelabz.regex;

import java.util.regex.*;

public class ExtractLanguage {
    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] words ={"Java","Python","JavaScript","Go"};

        String regex = "\\b(Java|JavaScript|Python|Go)\\b";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
