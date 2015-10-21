package org.autorefactor.refactoring;

import java.util.ArrayList;
import java.util.List;

public class CommonPrinter {

    static boolean printIfCommon(List<String> names1, List<String> names2, boolean checkNames, boolean checkAdditional) {
        if (checkNames) {
            if (containsAnyIgnoreCase(names1, names2)) {
                System.out.println("Common name exist");
                return true;
            }
        } else {
            if (checkAdditional) {
                final List<String> copyNames = new ArrayList<String>();
                copyNames.addAll(names2);
                if (containsAnyIgnoreCase(names1, copyNames)) {
                    System.out.println("Same name exist");
                } else {
                    System.out.println("No similar name exist");
                    return false;
                }
            }
        }
        System.out.println("No common name");
        return false;
    }

    private static boolean containsAnyIgnoreCase(List<String> names1, List<String> names2) {
        for (String s1 : names1) {
            for (String s2 : names2) {
                if (s1.equalsIgnoreCase(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
