package com.bridgelabz.regex;

import java.util.*;
import java.util.regex.*;

public class CreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex1 ="^4[0-9]{15}$";
        String regex2 ="^5[0-9]{15}$";
        Pattern pattern1 =Pattern.compile(regex1);
        Pattern pattern2 =Pattern.compile(regex2);

        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);

        if(matcher1.find()){
            System.out.println("Visa card");
        }
        else if(matcher2.find()){
            System.out.println("Master card");
        }
        else{
            System.out.println("invalid");
        }
    }
}
/*4123123412341234
Visa card
 */