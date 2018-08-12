package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.FlatCollection.transform;

public class FlatCollectionSpec {

    @Test
    public void transformShouldFlattenCollection() {
       final List<List<String>> collection = asList(asList("Viktor", "Faric"), asList("John", "Doe", "Third"));
       final List<String> expected = asList("Viktor", "Faric", "John", "Doe", "Third");

       assertThat(transform(collection), is(equalTo(expected)));
    }
}
