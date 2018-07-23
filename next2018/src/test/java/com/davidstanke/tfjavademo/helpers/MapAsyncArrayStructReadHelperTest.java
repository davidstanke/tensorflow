package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapAsyncArrayStructReadHelperTest {
    @Test
    public void testHelperMapAsyncArrayStructRead() {
		MapAsyncArrayStructReadHelper helper = new MapAsyncArrayStructReadHelper();
		assertEquals(helper.help(),"valid");
    }
}

