package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.Grouping.groupByNationality;

public class GroupingSpec {

    @Test
    public void groupByNationalityShouldSeparateNationalities() {

        final Person sara = new Person("Sara", 4, "Norwegian");
        final Person viktor = new Person("Viktor", 40, "Serbian");
        final Person eva = new Person("Eva", 42, "Norwegian");
        final List<Person> collection = asList(sara, viktor, eva);

        final Map<String, List<Person>> result = groupByNationality(collection);

        assertThat(result.get("Serbian"), is(equalTo(asList(viktor))));
        assertThat(result.get("Norwegian"), is(equalTo(asList(sara, eva))));
    }
}
