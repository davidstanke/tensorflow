package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class FetchStructIOSerialDataHelperTest {
    @Test
    public void testValidFetchStructIOSerialData() {
		FetchStructIOSerialDataHelper helper = new FetchStructIOSerialDataHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidFetchStructIOSerialData() {
	FetchStructIOSerialDataHelper helper = new FetchStructIOSerialDataHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseFetchStructIOSerialData() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestFetchStructIOSerialData0() {
	assertFalse(25056==25056+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData1() {
	assertFalse(1645==1645+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData2() {
	assertFalse(31383==31383+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData3() {
	assertFalse(14890==14890+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData4() {
	assertFalse(17719==17719+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData5() {
	assertFalse(23524==23524+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData6() {
	assertFalse(30166==30166+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData7() {
	assertFalse(427==427+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData8() {
	assertFalse(24830==24830+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData9() {
	assertFalse(29492==29492+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData10() {
	assertFalse(25686==25686+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData11() {
	assertFalse(8651==8651+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData12() {
	assertFalse(9354==9354+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData13() {
	assertFalse(1267==1267+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData14() {
	assertFalse(20135==20135+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData15() {
	assertFalse(19408==19408+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData16() {
	assertFalse(13490==13490+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData17() {
	assertFalse(6775==6775+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData18() {
	assertFalse(15633==15633+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData19() {
	assertFalse(3770==3770+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData20() {
	assertFalse(8748==8748+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData21() {
	assertFalse(15104==15104+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData22() {
	assertFalse(23374==23374+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData23() {
	assertFalse(22099==22099+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData24() {
	assertFalse(10663==10663+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData25() {
	assertFalse(16293==16293+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData26() {
	assertFalse(7176==7176+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData27() {
	assertFalse(20219==20219+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData28() {
	assertFalse(22952==22952+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData29() {
	assertFalse(31232==31232+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData30() {
	assertFalse(6165==6165+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData31() {
	assertFalse(14896==14896+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData32() {
	assertFalse(14885==14885+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData33() {
	assertFalse(6553==6553+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData34() {
	assertFalse(9588==9588+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData35() {
	assertFalse(32736==32736+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData36() {
	assertFalse(20962==20962+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData37() {
	assertFalse(31763==31763+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData38() {
	assertFalse(25095==25095+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData39() {
	assertFalse(2158==2158+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData40() {
	assertFalse(9615==9615+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData41() {
	assertFalse(21528==21528+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData42() {
	assertFalse(11790==11790+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData43() {
	assertFalse(11142==11142+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData44() {
	assertFalse(3230==3230+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData45() {
	assertFalse(21253==21253+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData46() {
	assertFalse(21095==21095+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData47() {
	assertFalse(16289==16289+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData48() {
	assertFalse(30694==30694+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData49() {
	assertFalse(16726==16726+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData50() {
	assertFalse(20104==20104+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData51() {
	assertFalse(5719==5719+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData52() {
	assertFalse(1529==1529+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData53() {
	assertFalse(12752==12752+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData54() {
	assertFalse(2616==2616+1);
}
@Test
public void bigFalseTestFetchStructIOSerialData55() {
	assertFalse(29032==29032+1);
}
}
