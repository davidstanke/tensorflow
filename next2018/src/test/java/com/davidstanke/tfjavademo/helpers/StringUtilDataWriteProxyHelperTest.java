package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringUtilDataWriteProxyHelperTest {
    @Test
    public void testValidStringUtilDataWriteProxy() {
		StringUtilDataWriteProxyHelper helper = new StringUtilDataWriteProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringUtilDataWriteProxy() {
	StringUtilDataWriteProxyHelper helper = new StringUtilDataWriteProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStringUtilDataWriteProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringUtilDataWriteProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
