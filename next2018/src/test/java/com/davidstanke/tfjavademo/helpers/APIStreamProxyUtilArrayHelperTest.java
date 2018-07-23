package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIStreamProxyUtilArrayHelperTest {
    @Test
    public void testValidAPIStreamProxyUtilArray() {
		APIStreamProxyUtilArrayHelper helper = new APIStreamProxyUtilArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIStreamProxyUtilArray() {
	APIStreamProxyUtilArrayHelper helper = new APIStreamProxyUtilArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPIStreamProxyUtilArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAPIStreamProxyUtilArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIStreamProxyUtilArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
