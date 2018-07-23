package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibLibProcUtilStreamHelperTest {
    @Test
    public void testValidLibLibProcUtilStream() {
		LibLibProcUtilStreamHelper helper = new LibLibProcUtilStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibLibProcUtilStream() {
	LibLibProcUtilStreamHelper helper = new LibLibProcUtilStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseLibLibProcUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseLibLibProcUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLibLibProcUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
