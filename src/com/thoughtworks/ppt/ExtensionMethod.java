    package com.thoughtworks.ppt;

    public class ExtensionMethod {
        public static void main(String[] args) {
            String str = "hello world";
            System.out.println(StringUtil.reverse(str));
            System.out.println(StringUtil.sort(str, false));
            System.out.println(StringUtil.sort(str, true));
        }
    }
    class StringUtil {
        public static String reverse(String input) {
            char[] arr = input.toCharArray();
            for (int i = 0; i < arr.length/2; i++) {
                char temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
            return new String(arr);
        }
        public static String sort(String input, boolean desc) {
            char[] arr = input.toCharArray();
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }

                char tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }

            if(desc) {
                return reverse(new String(arr));
            }
            return new String(arr);
        }
    }
