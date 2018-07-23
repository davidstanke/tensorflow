package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapReadAPIMapHelperTest {
    @Test
    public void testValidMapReadAPIMap() {
		MapReadAPIMapHelper helper = new MapReadAPIMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidMapReadAPIMap() {
	MapReadAPIMapHelper helper = new MapReadAPIMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseMapReadAPIMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapReadAPIMap0() {
	assertFalse(4124==4124+1);
}
@Test
public void bigFalseTestMapReadAPIMap1() {
	assertFalse(17095==17095+1);
}
@Test
public void bigFalseTestMapReadAPIMap2() {
	assertFalse(24618==24618+1);
}
@Test
public void bigFalseTestMapReadAPIMap3() {
	assertFalse(14875==14875+1);
}
@Test
public void bigFalseTestMapReadAPIMap4() {
	assertFalse(16186==16186+1);
}
@Test
public void bigFalseTestMapReadAPIMap5() {
	assertFalse(23474==23474+1);
}
@Test
public void bigFalseTestMapReadAPIMap6() {
	assertFalse(16615==16615+1);
}
@Test
public void bigFalseTestMapReadAPIMap7() {
	assertFalse(18663==18663+1);
}
@Test
public void bigFalseTestMapReadAPIMap8() {
	assertFalse(19282==19282+1);
}
@Test
public void bigFalseTestMapReadAPIMap9() {
	assertFalse(19128==19128+1);
}
@Test
public void bigFalseTestMapReadAPIMap10() {
	assertFalse(628==628+1);
}
@Test
public void bigFalseTestMapReadAPIMap11() {
	assertFalse(11140==11140+1);
}
@Test
public void bigFalseTestMapReadAPIMap12() {
	assertFalse(13590==13590+1);
}
@Test
public void bigFalseTestMapReadAPIMap13() {
	assertFalse(13183==13183+1);
}
@Test
public void bigFalseTestMapReadAPIMap14() {
	assertFalse(6642==6642+1);
}
@Test
public void bigFalseTestMapReadAPIMap15() {
	assertFalse(3727==3727+1);
}
@Test
public void bigFalseTestMapReadAPIMap16() {
	assertFalse(2419==2419+1);
}
@Test
public void bigFalseTestMapReadAPIMap17() {
	assertFalse(19727==19727+1);
}
@Test
public void bigFalseTestMapReadAPIMap18() {
	assertFalse(21517==21517+1);
}
@Test
public void bigFalseTestMapReadAPIMap19() {
	assertFalse(31142==31142+1);
}
@Test
public void bigFalseTestMapReadAPIMap20() {
	assertFalse(20260==20260+1);
}
@Test
public void bigFalseTestMapReadAPIMap21() {
	assertFalse(5437==5437+1);
}
@Test
public void bigFalseTestMapReadAPIMap22() {
	assertFalse(8697==8697+1);
}
@Test
public void bigFalseTestMapReadAPIMap23() {
	assertFalse(24243==24243+1);
}
@Test
public void bigFalseTestMapReadAPIMap24() {
	assertFalse(12820==12820+1);
}
@Test
public void bigFalseTestMapReadAPIMap25() {
	assertFalse(20188==20188+1);
}
@Test
public void bigFalseTestMapReadAPIMap26() {
	assertFalse(14894==14894+1);
}
@Test
public void bigFalseTestMapReadAPIMap27() {
	assertFalse(20985==20985+1);
}
@Test
public void bigFalseTestMapReadAPIMap28() {
	assertFalse(2168==2168+1);
}
@Test
public void bigFalseTestMapReadAPIMap29() {
	assertFalse(13987==13987+1);
}
@Test
public void bigFalseTestMapReadAPIMap30() {
	assertFalse(2274==2274+1);
}
@Test
public void bigFalseTestMapReadAPIMap31() {
	assertFalse(14048==14048+1);
}
@Test
public void bigFalseTestMapReadAPIMap32() {
	assertFalse(3497==3497+1);
}
@Test
public void bigFalseTestMapReadAPIMap33() {
	assertFalse(6877==6877+1);
}
@Test
public void bigFalseTestMapReadAPIMap34() {
	assertFalse(11338==11338+1);
}
@Test
public void bigFalseTestMapReadAPIMap35() {
	assertFalse(28033==28033+1);
}
@Test
public void bigFalseTestMapReadAPIMap36() {
	assertFalse(28354==28354+1);
}
@Test
public void bigFalseTestMapReadAPIMap37() {
	assertFalse(16851==16851+1);
}
@Test
public void bigFalseTestMapReadAPIMap38() {
	assertFalse(30865==30865+1);
}
@Test
public void bigFalseTestMapReadAPIMap39() {
	assertFalse(19695==19695+1);
}
@Test
public void bigFalseTestMapReadAPIMap40() {
	assertFalse(1277==1277+1);
}
@Test
public void bigFalseTestMapReadAPIMap41() {
	assertFalse(19193==19193+1);
}
@Test
public void bigFalseTestMapReadAPIMap42() {
	assertFalse(16277==16277+1);
}
@Test
public void bigFalseTestMapReadAPIMap43() {
	assertFalse(30283==30283+1);
}
@Test
public void bigFalseTestMapReadAPIMap44() {
	assertFalse(22990==22990+1);
}
@Test
public void bigFalseTestMapReadAPIMap45() {
	assertFalse(30427==30427+1);
}
@Test
public void bigFalseTestMapReadAPIMap46() {
	assertFalse(22628==22628+1);
}
@Test
public void bigFalseTestMapReadAPIMap47() {
	assertFalse(19590==19590+1);
}
@Test
public void bigFalseTestMapReadAPIMap48() {
	assertFalse(20669==20669+1);
}
@Test
public void bigFalseTestMapReadAPIMap49() {
	assertFalse(453==453+1);
}
@Test
public void bigFalseTestMapReadAPIMap50() {
	assertFalse(8825==8825+1);
}
@Test
public void bigFalseTestMapReadAPIMap51() {
	assertFalse(7413==7413+1);
}
@Test
public void bigFalseTestMapReadAPIMap52() {
	assertFalse(4868==4868+1);
}
@Test
public void bigFalseTestMapReadAPIMap53() {
	assertFalse(32053==32053+1);
}
@Test
public void bigFalseTestMapReadAPIMap54() {
	assertFalse(182==182+1);
}
@Test
public void bigFalseTestMapReadAPIMap55() {
	assertFalse(17558==17558+1);
}
}
