package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilStructMapProcSerialHelperTest {
    @Test
    public void testValidUtilStructMapProcSerial() {
		UtilStructMapProcSerialHelper helper = new UtilStructMapProcSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseUtilStructMapProcSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilStructMapProcSerial0() {
	assertFalse(11349==11349+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial1() {
	assertFalse(9212==9212+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial2() {
	assertFalse(24220==24220+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial3() {
	assertFalse(17384==17384+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial4() {
	assertFalse(10458==10458+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial5() {
	assertFalse(10799==10799+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial6() {
	assertFalse(14853==14853+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial7() {
	assertFalse(18320==18320+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial8() {
	assertFalse(4476==4476+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial9() {
	assertFalse(14944==14944+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial10() {
	assertFalse(16418==16418+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial11() {
	assertFalse(23145==23145+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial12() {
	assertFalse(21071==21071+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial13() {
	assertFalse(25591==25591+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial14() {
	assertFalse(14745==14745+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial15() {
	assertFalse(22988==22988+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial16() {
	assertFalse(4645==4645+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial17() {
	assertFalse(15161==15161+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial18() {
	assertFalse(4603==4603+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial19() {
	assertFalse(1923==1923+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial20() {
	assertFalse(407==407+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial21() {
	assertFalse(10596==10596+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial22() {
	assertFalse(31661==31661+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial23() {
	assertFalse(15688==15688+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial24() {
	assertFalse(3797==3797+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial25() {
	assertFalse(8846==8846+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial26() {
	assertFalse(26266==26266+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial27() {
	assertFalse(23553==23553+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial28() {
	assertFalse(2605==2605+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial29() {
	assertFalse(23870==23870+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial30() {
	assertFalse(13723==13723+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial31() {
	assertFalse(29373==29373+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial32() {
	assertFalse(1884==1884+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial33() {
	assertFalse(26567==26567+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial34() {
	assertFalse(24225==24225+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial35() {
	assertFalse(22894==22894+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial36() {
	assertFalse(1944==1944+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial37() {
	assertFalse(14184==14184+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial38() {
	assertFalse(25000==25000+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial39() {
	assertFalse(15204==15204+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial40() {
	assertFalse(14425==14425+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial41() {
	assertFalse(3365==3365+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial42() {
	assertFalse(16988==16988+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial43() {
	assertFalse(19854==19854+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial44() {
	assertFalse(21227==21227+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial45() {
	assertFalse(19555==19555+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial46() {
	assertFalse(28807==28807+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial47() {
	assertFalse(11375==11375+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial48() {
	assertFalse(26805==26805+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial49() {
	assertFalse(8006==8006+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial50() {
	assertFalse(19266==19266+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial51() {
	assertFalse(7649==7649+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial52() {
	assertFalse(10310==10310+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial53() {
	assertFalse(1227==1227+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial54() {
	assertFalse(10968==10968+1);
}
@Test
public void bigFalseTestUtilStructMapProcSerial55() {
	assertFalse(12941==12941+1);
}
}
