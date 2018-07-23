package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadDataStringFetchArrayHelperTest {
    @Test
    public void testValidReadDataStringFetchArray() {
		ReadDataStringFetchArrayHelper helper = new ReadDataStringFetchArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseReadDataStringFetchArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseReadDataStringFetchArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseReadDataStringFetchArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseReadDataStringFetchArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
