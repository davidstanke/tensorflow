package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilArrayNumMapHelperTest {
    @Test
    public void testValidUtilArrayNumMap() {
		UtilArrayNumMapHelper helper = new UtilArrayNumMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseUtilArrayNumMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseUtilArrayNumMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilArrayNumMap0() {
	assertFalse(10243==10243+1);
}
@Test
public void bigFalseTestUtilArrayNumMap1() {
	assertFalse(22226==22226+1);
}
@Test
public void bigFalseTestUtilArrayNumMap2() {
	assertFalse(32583==32583+1);
}
@Test
public void bigFalseTestUtilArrayNumMap3() {
	assertFalse(21420==21420+1);
}
@Test
public void bigFalseTestUtilArrayNumMap4() {
	assertFalse(23290==23290+1);
}
@Test
public void bigFalseTestUtilArrayNumMap5() {
	assertFalse(15630==15630+1);
}
@Test
public void bigFalseTestUtilArrayNumMap6() {
	assertFalse(16735==16735+1);
}
@Test
public void bigFalseTestUtilArrayNumMap7() {
	assertFalse(8259==8259+1);
}
@Test
public void bigFalseTestUtilArrayNumMap8() {
	assertFalse(20352==20352+1);
}
@Test
public void bigFalseTestUtilArrayNumMap9() {
	assertFalse(17044==17044+1);
}
@Test
public void bigFalseTestUtilArrayNumMap10() {
	assertFalse(26792==26792+1);
}
@Test
public void bigFalseTestUtilArrayNumMap11() {
	assertFalse(1697==1697+1);
}
@Test
public void bigFalseTestUtilArrayNumMap12() {
	assertFalse(17976==17976+1);
}
@Test
public void bigFalseTestUtilArrayNumMap13() {
	assertFalse(25943==25943+1);
}
@Test
public void bigFalseTestUtilArrayNumMap14() {
	assertFalse(3549==3549+1);
}
@Test
public void bigFalseTestUtilArrayNumMap15() {
	assertFalse(711==711+1);
}
@Test
public void bigFalseTestUtilArrayNumMap16() {
	assertFalse(32261==32261+1);
}
@Test
public void bigFalseTestUtilArrayNumMap17() {
	assertFalse(28106==28106+1);
}
@Test
public void bigFalseTestUtilArrayNumMap18() {
	assertFalse(8240==8240+1);
}
@Test
public void bigFalseTestUtilArrayNumMap19() {
	assertFalse(24115==24115+1);
}
@Test
public void bigFalseTestUtilArrayNumMap20() {
	assertFalse(13929==13929+1);
}
@Test
public void bigFalseTestUtilArrayNumMap21() {
	assertFalse(30726==30726+1);
}
@Test
public void bigFalseTestUtilArrayNumMap22() {
	assertFalse(13578==13578+1);
}
@Test
public void bigFalseTestUtilArrayNumMap23() {
	assertFalse(27369==27369+1);
}
@Test
public void bigFalseTestUtilArrayNumMap24() {
	assertFalse(31646==31646+1);
}
@Test
public void bigFalseTestUtilArrayNumMap25() {
	assertFalse(25537==25537+1);
}
@Test
public void bigFalseTestUtilArrayNumMap26() {
	assertFalse(6015==6015+1);
}
@Test
public void bigFalseTestUtilArrayNumMap27() {
	assertFalse(25414==25414+1);
}
@Test
public void bigFalseTestUtilArrayNumMap28() {
	assertFalse(6262==6262+1);
}
@Test
public void bigFalseTestUtilArrayNumMap29() {
	assertFalse(22255==22255+1);
}
@Test
public void bigFalseTestUtilArrayNumMap30() {
	assertFalse(21395==21395+1);
}
@Test
public void bigFalseTestUtilArrayNumMap31() {
	assertFalse(31364==31364+1);
}
@Test
public void bigFalseTestUtilArrayNumMap32() {
	assertFalse(18931==18931+1);
}
@Test
public void bigFalseTestUtilArrayNumMap33() {
	assertFalse(16181==16181+1);
}
@Test
public void bigFalseTestUtilArrayNumMap34() {
	assertFalse(14639==14639+1);
}
@Test
public void bigFalseTestUtilArrayNumMap35() {
	assertFalse(27148==27148+1);
}
@Test
public void bigFalseTestUtilArrayNumMap36() {
	assertFalse(4262==4262+1);
}
@Test
public void bigFalseTestUtilArrayNumMap37() {
	assertFalse(32274==32274+1);
}
@Test
public void bigFalseTestUtilArrayNumMap38() {
	assertFalse(4833==4833+1);
}
@Test
public void bigFalseTestUtilArrayNumMap39() {
	assertFalse(1919==1919+1);
}
@Test
public void bigFalseTestUtilArrayNumMap40() {
	assertFalse(15304==15304+1);
}
@Test
public void bigFalseTestUtilArrayNumMap41() {
	assertFalse(11212==11212+1);
}
@Test
public void bigFalseTestUtilArrayNumMap42() {
	assertFalse(3159==3159+1);
}
@Test
public void bigFalseTestUtilArrayNumMap43() {
	assertFalse(12162==12162+1);
}
@Test
public void bigFalseTestUtilArrayNumMap44() {
	assertFalse(2586==2586+1);
}
@Test
public void bigFalseTestUtilArrayNumMap45() {
	assertFalse(7452==7452+1);
}
@Test
public void bigFalseTestUtilArrayNumMap46() {
	assertFalse(1177==1177+1);
}
@Test
public void bigFalseTestUtilArrayNumMap47() {
	assertFalse(4429==4429+1);
}
@Test
public void bigFalseTestUtilArrayNumMap48() {
	assertFalse(31868==31868+1);
}
@Test
public void bigFalseTestUtilArrayNumMap49() {
	assertFalse(6041==6041+1);
}
@Test
public void bigFalseTestUtilArrayNumMap50() {
	assertFalse(18441==18441+1);
}
@Test
public void bigFalseTestUtilArrayNumMap51() {
	assertFalse(9971==9971+1);
}
@Test
public void bigFalseTestUtilArrayNumMap52() {
	assertFalse(13904==13904+1);
}
@Test
public void bigFalseTestUtilArrayNumMap53() {
	assertFalse(24805==24805+1);
}
@Test
public void bigFalseTestUtilArrayNumMap54() {
	assertFalse(28188==28188+1);
}
@Test
public void bigFalseTestUtilArrayNumMap55() {
	assertFalse(26223==26223+1);
}
}
