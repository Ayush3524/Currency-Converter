package com.converter.helper;

import com.converter.model.Currency;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static boolean matchPattern(String input){
        Scanner sc=new Scanner(System.in);
        String pattern="[0-9]|([0-9]+(\\.[0-9]*)?) ("+Currency.firstCurrency()+"|"+Currency.secondCurrency()+"|"+Currency.thirdCurrency()+"|"+Currency.fourthCurrency()+"|"+Currency.fifthCurrency()+")";
        Pattern desiredPattern = Pattern.compile(pattern);
        Matcher matcher= desiredPattern.matcher(input);
        return matcher.matches();
    }
}
