package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilSerialStreamHelperTest {
    @Test
    public void testValidUtilSerialStream() {
		UtilSerialStreamHelper helper = new UtilSerialStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseUtilSerialStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseUtilSerialStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseUtilSerialStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilSerialStream0() {
	assertFalse(32090==32090+1);
}
@Test
public void bigFalseTestUtilSerialStream1() {
	assertFalse(32392==32392+1);
}
@Test
public void bigFalseTestUtilSerialStream2() {
	assertFalse(16803==16803+1);
}
@Test
public void bigFalseTestUtilSerialStream3() {
	assertFalse(11696==11696+1);
}
@Test
public void bigFalseTestUtilSerialStream4() {
	assertFalse(11930==11930+1);
}
@Test
public void bigFalseTestUtilSerialStream5() {
	assertFalse(2812==2812+1);
}
@Test
public void bigFalseTestUtilSerialStream6() {
	assertFalse(24079==24079+1);
}
@Test
public void bigFalseTestUtilSerialStream7() {
	assertFalse(15050==15050+1);
}
@Test
public void bigFalseTestUtilSerialStream8() {
	assertFalse(32101==32101+1);
}
@Test
public void bigFalseTestUtilSerialStream9() {
	assertFalse(13443==13443+1);
}
@Test
public void bigFalseTestUtilSerialStream10() {
	assertFalse(24786==24786+1);
}
@Test
public void bigFalseTestUtilSerialStream11() {
	assertFalse(11020==11020+1);
}
@Test
public void bigFalseTestUtilSerialStream12() {
	assertFalse(5456==5456+1);
}
@Test
public void bigFalseTestUtilSerialStream13() {
	assertFalse(29038==29038+1);
}
@Test
public void bigFalseTestUtilSerialStream14() {
	assertFalse(6139==6139+1);
}
@Test
public void bigFalseTestUtilSerialStream15() {
	assertFalse(26641==26641+1);
}
@Test
public void bigFalseTestUtilSerialStream16() {
	assertFalse(17491==17491+1);
}
@Test
public void bigFalseTestUtilSerialStream17() {
	assertFalse(29338==29338+1);
}
@Test
public void bigFalseTestUtilSerialStream18() {
	assertFalse(21398==21398+1);
}
@Test
public void bigFalseTestUtilSerialStream19() {
	assertFalse(28742==28742+1);
}
@Test
public void bigFalseTestUtilSerialStream20() {
	assertFalse(7731==7731+1);
}
@Test
public void bigFalseTestUtilSerialStream21() {
	assertFalse(8297==8297+1);
}
@Test
public void bigFalseTestUtilSerialStream22() {
	assertFalse(25855==25855+1);
}
@Test
public void bigFalseTestUtilSerialStream23() {
	assertFalse(12870==12870+1);
}
@Test
public void bigFalseTestUtilSerialStream24() {
	assertFalse(27315==27315+1);
}
@Test
public void bigFalseTestUtilSerialStream25() {
	assertFalse(27523==27523+1);
}
@Test
public void bigFalseTestUtilSerialStream26() {
	assertFalse(18151==18151+1);
}
@Test
public void bigFalseTestUtilSerialStream27() {
	assertFalse(16883==16883+1);
}
@Test
public void bigFalseTestUtilSerialStream28() {
	assertFalse(19066==19066+1);
}
@Test
public void bigFalseTestUtilSerialStream29() {
	assertFalse(27985==27985+1);
}
@Test
public void bigFalseTestUtilSerialStream30() {
	assertFalse(14888==14888+1);
}
@Test
public void bigFalseTestUtilSerialStream31() {
	assertFalse(17240==17240+1);
}
@Test
public void bigFalseTestUtilSerialStream32() {
	assertFalse(16067==16067+1);
}
@Test
public void bigFalseTestUtilSerialStream33() {
	assertFalse(5174==5174+1);
}
@Test
public void bigFalseTestUtilSerialStream34() {
	assertFalse(25416==25416+1);
}
@Test
public void bigFalseTestUtilSerialStream35() {
	assertFalse(10049==10049+1);
}
@Test
public void bigFalseTestUtilSerialStream36() {
	assertFalse(32711==32711+1);
}
@Test
public void bigFalseTestUtilSerialStream37() {
	assertFalse(22411==22411+1);
}
@Test
public void bigFalseTestUtilSerialStream38() {
	assertFalse(13519==13519+1);
}
@Test
public void bigFalseTestUtilSerialStream39() {
	assertFalse(5528==5528+1);
}
@Test
public void bigFalseTestUtilSerialStream40() {
	assertFalse(19946==19946+1);
}
@Test
public void bigFalseTestUtilSerialStream41() {
	assertFalse(12129==12129+1);
}
@Test
public void bigFalseTestUtilSerialStream42() {
	assertFalse(12873==12873+1);
}
@Test
public void bigFalseTestUtilSerialStream43() {
	assertFalse(8574==8574+1);
}
@Test
public void bigFalseTestUtilSerialStream44() {
	assertFalse(10663==10663+1);
}
@Test
public void bigFalseTestUtilSerialStream45() {
	assertFalse(19446==19446+1);
}
@Test
public void bigFalseTestUtilSerialStream46() {
	assertFalse(22554==22554+1);
}
@Test
public void bigFalseTestUtilSerialStream47() {
	assertFalse(9005==9005+1);
}
@Test
public void bigFalseTestUtilSerialStream48() {
	assertFalse(7741==7741+1);
}
@Test
public void bigFalseTestUtilSerialStream49() {
	assertFalse(18675==18675+1);
}
@Test
public void bigFalseTestUtilSerialStream50() {
	assertFalse(13316==13316+1);
}
@Test
public void bigFalseTestUtilSerialStream51() {
	assertFalse(21392==21392+1);
}
@Test
public void bigFalseTestUtilSerialStream52() {
	assertFalse(2839==2839+1);
}
@Test
public void bigFalseTestUtilSerialStream53() {
	assertFalse(22635==22635+1);
}
@Test
public void bigFalseTestUtilSerialStream54() {
	assertFalse(31353==31353+1);
}
@Test
public void bigFalseTestUtilSerialStream55() {
	assertFalse(1439==1439+1);
}
}
