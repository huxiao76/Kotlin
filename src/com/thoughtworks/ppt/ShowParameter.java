    package com.thoughtworks.ppt;

    class Person {
        private String name;
        private int age;
        private String address;
        private String emain;

        public Person(String name, String address) {
            this.name = name;
            this.age = 20;
            this.address = address;
            this.emain = "123@tw.com";
        }

        public Person(String name, int age, String address, String emain) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.emain = emain;
        }
    }

    public class ShowParameter {
        public static void main(String[] args) {
            Person person = new Person("zhangsan", 20,
                    "wuhan", "123@tw.com");

            Person person1 = new Person("lisi", "wuhan");
        }
    }
