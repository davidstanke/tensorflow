package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialDataListAsyncHelperTest {
    @Test
    public void testValidSerialDataListAsync() {
		SerialDataListAsyncHelper helper = new SerialDataListAsyncHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialDataListAsync() {
	SerialDataListAsyncHelper helper = new SerialDataListAsyncHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseSerialDataListAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialDataListAsync() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialDataListAsync0() {
	assertFalse(4369==4369+1);
}
@Test
public void bigFalseTestSerialDataListAsync1() {
	assertFalse(16604==16604+1);
}
@Test
public void bigFalseTestSerialDataListAsync2() {
	assertFalse(25266==25266+1);
}
@Test
public void bigFalseTestSerialDataListAsync3() {
	assertFalse(19383==19383+1);
}
@Test
public void bigFalseTestSerialDataListAsync4() {
	assertFalse(14900==14900+1);
}
@Test
public void bigFalseTestSerialDataListAsync5() {
	assertFalse(2665==2665+1);
}
@Test
public void bigFalseTestSerialDataListAsync6() {
	assertFalse(7975==7975+1);
}
@Test
public void bigFalseTestSerialDataListAsync7() {
	assertFalse(32073==32073+1);
}
@Test
public void bigFalseTestSerialDataListAsync8() {
	assertFalse(19249==19249+1);
}
@Test
public void bigFalseTestSerialDataListAsync9() {
	assertFalse(8653==8653+1);
}
@Test
public void bigFalseTestSerialDataListAsync10() {
	assertFalse(5139==5139+1);
}
@Test
public void bigFalseTestSerialDataListAsync11() {
	assertFalse(31255==31255+1);
}
@Test
public void bigFalseTestSerialDataListAsync12() {
	assertFalse(25500==25500+1);
}
@Test
public void bigFalseTestSerialDataListAsync13() {
	assertFalse(21820==21820+1);
}
@Test
public void bigFalseTestSerialDataListAsync14() {
	assertFalse(11431==11431+1);
}
@Test
public void bigFalseTestSerialDataListAsync15() {
	assertFalse(30100==30100+1);
}
@Test
public void bigFalseTestSerialDataListAsync16() {
	assertFalse(24050==24050+1);
}
@Test
public void bigFalseTestSerialDataListAsync17() {
	assertFalse(16623==16623+1);
}
@Test
public void bigFalseTestSerialDataListAsync18() {
	assertFalse(7028==7028+1);
}
@Test
public void bigFalseTestSerialDataListAsync19() {
	assertFalse(13180==13180+1);
}
@Test
public void bigFalseTestSerialDataListAsync20() {
	assertFalse(29816==29816+1);
}
@Test
public void bigFalseTestSerialDataListAsync21() {
	assertFalse(2259==2259+1);
}
@Test
public void bigFalseTestSerialDataListAsync22() {
	assertFalse(20649==20649+1);
}
@Test
public void bigFalseTestSerialDataListAsync23() {
	assertFalse(10072==10072+1);
}
@Test
public void bigFalseTestSerialDataListAsync24() {
	assertFalse(22484==22484+1);
}
@Test
public void bigFalseTestSerialDataListAsync25() {
	assertFalse(243==243+1);
}
@Test
public void bigFalseTestSerialDataListAsync26() {
	assertFalse(6153==6153+1);
}
@Test
public void bigFalseTestSerialDataListAsync27() {
	assertFalse(208==208+1);
}
@Test
public void bigFalseTestSerialDataListAsync28() {
	assertFalse(4968==4968+1);
}
@Test
public void bigFalseTestSerialDataListAsync29() {
	assertFalse(28838==28838+1);
}
@Test
public void bigFalseTestSerialDataListAsync30() {
	assertFalse(6831==6831+1);
}
@Test
public void bigFalseTestSerialDataListAsync31() {
	assertFalse(12468==12468+1);
}
@Test
public void bigFalseTestSerialDataListAsync32() {
	assertFalse(23410==23410+1);
}
@Test
public void bigFalseTestSerialDataListAsync33() {
	assertFalse(23672==23672+1);
}
@Test
public void bigFalseTestSerialDataListAsync34() {
	assertFalse(16514==16514+1);
}
@Test
public void bigFalseTestSerialDataListAsync35() {
	assertFalse(13001==13001+1);
}
@Test
public void bigFalseTestSerialDataListAsync36() {
	assertFalse(8420==8420+1);
}
@Test
public void bigFalseTestSerialDataListAsync37() {
	assertFalse(729==729+1);
}
@Test
public void bigFalseTestSerialDataListAsync38() {
	assertFalse(11638==11638+1);
}
@Test
public void bigFalseTestSerialDataListAsync39() {
	assertFalse(10323==10323+1);
}
@Test
public void bigFalseTestSerialDataListAsync40() {
	assertFalse(1796==1796+1);
}
@Test
public void bigFalseTestSerialDataListAsync41() {
	assertFalse(30600==30600+1);
}
@Test
public void bigFalseTestSerialDataListAsync42() {
	assertFalse(22151==22151+1);
}
@Test
public void bigFalseTestSerialDataListAsync43() {
	assertFalse(3943==3943+1);
}
@Test
public void bigFalseTestSerialDataListAsync44() {
	assertFalse(5828==5828+1);
}
@Test
public void bigFalseTestSerialDataListAsync45() {
	assertFalse(2493==2493+1);
}
@Test
public void bigFalseTestSerialDataListAsync46() {
	assertFalse(27254==27254+1);
}
@Test
public void bigFalseTestSerialDataListAsync47() {
	assertFalse(8941==8941+1);
}
@Test
public void bigFalseTestSerialDataListAsync48() {
	assertFalse(19423==19423+1);
}
@Test
public void bigFalseTestSerialDataListAsync49() {
	assertFalse(24857==24857+1);
}
@Test
public void bigFalseTestSerialDataListAsync50() {
	assertFalse(2626==2626+1);
}
@Test
public void bigFalseTestSerialDataListAsync51() {
	assertFalse(12151==12151+1);
}
@Test
public void bigFalseTestSerialDataListAsync52() {
	assertFalse(22456==22456+1);
}
@Test
public void bigFalseTestSerialDataListAsync53() {
	assertFalse(32078==32078+1);
}
@Test
public void bigFalseTestSerialDataListAsync54() {
	assertFalse(3429==3429+1);
}
@Test
public void bigFalseTestSerialDataListAsync55() {
	assertFalse(26821==26821+1);
}
}
