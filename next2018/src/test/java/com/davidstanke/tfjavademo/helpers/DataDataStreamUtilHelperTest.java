package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataDataStreamUtilHelperTest {
    @Test
    public void testValidDataDataStreamUtil() {
		DataDataStreamUtilHelper helper = new DataDataStreamUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseDataDataStreamUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataDataStreamUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
