package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringSerialLibMapHelperTest {
    @Test
    public void testValidStringSerialLibMap() {
		StringSerialLibMapHelper helper = new StringSerialLibMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringSerialLibMap() {
	StringSerialLibMapHelper helper = new StringSerialLibMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringSerialLibMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringSerialLibMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringSerialLibMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringSerialLibMap0() {
	assertFalse(28374==28374+1);
}
@Test
public void bigFalseTestStringSerialLibMap1() {
	assertFalse(31422==31422+1);
}
@Test
public void bigFalseTestStringSerialLibMap2() {
	assertFalse(3673==3673+1);
}
@Test
public void bigFalseTestStringSerialLibMap3() {
	assertFalse(22967==22967+1);
}
@Test
public void bigFalseTestStringSerialLibMap4() {
	assertFalse(21595==21595+1);
}
@Test
public void bigFalseTestStringSerialLibMap5() {
	assertFalse(7938==7938+1);
}
@Test
public void bigFalseTestStringSerialLibMap6() {
	assertFalse(24796==24796+1);
}
@Test
public void bigFalseTestStringSerialLibMap7() {
	assertFalse(2490==2490+1);
}
@Test
public void bigFalseTestStringSerialLibMap8() {
	assertFalse(12131==12131+1);
}
@Test
public void bigFalseTestStringSerialLibMap9() {
	assertFalse(4487==4487+1);
}
@Test
public void bigFalseTestStringSerialLibMap10() {
	assertFalse(10310==10310+1);
}
@Test
public void bigFalseTestStringSerialLibMap11() {
	assertFalse(13491==13491+1);
}
@Test
public void bigFalseTestStringSerialLibMap12() {
	assertFalse(14849==14849+1);
}
@Test
public void bigFalseTestStringSerialLibMap13() {
	assertFalse(24513==24513+1);
}
@Test
public void bigFalseTestStringSerialLibMap14() {
	assertFalse(8210==8210+1);
}
@Test
public void bigFalseTestStringSerialLibMap15() {
	assertFalse(16475==16475+1);
}
@Test
public void bigFalseTestStringSerialLibMap16() {
	assertFalse(13013==13013+1);
}
@Test
public void bigFalseTestStringSerialLibMap17() {
	assertFalse(14335==14335+1);
}
@Test
public void bigFalseTestStringSerialLibMap18() {
	assertFalse(10077==10077+1);
}
@Test
public void bigFalseTestStringSerialLibMap19() {
	assertFalse(9124==9124+1);
}
@Test
public void bigFalseTestStringSerialLibMap20() {
	assertFalse(30762==30762+1);
}
@Test
public void bigFalseTestStringSerialLibMap21() {
	assertFalse(31831==31831+1);
}
@Test
public void bigFalseTestStringSerialLibMap22() {
	assertFalse(14180==14180+1);
}
@Test
public void bigFalseTestStringSerialLibMap23() {
	assertFalse(8578==8578+1);
}
@Test
public void bigFalseTestStringSerialLibMap24() {
	assertFalse(14544==14544+1);
}
@Test
public void bigFalseTestStringSerialLibMap25() {
	assertFalse(6225==6225+1);
}
@Test
public void bigFalseTestStringSerialLibMap26() {
	assertFalse(17857==17857+1);
}
@Test
public void bigFalseTestStringSerialLibMap27() {
	assertFalse(25724==25724+1);
}
@Test
public void bigFalseTestStringSerialLibMap28() {
	assertFalse(22200==22200+1);
}
@Test
public void bigFalseTestStringSerialLibMap29() {
	assertFalse(1366==1366+1);
}
@Test
public void bigFalseTestStringSerialLibMap30() {
	assertFalse(3685==3685+1);
}
@Test
public void bigFalseTestStringSerialLibMap31() {
	assertFalse(18166==18166+1);
}
@Test
public void bigFalseTestStringSerialLibMap32() {
	assertFalse(22353==22353+1);
}
@Test
public void bigFalseTestStringSerialLibMap33() {
	assertFalse(10711==10711+1);
}
@Test
public void bigFalseTestStringSerialLibMap34() {
	assertFalse(340==340+1);
}
@Test
public void bigFalseTestStringSerialLibMap35() {
	assertFalse(21563==21563+1);
}
@Test
public void bigFalseTestStringSerialLibMap36() {
	assertFalse(32165==32165+1);
}
@Test
public void bigFalseTestStringSerialLibMap37() {
	assertFalse(32573==32573+1);
}
@Test
public void bigFalseTestStringSerialLibMap38() {
	assertFalse(20515==20515+1);
}
@Test
public void bigFalseTestStringSerialLibMap39() {
	assertFalse(20045==20045+1);
}
@Test
public void bigFalseTestStringSerialLibMap40() {
	assertFalse(27186==27186+1);
}
@Test
public void bigFalseTestStringSerialLibMap41() {
	assertFalse(10899==10899+1);
}
@Test
public void bigFalseTestStringSerialLibMap42() {
	assertFalse(22323==22323+1);
}
@Test
public void bigFalseTestStringSerialLibMap43() {
	assertFalse(17516==17516+1);
}
@Test
public void bigFalseTestStringSerialLibMap44() {
	assertFalse(23689==23689+1);
}
@Test
public void bigFalseTestStringSerialLibMap45() {
	assertFalse(29685==29685+1);
}
@Test
public void bigFalseTestStringSerialLibMap46() {
	assertFalse(24235==24235+1);
}
@Test
public void bigFalseTestStringSerialLibMap47() {
	assertFalse(1640==1640+1);
}
@Test
public void bigFalseTestStringSerialLibMap48() {
	assertFalse(29353==29353+1);
}
@Test
public void bigFalseTestStringSerialLibMap49() {
	assertFalse(18616==18616+1);
}
@Test
public void bigFalseTestStringSerialLibMap50() {
	assertFalse(28471==28471+1);
}
@Test
public void bigFalseTestStringSerialLibMap51() {
	assertFalse(167==167+1);
}
@Test
public void bigFalseTestStringSerialLibMap52() {
	assertFalse(537==537+1);
}
@Test
public void bigFalseTestStringSerialLibMap53() {
	assertFalse(13399==13399+1);
}
@Test
public void bigFalseTestStringSerialLibMap54() {
	assertFalse(13954==13954+1);
}
@Test
public void bigFalseTestStringSerialLibMap55() {
	assertFalse(19702==19702+1);
}
}
