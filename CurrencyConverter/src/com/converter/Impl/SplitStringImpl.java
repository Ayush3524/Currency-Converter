package com.converter.Impl;

import com.converter.helper.SplitString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitStringImpl implements SplitString {

    @Override
    public String onlyString(String input) {
        StringBuffer num = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))){
                num.append(input.charAt(i));
            }
        }

        return String.valueOf(num);
    }

    @Override
    public double onlyDouble(String input) {
        double value=0;
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            value = Double.parseDouble(matcher.group());
        }

        return value;
    }
}
