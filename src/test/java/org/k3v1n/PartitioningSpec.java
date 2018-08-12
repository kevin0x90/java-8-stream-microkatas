package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.Partitioning.partitionAdults;

public class PartitioningSpec {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        final Person sara = new Person("Sara", 4);
        final Person viktor = new Person("Viktor", 40);
        final Person eva = new Person("Eva", 42);

        final List<Person> collection = asList(sara, viktor, eva);
        final Map<Boolean, List<Person>> result = partitionAdults(collection);

        assertThat(result.get(true), is(equalTo(asList(viktor, eva))));
        assertThat(result.get(false), is(equalTo(asList(sara))));
    }
}
