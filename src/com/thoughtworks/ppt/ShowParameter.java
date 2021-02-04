package com.thoughtworks.ppt;

import java.util.Arrays;
import java.util.List;

public class ShowParameter {
    public static void main(String[] args) {
        List<Integer> collection = Arrays.asList(2, 4, 0);
        System.out.println(joinToString(collection, "-", "[", "]"));
    }

    public static String joinToString(List<Integer> collection,
                                      String separator,
                                      String prefix,
                                      String postfix) {
        StringBuilder result = new StringBuilder(prefix);

        for (int i = 0; i < collection.size(); i++) {
            if (i > 0) {
                result.append(separator);
            }
            result.append(collection.get(i));
        }
        result.append(postfix);
        return result.toString();
    }
}
