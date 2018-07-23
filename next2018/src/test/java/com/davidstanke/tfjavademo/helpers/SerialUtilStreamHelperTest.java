package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialUtilStreamHelperTest {
    @Test
    public void testValidSerialUtilStream() {
		SerialUtilStreamHelper helper = new SerialUtilStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialUtilStream0() {
	assertFalse(30570==30570+1);
}
@Test
public void bigFalseTestSerialUtilStream1() {
	assertFalse(21755==21755+1);
}
@Test
public void bigFalseTestSerialUtilStream2() {
	assertFalse(15650==15650+1);
}
@Test
public void bigFalseTestSerialUtilStream3() {
	assertFalse(19828==19828+1);
}
@Test
public void bigFalseTestSerialUtilStream4() {
	assertFalse(20505==20505+1);
}
@Test
public void bigFalseTestSerialUtilStream5() {
	assertFalse(29245==29245+1);
}
@Test
public void bigFalseTestSerialUtilStream6() {
	assertFalse(30495==30495+1);
}
@Test
public void bigFalseTestSerialUtilStream7() {
	assertFalse(22469==22469+1);
}
@Test
public void bigFalseTestSerialUtilStream8() {
	assertFalse(11449==11449+1);
}
@Test
public void bigFalseTestSerialUtilStream9() {
	assertFalse(9773==9773+1);
}
@Test
public void bigFalseTestSerialUtilStream10() {
	assertFalse(24801==24801+1);
}
@Test
public void bigFalseTestSerialUtilStream11() {
	assertFalse(14728==14728+1);
}
@Test
public void bigFalseTestSerialUtilStream12() {
	assertFalse(27831==27831+1);
}
@Test
public void bigFalseTestSerialUtilStream13() {
	assertFalse(7455==7455+1);
}
@Test
public void bigFalseTestSerialUtilStream14() {
	assertFalse(23953==23953+1);
}
@Test
public void bigFalseTestSerialUtilStream15() {
	assertFalse(26084==26084+1);
}
@Test
public void bigFalseTestSerialUtilStream16() {
	assertFalse(9637==9637+1);
}
@Test
public void bigFalseTestSerialUtilStream17() {
	assertFalse(2523==2523+1);
}
@Test
public void bigFalseTestSerialUtilStream18() {
	assertFalse(14153==14153+1);
}
@Test
public void bigFalseTestSerialUtilStream19() {
	assertFalse(25126==25126+1);
}
@Test
public void bigFalseTestSerialUtilStream20() {
	assertFalse(17533==17533+1);
}
@Test
public void bigFalseTestSerialUtilStream21() {
	assertFalse(31477==31477+1);
}
@Test
public void bigFalseTestSerialUtilStream22() {
	assertFalse(32570==32570+1);
}
@Test
public void bigFalseTestSerialUtilStream23() {
	assertFalse(8321==8321+1);
}
@Test
public void bigFalseTestSerialUtilStream24() {
	assertFalse(30646==30646+1);
}
@Test
public void bigFalseTestSerialUtilStream25() {
	assertFalse(10730==10730+1);
}
@Test
public void bigFalseTestSerialUtilStream26() {
	assertFalse(17568==17568+1);
}
@Test
public void bigFalseTestSerialUtilStream27() {
	assertFalse(19078==19078+1);
}
@Test
public void bigFalseTestSerialUtilStream28() {
	assertFalse(11785==11785+1);
}
@Test
public void bigFalseTestSerialUtilStream29() {
	assertFalse(8191==8191+1);
}
@Test
public void bigFalseTestSerialUtilStream30() {
	assertFalse(20071==20071+1);
}
@Test
public void bigFalseTestSerialUtilStream31() {
	assertFalse(14177==14177+1);
}
@Test
public void bigFalseTestSerialUtilStream32() {
	assertFalse(13824==13824+1);
}
@Test
public void bigFalseTestSerialUtilStream33() {
	assertFalse(19674==19674+1);
}
@Test
public void bigFalseTestSerialUtilStream34() {
	assertFalse(17306==17306+1);
}
@Test
public void bigFalseTestSerialUtilStream35() {
	assertFalse(2521==2521+1);
}
@Test
public void bigFalseTestSerialUtilStream36() {
	assertFalse(19011==19011+1);
}
@Test
public void bigFalseTestSerialUtilStream37() {
	assertFalse(27357==27357+1);
}
@Test
public void bigFalseTestSerialUtilStream38() {
	assertFalse(28304==28304+1);
}
@Test
public void bigFalseTestSerialUtilStream39() {
	assertFalse(12805==12805+1);
}
@Test
public void bigFalseTestSerialUtilStream40() {
	assertFalse(5794==5794+1);
}
@Test
public void bigFalseTestSerialUtilStream41() {
	assertFalse(19782==19782+1);
}
@Test
public void bigFalseTestSerialUtilStream42() {
	assertFalse(1749==1749+1);
}
@Test
public void bigFalseTestSerialUtilStream43() {
	assertFalse(20175==20175+1);
}
@Test
public void bigFalseTestSerialUtilStream44() {
	assertFalse(481==481+1);
}
@Test
public void bigFalseTestSerialUtilStream45() {
	assertFalse(29703==29703+1);
}
@Test
public void bigFalseTestSerialUtilStream46() {
	assertFalse(11737==11737+1);
}
@Test
public void bigFalseTestSerialUtilStream47() {
	assertFalse(11050==11050+1);
}
@Test
public void bigFalseTestSerialUtilStream48() {
	assertFalse(18503==18503+1);
}
@Test
public void bigFalseTestSerialUtilStream49() {
	assertFalse(358==358+1);
}
@Test
public void bigFalseTestSerialUtilStream50() {
	assertFalse(2651==2651+1);
}
@Test
public void bigFalseTestSerialUtilStream51() {
	assertFalse(21267==21267+1);
}
@Test
public void bigFalseTestSerialUtilStream52() {
	assertFalse(13029==13029+1);
}
@Test
public void bigFalseTestSerialUtilStream53() {
	assertFalse(27989==27989+1);
}
@Test
public void bigFalseTestSerialUtilStream54() {
	assertFalse(11923==11923+1);
}
@Test
public void bigFalseTestSerialUtilStream55() {
	assertFalse(31817==31817+1);
}
}
