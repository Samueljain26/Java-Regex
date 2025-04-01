package com.bridgelabz.regex;

import java.util.regex.*;

public class ExtractEmail {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);

        String input = "the email1 is sam@gmail.com and email2 is sam2@gmail.com .";
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
/*sam@gmail.com
sam2@gmail.com
 */
