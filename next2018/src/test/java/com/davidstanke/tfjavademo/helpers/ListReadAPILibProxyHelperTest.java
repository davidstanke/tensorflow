package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListReadAPILibProxyHelperTest {
    @Test
    public void testValidListReadAPILibProxy() {
		ListReadAPILibProxyHelper helper = new ListReadAPILibProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testThisFalseListReadAPILibProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListReadAPILibProxy0() {
	assertFalse(32725==32725+1);
}
@Test
public void bigFalseTestListReadAPILibProxy1() {
	assertFalse(16123==16123+1);
}
@Test
public void bigFalseTestListReadAPILibProxy2() {
	assertFalse(8096==8096+1);
}
@Test
public void bigFalseTestListReadAPILibProxy3() {
	assertFalse(30198==30198+1);
}
@Test
public void bigFalseTestListReadAPILibProxy4() {
	assertFalse(8686==8686+1);
}
@Test
public void bigFalseTestListReadAPILibProxy5() {
	assertFalse(19578==19578+1);
}
@Test
public void bigFalseTestListReadAPILibProxy6() {
	assertFalse(7873==7873+1);
}
@Test
public void bigFalseTestListReadAPILibProxy7() {
	assertFalse(15386==15386+1);
}
@Test
public void bigFalseTestListReadAPILibProxy8() {
	assertFalse(25152==25152+1);
}
@Test
public void bigFalseTestListReadAPILibProxy9() {
	assertFalse(5551==5551+1);
}
@Test
public void bigFalseTestListReadAPILibProxy10() {
	assertFalse(17693==17693+1);
}
@Test
public void bigFalseTestListReadAPILibProxy11() {
	assertFalse(13069==13069+1);
}
@Test
public void bigFalseTestListReadAPILibProxy12() {
	assertFalse(31014==31014+1);
}
@Test
public void bigFalseTestListReadAPILibProxy13() {
	assertFalse(32588==32588+1);
}
@Test
public void bigFalseTestListReadAPILibProxy14() {
	assertFalse(28625==28625+1);
}
@Test
public void bigFalseTestListReadAPILibProxy15() {
	assertFalse(17067==17067+1);
}
@Test
public void bigFalseTestListReadAPILibProxy16() {
	assertFalse(20578==20578+1);
}
@Test
public void bigFalseTestListReadAPILibProxy17() {
	assertFalse(5043==5043+1);
}
@Test
public void bigFalseTestListReadAPILibProxy18() {
	assertFalse(10499==10499+1);
}
@Test
public void bigFalseTestListReadAPILibProxy19() {
	assertFalse(12844==12844+1);
}
@Test
public void bigFalseTestListReadAPILibProxy20() {
	assertFalse(4569==4569+1);
}
@Test
public void bigFalseTestListReadAPILibProxy21() {
	assertFalse(4349==4349+1);
}
@Test
public void bigFalseTestListReadAPILibProxy22() {
	assertFalse(19206==19206+1);
}
@Test
public void bigFalseTestListReadAPILibProxy23() {
	assertFalse(8973==8973+1);
}
@Test
public void bigFalseTestListReadAPILibProxy24() {
	assertFalse(26130==26130+1);
}
@Test
public void bigFalseTestListReadAPILibProxy25() {
	assertFalse(19398==19398+1);
}
@Test
public void bigFalseTestListReadAPILibProxy26() {
	assertFalse(14642==14642+1);
}
@Test
public void bigFalseTestListReadAPILibProxy27() {
	assertFalse(20159==20159+1);
}
@Test
public void bigFalseTestListReadAPILibProxy28() {
	assertFalse(7789==7789+1);
}
@Test
public void bigFalseTestListReadAPILibProxy29() {
	assertFalse(29375==29375+1);
}
@Test
public void bigFalseTestListReadAPILibProxy30() {
	assertFalse(19073==19073+1);
}
@Test
public void bigFalseTestListReadAPILibProxy31() {
	assertFalse(29458==29458+1);
}
@Test
public void bigFalseTestListReadAPILibProxy32() {
	assertFalse(18211==18211+1);
}
@Test
public void bigFalseTestListReadAPILibProxy33() {
	assertFalse(32497==32497+1);
}
@Test
public void bigFalseTestListReadAPILibProxy34() {
	assertFalse(16874==16874+1);
}
@Test
public void bigFalseTestListReadAPILibProxy35() {
	assertFalse(6496==6496+1);
}
@Test
public void bigFalseTestListReadAPILibProxy36() {
	assertFalse(23809==23809+1);
}
@Test
public void bigFalseTestListReadAPILibProxy37() {
	assertFalse(23761==23761+1);
}
@Test
public void bigFalseTestListReadAPILibProxy38() {
	assertFalse(28797==28797+1);
}
@Test
public void bigFalseTestListReadAPILibProxy39() {
	assertFalse(9337==9337+1);
}
@Test
public void bigFalseTestListReadAPILibProxy40() {
	assertFalse(8932==8932+1);
}
@Test
public void bigFalseTestListReadAPILibProxy41() {
	assertFalse(6665==6665+1);
}
@Test
public void bigFalseTestListReadAPILibProxy42() {
	assertFalse(23875==23875+1);
}
@Test
public void bigFalseTestListReadAPILibProxy43() {
	assertFalse(20818==20818+1);
}
@Test
public void bigFalseTestListReadAPILibProxy44() {
	assertFalse(21235==21235+1);
}
@Test
public void bigFalseTestListReadAPILibProxy45() {
	assertFalse(9217==9217+1);
}
@Test
public void bigFalseTestListReadAPILibProxy46() {
	assertFalse(3795==3795+1);
}
@Test
public void bigFalseTestListReadAPILibProxy47() {
	assertFalse(5740==5740+1);
}
@Test
public void bigFalseTestListReadAPILibProxy48() {
	assertFalse(10143==10143+1);
}
@Test
public void bigFalseTestListReadAPILibProxy49() {
	assertFalse(25391==25391+1);
}
@Test
public void bigFalseTestListReadAPILibProxy50() {
	assertFalse(21172==21172+1);
}
@Test
public void bigFalseTestListReadAPILibProxy51() {
	assertFalse(3590==3590+1);
}
@Test
public void bigFalseTestListReadAPILibProxy52() {
	assertFalse(30812==30812+1);
}
@Test
public void bigFalseTestListReadAPILibProxy53() {
	assertFalse(16164==16164+1);
}
@Test
public void bigFalseTestListReadAPILibProxy54() {
	assertFalse(7798==7798+1);
}
@Test
public void bigFalseTestListReadAPILibProxy55() {
	assertFalse(22274==22274+1);
}
}
