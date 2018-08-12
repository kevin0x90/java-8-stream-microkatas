package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.Sum.calculate;

public class SumSpec {

    @Test
    public void transformShouldSumUpAllElements() {
        final List<Integer> numbers = asList(1, 2, 3, 4, 5);
        final int expected = 15;

        assertThat(calculate(numbers), is(equalTo(expected)));
    }
}
