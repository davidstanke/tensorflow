package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APISerialIOMapHelperTest {
    @Test
    public void testValidAPISerialIOMap() {
		APISerialIOMapHelper helper = new APISerialIOMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPISerialIOMap() {
	APISerialIOMapHelper helper = new APISerialIOMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPISerialIOMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPISerialIOMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPISerialIOMap0() {
	assertFalse(5261==5261+1);
}
@Test
public void bigFalseTestAPISerialIOMap1() {
	assertFalse(3781==3781+1);
}
@Test
public void bigFalseTestAPISerialIOMap2() {
	assertFalse(28568==28568+1);
}
@Test
public void bigFalseTestAPISerialIOMap3() {
	assertFalse(20947==20947+1);
}
@Test
public void bigFalseTestAPISerialIOMap4() {
	assertFalse(28801==28801+1);
}
@Test
public void bigFalseTestAPISerialIOMap5() {
	assertFalse(15042==15042+1);
}
@Test
public void bigFalseTestAPISerialIOMap6() {
	assertFalse(20814==20814+1);
}
@Test
public void bigFalseTestAPISerialIOMap7() {
	assertFalse(3635==3635+1);
}
@Test
public void bigFalseTestAPISerialIOMap8() {
	assertFalse(30789==30789+1);
}
@Test
public void bigFalseTestAPISerialIOMap9() {
	assertFalse(25475==25475+1);
}
@Test
public void bigFalseTestAPISerialIOMap10() {
	assertFalse(6212==6212+1);
}
@Test
public void bigFalseTestAPISerialIOMap11() {
	assertFalse(28224==28224+1);
}
@Test
public void bigFalseTestAPISerialIOMap12() {
	assertFalse(32061==32061+1);
}
@Test
public void bigFalseTestAPISerialIOMap13() {
	assertFalse(3936==3936+1);
}
@Test
public void bigFalseTestAPISerialIOMap14() {
	assertFalse(17429==17429+1);
}
@Test
public void bigFalseTestAPISerialIOMap15() {
	assertFalse(30397==30397+1);
}
@Test
public void bigFalseTestAPISerialIOMap16() {
	assertFalse(26897==26897+1);
}
@Test
public void bigFalseTestAPISerialIOMap17() {
	assertFalse(15886==15886+1);
}
@Test
public void bigFalseTestAPISerialIOMap18() {
	assertFalse(2467==2467+1);
}
@Test
public void bigFalseTestAPISerialIOMap19() {
	assertFalse(21841==21841+1);
}
@Test
public void bigFalseTestAPISerialIOMap20() {
	assertFalse(24104==24104+1);
}
@Test
public void bigFalseTestAPISerialIOMap21() {
	assertFalse(1379==1379+1);
}
@Test
public void bigFalseTestAPISerialIOMap22() {
	assertFalse(15865==15865+1);
}
@Test
public void bigFalseTestAPISerialIOMap23() {
	assertFalse(26679==26679+1);
}
@Test
public void bigFalseTestAPISerialIOMap24() {
	assertFalse(25573==25573+1);
}
@Test
public void bigFalseTestAPISerialIOMap25() {
	assertFalse(12009==12009+1);
}
@Test
public void bigFalseTestAPISerialIOMap26() {
	assertFalse(4835==4835+1);
}
@Test
public void bigFalseTestAPISerialIOMap27() {
	assertFalse(5287==5287+1);
}
@Test
public void bigFalseTestAPISerialIOMap28() {
	assertFalse(6820==6820+1);
}
@Test
public void bigFalseTestAPISerialIOMap29() {
	assertFalse(8740==8740+1);
}
@Test
public void bigFalseTestAPISerialIOMap30() {
	assertFalse(331==331+1);
}
@Test
public void bigFalseTestAPISerialIOMap31() {
	assertFalse(6152==6152+1);
}
@Test
public void bigFalseTestAPISerialIOMap32() {
	assertFalse(13171==13171+1);
}
@Test
public void bigFalseTestAPISerialIOMap33() {
	assertFalse(10147==10147+1);
}
@Test
public void bigFalseTestAPISerialIOMap34() {
	assertFalse(32082==32082+1);
}
@Test
public void bigFalseTestAPISerialIOMap35() {
	assertFalse(16338==16338+1);
}
@Test
public void bigFalseTestAPISerialIOMap36() {
	assertFalse(10128==10128+1);
}
@Test
public void bigFalseTestAPISerialIOMap37() {
	assertFalse(20681==20681+1);
}
@Test
public void bigFalseTestAPISerialIOMap38() {
	assertFalse(20530==20530+1);
}
@Test
public void bigFalseTestAPISerialIOMap39() {
	assertFalse(13381==13381+1);
}
@Test
public void bigFalseTestAPISerialIOMap40() {
	assertFalse(27559==27559+1);
}
@Test
public void bigFalseTestAPISerialIOMap41() {
	assertFalse(4185==4185+1);
}
@Test
public void bigFalseTestAPISerialIOMap42() {
	assertFalse(13270==13270+1);
}
@Test
public void bigFalseTestAPISerialIOMap43() {
	assertFalse(16843==16843+1);
}
@Test
public void bigFalseTestAPISerialIOMap44() {
	assertFalse(6856==6856+1);
}
@Test
public void bigFalseTestAPISerialIOMap45() {
	assertFalse(20419==20419+1);
}
@Test
public void bigFalseTestAPISerialIOMap46() {
	assertFalse(3126==3126+1);
}
@Test
public void bigFalseTestAPISerialIOMap47() {
	assertFalse(19758==19758+1);
}
@Test
public void bigFalseTestAPISerialIOMap48() {
	assertFalse(21802==21802+1);
}
@Test
public void bigFalseTestAPISerialIOMap49() {
	assertFalse(3376==3376+1);
}
@Test
public void bigFalseTestAPISerialIOMap50() {
	assertFalse(23156==23156+1);
}
@Test
public void bigFalseTestAPISerialIOMap51() {
	assertFalse(24186==24186+1);
}
@Test
public void bigFalseTestAPISerialIOMap52() {
	assertFalse(20130==20130+1);
}
@Test
public void bigFalseTestAPISerialIOMap53() {
	assertFalse(20047==20047+1);
}
@Test
public void bigFalseTestAPISerialIOMap54() {
	assertFalse(17848==17848+1);
}
@Test
public void bigFalseTestAPISerialIOMap55() {
	assertFalse(28336==28336+1);
}
}
