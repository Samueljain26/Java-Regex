package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String regex="^[0-9]{3}+-[0-9]{2}+-[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        String input = sc.nextLine();
        Matcher matcher = pattern.matcher(input);

        System.out.println(input + " is valid: " + matcher.matches());
    }
}
/*123-45-6789
123-45-6789 is valid: true
 */