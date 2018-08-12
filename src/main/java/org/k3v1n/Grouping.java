package org.k3v1n;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static Map<String, List<Person>> groupByNationality(final List<Person> collection) {
       return collection.stream().collect(Collectors.groupingBy(Person::getNationality));
    }
}
