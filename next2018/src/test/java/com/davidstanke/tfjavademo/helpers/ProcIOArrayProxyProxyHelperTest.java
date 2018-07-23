package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcIOArrayProxyProxyHelperTest {
    @Test
    public void testValidProcIOArrayProxyProxy() {
		ProcIOArrayProxyProxyHelper helper = new ProcIOArrayProxyProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseProcIOArrayProxyProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProcIOArrayProxyProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseProcIOArrayProxyProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy0() {
	assertFalse(18484==18484+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy1() {
	assertFalse(25018==25018+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy2() {
	assertFalse(18205==18205+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy3() {
	assertFalse(31722==31722+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy4() {
	assertFalse(3459==3459+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy5() {
	assertFalse(13570==13570+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy6() {
	assertFalse(19055==19055+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy7() {
	assertFalse(29453==29453+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy8() {
	assertFalse(13554==13554+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy9() {
	assertFalse(18541==18541+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy10() {
	assertFalse(23058==23058+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy11() {
	assertFalse(14756==14756+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy12() {
	assertFalse(18310==18310+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy13() {
	assertFalse(29563==29563+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy14() {
	assertFalse(18244==18244+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy15() {
	assertFalse(21619==21619+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy16() {
	assertFalse(24411==24411+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy17() {
	assertFalse(4428==4428+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy18() {
	assertFalse(12160==12160+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy19() {
	assertFalse(3848==3848+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy20() {
	assertFalse(354==354+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy21() {
	assertFalse(32169==32169+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy22() {
	assertFalse(25244==25244+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy23() {
	assertFalse(32168==32168+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy24() {
	assertFalse(22236==22236+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy25() {
	assertFalse(22222==22222+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy26() {
	assertFalse(3745==3745+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy27() {
	assertFalse(12794==12794+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy28() {
	assertFalse(661==661+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy29() {
	assertFalse(4089==4089+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy30() {
	assertFalse(19822==19822+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy31() {
	assertFalse(3701==3701+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy32() {
	assertFalse(3553==3553+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy33() {
	assertFalse(8371==8371+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy34() {
	assertFalse(28683==28683+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy35() {
	assertFalse(25739==25739+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy36() {
	assertFalse(10584==10584+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy37() {
	assertFalse(23777==23777+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy38() {
	assertFalse(9166==9166+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy39() {
	assertFalse(18835==18835+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy40() {
	assertFalse(15697==15697+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy41() {
	assertFalse(16778==16778+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy42() {
	assertFalse(19760==19760+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy43() {
	assertFalse(20087==20087+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy44() {
	assertFalse(1567==1567+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy45() {
	assertFalse(16997==16997+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy46() {
	assertFalse(13420==13420+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy47() {
	assertFalse(1569==1569+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy48() {
	assertFalse(14350==14350+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy49() {
	assertFalse(25642==25642+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy50() {
	assertFalse(24541==24541+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy51() {
	assertFalse(1702==1702+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy52() {
	assertFalse(26396==26396+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy53() {
	assertFalse(12181==12181+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy54() {
	assertFalse(14357==14357+1);
}
@Test
public void bigFalseTestProcIOArrayProxyProxy55() {
	assertFalse(20785==20785+1);
}
}
