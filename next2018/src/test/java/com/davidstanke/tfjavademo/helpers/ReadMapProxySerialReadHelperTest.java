package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadMapProxySerialReadHelperTest {
    @Test
    public void testValidReadMapProxySerialRead() {
		ReadMapProxySerialReadHelper helper = new ReadMapProxySerialReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseReadMapProxySerialRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseReadMapProxySerialRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseReadMapProxySerialRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadMapProxySerialRead0() {
	assertFalse(10266==10266+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead1() {
	assertFalse(7677==7677+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead2() {
	assertFalse(19863==19863+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead3() {
	assertFalse(7291==7291+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead4() {
	assertFalse(26998==26998+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead5() {
	assertFalse(9255==9255+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead6() {
	assertFalse(28928==28928+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead7() {
	assertFalse(8868==8868+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead8() {
	assertFalse(2919==2919+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead9() {
	assertFalse(4858==4858+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead10() {
	assertFalse(24223==24223+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead11() {
	assertFalse(25903==25903+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead12() {
	assertFalse(4654==4654+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead13() {
	assertFalse(20271==20271+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead14() {
	assertFalse(18237==18237+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead15() {
	assertFalse(459==459+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead16() {
	assertFalse(9184==9184+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead17() {
	assertFalse(5234==5234+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead18() {
	assertFalse(27706==27706+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead19() {
	assertFalse(30717==30717+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead20() {
	assertFalse(12055==12055+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead21() {
	assertFalse(21657==21657+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead22() {
	assertFalse(29716==29716+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead23() {
	assertFalse(20667==20667+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead24() {
	assertFalse(20573==20573+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead25() {
	assertFalse(20129==20129+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead26() {
	assertFalse(31673==31673+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead27() {
	assertFalse(9161==9161+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead28() {
	assertFalse(8789==8789+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead29() {
	assertFalse(6508==6508+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead30() {
	assertFalse(28813==28813+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead31() {
	assertFalse(5847==5847+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead32() {
	assertFalse(25767==25767+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead33() {
	assertFalse(7741==7741+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead34() {
	assertFalse(32569==32569+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead35() {
	assertFalse(12887==12887+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead36() {
	assertFalse(9649==9649+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead37() {
	assertFalse(16111==16111+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead38() {
	assertFalse(9017==9017+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead39() {
	assertFalse(10272==10272+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead40() {
	assertFalse(23279==23279+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead41() {
	assertFalse(9208==9208+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead42() {
	assertFalse(8996==8996+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead43() {
	assertFalse(26564==26564+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead44() {
	assertFalse(5158==5158+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead45() {
	assertFalse(28194==28194+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead46() {
	assertFalse(1466==1466+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead47() {
	assertFalse(7345==7345+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead48() {
	assertFalse(13652==13652+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead49() {
	assertFalse(18435==18435+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead50() {
	assertFalse(19376==19376+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead51() {
	assertFalse(29194==29194+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead52() {
	assertFalse(25431==25431+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead53() {
	assertFalse(4929==4929+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead54() {
	assertFalse(31290==31290+1);
}
@Test
public void bigFalseTestReadMapProxySerialRead55() {
	assertFalse(14403==14403+1);
}
}
