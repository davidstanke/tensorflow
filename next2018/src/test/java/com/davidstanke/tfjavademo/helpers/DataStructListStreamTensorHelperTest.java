package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataStructListStreamTensorHelperTest {
    @Test
    public void testValidDataStructListStreamTensor() {
		DataStructListStreamTensorHelper helper = new DataStructListStreamTensorHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidDataStructListStreamTensor() {
	DataStructListStreamTensorHelper helper = new DataStructListStreamTensorHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
}
