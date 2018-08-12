package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.ToUpperCase.transform;


public class ToUpperCaseSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        final List<String> collection = asList("My", "name", "is", "John", "Doe");
        final List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");

        assertThat(transform(collection), is(equalTo(expected)));
    }
}
