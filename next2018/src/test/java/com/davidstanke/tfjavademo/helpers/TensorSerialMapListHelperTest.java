package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class TensorSerialMapListHelperTest {
    @Test
    public void testValidTensorSerialMapList() {
		TensorSerialMapListHelper helper = new TensorSerialMapListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidTensorSerialMapList() {
	TensorSerialMapListHelper helper = new TensorSerialMapListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseTensorSerialMapList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseTensorSerialMapList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
