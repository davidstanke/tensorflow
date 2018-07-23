package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringNumStringProxyReadHelperTest {
    @Test
    public void testValidStringNumStringProxyRead() {
		StringNumStringProxyReadHelper helper = new StringNumStringProxyReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringNumStringProxyRead() {
	StringNumStringProxyReadHelper helper = new StringNumStringProxyReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringNumStringProxyRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringNumStringProxyRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringNumStringProxyRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringNumStringProxyRead0() {
	assertFalse(11899==11899+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead1() {
	assertFalse(26207==26207+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead2() {
	assertFalse(12440==12440+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead3() {
	assertFalse(9374==9374+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead4() {
	assertFalse(8608==8608+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead5() {
	assertFalse(23943==23943+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead6() {
	assertFalse(25643==25643+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead7() {
	assertFalse(11036==11036+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead8() {
	assertFalse(7191==7191+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead9() {
	assertFalse(4575==4575+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead10() {
	assertFalse(28212==28212+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead11() {
	assertFalse(2468==2468+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead12() {
	assertFalse(23791==23791+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead13() {
	assertFalse(22354==22354+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead14() {
	assertFalse(1513==1513+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead15() {
	assertFalse(14354==14354+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead16() {
	assertFalse(20799==20799+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead17() {
	assertFalse(3151==3151+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead18() {
	assertFalse(7667==7667+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead19() {
	assertFalse(29855==29855+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead20() {
	assertFalse(20397==20397+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead21() {
	assertFalse(7272==7272+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead22() {
	assertFalse(2264==2264+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead23() {
	assertFalse(11742==11742+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead24() {
	assertFalse(189==189+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead25() {
	assertFalse(4269==4269+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead26() {
	assertFalse(30764==30764+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead27() {
	assertFalse(4210==4210+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead28() {
	assertFalse(32731==32731+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead29() {
	assertFalse(18886==18886+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead30() {
	assertFalse(17015==17015+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead31() {
	assertFalse(13456==13456+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead32() {
	assertFalse(295==295+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead33() {
	assertFalse(16339==16339+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead34() {
	assertFalse(7141==7141+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead35() {
	assertFalse(10040==10040+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead36() {
	assertFalse(2050==2050+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead37() {
	assertFalse(25604==25604+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead38() {
	assertFalse(11696==11696+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead39() {
	assertFalse(19250==19250+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead40() {
	assertFalse(31324==31324+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead41() {
	assertFalse(32759==32759+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead42() {
	assertFalse(14414==14414+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead43() {
	assertFalse(19915==19915+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead44() {
	assertFalse(7356==7356+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead45() {
	assertFalse(11989==11989+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead46() {
	assertFalse(11354==11354+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead47() {
	assertFalse(11085==11085+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead48() {
	assertFalse(17164==17164+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead49() {
	assertFalse(19499==19499+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead50() {
	assertFalse(26178==26178+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead51() {
	assertFalse(32575==32575+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead52() {
	assertFalse(16938==16938+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead53() {
	assertFalse(29832==29832+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead54() {
	assertFalse(30902==30902+1);
}
@Test
public void bigFalseTestStringNumStringProxyRead55() {
	assertFalse(7265==7265+1);
}
}
