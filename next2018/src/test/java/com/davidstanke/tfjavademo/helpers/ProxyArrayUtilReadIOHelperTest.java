package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProxyArrayUtilReadIOHelperTest {
    @Test
    public void testValidProxyArrayUtilReadIO() {
		ProxyArrayUtilReadIOHelper helper = new ProxyArrayUtilReadIOHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProxyArrayUtilReadIO() {
	ProxyArrayUtilReadIOHelper helper = new ProxyArrayUtilReadIOHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProxyArrayUtilReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProxyArrayUtilReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProxyArrayUtilReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProxyArrayUtilReadIO() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
