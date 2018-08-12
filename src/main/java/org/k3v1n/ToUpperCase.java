package org.k3v1n;

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static List<String> transform(final List<String> stringsToTransform) {

        return stringsToTransform.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
