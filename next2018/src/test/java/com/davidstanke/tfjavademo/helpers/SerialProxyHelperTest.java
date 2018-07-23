package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialProxyHelperTest {
    @Test
    public void testValidSerialProxy() {
		SerialProxyHelper helper = new SerialProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialProxy() {
	SerialProxyHelper helper = new SerialProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseSerialProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseSerialProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialProxy0() {
	assertFalse(19079==19079+1);
}
@Test
public void bigFalseTestSerialProxy1() {
	assertFalse(18182==18182+1);
}
@Test
public void bigFalseTestSerialProxy2() {
	assertFalse(22720==22720+1);
}
@Test
public void bigFalseTestSerialProxy3() {
	assertFalse(8920==8920+1);
}
@Test
public void bigFalseTestSerialProxy4() {
	assertFalse(12695==12695+1);
}
@Test
public void bigFalseTestSerialProxy5() {
	assertFalse(27619==27619+1);
}
@Test
public void bigFalseTestSerialProxy6() {
	assertFalse(26232==26232+1);
}
@Test
public void bigFalseTestSerialProxy7() {
	assertFalse(29123==29123+1);
}
@Test
public void bigFalseTestSerialProxy8() {
	assertFalse(22419==22419+1);
}
@Test
public void bigFalseTestSerialProxy9() {
	assertFalse(11344==11344+1);
}
@Test
public void bigFalseTestSerialProxy10() {
	assertFalse(4369==4369+1);
}
@Test
public void bigFalseTestSerialProxy11() {
	assertFalse(15619==15619+1);
}
@Test
public void bigFalseTestSerialProxy12() {
	assertFalse(31781==31781+1);
}
@Test
public void bigFalseTestSerialProxy13() {
	assertFalse(9445==9445+1);
}
@Test
public void bigFalseTestSerialProxy14() {
	assertFalse(18756==18756+1);
}
@Test
public void bigFalseTestSerialProxy15() {
	assertFalse(9610==9610+1);
}
@Test
public void bigFalseTestSerialProxy16() {
	assertFalse(5292==5292+1);
}
@Test
public void bigFalseTestSerialProxy17() {
	assertFalse(5182==5182+1);
}
@Test
public void bigFalseTestSerialProxy18() {
	assertFalse(10244==10244+1);
}
@Test
public void bigFalseTestSerialProxy19() {
	assertFalse(1381==1381+1);
}
@Test
public void bigFalseTestSerialProxy20() {
	assertFalse(21431==21431+1);
}
@Test
public void bigFalseTestSerialProxy21() {
	assertFalse(21199==21199+1);
}
@Test
public void bigFalseTestSerialProxy22() {
	assertFalse(6234==6234+1);
}
@Test
public void bigFalseTestSerialProxy23() {
	assertFalse(19041==19041+1);
}
@Test
public void bigFalseTestSerialProxy24() {
	assertFalse(11327==11327+1);
}
@Test
public void bigFalseTestSerialProxy25() {
	assertFalse(31594==31594+1);
}
@Test
public void bigFalseTestSerialProxy26() {
	assertFalse(17153==17153+1);
}
@Test
public void bigFalseTestSerialProxy27() {
	assertFalse(20347==20347+1);
}
@Test
public void bigFalseTestSerialProxy28() {
	assertFalse(19624==19624+1);
}
@Test
public void bigFalseTestSerialProxy29() {
	assertFalse(4241==4241+1);
}
@Test
public void bigFalseTestSerialProxy30() {
	assertFalse(6081==6081+1);
}
@Test
public void bigFalseTestSerialProxy31() {
	assertFalse(24841==24841+1);
}
@Test
public void bigFalseTestSerialProxy32() {
	assertFalse(19830==19830+1);
}
@Test
public void bigFalseTestSerialProxy33() {
	assertFalse(10877==10877+1);
}
@Test
public void bigFalseTestSerialProxy34() {
	assertFalse(4236==4236+1);
}
@Test
public void bigFalseTestSerialProxy35() {
	assertFalse(22441==22441+1);
}
@Test
public void bigFalseTestSerialProxy36() {
	assertFalse(4047==4047+1);
}
@Test
public void bigFalseTestSerialProxy37() {
	assertFalse(31211==31211+1);
}
@Test
public void bigFalseTestSerialProxy38() {
	assertFalse(2650==2650+1);
}
@Test
public void bigFalseTestSerialProxy39() {
	assertFalse(30189==30189+1);
}
@Test
public void bigFalseTestSerialProxy40() {
	assertFalse(1973==1973+1);
}
@Test
public void bigFalseTestSerialProxy41() {
	assertFalse(11177==11177+1);
}
@Test
public void bigFalseTestSerialProxy42() {
	assertFalse(20420==20420+1);
}
@Test
public void bigFalseTestSerialProxy43() {
	assertFalse(29891==29891+1);
}
@Test
public void bigFalseTestSerialProxy44() {
	assertFalse(28160==28160+1);
}
@Test
public void bigFalseTestSerialProxy45() {
	assertFalse(30948==30948+1);
}
@Test
public void bigFalseTestSerialProxy46() {
	assertFalse(12642==12642+1);
}
@Test
public void bigFalseTestSerialProxy47() {
	assertFalse(27301==27301+1);
}
@Test
public void bigFalseTestSerialProxy48() {
	assertFalse(5660==5660+1);
}
@Test
public void bigFalseTestSerialProxy49() {
	assertFalse(28718==28718+1);
}
@Test
public void bigFalseTestSerialProxy50() {
	assertFalse(18406==18406+1);
}
@Test
public void bigFalseTestSerialProxy51() {
	assertFalse(31110==31110+1);
}
@Test
public void bigFalseTestSerialProxy52() {
	assertFalse(25480==25480+1);
}
@Test
public void bigFalseTestSerialProxy53() {
	assertFalse(17234==17234+1);
}
@Test
public void bigFalseTestSerialProxy54() {
	assertFalse(15349==15349+1);
}
@Test
public void bigFalseTestSerialProxy55() {
	assertFalse(28536==28536+1);
}
}
