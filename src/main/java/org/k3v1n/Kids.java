package org.k3v1n;

import java.util.List;
import java.util.stream.Collectors;

public class Kids {

    public static List<String> getKidNames(final List<Person> kids) {
        return kids.stream()
                .filter(k -> k.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
