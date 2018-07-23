package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncStreamProxyAsyncArrayHelperTest {
    @Test
    public void testValidAsyncStreamProxyAsyncArray() {
		AsyncStreamProxyAsyncArrayHelper helper = new AsyncStreamProxyAsyncArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncStreamProxyAsyncArray() {
	AsyncStreamProxyAsyncArrayHelper helper = new AsyncStreamProxyAsyncArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAsyncStreamProxyAsyncArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAsyncStreamProxyAsyncArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
