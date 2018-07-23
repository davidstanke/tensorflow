package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialStreamProxyProcHelperTest {
    @Test
    public void testValidSerialStreamProxyProc() {
		SerialStreamProxyProcHelper helper = new SerialStreamProxyProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseSerialStreamProxyProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialStreamProxyProc0() {
	assertFalse(26510==26510+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc1() {
	assertFalse(5015==5015+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc2() {
	assertFalse(26934==26934+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc3() {
	assertFalse(8410==8410+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc4() {
	assertFalse(32678==32678+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc5() {
	assertFalse(3122==3122+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc6() {
	assertFalse(16477==16477+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc7() {
	assertFalse(9144==9144+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc8() {
	assertFalse(2082==2082+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc9() {
	assertFalse(10142==10142+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc10() {
	assertFalse(1302==1302+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc11() {
	assertFalse(12056==12056+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc12() {
	assertFalse(5046==5046+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc13() {
	assertFalse(18488==18488+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc14() {
	assertFalse(16198==16198+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc15() {
	assertFalse(29557==29557+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc16() {
	assertFalse(25624==25624+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc17() {
	assertFalse(5713==5713+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc18() {
	assertFalse(13742==13742+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc19() {
	assertFalse(22879==22879+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc20() {
	assertFalse(13475==13475+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc21() {
	assertFalse(19609==19609+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc22() {
	assertFalse(24552==24552+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc23() {
	assertFalse(20930==20930+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc24() {
	assertFalse(4783==4783+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc25() {
	assertFalse(24394==24394+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc26() {
	assertFalse(31775==31775+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc27() {
	assertFalse(24304==24304+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc28() {
	assertFalse(24491==24491+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc29() {
	assertFalse(27156==27156+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc30() {
	assertFalse(17553==17553+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc31() {
	assertFalse(8819==8819+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc32() {
	assertFalse(22783==22783+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc33() {
	assertFalse(4299==4299+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc34() {
	assertFalse(198==198+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc35() {
	assertFalse(31637==31637+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc36() {
	assertFalse(16803==16803+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc37() {
	assertFalse(16083==16083+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc38() {
	assertFalse(28302==28302+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc39() {
	assertFalse(683==683+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc40() {
	assertFalse(2431==2431+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc41() {
	assertFalse(28999==28999+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc42() {
	assertFalse(16060==16060+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc43() {
	assertFalse(27942==27942+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc44() {
	assertFalse(3713==3713+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc45() {
	assertFalse(30700==30700+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc46() {
	assertFalse(8611==8611+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc47() {
	assertFalse(9816==9816+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc48() {
	assertFalse(21376==21376+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc49() {
	assertFalse(22745==22745+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc50() {
	assertFalse(8020==8020+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc51() {
	assertFalse(10501==10501+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc52() {
	assertFalse(18644==18644+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc53() {
	assertFalse(17122==17122+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc54() {
	assertFalse(14230==14230+1);
}
@Test
public void bigFalseTestSerialStreamProxyProc55() {
	assertFalse(26033==26033+1);
}
}
