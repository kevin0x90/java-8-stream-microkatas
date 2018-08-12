package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.Joining.namesToString;

public class JoiningSpec {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        final Person sara = new Person("Sara", 4);
        final Person viktor = new Person("Viktor", 40);
        final Person eva = new Person("Eva", 42);
        final List<Person> collection = asList(sara, viktor, eva);

        assertThat(namesToString(collection), is(equalTo("Names: Sara, Viktor, Eva")));
    }
}
