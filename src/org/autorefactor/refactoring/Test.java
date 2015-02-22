package org.autorefactor.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static boolean printIfCommon(List<String> names1, List<String> names2, boolean checkNames, boolean checkAdditional) {
        if (checkNames) {
            boolean found = false;
            for (String s1 : names1) {
                for (String s2 : names2) {
                    if (s1.equalsIgnoreCase(s2)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                System.out.println("Common name exist");
                return true;
            }
        } else {
            if (checkAdditional) {
                final List<String> copyNames = new ArrayList<String>();
                for (String name : names2) {
                    copyNames.add(name);
                }
                boolean found = false;
                for (String s1 : names1) {
                    for (String s2 : copyNames) {
                        if (s1.equalsIgnoreCase(s2)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
                if (found) {
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
}
