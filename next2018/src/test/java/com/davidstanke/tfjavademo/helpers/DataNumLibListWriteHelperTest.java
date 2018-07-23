package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataNumLibListWriteHelperTest {
    @Test
    public void testValidDataNumLibListWrite() {
		DataNumLibListWriteHelper helper = new DataNumLibListWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseDataNumLibListWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
