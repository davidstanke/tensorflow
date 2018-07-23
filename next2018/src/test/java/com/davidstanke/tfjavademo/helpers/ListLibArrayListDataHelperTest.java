package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ListLibArrayListDataHelperTest {
    @Test
    public void testValidListLibArrayListData() {
		ListLibArrayListDataHelper helper = new ListLibArrayListDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseListLibArrayListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseListLibArrayListData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestListLibArrayListData0() {
	assertFalse(28287==28287+1);
}
@Test
public void bigFalseTestListLibArrayListData1() {
	assertFalse(14022==14022+1);
}
@Test
public void bigFalseTestListLibArrayListData2() {
	assertFalse(5207==5207+1);
}
@Test
public void bigFalseTestListLibArrayListData3() {
	assertFalse(27994==27994+1);
}
@Test
public void bigFalseTestListLibArrayListData4() {
	assertFalse(9497==9497+1);
}
@Test
public void bigFalseTestListLibArrayListData5() {
	assertFalse(28438==28438+1);
}
@Test
public void bigFalseTestListLibArrayListData6() {
	assertFalse(12483==12483+1);
}
@Test
public void bigFalseTestListLibArrayListData7() {
	assertFalse(28160==28160+1);
}
@Test
public void bigFalseTestListLibArrayListData8() {
	assertFalse(571==571+1);
}
@Test
public void bigFalseTestListLibArrayListData9() {
	assertFalse(11698==11698+1);
}
@Test
public void bigFalseTestListLibArrayListData10() {
	assertFalse(18163==18163+1);
}
@Test
public void bigFalseTestListLibArrayListData11() {
	assertFalse(14171==14171+1);
}
@Test
public void bigFalseTestListLibArrayListData12() {
	assertFalse(24261==24261+1);
}
@Test
public void bigFalseTestListLibArrayListData13() {
	assertFalse(16909==16909+1);
}
@Test
public void bigFalseTestListLibArrayListData14() {
	assertFalse(873==873+1);
}
@Test
public void bigFalseTestListLibArrayListData15() {
	assertFalse(5495==5495+1);
}
@Test
public void bigFalseTestListLibArrayListData16() {
	assertFalse(28616==28616+1);
}
@Test
public void bigFalseTestListLibArrayListData17() {
	assertFalse(5850==5850+1);
}
@Test
public void bigFalseTestListLibArrayListData18() {
	assertFalse(13862==13862+1);
}
@Test
public void bigFalseTestListLibArrayListData19() {
	assertFalse(4055==4055+1);
}
@Test
public void bigFalseTestListLibArrayListData20() {
	assertFalse(14546==14546+1);
}
@Test
public void bigFalseTestListLibArrayListData21() {
	assertFalse(1130==1130+1);
}
@Test
public void bigFalseTestListLibArrayListData22() {
	assertFalse(27608==27608+1);
}
@Test
public void bigFalseTestListLibArrayListData23() {
	assertFalse(2353==2353+1);
}
@Test
public void bigFalseTestListLibArrayListData24() {
	assertFalse(22263==22263+1);
}
@Test
public void bigFalseTestListLibArrayListData25() {
	assertFalse(27850==27850+1);
}
@Test
public void bigFalseTestListLibArrayListData26() {
	assertFalse(28096==28096+1);
}
@Test
public void bigFalseTestListLibArrayListData27() {
	assertFalse(7917==7917+1);
}
@Test
public void bigFalseTestListLibArrayListData28() {
	assertFalse(28836==28836+1);
}
@Test
public void bigFalseTestListLibArrayListData29() {
	assertFalse(32152==32152+1);
}
@Test
public void bigFalseTestListLibArrayListData30() {
	assertFalse(21605==21605+1);
}
@Test
public void bigFalseTestListLibArrayListData31() {
	assertFalse(1116==1116+1);
}
@Test
public void bigFalseTestListLibArrayListData32() {
	assertFalse(22051==22051+1);
}
@Test
public void bigFalseTestListLibArrayListData33() {
	assertFalse(13225==13225+1);
}
@Test
public void bigFalseTestListLibArrayListData34() {
	assertFalse(6394==6394+1);
}
@Test
public void bigFalseTestListLibArrayListData35() {
	assertFalse(21944==21944+1);
}
@Test
public void bigFalseTestListLibArrayListData36() {
	assertFalse(7917==7917+1);
}
@Test
public void bigFalseTestListLibArrayListData37() {
	assertFalse(31837==31837+1);
}
@Test
public void bigFalseTestListLibArrayListData38() {
	assertFalse(20880==20880+1);
}
@Test
public void bigFalseTestListLibArrayListData39() {
	assertFalse(7904==7904+1);
}
@Test
public void bigFalseTestListLibArrayListData40() {
	assertFalse(20403==20403+1);
}
@Test
public void bigFalseTestListLibArrayListData41() {
	assertFalse(4285==4285+1);
}
@Test
public void bigFalseTestListLibArrayListData42() {
	assertFalse(1020==1020+1);
}
@Test
public void bigFalseTestListLibArrayListData43() {
	assertFalse(4560==4560+1);
}
@Test
public void bigFalseTestListLibArrayListData44() {
	assertFalse(21803==21803+1);
}
@Test
public void bigFalseTestListLibArrayListData45() {
	assertFalse(26201==26201+1);
}
@Test
public void bigFalseTestListLibArrayListData46() {
	assertFalse(15238==15238+1);
}
@Test
public void bigFalseTestListLibArrayListData47() {
	assertFalse(10466==10466+1);
}
@Test
public void bigFalseTestListLibArrayListData48() {
	assertFalse(24475==24475+1);
}
@Test
public void bigFalseTestListLibArrayListData49() {
	assertFalse(20964==20964+1);
}
@Test
public void bigFalseTestListLibArrayListData50() {
	assertFalse(19798==19798+1);
}
@Test
public void bigFalseTestListLibArrayListData51() {
	assertFalse(12486==12486+1);
}
@Test
public void bigFalseTestListLibArrayListData52() {
	assertFalse(27430==27430+1);
}
@Test
public void bigFalseTestListLibArrayListData53() {
	assertFalse(14220==14220+1);
}
@Test
public void bigFalseTestListLibArrayListData54() {
	assertFalse(30623==30623+1);
}
@Test
public void bigFalseTestListLibArrayListData55() {
	assertFalse(30274==30274+1);
}
}
