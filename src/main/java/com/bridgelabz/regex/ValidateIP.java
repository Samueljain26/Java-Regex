package com.bridgelabz.regex;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateIP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String regex="^(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.+(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.+(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.+(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})$";
        Pattern pattern = Pattern.compile(regex);
        String input = sc.nextLine();
        Matcher matcher = pattern.matcher(input);

        System.out.println(input + " is valid: " + matcher.matches());

    }
}
/*1.0.0.0
1.0.0.0 is valid: true
 */