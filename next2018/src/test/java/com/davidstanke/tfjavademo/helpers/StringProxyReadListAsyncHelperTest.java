package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringProxyReadListAsyncHelperTest {
    @Test
    public void testValidStringProxyReadListAsync() {
		StringProxyReadListAsyncHelper helper = new StringProxyReadListAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseStringProxyReadListAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringProxyReadListAsync0() {
	assertFalse(5056==5056+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync1() {
	assertFalse(18759==18759+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync2() {
	assertFalse(2774==2774+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync3() {
	assertFalse(3294==3294+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync4() {
	assertFalse(22023==22023+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync5() {
	assertFalse(15600==15600+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync6() {
	assertFalse(29234==29234+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync7() {
	assertFalse(24213==24213+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync8() {
	assertFalse(10714==10714+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync9() {
	assertFalse(15403==15403+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync10() {
	assertFalse(26110==26110+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync11() {
	assertFalse(17666==17666+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync12() {
	assertFalse(22261==22261+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync13() {
	assertFalse(2567==2567+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync14() {
	assertFalse(28197==28197+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync15() {
	assertFalse(7003==7003+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync16() {
	assertFalse(10551==10551+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync17() {
	assertFalse(22427==22427+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync18() {
	assertFalse(23830==23830+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync19() {
	assertFalse(14409==14409+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync20() {
	assertFalse(29400==29400+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync21() {
	assertFalse(32654==32654+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync22() {
	assertFalse(21092==21092+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync23() {
	assertFalse(4691==4691+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync24() {
	assertFalse(30315==30315+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync25() {
	assertFalse(28257==28257+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync26() {
	assertFalse(19228==19228+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync27() {
	assertFalse(16138==16138+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync28() {
	assertFalse(29843==29843+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync29() {
	assertFalse(17283==17283+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync30() {
	assertFalse(23530==23530+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync31() {
	assertFalse(14585==14585+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync32() {
	assertFalse(22917==22917+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync33() {
	assertFalse(30483==30483+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync34() {
	assertFalse(28906==28906+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync35() {
	assertFalse(6219==6219+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync36() {
	assertFalse(17985==17985+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync37() {
	assertFalse(4211==4211+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync38() {
	assertFalse(12111==12111+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync39() {
	assertFalse(10810==10810+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync40() {
	assertFalse(29072==29072+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync41() {
	assertFalse(14737==14737+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync42() {
	assertFalse(21686==21686+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync43() {
	assertFalse(4924==4924+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync44() {
	assertFalse(7356==7356+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync45() {
	assertFalse(15092==15092+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync46() {
	assertFalse(12360==12360+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync47() {
	assertFalse(26604==26604+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync48() {
	assertFalse(6162==6162+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync49() {
	assertFalse(11400==11400+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync50() {
	assertFalse(4498==4498+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync51() {
	assertFalse(26809==26809+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync52() {
	assertFalse(4888==4888+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync53() {
	assertFalse(26410==26410+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync54() {
	assertFalse(18724==18724+1);
}
@Test
public void bigFalseTestStringProxyReadListAsync55() {
	assertFalse(19536==19536+1);
}
}
