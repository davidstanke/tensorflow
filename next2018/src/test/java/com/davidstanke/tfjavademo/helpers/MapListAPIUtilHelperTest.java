package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapListAPIUtilHelperTest {
    @Test
    public void testValidMapListAPIUtil() {
		MapListAPIUtilHelper helper = new MapListAPIUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseMapListAPIUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseMapListAPIUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapListAPIUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseMapListAPIUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
