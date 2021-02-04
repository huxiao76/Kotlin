package com.thoughtworks.ppt;

public class ExtensionMethod {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(StringUtil.firstChar(str));
        System.out.println(StringUtil.lastChar(str));

    }
}

class StringUtil {
    public static String firstChar(String str) {
        if (str != null && str.length() > 0) {
            return str.charAt(0) + "";
        }
        return "";
    }

    public static String lastChar(String str) {
        if (str != null && str.length() > 0) {
            return str.charAt(str.length() - 1) + "";
        }
        return "";

    }
}
