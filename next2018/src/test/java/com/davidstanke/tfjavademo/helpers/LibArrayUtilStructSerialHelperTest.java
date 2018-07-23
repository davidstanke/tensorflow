package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibArrayUtilStructSerialHelperTest {
    @Test
    public void testValidLibArrayUtilStructSerial() {
		LibArrayUtilStructSerialHelper helper = new LibArrayUtilStructSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibArrayUtilStructSerial() {
	LibArrayUtilStructSerialHelper helper = new LibArrayUtilStructSerialHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseLibArrayUtilStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseLibArrayUtilStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLibArrayUtilStructSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial0() {
	assertFalse(21137==21137+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial1() {
	assertFalse(24585==24585+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial2() {
	assertFalse(7535==7535+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial3() {
	assertFalse(6163==6163+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial4() {
	assertFalse(31258==31258+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial5() {
	assertFalse(17631==17631+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial6() {
	assertFalse(14719==14719+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial7() {
	assertFalse(28447==28447+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial8() {
	assertFalse(29567==29567+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial9() {
	assertFalse(12839==12839+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial10() {
	assertFalse(22175==22175+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial11() {
	assertFalse(24825==24825+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial12() {
	assertFalse(6857==6857+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial13() {
	assertFalse(14158==14158+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial14() {
	assertFalse(2020==2020+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial15() {
	assertFalse(29331==29331+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial16() {
	assertFalse(18659==18659+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial17() {
	assertFalse(15240==15240+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial18() {
	assertFalse(12714==12714+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial19() {
	assertFalse(1041==1041+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial20() {
	assertFalse(8658==8658+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial21() {
	assertFalse(5461==5461+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial22() {
	assertFalse(14383==14383+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial23() {
	assertFalse(12599==12599+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial24() {
	assertFalse(2738==2738+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial25() {
	assertFalse(3797==3797+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial26() {
	assertFalse(31726==31726+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial27() {
	assertFalse(19602==19602+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial28() {
	assertFalse(884==884+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial29() {
	assertFalse(25297==25297+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial30() {
	assertFalse(16317==16317+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial31() {
	assertFalse(24937==24937+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial32() {
	assertFalse(24665==24665+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial33() {
	assertFalse(32389==32389+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial34() {
	assertFalse(21670==21670+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial35() {
	assertFalse(26723==26723+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial36() {
	assertFalse(7981==7981+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial37() {
	assertFalse(5167==5167+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial38() {
	assertFalse(10117==10117+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial39() {
	assertFalse(6901==6901+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial40() {
	assertFalse(21572==21572+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial41() {
	assertFalse(19032==19032+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial42() {
	assertFalse(3173==3173+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial43() {
	assertFalse(4497==4497+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial44() {
	assertFalse(27446==27446+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial45() {
	assertFalse(5093==5093+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial46() {
	assertFalse(25499==25499+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial47() {
	assertFalse(6288==6288+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial48() {
	assertFalse(14169==14169+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial49() {
	assertFalse(31965==31965+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial50() {
	assertFalse(29856==29856+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial51() {
	assertFalse(26587==26587+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial52() {
	assertFalse(4099==4099+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial53() {
	assertFalse(30711==30711+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial54() {
	assertFalse(6832==6832+1);
}
@Test
public void bigFalseTestLibArrayUtilStructSerial55() {
	assertFalse(10589==10589+1);
}
}
