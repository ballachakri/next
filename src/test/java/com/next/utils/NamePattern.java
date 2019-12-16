package com.next.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePattern {

    public static void main(String[] args) {

        String s=findPattern("Shirt","White Short Sleeve Oxford Shirt (3mths-7yrs)");
        System.out.println(s);
    }
    public static String findPattern(String patternString, String matcherString)
    {
        Pattern pattern=Pattern.compile(patternString);
        Matcher matcher=pattern.matcher(matcherString);
        int i=0;
        String item = null;
        while(matcher.find())
        {
            i++;
            item=matcher.group();

        }
        return item;
    }
}
