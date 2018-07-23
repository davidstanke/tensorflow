package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcMapNumProcStreamHelperTest {
    @Test
    public void testHelperProcMapNumProcStream() {
		ProcMapNumProcStreamHelper helper = new ProcMapNumProcStreamHelper();
		assertEquals(helper.help(),"valid");
    }
}

