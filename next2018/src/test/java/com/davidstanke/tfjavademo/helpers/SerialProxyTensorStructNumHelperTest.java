package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialProxyTensorStructNumHelperTest {
    @Test
    public void testValidSerialProxyTensorStructNum() {
		SerialProxyTensorStructNumHelper helper = new SerialProxyTensorStructNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialProxyTensorStructNum() {
	SerialProxyTensorStructNumHelper helper = new SerialProxyTensorStructNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseSerialProxyTensorStructNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseSerialProxyTensorStructNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialProxyTensorStructNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
