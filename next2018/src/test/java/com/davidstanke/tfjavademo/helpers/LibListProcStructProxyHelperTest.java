package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibListProcStructProxyHelperTest {
    @Test
    public void testValidLibListProcStructProxy() {
		LibListProcStructProxyHelper helper = new LibListProcStructProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibListProcStructProxy() {
	LibListProcStructProxyHelper helper = new LibListProcStructProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseLibListProcStructProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseLibListProcStructProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseLibListProcStructProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibListProcStructProxy0() {
	assertFalse(15361==15361+1);
}
@Test
public void bigFalseTestLibListProcStructProxy1() {
	assertFalse(28358==28358+1);
}
@Test
public void bigFalseTestLibListProcStructProxy2() {
	assertFalse(2461==2461+1);
}
@Test
public void bigFalseTestLibListProcStructProxy3() {
	assertFalse(7048==7048+1);
}
@Test
public void bigFalseTestLibListProcStructProxy4() {
	assertFalse(29930==29930+1);
}
@Test
public void bigFalseTestLibListProcStructProxy5() {
	assertFalse(20254==20254+1);
}
@Test
public void bigFalseTestLibListProcStructProxy6() {
	assertFalse(2324==2324+1);
}
@Test
public void bigFalseTestLibListProcStructProxy7() {
	assertFalse(3150==3150+1);
}
@Test
public void bigFalseTestLibListProcStructProxy8() {
	assertFalse(29503==29503+1);
}
@Test
public void bigFalseTestLibListProcStructProxy9() {
	assertFalse(971==971+1);
}
@Test
public void bigFalseTestLibListProcStructProxy10() {
	assertFalse(14834==14834+1);
}
@Test
public void bigFalseTestLibListProcStructProxy11() {
	assertFalse(16649==16649+1);
}
@Test
public void bigFalseTestLibListProcStructProxy12() {
	assertFalse(1206==1206+1);
}
@Test
public void bigFalseTestLibListProcStructProxy13() {
	assertFalse(3341==3341+1);
}
@Test
public void bigFalseTestLibListProcStructProxy14() {
	assertFalse(19700==19700+1);
}
@Test
public void bigFalseTestLibListProcStructProxy15() {
	assertFalse(18051==18051+1);
}
@Test
public void bigFalseTestLibListProcStructProxy16() {
	assertFalse(29438==29438+1);
}
@Test
public void bigFalseTestLibListProcStructProxy17() {
	assertFalse(19707==19707+1);
}
@Test
public void bigFalseTestLibListProcStructProxy18() {
	assertFalse(2499==2499+1);
}
@Test
public void bigFalseTestLibListProcStructProxy19() {
	assertFalse(31260==31260+1);
}
@Test
public void bigFalseTestLibListProcStructProxy20() {
	assertFalse(10651==10651+1);
}
@Test
public void bigFalseTestLibListProcStructProxy21() {
	assertFalse(11823==11823+1);
}
@Test
public void bigFalseTestLibListProcStructProxy22() {
	assertFalse(11830==11830+1);
}
@Test
public void bigFalseTestLibListProcStructProxy23() {
	assertFalse(24146==24146+1);
}
@Test
public void bigFalseTestLibListProcStructProxy24() {
	assertFalse(23941==23941+1);
}
@Test
public void bigFalseTestLibListProcStructProxy25() {
	assertFalse(2353==2353+1);
}
@Test
public void bigFalseTestLibListProcStructProxy26() {
	assertFalse(1354==1354+1);
}
@Test
public void bigFalseTestLibListProcStructProxy27() {
	assertFalse(11283==11283+1);
}
@Test
public void bigFalseTestLibListProcStructProxy28() {
	assertFalse(4736==4736+1);
}
@Test
public void bigFalseTestLibListProcStructProxy29() {
	assertFalse(29860==29860+1);
}
@Test
public void bigFalseTestLibListProcStructProxy30() {
	assertFalse(29153==29153+1);
}
@Test
public void bigFalseTestLibListProcStructProxy31() {
	assertFalse(11458==11458+1);
}
@Test
public void bigFalseTestLibListProcStructProxy32() {
	assertFalse(6714==6714+1);
}
@Test
public void bigFalseTestLibListProcStructProxy33() {
	assertFalse(27699==27699+1);
}
@Test
public void bigFalseTestLibListProcStructProxy34() {
	assertFalse(26941==26941+1);
}
@Test
public void bigFalseTestLibListProcStructProxy35() {
	assertFalse(10507==10507+1);
}
@Test
public void bigFalseTestLibListProcStructProxy36() {
	assertFalse(26918==26918+1);
}
@Test
public void bigFalseTestLibListProcStructProxy37() {
	assertFalse(31289==31289+1);
}
@Test
public void bigFalseTestLibListProcStructProxy38() {
	assertFalse(6460==6460+1);
}
@Test
public void bigFalseTestLibListProcStructProxy39() {
	assertFalse(30823==30823+1);
}
@Test
public void bigFalseTestLibListProcStructProxy40() {
	assertFalse(23835==23835+1);
}
@Test
public void bigFalseTestLibListProcStructProxy41() {
	assertFalse(20531==20531+1);
}
@Test
public void bigFalseTestLibListProcStructProxy42() {
	assertFalse(13905==13905+1);
}
@Test
public void bigFalseTestLibListProcStructProxy43() {
	assertFalse(32110==32110+1);
}
@Test
public void bigFalseTestLibListProcStructProxy44() {
	assertFalse(20907==20907+1);
}
@Test
public void bigFalseTestLibListProcStructProxy45() {
	assertFalse(31206==31206+1);
}
@Test
public void bigFalseTestLibListProcStructProxy46() {
	assertFalse(11590==11590+1);
}
@Test
public void bigFalseTestLibListProcStructProxy47() {
	assertFalse(6880==6880+1);
}
@Test
public void bigFalseTestLibListProcStructProxy48() {
	assertFalse(7748==7748+1);
}
@Test
public void bigFalseTestLibListProcStructProxy49() {
	assertFalse(5967==5967+1);
}
@Test
public void bigFalseTestLibListProcStructProxy50() {
	assertFalse(13492==13492+1);
}
@Test
public void bigFalseTestLibListProcStructProxy51() {
	assertFalse(28017==28017+1);
}
@Test
public void bigFalseTestLibListProcStructProxy52() {
	assertFalse(23049==23049+1);
}
@Test
public void bigFalseTestLibListProcStructProxy53() {
	assertFalse(18767==18767+1);
}
@Test
public void bigFalseTestLibListProcStructProxy54() {
	assertFalse(31293==31293+1);
}
@Test
public void bigFalseTestLibListProcStructProxy55() {
	assertFalse(22104==22104+1);
}
}
