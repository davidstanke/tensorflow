package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteUtilUtilIOArrayHelperTest {
    @Test
    public void testHelperWriteUtilUtilIOArray() {
		WriteUtilUtilIOArrayHelper helper = new WriteUtilUtilIOArrayHelper();
		assertEquals(helper.help(),"valid");
    }
}

