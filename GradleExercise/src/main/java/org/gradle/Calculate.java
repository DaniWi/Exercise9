package org.gradle;

import com.google.common.math.IntMath;

public class Calculate {

    public static int pow(int value) {
	System.out.println(IntMath.pow(value, 3));
	return IntMath.pow(value, 3);
    }
}
