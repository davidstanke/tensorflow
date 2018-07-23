package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructStructLibIOIOHelperTest {
    @Test
    public void testValidStructStructLibIOIO() {
		StructStructLibIOIOHelper helper = new StructStructLibIOIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseStructStructLibIOIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
