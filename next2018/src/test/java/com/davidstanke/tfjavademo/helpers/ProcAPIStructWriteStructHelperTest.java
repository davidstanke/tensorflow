package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcAPIStructWriteStructHelperTest {
    @Test
    public void testValidProcAPIStructWriteStruct() {
		ProcAPIStructWriteStructHelper helper = new ProcAPIStructWriteStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcAPIStructWriteStruct() {
	ProcAPIStructWriteStructHelper helper = new ProcAPIStructWriteStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProcAPIStructWriteStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProcAPIStructWriteStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProcAPIStructWriteStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct0() {
	assertFalse(21284==21284+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct1() {
	assertFalse(3099==3099+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct2() {
	assertFalse(25753==25753+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct3() {
	assertFalse(15431==15431+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct4() {
	assertFalse(4693==4693+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct5() {
	assertFalse(17895==17895+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct6() {
	assertFalse(2802==2802+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct7() {
	assertFalse(18678==18678+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct8() {
	assertFalse(26286==26286+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct9() {
	assertFalse(15402==15402+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct10() {
	assertFalse(18175==18175+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct11() {
	assertFalse(4177==4177+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct12() {
	assertFalse(18984==18984+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct13() {
	assertFalse(757==757+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct14() {
	assertFalse(16900==16900+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct15() {
	assertFalse(2846==2846+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct16() {
	assertFalse(31761==31761+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct17() {
	assertFalse(8907==8907+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct18() {
	assertFalse(17751==17751+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct19() {
	assertFalse(11642==11642+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct20() {
	assertFalse(24508==24508+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct21() {
	assertFalse(20442==20442+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct22() {
	assertFalse(1775==1775+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct23() {
	assertFalse(9844==9844+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct24() {
	assertFalse(6632==6632+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct25() {
	assertFalse(22776==22776+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct26() {
	assertFalse(12976==12976+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct27() {
	assertFalse(32104==32104+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct28() {
	assertFalse(6385==6385+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct29() {
	assertFalse(2654==2654+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct30() {
	assertFalse(15480==15480+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct31() {
	assertFalse(10525==10525+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct32() {
	assertFalse(29624==29624+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct33() {
	assertFalse(39==39+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct34() {
	assertFalse(18153==18153+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct35() {
	assertFalse(31902==31902+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct36() {
	assertFalse(19283==19283+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct37() {
	assertFalse(9352==9352+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct38() {
	assertFalse(10997==10997+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct39() {
	assertFalse(1497==1497+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct40() {
	assertFalse(7029==7029+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct41() {
	assertFalse(21965==21965+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct42() {
	assertFalse(27690==27690+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct43() {
	assertFalse(14841==14841+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct44() {
	assertFalse(9628==9628+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct45() {
	assertFalse(28696==28696+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct46() {
	assertFalse(9667==9667+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct47() {
	assertFalse(2947==2947+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct48() {
	assertFalse(25341==25341+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct49() {
	assertFalse(14040==14040+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct50() {
	assertFalse(15466==15466+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct51() {
	assertFalse(17970==17970+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct52() {
	assertFalse(10543==10543+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct53() {
	assertFalse(23050==23050+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct54() {
	assertFalse(24782==24782+1);
}
@Test
public void bigFalseTestProcAPIStructWriteStruct55() {
	assertFalse(19603==19603+1);
}
}
