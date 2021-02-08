package com.thoughtworks.ppt;

public class StringDemo {
    public static void main(String[] args) {
        String name = "小丽";
        int age = 20;
        String address = "wuhan";
        String message = String.format("\"name\" : \"%s\" \n " +
                "\"age\" : %d \n " +
                "\"address\" : \"%s\" \n", name, age, address);
        System.out.println(message);
    }
}
