package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapStructArrayLibReadHelperTest {
    @Test
    public void testValidMapStructArrayLibRead() {
		MapStructArrayLibReadHelper helper = new MapStructArrayLibReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidMapStructArrayLibRead() {
	MapStructArrayLibReadHelper helper = new MapStructArrayLibReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseMapStructArrayLibRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseMapStructArrayLibRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapStructArrayLibRead0() {
	assertFalse(14418==14418+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead1() {
	assertFalse(511==511+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead2() {
	assertFalse(15280==15280+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead3() {
	assertFalse(26691==26691+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead4() {
	assertFalse(5950==5950+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead5() {
	assertFalse(13516==13516+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead6() {
	assertFalse(16243==16243+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead7() {
	assertFalse(28154==28154+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead8() {
	assertFalse(26942==26942+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead9() {
	assertFalse(10339==10339+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead10() {
	assertFalse(17647==17647+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead11() {
	assertFalse(25841==25841+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead12() {
	assertFalse(12095==12095+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead13() {
	assertFalse(26096==26096+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead14() {
	assertFalse(25777==25777+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead15() {
	assertFalse(16078==16078+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead16() {
	assertFalse(27212==27212+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead17() {
	assertFalse(25146==25146+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead18() {
	assertFalse(17246==17246+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead19() {
	assertFalse(22515==22515+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead20() {
	assertFalse(24252==24252+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead21() {
	assertFalse(32600==32600+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead22() {
	assertFalse(5830==5830+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead23() {
	assertFalse(17822==17822+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead24() {
	assertFalse(24091==24091+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead25() {
	assertFalse(28212==28212+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead26() {
	assertFalse(28592==28592+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead27() {
	assertFalse(27074==27074+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead28() {
	assertFalse(17369==17369+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead29() {
	assertFalse(11201==11201+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead30() {
	assertFalse(21600==21600+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead31() {
	assertFalse(26786==26786+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead32() {
	assertFalse(4277==4277+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead33() {
	assertFalse(5628==5628+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead34() {
	assertFalse(30696==30696+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead35() {
	assertFalse(23603==23603+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead36() {
	assertFalse(20711==20711+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead37() {
	assertFalse(21668==21668+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead38() {
	assertFalse(6708==6708+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead39() {
	assertFalse(24879==24879+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead40() {
	assertFalse(14608==14608+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead41() {
	assertFalse(4536==4536+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead42() {
	assertFalse(23763==23763+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead43() {
	assertFalse(23033==23033+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead44() {
	assertFalse(9698==9698+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead45() {
	assertFalse(15797==15797+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead46() {
	assertFalse(6277==6277+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead47() {
	assertFalse(820==820+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead48() {
	assertFalse(27279==27279+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead49() {
	assertFalse(23436==23436+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead50() {
	assertFalse(32650==32650+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead51() {
	assertFalse(13857==13857+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead52() {
	assertFalse(6642==6642+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead53() {
	assertFalse(4197==4197+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead54() {
	assertFalse(6309==6309+1);
}
@Test
public void bigFalseTestMapStructArrayLibRead55() {
	assertFalse(29884==29884+1);
}
}
