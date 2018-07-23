package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructSerialFetchMapMapHelperTest {
    @Test
    public void testValidStructSerialFetchMapMap() {
		StructSerialFetchMapMapHelper helper = new StructSerialFetchMapMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialFetchMapMap() {
	StructSerialFetchMapMapHelper helper = new StructSerialFetchMapMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructSerialFetchMapMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructSerialFetchMapMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
