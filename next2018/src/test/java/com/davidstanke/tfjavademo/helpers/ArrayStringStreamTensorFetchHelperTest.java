package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayStringStreamTensorFetchHelperTest {
    @Test
    public void testValidArrayStringStreamTensorFetch() {
		ArrayStringStreamTensorFetchHelper helper = new ArrayStringStreamTensorFetchHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayStringStreamTensorFetch() {
	ArrayStringStreamTensorFetchHelper helper = new ArrayStringStreamTensorFetchHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseArrayStringStreamTensorFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayStringStreamTensorFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
