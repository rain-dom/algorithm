package com.dzp.algorithm.str;

public class reverseWords {
    public String reverseWords(String s) {
         if (s ==null) {
             return null;
         }
        char[] chars = s.toCharArray();
        int size = chars.length -1;
        //翻转数组
        reverse(chars, 0, size);
        //翻转单词
        word_reverse(chars, size);
        // 删除多余空格



    }

    public void reverse(char[] chars, int start, int end) {
        while (start < end) {
            chars[start] ^= chars[end];
            chars[end] ^= chars[start];
            chars[start] ^= chars[end];
            start++;
            end--;
        }
    }

    public void word_reverse(char[] chars, int size) {
        int l = 0;
        int r = 0;
        while (r < size) {
            while (l < size && chars[l] == ' ') {
                l++;
            }
            r = l;
            while (r < size && chars[r] != ' ') {
                r++;
            }
            reverse(chars, r, l - 1);
            l = r;
        }
    }



}
