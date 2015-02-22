package org.autorefactor.refactoring;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names1 = NameDAO.getNames(args[0]);
        List<String> names2 = NameDAO.getNames(args[1]);
        new CommonPrinter().printIfCommon(names1, names2, true, true);
    }

}
