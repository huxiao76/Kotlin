package com.thoughtworks.ppt;

public class SwitchDemo {
    public static void main(String[] args) {
        // 调用java的静态函数
        System.out.println(getPoint(90));
        // 调用kotlin的方法å
        System.out.println(WhenDemoKt.getPoint2(50));
    }

    public static String getPoint(int grade) {
        if (grade >= 90 && grade <= 100) {
            return "优秀";
        } else if (grade >= 70 && grade < 90) {
            return "良好";
        } else if (grade >= 60 && grade < 70) {
            return "及格";
        } else if (grade < 60) {
            return "加油";
        }
        return "";
    }
}
