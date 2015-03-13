package it.jdark.android.projectfromscratch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jdark on 13/03/15.
 */
public class SimpleUnitTest {

    @Test
    public void checkJUnitWork() {
        // failing test gives much better feedback
        // to show that all works correctly ;)
        assertThat(true, is(true));
    }
}
