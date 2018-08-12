package org.k3v1n;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatCollection {

    public static List<String> transform(final List<List<String>> collection) {
       return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
