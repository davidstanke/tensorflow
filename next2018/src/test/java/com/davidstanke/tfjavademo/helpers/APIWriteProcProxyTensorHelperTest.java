package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIWriteProcProxyTensorHelperTest {
    @Test
    public void testValidAPIWriteProcProxyTensor() {
		APIWriteProcProxyTensorHelper helper = new APIWriteProcProxyTensorHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseAPIWriteProcProxyTensor() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIWriteProcProxyTensor() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPIWriteProcProxyTensor() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
