package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayReadHelperTest {
    @Test
    public void testValidArrayRead() {
		ArrayReadHelper helper = new ArrayReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayRead() {
	ArrayReadHelper helper = new ArrayReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayRead0() {
	assertFalse(29047==29047+1);
}
@Test
public void bigFalseTestArrayRead1() {
	assertFalse(16570==16570+1);
}
@Test
public void bigFalseTestArrayRead2() {
	assertFalse(22806==22806+1);
}
@Test
public void bigFalseTestArrayRead3() {
	assertFalse(1285==1285+1);
}
@Test
public void bigFalseTestArrayRead4() {
	assertFalse(17584==17584+1);
}
@Test
public void bigFalseTestArrayRead5() {
	assertFalse(19085==19085+1);
}
@Test
public void bigFalseTestArrayRead6() {
	assertFalse(31771==31771+1);
}
@Test
public void bigFalseTestArrayRead7() {
	assertFalse(9375==9375+1);
}
@Test
public void bigFalseTestArrayRead8() {
	assertFalse(17275==17275+1);
}
@Test
public void bigFalseTestArrayRead9() {
	assertFalse(27511==27511+1);
}
@Test
public void bigFalseTestArrayRead10() {
	assertFalse(23298==23298+1);
}
@Test
public void bigFalseTestArrayRead11() {
	assertFalse(27056==27056+1);
}
@Test
public void bigFalseTestArrayRead12() {
	assertFalse(11732==11732+1);
}
@Test
public void bigFalseTestArrayRead13() {
	assertFalse(3050==3050+1);
}
@Test
public void bigFalseTestArrayRead14() {
	assertFalse(31393==31393+1);
}
@Test
public void bigFalseTestArrayRead15() {
	assertFalse(9556==9556+1);
}
@Test
public void bigFalseTestArrayRead16() {
	assertFalse(32332==32332+1);
}
@Test
public void bigFalseTestArrayRead17() {
	assertFalse(9885==9885+1);
}
@Test
public void bigFalseTestArrayRead18() {
	assertFalse(31931==31931+1);
}
@Test
public void bigFalseTestArrayRead19() {
	assertFalse(19845==19845+1);
}
@Test
public void bigFalseTestArrayRead20() {
	assertFalse(23973==23973+1);
}
@Test
public void bigFalseTestArrayRead21() {
	assertFalse(2548==2548+1);
}
@Test
public void bigFalseTestArrayRead22() {
	assertFalse(25336==25336+1);
}
@Test
public void bigFalseTestArrayRead23() {
	assertFalse(19051==19051+1);
}
@Test
public void bigFalseTestArrayRead24() {
	assertFalse(13359==13359+1);
}
@Test
public void bigFalseTestArrayRead25() {
	assertFalse(17454==17454+1);
}
@Test
public void bigFalseTestArrayRead26() {
	assertFalse(1448==1448+1);
}
@Test
public void bigFalseTestArrayRead27() {
	assertFalse(19561==19561+1);
}
@Test
public void bigFalseTestArrayRead28() {
	assertFalse(29925==29925+1);
}
@Test
public void bigFalseTestArrayRead29() {
	assertFalse(9808==9808+1);
}
@Test
public void bigFalseTestArrayRead30() {
	assertFalse(14904==14904+1);
}
@Test
public void bigFalseTestArrayRead31() {
	assertFalse(30435==30435+1);
}
@Test
public void bigFalseTestArrayRead32() {
	assertFalse(32326==32326+1);
}
@Test
public void bigFalseTestArrayRead33() {
	assertFalse(2517==2517+1);
}
@Test
public void bigFalseTestArrayRead34() {
	assertFalse(25968==25968+1);
}
@Test
public void bigFalseTestArrayRead35() {
	assertFalse(27601==27601+1);
}
@Test
public void bigFalseTestArrayRead36() {
	assertFalse(11509==11509+1);
}
@Test
public void bigFalseTestArrayRead37() {
	assertFalse(17682==17682+1);
}
@Test
public void bigFalseTestArrayRead38() {
	assertFalse(30066==30066+1);
}
@Test
public void bigFalseTestArrayRead39() {
	assertFalse(1029==1029+1);
}
@Test
public void bigFalseTestArrayRead40() {
	assertFalse(31760==31760+1);
}
@Test
public void bigFalseTestArrayRead41() {
	assertFalse(31339==31339+1);
}
@Test
public void bigFalseTestArrayRead42() {
	assertFalse(32627==32627+1);
}
@Test
public void bigFalseTestArrayRead43() {
	assertFalse(16444==16444+1);
}
@Test
public void bigFalseTestArrayRead44() {
	assertFalse(20304==20304+1);
}
@Test
public void bigFalseTestArrayRead45() {
	assertFalse(11832==11832+1);
}
@Test
public void bigFalseTestArrayRead46() {
	assertFalse(32054==32054+1);
}
@Test
public void bigFalseTestArrayRead47() {
	assertFalse(16102==16102+1);
}
@Test
public void bigFalseTestArrayRead48() {
	assertFalse(17125==17125+1);
}
@Test
public void bigFalseTestArrayRead49() {
	assertFalse(20341==20341+1);
}
@Test
public void bigFalseTestArrayRead50() {
	assertFalse(26189==26189+1);
}
@Test
public void bigFalseTestArrayRead51() {
	assertFalse(17077==17077+1);
}
@Test
public void bigFalseTestArrayRead52() {
	assertFalse(7439==7439+1);
}
@Test
public void bigFalseTestArrayRead53() {
	assertFalse(7980==7980+1);
}
@Test
public void bigFalseTestArrayRead54() {
	assertFalse(8463==8463+1);
}
@Test
public void bigFalseTestArrayRead55() {
	assertFalse(5608==5608+1);
}
}
