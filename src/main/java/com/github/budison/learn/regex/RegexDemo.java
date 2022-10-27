package com.github.budison.learn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexDemo {

    public static void main(String[] args) {

        String regex = "\\w.";

        String text = "A@";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(text);

        System.out.println(m.matches());
    }
}
