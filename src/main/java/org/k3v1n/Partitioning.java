package org.k3v1n;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults(final List<Person> collection) {
       return collection.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
    }
}
