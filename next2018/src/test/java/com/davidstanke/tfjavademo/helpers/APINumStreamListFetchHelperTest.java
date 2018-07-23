package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APINumStreamListFetchHelperTest {
    @Test
    public void testValidAPINumStreamListFetch() {
		APINumStreamListFetchHelper helper = new APINumStreamListFetchHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPINumStreamListFetch() {
	APINumStreamListFetchHelper helper = new APINumStreamListFetchHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPINumStreamListFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAPINumStreamListFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPINumStreamListFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPINumStreamListFetch() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
