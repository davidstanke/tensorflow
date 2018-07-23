package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IONumStringReadHelperTest {
    @Test
    public void testValidIONumStringRead() {
		IONumStringReadHelper helper = new IONumStringReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidIONumStringRead() {
	IONumStringReadHelper helper = new IONumStringReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
}
