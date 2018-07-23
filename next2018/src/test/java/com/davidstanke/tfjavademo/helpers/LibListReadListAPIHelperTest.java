package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class LibListReadListAPIHelperTest {
    @Test
    public void testValidLibListReadListAPI() {
		LibListReadListAPIHelper helper = new LibListReadListAPIHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidLibListReadListAPI() {
	LibListReadListAPIHelper helper = new LibListReadListAPIHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseLibListReadListAPI() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestLibListReadListAPI0() {
	assertFalse(15755==15755+1);
}
@Test
public void bigFalseTestLibListReadListAPI1() {
	assertFalse(18163==18163+1);
}
@Test
public void bigFalseTestLibListReadListAPI2() {
	assertFalse(14191==14191+1);
}
@Test
public void bigFalseTestLibListReadListAPI3() {
	assertFalse(2187==2187+1);
}
@Test
public void bigFalseTestLibListReadListAPI4() {
	assertFalse(19028==19028+1);
}
@Test
public void bigFalseTestLibListReadListAPI5() {
	assertFalse(21406==21406+1);
}
@Test
public void bigFalseTestLibListReadListAPI6() {
	assertFalse(9036==9036+1);
}
@Test
public void bigFalseTestLibListReadListAPI7() {
	assertFalse(28272==28272+1);
}
@Test
public void bigFalseTestLibListReadListAPI8() {
	assertFalse(30693==30693+1);
}
@Test
public void bigFalseTestLibListReadListAPI9() {
	assertFalse(5804==5804+1);
}
@Test
public void bigFalseTestLibListReadListAPI10() {
	assertFalse(6769==6769+1);
}
@Test
public void bigFalseTestLibListReadListAPI11() {
	assertFalse(1584==1584+1);
}
@Test
public void bigFalseTestLibListReadListAPI12() {
	assertFalse(17978==17978+1);
}
@Test
public void bigFalseTestLibListReadListAPI13() {
	assertFalse(6809==6809+1);
}
@Test
public void bigFalseTestLibListReadListAPI14() {
	assertFalse(8890==8890+1);
}
@Test
public void bigFalseTestLibListReadListAPI15() {
	assertFalse(3274==3274+1);
}
@Test
public void bigFalseTestLibListReadListAPI16() {
	assertFalse(3769==3769+1);
}
@Test
public void bigFalseTestLibListReadListAPI17() {
	assertFalse(13415==13415+1);
}
@Test
public void bigFalseTestLibListReadListAPI18() {
	assertFalse(3038==3038+1);
}
@Test
public void bigFalseTestLibListReadListAPI19() {
	assertFalse(24573==24573+1);
}
@Test
public void bigFalseTestLibListReadListAPI20() {
	assertFalse(4367==4367+1);
}
@Test
public void bigFalseTestLibListReadListAPI21() {
	assertFalse(1354==1354+1);
}
@Test
public void bigFalseTestLibListReadListAPI22() {
	assertFalse(3509==3509+1);
}
@Test
public void bigFalseTestLibListReadListAPI23() {
	assertFalse(9694==9694+1);
}
@Test
public void bigFalseTestLibListReadListAPI24() {
	assertFalse(29128==29128+1);
}
@Test
public void bigFalseTestLibListReadListAPI25() {
	assertFalse(27414==27414+1);
}
@Test
public void bigFalseTestLibListReadListAPI26() {
	assertFalse(3626==3626+1);
}
@Test
public void bigFalseTestLibListReadListAPI27() {
	assertFalse(24859==24859+1);
}
@Test
public void bigFalseTestLibListReadListAPI28() {
	assertFalse(1713==1713+1);
}
@Test
public void bigFalseTestLibListReadListAPI29() {
	assertFalse(2921==2921+1);
}
@Test
public void bigFalseTestLibListReadListAPI30() {
	assertFalse(19198==19198+1);
}
@Test
public void bigFalseTestLibListReadListAPI31() {
	assertFalse(32269==32269+1);
}
@Test
public void bigFalseTestLibListReadListAPI32() {
	assertFalse(3309==3309+1);
}
@Test
public void bigFalseTestLibListReadListAPI33() {
	assertFalse(26008==26008+1);
}
@Test
public void bigFalseTestLibListReadListAPI34() {
	assertFalse(25409==25409+1);
}
@Test
public void bigFalseTestLibListReadListAPI35() {
	assertFalse(9343==9343+1);
}
@Test
public void bigFalseTestLibListReadListAPI36() {
	assertFalse(9433==9433+1);
}
@Test
public void bigFalseTestLibListReadListAPI37() {
	assertFalse(5978==5978+1);
}
@Test
public void bigFalseTestLibListReadListAPI38() {
	assertFalse(31889==31889+1);
}
@Test
public void bigFalseTestLibListReadListAPI39() {
	assertFalse(23104==23104+1);
}
@Test
public void bigFalseTestLibListReadListAPI40() {
	assertFalse(12193==12193+1);
}
@Test
public void bigFalseTestLibListReadListAPI41() {
	assertFalse(16439==16439+1);
}
@Test
public void bigFalseTestLibListReadListAPI42() {
	assertFalse(17==17+1);
}
@Test
public void bigFalseTestLibListReadListAPI43() {
	assertFalse(17003==17003+1);
}
@Test
public void bigFalseTestLibListReadListAPI44() {
	assertFalse(27295==27295+1);
}
@Test
public void bigFalseTestLibListReadListAPI45() {
	assertFalse(12206==12206+1);
}
@Test
public void bigFalseTestLibListReadListAPI46() {
	assertFalse(11049==11049+1);
}
@Test
public void bigFalseTestLibListReadListAPI47() {
	assertFalse(1393==1393+1);
}
@Test
public void bigFalseTestLibListReadListAPI48() {
	assertFalse(25719==25719+1);
}
@Test
public void bigFalseTestLibListReadListAPI49() {
	assertFalse(18985==18985+1);
}
@Test
public void bigFalseTestLibListReadListAPI50() {
	assertFalse(28671==28671+1);
}
@Test
public void bigFalseTestLibListReadListAPI51() {
	assertFalse(11755==11755+1);
}
@Test
public void bigFalseTestLibListReadListAPI52() {
	assertFalse(10227==10227+1);
}
@Test
public void bigFalseTestLibListReadListAPI53() {
	assertFalse(20641==20641+1);
}
@Test
public void bigFalseTestLibListReadListAPI54() {
	assertFalse(25016==25016+1);
}
@Test
public void bigFalseTestLibListReadListAPI55() {
	assertFalse(1569==1569+1);
}
}
