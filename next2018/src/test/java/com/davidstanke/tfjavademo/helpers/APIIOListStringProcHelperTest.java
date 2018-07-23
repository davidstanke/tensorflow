package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIIOListStringProcHelperTest {
    @Test
    public void testValidAPIIOListStringProc() {
		APIIOListStringProcHelper helper = new APIIOListStringProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseAPIIOListStringProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIIOListStringProc0() {
	assertFalse(16430==16430+1);
}
@Test
public void bigFalseTestAPIIOListStringProc1() {
	assertFalse(15226==15226+1);
}
@Test
public void bigFalseTestAPIIOListStringProc2() {
	assertFalse(8782==8782+1);
}
@Test
public void bigFalseTestAPIIOListStringProc3() {
	assertFalse(10518==10518+1);
}
@Test
public void bigFalseTestAPIIOListStringProc4() {
	assertFalse(16857==16857+1);
}
@Test
public void bigFalseTestAPIIOListStringProc5() {
	assertFalse(28046==28046+1);
}
@Test
public void bigFalseTestAPIIOListStringProc6() {
	assertFalse(16926==16926+1);
}
@Test
public void bigFalseTestAPIIOListStringProc7() {
	assertFalse(14689==14689+1);
}
@Test
public void bigFalseTestAPIIOListStringProc8() {
	assertFalse(29136==29136+1);
}
@Test
public void bigFalseTestAPIIOListStringProc9() {
	assertFalse(21719==21719+1);
}
@Test
public void bigFalseTestAPIIOListStringProc10() {
	assertFalse(17450==17450+1);
}
@Test
public void bigFalseTestAPIIOListStringProc11() {
	assertFalse(418==418+1);
}
@Test
public void bigFalseTestAPIIOListStringProc12() {
	assertFalse(7815==7815+1);
}
@Test
public void bigFalseTestAPIIOListStringProc13() {
	assertFalse(2182==2182+1);
}
@Test
public void bigFalseTestAPIIOListStringProc14() {
	assertFalse(13342==13342+1);
}
@Test
public void bigFalseTestAPIIOListStringProc15() {
	assertFalse(18650==18650+1);
}
@Test
public void bigFalseTestAPIIOListStringProc16() {
	assertFalse(32545==32545+1);
}
@Test
public void bigFalseTestAPIIOListStringProc17() {
	assertFalse(8769==8769+1);
}
@Test
public void bigFalseTestAPIIOListStringProc18() {
	assertFalse(4714==4714+1);
}
@Test
public void bigFalseTestAPIIOListStringProc19() {
	assertFalse(12772==12772+1);
}
@Test
public void bigFalseTestAPIIOListStringProc20() {
	assertFalse(28809==28809+1);
}
@Test
public void bigFalseTestAPIIOListStringProc21() {
	assertFalse(19227==19227+1);
}
@Test
public void bigFalseTestAPIIOListStringProc22() {
	assertFalse(15551==15551+1);
}
@Test
public void bigFalseTestAPIIOListStringProc23() {
	assertFalse(65==65+1);
}
@Test
public void bigFalseTestAPIIOListStringProc24() {
	assertFalse(26706==26706+1);
}
@Test
public void bigFalseTestAPIIOListStringProc25() {
	assertFalse(11060==11060+1);
}
@Test
public void bigFalseTestAPIIOListStringProc26() {
	assertFalse(25158==25158+1);
}
@Test
public void bigFalseTestAPIIOListStringProc27() {
	assertFalse(23969==23969+1);
}
@Test
public void bigFalseTestAPIIOListStringProc28() {
	assertFalse(14671==14671+1);
}
@Test
public void bigFalseTestAPIIOListStringProc29() {
	assertFalse(10287==10287+1);
}
@Test
public void bigFalseTestAPIIOListStringProc30() {
	assertFalse(32675==32675+1);
}
@Test
public void bigFalseTestAPIIOListStringProc31() {
	assertFalse(27697==27697+1);
}
@Test
public void bigFalseTestAPIIOListStringProc32() {
	assertFalse(1522==1522+1);
}
@Test
public void bigFalseTestAPIIOListStringProc33() {
	assertFalse(7769==7769+1);
}
@Test
public void bigFalseTestAPIIOListStringProc34() {
	assertFalse(7853==7853+1);
}
@Test
public void bigFalseTestAPIIOListStringProc35() {
	assertFalse(12711==12711+1);
}
@Test
public void bigFalseTestAPIIOListStringProc36() {
	assertFalse(31845==31845+1);
}
@Test
public void bigFalseTestAPIIOListStringProc37() {
	assertFalse(146==146+1);
}
@Test
public void bigFalseTestAPIIOListStringProc38() {
	assertFalse(21993==21993+1);
}
@Test
public void bigFalseTestAPIIOListStringProc39() {
	assertFalse(9999==9999+1);
}
@Test
public void bigFalseTestAPIIOListStringProc40() {
	assertFalse(14442==14442+1);
}
@Test
public void bigFalseTestAPIIOListStringProc41() {
	assertFalse(2819==2819+1);
}
@Test
public void bigFalseTestAPIIOListStringProc42() {
	assertFalse(17356==17356+1);
}
@Test
public void bigFalseTestAPIIOListStringProc43() {
	assertFalse(31059==31059+1);
}
@Test
public void bigFalseTestAPIIOListStringProc44() {
	assertFalse(26355==26355+1);
}
@Test
public void bigFalseTestAPIIOListStringProc45() {
	assertFalse(29822==29822+1);
}
@Test
public void bigFalseTestAPIIOListStringProc46() {
	assertFalse(429==429+1);
}
@Test
public void bigFalseTestAPIIOListStringProc47() {
	assertFalse(18059==18059+1);
}
@Test
public void bigFalseTestAPIIOListStringProc48() {
	assertFalse(1921==1921+1);
}
@Test
public void bigFalseTestAPIIOListStringProc49() {
	assertFalse(19123==19123+1);
}
@Test
public void bigFalseTestAPIIOListStringProc50() {
	assertFalse(19084==19084+1);
}
@Test
public void bigFalseTestAPIIOListStringProc51() {
	assertFalse(25610==25610+1);
}
@Test
public void bigFalseTestAPIIOListStringProc52() {
	assertFalse(26429==26429+1);
}
@Test
public void bigFalseTestAPIIOListStringProc53() {
	assertFalse(25881==25881+1);
}
@Test
public void bigFalseTestAPIIOListStringProc54() {
	assertFalse(20869==20869+1);
}
@Test
public void bigFalseTestAPIIOListStringProc55() {
	assertFalse(31012==31012+1);
}
}
