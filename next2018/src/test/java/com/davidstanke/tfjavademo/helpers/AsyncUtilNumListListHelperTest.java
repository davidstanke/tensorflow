package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class AsyncUtilNumListListHelperTest {
    @Test
    public void testValidAsyncUtilNumListList() {
		AsyncUtilNumListListHelper helper = new AsyncUtilNumListListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAsyncUtilNumListList() {
	AsyncUtilNumListListHelper helper = new AsyncUtilNumListListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseAsyncUtilNumListList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAsyncUtilNumListList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
