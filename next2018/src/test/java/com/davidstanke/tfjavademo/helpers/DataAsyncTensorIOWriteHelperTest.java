package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataAsyncTensorIOWriteHelperTest {
    @Test
    public void testValidDataAsyncTensorIOWrite() {
		DataAsyncTensorIOWriteHelper helper = new DataAsyncTensorIOWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseDataAsyncTensorIOWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseDataAsyncTensorIOWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataAsyncTensorIOWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
