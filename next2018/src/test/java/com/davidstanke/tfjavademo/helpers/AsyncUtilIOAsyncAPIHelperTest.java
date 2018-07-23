package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncUtilIOAsyncAPIHelperTest {
    @Test
    public void testValidAsyncUtilIOAsyncAPI() {
		AsyncUtilIOAsyncAPIHelper helper = new AsyncUtilIOAsyncAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncUtilIOAsyncAPI() {
	AsyncUtilIOAsyncAPIHelper helper = new AsyncUtilIOAsyncAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAsyncUtilIOAsyncAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
