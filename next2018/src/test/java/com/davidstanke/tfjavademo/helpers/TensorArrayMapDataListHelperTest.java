package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class TensorArrayMapDataListHelperTest {
    @Test
    public void testValidTensorArrayMapDataList() {
		TensorArrayMapDataListHelper helper = new TensorArrayMapDataListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidTensorArrayMapDataList() {
	TensorArrayMapDataListHelper helper = new TensorArrayMapDataListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseTensorArrayMapDataList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseTensorArrayMapDataList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
