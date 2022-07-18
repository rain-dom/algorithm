package com.dzp.algorithm.str;

public class reverseStr {

    public void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }
        int length = s.length;
        int l = 0;
        int r = length-1;
        for (int i = 0; i < length>>1; i++) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    // 循环次数的限制
    public void reverseString2(char[] s) {
        if (s.length == 0) {
            return;
        }
        int length = s.length;
        int l = 0;
        int r = length-1;
        for (int i = 0; i < length>>1; i++) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
