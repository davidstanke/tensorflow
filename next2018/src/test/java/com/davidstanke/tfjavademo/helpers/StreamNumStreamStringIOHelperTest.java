package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamNumStreamStringIOHelperTest {
    @Test
    public void testValidStreamNumStreamStringIO() {
		StreamNumStreamStringIOHelper helper = new StreamNumStreamStringIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamNumStreamStringIO() {
	StreamNumStreamStringIOHelper helper = new StreamNumStreamStringIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStreamNumStreamStringIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
