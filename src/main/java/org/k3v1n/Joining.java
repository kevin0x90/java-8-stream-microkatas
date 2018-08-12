package org.k3v1n;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static String namesToString(final List<Person> collection) {
        return "Names: " + collection.stream().map(Person::getName).collect(Collectors.joining(", "));
    }
}
