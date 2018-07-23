package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APITensorDataListLibHelperTest {
    @Test
    public void testValidAPITensorDataListLib() {
		APITensorDataListLibHelper helper = new APITensorDataListLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPITensorDataListLib() {
	APITensorDataListLibHelper helper = new APITensorDataListLibHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPITensorDataListLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAPITensorDataListLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPITensorDataListLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
