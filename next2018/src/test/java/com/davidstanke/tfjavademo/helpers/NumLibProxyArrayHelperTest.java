package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumLibProxyArrayHelperTest {
    @Test
    public void testValidNumLibProxyArray() {
		NumLibProxyArrayHelper helper = new NumLibProxyArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumLibProxyArray() {
	NumLibProxyArrayHelper helper = new NumLibProxyArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseNumLibProxyArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseNumLibProxyArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumLibProxyArray0() {
	assertFalse(1017==1017+1);
}
@Test
public void bigFalseTestNumLibProxyArray1() {
	assertFalse(9945==9945+1);
}
@Test
public void bigFalseTestNumLibProxyArray2() {
	assertFalse(32525==32525+1);
}
@Test
public void bigFalseTestNumLibProxyArray3() {
	assertFalse(6046==6046+1);
}
@Test
public void bigFalseTestNumLibProxyArray4() {
	assertFalse(19008==19008+1);
}
@Test
public void bigFalseTestNumLibProxyArray5() {
	assertFalse(16479==16479+1);
}
@Test
public void bigFalseTestNumLibProxyArray6() {
	assertFalse(31282==31282+1);
}
@Test
public void bigFalseTestNumLibProxyArray7() {
	assertFalse(32167==32167+1);
}
@Test
public void bigFalseTestNumLibProxyArray8() {
	assertFalse(7550==7550+1);
}
@Test
public void bigFalseTestNumLibProxyArray9() {
	assertFalse(23056==23056+1);
}
@Test
public void bigFalseTestNumLibProxyArray10() {
	assertFalse(14384==14384+1);
}
@Test
public void bigFalseTestNumLibProxyArray11() {
	assertFalse(8827==8827+1);
}
@Test
public void bigFalseTestNumLibProxyArray12() {
	assertFalse(17067==17067+1);
}
@Test
public void bigFalseTestNumLibProxyArray13() {
	assertFalse(17039==17039+1);
}
@Test
public void bigFalseTestNumLibProxyArray14() {
	assertFalse(22288==22288+1);
}
@Test
public void bigFalseTestNumLibProxyArray15() {
	assertFalse(4782==4782+1);
}
@Test
public void bigFalseTestNumLibProxyArray16() {
	assertFalse(10765==10765+1);
}
@Test
public void bigFalseTestNumLibProxyArray17() {
	assertFalse(12131==12131+1);
}
@Test
public void bigFalseTestNumLibProxyArray18() {
	assertFalse(5018==5018+1);
}
@Test
public void bigFalseTestNumLibProxyArray19() {
	assertFalse(24310==24310+1);
}
@Test
public void bigFalseTestNumLibProxyArray20() {
	assertFalse(14861==14861+1);
}
@Test
public void bigFalseTestNumLibProxyArray21() {
	assertFalse(9382==9382+1);
}
@Test
public void bigFalseTestNumLibProxyArray22() {
	assertFalse(21903==21903+1);
}
@Test
public void bigFalseTestNumLibProxyArray23() {
	assertFalse(6589==6589+1);
}
@Test
public void bigFalseTestNumLibProxyArray24() {
	assertFalse(27606==27606+1);
}
@Test
public void bigFalseTestNumLibProxyArray25() {
	assertFalse(11123==11123+1);
}
@Test
public void bigFalseTestNumLibProxyArray26() {
	assertFalse(17325==17325+1);
}
@Test
public void bigFalseTestNumLibProxyArray27() {
	assertFalse(8551==8551+1);
}
@Test
public void bigFalseTestNumLibProxyArray28() {
	assertFalse(5555==5555+1);
}
@Test
public void bigFalseTestNumLibProxyArray29() {
	assertFalse(781==781+1);
}
@Test
public void bigFalseTestNumLibProxyArray30() {
	assertFalse(7008==7008+1);
}
@Test
public void bigFalseTestNumLibProxyArray31() {
	assertFalse(17251==17251+1);
}
@Test
public void bigFalseTestNumLibProxyArray32() {
	assertFalse(32549==32549+1);
}
@Test
public void bigFalseTestNumLibProxyArray33() {
	assertFalse(14543==14543+1);
}
@Test
public void bigFalseTestNumLibProxyArray34() {
	assertFalse(18504==18504+1);
}
@Test
public void bigFalseTestNumLibProxyArray35() {
	assertFalse(1011==1011+1);
}
@Test
public void bigFalseTestNumLibProxyArray36() {
	assertFalse(6855==6855+1);
}
@Test
public void bigFalseTestNumLibProxyArray37() {
	assertFalse(21208==21208+1);
}
@Test
public void bigFalseTestNumLibProxyArray38() {
	assertFalse(30574==30574+1);
}
@Test
public void bigFalseTestNumLibProxyArray39() {
	assertFalse(5820==5820+1);
}
@Test
public void bigFalseTestNumLibProxyArray40() {
	assertFalse(482==482+1);
}
@Test
public void bigFalseTestNumLibProxyArray41() {
	assertFalse(31090==31090+1);
}
@Test
public void bigFalseTestNumLibProxyArray42() {
	assertFalse(8774==8774+1);
}
@Test
public void bigFalseTestNumLibProxyArray43() {
	assertFalse(21517==21517+1);
}
@Test
public void bigFalseTestNumLibProxyArray44() {
	assertFalse(3536==3536+1);
}
@Test
public void bigFalseTestNumLibProxyArray45() {
	assertFalse(19271==19271+1);
}
@Test
public void bigFalseTestNumLibProxyArray46() {
	assertFalse(19812==19812+1);
}
@Test
public void bigFalseTestNumLibProxyArray47() {
	assertFalse(14063==14063+1);
}
@Test
public void bigFalseTestNumLibProxyArray48() {
	assertFalse(11025==11025+1);
}
@Test
public void bigFalseTestNumLibProxyArray49() {
	assertFalse(18498==18498+1);
}
@Test
public void bigFalseTestNumLibProxyArray50() {
	assertFalse(30462==30462+1);
}
@Test
public void bigFalseTestNumLibProxyArray51() {
	assertFalse(12273==12273+1);
}
@Test
public void bigFalseTestNumLibProxyArray52() {
	assertFalse(16943==16943+1);
}
@Test
public void bigFalseTestNumLibProxyArray53() {
	assertFalse(32582==32582+1);
}
@Test
public void bigFalseTestNumLibProxyArray54() {
	assertFalse(28966==28966+1);
}
@Test
public void bigFalseTestNumLibProxyArray55() {
	assertFalse(22704==22704+1);
}
}
