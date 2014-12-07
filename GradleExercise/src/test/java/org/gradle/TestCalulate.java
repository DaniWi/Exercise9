package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalulate {

    @Test
    public void test() {
	assertEquals(27, Calculate.pow(3));
    }

}
