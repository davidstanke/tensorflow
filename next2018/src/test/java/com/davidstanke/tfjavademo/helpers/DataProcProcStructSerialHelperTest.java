package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataProcProcStructSerialHelperTest {
    @Test
    public void testValidDataProcProcStructSerial() {
		DataProcProcStructSerialHelper helper = new DataProcProcStructSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseDataProcProcStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseDataProcProcStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataProcProcStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
}
