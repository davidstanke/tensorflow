package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumWriteWriteArraySerialHelperTest {
    @Test
    public void testValidNumWriteWriteArraySerial() {
		NumWriteWriteArraySerialHelper helper = new NumWriteWriteArraySerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseNumWriteWriteArraySerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
