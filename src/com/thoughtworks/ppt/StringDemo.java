package com.thoughtworks.ppt;

public class StringDemo {
    public static void main(String[] args) {
        String name = "小丽";
        double money = 10.155;
        int score = 10;
        String message = String.format("%s，晚上好！ 您目前余额: %.2f元，积分: %d\\n\\n\\n\\n\\n", name, money, score);
        System.out.println(message);
    }
}
