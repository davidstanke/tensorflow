package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListReadDataArrayHelperTest {
    @Test
    public void testValidListReadDataArray() {
		ListReadDataArrayHelper helper = new ListReadDataArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidListReadDataArray() {
	ListReadDataArrayHelper helper = new ListReadDataArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseListReadDataArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
