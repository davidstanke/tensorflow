package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialStructUtilProxyHelperTest {
    @Test
    public void testValidSerialStructUtilProxy() {
		SerialStructUtilProxyHelper helper = new SerialStructUtilProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseSerialStructUtilProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialStructUtilProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialStructUtilProxy0() {
	assertFalse(32042==32042+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy1() {
	assertFalse(11822==11822+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy2() {
	assertFalse(32134==32134+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy3() {
	assertFalse(15952==15952+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy4() {
	assertFalse(21734==21734+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy5() {
	assertFalse(30992==30992+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy6() {
	assertFalse(31550==31550+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy7() {
	assertFalse(18484==18484+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy8() {
	assertFalse(23384==23384+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy9() {
	assertFalse(6211==6211+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy10() {
	assertFalse(5120==5120+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy11() {
	assertFalse(26633==26633+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy12() {
	assertFalse(15699==15699+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy13() {
	assertFalse(14439==14439+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy14() {
	assertFalse(16831==16831+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy15() {
	assertFalse(650==650+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy16() {
	assertFalse(21205==21205+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy17() {
	assertFalse(17504==17504+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy18() {
	assertFalse(2285==2285+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy19() {
	assertFalse(4841==4841+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy20() {
	assertFalse(348==348+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy21() {
	assertFalse(26544==26544+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy22() {
	assertFalse(422==422+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy23() {
	assertFalse(31374==31374+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy24() {
	assertFalse(30447==30447+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy25() {
	assertFalse(23185==23185+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy26() {
	assertFalse(18333==18333+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy27() {
	assertFalse(4240==4240+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy28() {
	assertFalse(2535==2535+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy29() {
	assertFalse(21461==21461+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy30() {
	assertFalse(31943==31943+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy31() {
	assertFalse(11503==11503+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy32() {
	assertFalse(18818==18818+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy33() {
	assertFalse(15486==15486+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy34() {
	assertFalse(19145==19145+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy35() {
	assertFalse(11160==11160+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy36() {
	assertFalse(2854==2854+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy37() {
	assertFalse(285==285+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy38() {
	assertFalse(3874==3874+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy39() {
	assertFalse(8982==8982+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy40() {
	assertFalse(117==117+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy41() {
	assertFalse(7403==7403+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy42() {
	assertFalse(7704==7704+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy43() {
	assertFalse(19223==19223+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy44() {
	assertFalse(8724==8724+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy45() {
	assertFalse(15017==15017+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy46() {
	assertFalse(18532==18532+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy47() {
	assertFalse(20134==20134+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy48() {
	assertFalse(31547==31547+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy49() {
	assertFalse(1847==1847+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy50() {
	assertFalse(3997==3997+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy51() {
	assertFalse(1570==1570+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy52() {
	assertFalse(8700==8700+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy53() {
	assertFalse(4598==4598+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy54() {
	assertFalse(13669==13669+1);
}
@Test
public void bigFalseTestSerialStructUtilProxy55() {
	assertFalse(21761==21761+1);
}
}
