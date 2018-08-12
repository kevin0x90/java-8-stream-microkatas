package org.k3v1n;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {
    public static List<String> transform(final List<String> collection) {
        return collection.stream().filter(elem -> elem.length() < 4).collect(Collectors.toList());
    }
}
