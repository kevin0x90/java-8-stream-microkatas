package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.k3v1n.FilterCollection.transform;

public class FilterCollectionSpec {

    @Test
    public void transformShouldFilterCollection() {
       final List<String> collection = asList("My", "name", "is", "John", "Doe");
       final List<String> expected = asList("My", "is", "Doe");

       assertThat(transform(collection), is(equalTo(expected)));
    }
}
