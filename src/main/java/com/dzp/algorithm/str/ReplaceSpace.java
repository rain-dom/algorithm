package com.dzp.algorithm.str;

public class ReplaceSpace {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                builder.append("%20");
            } else {
                builder.append(chars[i]);
            }
        }
        return builder.toString();

    }

}
