package org.k3v1n;

import java.util.List;

public class Sum {

    public static int calculate(final List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n).sum();
    }
}
