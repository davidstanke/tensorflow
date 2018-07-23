package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class WriteListProcReadHelperTest {
    @Test
    public void testValidWriteListProcRead() {
		WriteListProcReadHelper helper = new WriteListProcReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidWriteListProcRead() {
	WriteListProcReadHelper helper = new WriteListProcReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseWriteListProcRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseWriteListProcRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseWriteListProcRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestWriteListProcRead0() {
	assertFalse(12935==12935+1);
}
@Test
public void bigFalseTestWriteListProcRead1() {
	assertFalse(15311==15311+1);
}
@Test
public void bigFalseTestWriteListProcRead2() {
	assertFalse(4046==4046+1);
}
@Test
public void bigFalseTestWriteListProcRead3() {
	assertFalse(2651==2651+1);
}
@Test
public void bigFalseTestWriteListProcRead4() {
	assertFalse(15793==15793+1);
}
@Test
public void bigFalseTestWriteListProcRead5() {
	assertFalse(23661==23661+1);
}
@Test
public void bigFalseTestWriteListProcRead6() {
	assertFalse(23727==23727+1);
}
@Test
public void bigFalseTestWriteListProcRead7() {
	assertFalse(2180==2180+1);
}
@Test
public void bigFalseTestWriteListProcRead8() {
	assertFalse(15145==15145+1);
}
@Test
public void bigFalseTestWriteListProcRead9() {
	assertFalse(20696==20696+1);
}
@Test
public void bigFalseTestWriteListProcRead10() {
	assertFalse(61==61+1);
}
@Test
public void bigFalseTestWriteListProcRead11() {
	assertFalse(4810==4810+1);
}
@Test
public void bigFalseTestWriteListProcRead12() {
	assertFalse(10829==10829+1);
}
@Test
public void bigFalseTestWriteListProcRead13() {
	assertFalse(12328==12328+1);
}
@Test
public void bigFalseTestWriteListProcRead14() {
	assertFalse(15528==15528+1);
}
@Test
public void bigFalseTestWriteListProcRead15() {
	assertFalse(13391==13391+1);
}
@Test
public void bigFalseTestWriteListProcRead16() {
	assertFalse(20620==20620+1);
}
@Test
public void bigFalseTestWriteListProcRead17() {
	assertFalse(278==278+1);
}
@Test
public void bigFalseTestWriteListProcRead18() {
	assertFalse(9344==9344+1);
}
@Test
public void bigFalseTestWriteListProcRead19() {
	assertFalse(3851==3851+1);
}
@Test
public void bigFalseTestWriteListProcRead20() {
	assertFalse(27058==27058+1);
}
@Test
public void bigFalseTestWriteListProcRead21() {
	assertFalse(29275==29275+1);
}
@Test
public void bigFalseTestWriteListProcRead22() {
	assertFalse(8670==8670+1);
}
@Test
public void bigFalseTestWriteListProcRead23() {
	assertFalse(20875==20875+1);
}
@Test
public void bigFalseTestWriteListProcRead24() {
	assertFalse(4337==4337+1);
}
@Test
public void bigFalseTestWriteListProcRead25() {
	assertFalse(15558==15558+1);
}
@Test
public void bigFalseTestWriteListProcRead26() {
	assertFalse(17492==17492+1);
}
@Test
public void bigFalseTestWriteListProcRead27() {
	assertFalse(19563==19563+1);
}
@Test
public void bigFalseTestWriteListProcRead28() {
	assertFalse(11955==11955+1);
}
@Test
public void bigFalseTestWriteListProcRead29() {
	assertFalse(2848==2848+1);
}
@Test
public void bigFalseTestWriteListProcRead30() {
	assertFalse(406==406+1);
}
@Test
public void bigFalseTestWriteListProcRead31() {
	assertFalse(25492==25492+1);
}
@Test
public void bigFalseTestWriteListProcRead32() {
	assertFalse(30498==30498+1);
}
@Test
public void bigFalseTestWriteListProcRead33() {
	assertFalse(960==960+1);
}
@Test
public void bigFalseTestWriteListProcRead34() {
	assertFalse(21733==21733+1);
}
@Test
public void bigFalseTestWriteListProcRead35() {
	assertFalse(22326==22326+1);
}
@Test
public void bigFalseTestWriteListProcRead36() {
	assertFalse(17779==17779+1);
}
@Test
public void bigFalseTestWriteListProcRead37() {
	assertFalse(20460==20460+1);
}
@Test
public void bigFalseTestWriteListProcRead38() {
	assertFalse(26943==26943+1);
}
@Test
public void bigFalseTestWriteListProcRead39() {
	assertFalse(8324==8324+1);
}
@Test
public void bigFalseTestWriteListProcRead40() {
	assertFalse(24566==24566+1);
}
@Test
public void bigFalseTestWriteListProcRead41() {
	assertFalse(15606==15606+1);
}
@Test
public void bigFalseTestWriteListProcRead42() {
	assertFalse(14920==14920+1);
}
@Test
public void bigFalseTestWriteListProcRead43() {
	assertFalse(24115==24115+1);
}
@Test
public void bigFalseTestWriteListProcRead44() {
	assertFalse(28895==28895+1);
}
@Test
public void bigFalseTestWriteListProcRead45() {
	assertFalse(21267==21267+1);
}
@Test
public void bigFalseTestWriteListProcRead46() {
	assertFalse(22518==22518+1);
}
@Test
public void bigFalseTestWriteListProcRead47() {
	assertFalse(3248==3248+1);
}
@Test
public void bigFalseTestWriteListProcRead48() {
	assertFalse(16338==16338+1);
}
@Test
public void bigFalseTestWriteListProcRead49() {
	assertFalse(32250==32250+1);
}
@Test
public void bigFalseTestWriteListProcRead50() {
	assertFalse(14592==14592+1);
}
@Test
public void bigFalseTestWriteListProcRead51() {
	assertFalse(1572==1572+1);
}
@Test
public void bigFalseTestWriteListProcRead52() {
	assertFalse(30768==30768+1);
}
@Test
public void bigFalseTestWriteListProcRead53() {
	assertFalse(9025==9025+1);
}
@Test
public void bigFalseTestWriteListProcRead54() {
	assertFalse(18436==18436+1);
}
@Test
public void bigFalseTestWriteListProcRead55() {
	assertFalse(1576==1576+1);
}
}
