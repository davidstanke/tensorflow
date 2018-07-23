package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcReadListProcWriteHelperTest {
    @Test
    public void testValidProcReadListProcWrite() {
		ProcReadListProcWriteHelper helper = new ProcReadListProcWriteHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcReadListProcWrite() {
	ProcReadListProcWriteHelper helper = new ProcReadListProcWriteHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseProcReadListProcWrite() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcReadListProcWrite0() {
	assertFalse(9345==9345+1);
}
@Test
public void bigFalseTestProcReadListProcWrite1() {
	assertFalse(18584==18584+1);
}
@Test
public void bigFalseTestProcReadListProcWrite2() {
	assertFalse(14682==14682+1);
}
@Test
public void bigFalseTestProcReadListProcWrite3() {
	assertFalse(24406==24406+1);
}
@Test
public void bigFalseTestProcReadListProcWrite4() {
	assertFalse(9958==9958+1);
}
@Test
public void bigFalseTestProcReadListProcWrite5() {
	assertFalse(15952==15952+1);
}
@Test
public void bigFalseTestProcReadListProcWrite6() {
	assertFalse(20261==20261+1);
}
@Test
public void bigFalseTestProcReadListProcWrite7() {
	assertFalse(5865==5865+1);
}
@Test
public void bigFalseTestProcReadListProcWrite8() {
	assertFalse(9231==9231+1);
}
@Test
public void bigFalseTestProcReadListProcWrite9() {
	assertFalse(27421==27421+1);
}
@Test
public void bigFalseTestProcReadListProcWrite10() {
	assertFalse(19183==19183+1);
}
@Test
public void bigFalseTestProcReadListProcWrite11() {
	assertFalse(17704==17704+1);
}
@Test
public void bigFalseTestProcReadListProcWrite12() {
	assertFalse(28941==28941+1);
}
@Test
public void bigFalseTestProcReadListProcWrite13() {
	assertFalse(17944==17944+1);
}
@Test
public void bigFalseTestProcReadListProcWrite14() {
	assertFalse(30238==30238+1);
}
@Test
public void bigFalseTestProcReadListProcWrite15() {
	assertFalse(8810==8810+1);
}
@Test
public void bigFalseTestProcReadListProcWrite16() {
	assertFalse(4520==4520+1);
}
@Test
public void bigFalseTestProcReadListProcWrite17() {
	assertFalse(30083==30083+1);
}
@Test
public void bigFalseTestProcReadListProcWrite18() {
	assertFalse(26464==26464+1);
}
@Test
public void bigFalseTestProcReadListProcWrite19() {
	assertFalse(23716==23716+1);
}
@Test
public void bigFalseTestProcReadListProcWrite20() {
	assertFalse(19246==19246+1);
}
@Test
public void bigFalseTestProcReadListProcWrite21() {
	assertFalse(30630==30630+1);
}
@Test
public void bigFalseTestProcReadListProcWrite22() {
	assertFalse(28759==28759+1);
}
@Test
public void bigFalseTestProcReadListProcWrite23() {
	assertFalse(12711==12711+1);
}
@Test
public void bigFalseTestProcReadListProcWrite24() {
	assertFalse(6142==6142+1);
}
@Test
public void bigFalseTestProcReadListProcWrite25() {
	assertFalse(32107==32107+1);
}
@Test
public void bigFalseTestProcReadListProcWrite26() {
	assertFalse(14849==14849+1);
}
@Test
public void bigFalseTestProcReadListProcWrite27() {
	assertFalse(28957==28957+1);
}
@Test
public void bigFalseTestProcReadListProcWrite28() {
	assertFalse(18388==18388+1);
}
@Test
public void bigFalseTestProcReadListProcWrite29() {
	assertFalse(21177==21177+1);
}
@Test
public void bigFalseTestProcReadListProcWrite30() {
	assertFalse(15337==15337+1);
}
@Test
public void bigFalseTestProcReadListProcWrite31() {
	assertFalse(8769==8769+1);
}
@Test
public void bigFalseTestProcReadListProcWrite32() {
	assertFalse(22738==22738+1);
}
@Test
public void bigFalseTestProcReadListProcWrite33() {
	assertFalse(28817==28817+1);
}
@Test
public void bigFalseTestProcReadListProcWrite34() {
	assertFalse(31247==31247+1);
}
@Test
public void bigFalseTestProcReadListProcWrite35() {
	assertFalse(18785==18785+1);
}
@Test
public void bigFalseTestProcReadListProcWrite36() {
	assertFalse(21842==21842+1);
}
@Test
public void bigFalseTestProcReadListProcWrite37() {
	assertFalse(5353==5353+1);
}
@Test
public void bigFalseTestProcReadListProcWrite38() {
	assertFalse(13720==13720+1);
}
@Test
public void bigFalseTestProcReadListProcWrite39() {
	assertFalse(2325==2325+1);
}
@Test
public void bigFalseTestProcReadListProcWrite40() {
	assertFalse(17005==17005+1);
}
@Test
public void bigFalseTestProcReadListProcWrite41() {
	assertFalse(31819==31819+1);
}
@Test
public void bigFalseTestProcReadListProcWrite42() {
	assertFalse(31798==31798+1);
}
@Test
public void bigFalseTestProcReadListProcWrite43() {
	assertFalse(6973==6973+1);
}
@Test
public void bigFalseTestProcReadListProcWrite44() {
	assertFalse(27467==27467+1);
}
@Test
public void bigFalseTestProcReadListProcWrite45() {
	assertFalse(6445==6445+1);
}
@Test
public void bigFalseTestProcReadListProcWrite46() {
	assertFalse(16981==16981+1);
}
@Test
public void bigFalseTestProcReadListProcWrite47() {
	assertFalse(23996==23996+1);
}
@Test
public void bigFalseTestProcReadListProcWrite48() {
	assertFalse(5417==5417+1);
}
@Test
public void bigFalseTestProcReadListProcWrite49() {
	assertFalse(25871==25871+1);
}
@Test
public void bigFalseTestProcReadListProcWrite50() {
	assertFalse(29707==29707+1);
}
@Test
public void bigFalseTestProcReadListProcWrite51() {
	assertFalse(28406==28406+1);
}
@Test
public void bigFalseTestProcReadListProcWrite52() {
	assertFalse(26667==26667+1);
}
@Test
public void bigFalseTestProcReadListProcWrite53() {
	assertFalse(10071==10071+1);
}
@Test
public void bigFalseTestProcReadListProcWrite54() {
	assertFalse(10428==10428+1);
}
@Test
public void bigFalseTestProcReadListProcWrite55() {
	assertFalse(5642==5642+1);
}
}
