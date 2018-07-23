package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcMapAPIAsyncHelperTest {
    @Test
    public void testValidProcMapAPIAsync() {
		ProcMapAPIAsyncHelper helper = new ProcMapAPIAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcMapAPIAsync() {
	ProcMapAPIAsyncHelper helper = new ProcMapAPIAsyncHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseProcMapAPIAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcMapAPIAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
