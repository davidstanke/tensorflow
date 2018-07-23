package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataStructArrayStringProxyHelperTest {
    @Test
    public void testValidDataStructArrayStringProxy() {
		DataStructArrayStringProxyHelper helper = new DataStructArrayStringProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidDataStructArrayStringProxy() {
	DataStructArrayStringProxyHelper helper = new DataStructArrayStringProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseDataStructArrayStringProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseDataStructArrayStringProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataStructArrayStringProxy0() {
	assertFalse(26478==26478+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy1() {
	assertFalse(29905==29905+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy2() {
	assertFalse(22290==22290+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy3() {
	assertFalse(12290==12290+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy4() {
	assertFalse(25287==25287+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy5() {
	assertFalse(26639==26639+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy6() {
	assertFalse(819==819+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy7() {
	assertFalse(30185==30185+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy8() {
	assertFalse(12681==12681+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy9() {
	assertFalse(7777==7777+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy10() {
	assertFalse(18924==18924+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy11() {
	assertFalse(24791==24791+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy12() {
	assertFalse(14624==14624+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy13() {
	assertFalse(26774==26774+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy14() {
	assertFalse(5027==5027+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy15() {
	assertFalse(16648==16648+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy16() {
	assertFalse(24062==24062+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy17() {
	assertFalse(13244==13244+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy18() {
	assertFalse(28152==28152+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy19() {
	assertFalse(15350==15350+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy20() {
	assertFalse(20975==20975+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy21() {
	assertFalse(28234==28234+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy22() {
	assertFalse(1917==1917+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy23() {
	assertFalse(17252==17252+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy24() {
	assertFalse(27707==27707+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy25() {
	assertFalse(5136==5136+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy26() {
	assertFalse(11062==11062+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy27() {
	assertFalse(28967==28967+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy28() {
	assertFalse(26493==26493+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy29() {
	assertFalse(3295==3295+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy30() {
	assertFalse(30671==30671+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy31() {
	assertFalse(21431==21431+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy32() {
	assertFalse(8518==8518+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy33() {
	assertFalse(18935==18935+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy34() {
	assertFalse(20128==20128+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy35() {
	assertFalse(30585==30585+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy36() {
	assertFalse(14193==14193+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy37() {
	assertFalse(20021==20021+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy38() {
	assertFalse(13921==13921+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy39() {
	assertFalse(14538==14538+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy40() {
	assertFalse(8004==8004+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy41() {
	assertFalse(3321==3321+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy42() {
	assertFalse(11693==11693+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy43() {
	assertFalse(10955==10955+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy44() {
	assertFalse(4684==4684+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy45() {
	assertFalse(19417==19417+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy46() {
	assertFalse(10552==10552+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy47() {
	assertFalse(7919==7919+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy48() {
	assertFalse(27893==27893+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy49() {
	assertFalse(29447==29447+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy50() {
	assertFalse(14799==14799+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy51() {
	assertFalse(6469==6469+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy52() {
	assertFalse(23275==23275+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy53() {
	assertFalse(30850==30850+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy54() {
	assertFalse(5652==5652+1);
}
@Test
public void bigFalseTestDataStructArrayStringProxy55() {
	assertFalse(15750==15750+1);
}
}
