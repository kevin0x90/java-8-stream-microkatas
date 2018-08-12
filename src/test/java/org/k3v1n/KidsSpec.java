package org.k3v1n;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3v1n.Kids.getKidNames;

public class KidsSpec {

    @Test
    public void getKidNamesShouldReturnNamesOfAllKidsUnder18() {
        final Person sara = new Person("Sara", 4);
        final Person viktor = new Person("Viktor", 40);
        final Person eva = new Person("Eva", 42);
        final Person anna = new Person("Anna", 5);

        final List<Person> collection = asList(sara, viktor, eva, anna);
        final List<String> expected = asList("Sara", "Anna");

        assertThat(getKidNames(collection), is(equalTo(expected)));
    }
}
