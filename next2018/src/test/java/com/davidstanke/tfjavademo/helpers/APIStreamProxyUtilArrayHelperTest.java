package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIStreamProxyUtilArrayHelperTest {
    @Test
    public void testHelperAPIStreamProxyUtilArray() {
		APIStreamProxyUtilArrayHelper helper = new APIStreamProxyUtilArrayHelper();
		assertEquals(helper.help(),"valid");
    }
}

