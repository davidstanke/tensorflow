package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibIOListAsyncDataHelperTest {
    @Test
    public void testValidLibIOListAsyncData() {
		LibIOListAsyncDataHelper helper = new LibIOListAsyncDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibIOListAsyncData() {
	LibIOListAsyncDataHelper helper = new LibIOListAsyncDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseLibIOListAsyncData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseLibIOListAsyncData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
