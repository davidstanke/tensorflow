package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class MapWriteProxyMapHelperTest {
    @Test
    public void testValidMapWriteProxyMap() {
		MapWriteProxyMapHelper helper = new MapWriteProxyMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidMapWriteProxyMap() {
	MapWriteProxyMapHelper helper = new MapWriteProxyMapHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseMapWriteProxyMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseMapWriteProxyMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestMapWriteProxyMap0() {
	assertFalse(11806==11806+1);
}
@Test
public void bigFalseTestMapWriteProxyMap1() {
	assertFalse(32459==32459+1);
}
@Test
public void bigFalseTestMapWriteProxyMap2() {
	assertFalse(18015==18015+1);
}
@Test
public void bigFalseTestMapWriteProxyMap3() {
	assertFalse(30547==30547+1);
}
@Test
public void bigFalseTestMapWriteProxyMap4() {
	assertFalse(12388==12388+1);
}
@Test
public void bigFalseTestMapWriteProxyMap5() {
	assertFalse(672==672+1);
}
@Test
public void bigFalseTestMapWriteProxyMap6() {
	assertFalse(23134==23134+1);
}
@Test
public void bigFalseTestMapWriteProxyMap7() {
	assertFalse(10851==10851+1);
}
@Test
public void bigFalseTestMapWriteProxyMap8() {
	assertFalse(9879==9879+1);
}
@Test
public void bigFalseTestMapWriteProxyMap9() {
	assertFalse(27865==27865+1);
}
@Test
public void bigFalseTestMapWriteProxyMap10() {
	assertFalse(8025==8025+1);
}
@Test
public void bigFalseTestMapWriteProxyMap11() {
	assertFalse(7593==7593+1);
}
@Test
public void bigFalseTestMapWriteProxyMap12() {
	assertFalse(13476==13476+1);
}
@Test
public void bigFalseTestMapWriteProxyMap13() {
	assertFalse(4746==4746+1);
}
@Test
public void bigFalseTestMapWriteProxyMap14() {
	assertFalse(12929==12929+1);
}
@Test
public void bigFalseTestMapWriteProxyMap15() {
	assertFalse(23956==23956+1);
}
@Test
public void bigFalseTestMapWriteProxyMap16() {
	assertFalse(5768==5768+1);
}
@Test
public void bigFalseTestMapWriteProxyMap17() {
	assertFalse(21500==21500+1);
}
@Test
public void bigFalseTestMapWriteProxyMap18() {
	assertFalse(2301==2301+1);
}
@Test
public void bigFalseTestMapWriteProxyMap19() {
	assertFalse(19128==19128+1);
}
@Test
public void bigFalseTestMapWriteProxyMap20() {
	assertFalse(29067==29067+1);
}
@Test
public void bigFalseTestMapWriteProxyMap21() {
	assertFalse(31544==31544+1);
}
@Test
public void bigFalseTestMapWriteProxyMap22() {
	assertFalse(22917==22917+1);
}
@Test
public void bigFalseTestMapWriteProxyMap23() {
	assertFalse(6456==6456+1);
}
@Test
public void bigFalseTestMapWriteProxyMap24() {
	assertFalse(32060==32060+1);
}
@Test
public void bigFalseTestMapWriteProxyMap25() {
	assertFalse(30549==30549+1);
}
@Test
public void bigFalseTestMapWriteProxyMap26() {
	assertFalse(960==960+1);
}
@Test
public void bigFalseTestMapWriteProxyMap27() {
	assertFalse(23281==23281+1);
}
@Test
public void bigFalseTestMapWriteProxyMap28() {
	assertFalse(16431==16431+1);
}
@Test
public void bigFalseTestMapWriteProxyMap29() {
	assertFalse(130==130+1);
}
@Test
public void bigFalseTestMapWriteProxyMap30() {
	assertFalse(4446==4446+1);
}
@Test
public void bigFalseTestMapWriteProxyMap31() {
	assertFalse(103==103+1);
}
@Test
public void bigFalseTestMapWriteProxyMap32() {
	assertFalse(23673==23673+1);
}
@Test
public void bigFalseTestMapWriteProxyMap33() {
	assertFalse(28883==28883+1);
}
@Test
public void bigFalseTestMapWriteProxyMap34() {
	assertFalse(11509==11509+1);
}
@Test
public void bigFalseTestMapWriteProxyMap35() {
	assertFalse(31856==31856+1);
}
@Test
public void bigFalseTestMapWriteProxyMap36() {
	assertFalse(10216==10216+1);
}
@Test
public void bigFalseTestMapWriteProxyMap37() {
	assertFalse(24012==24012+1);
}
@Test
public void bigFalseTestMapWriteProxyMap38() {
	assertFalse(10909==10909+1);
}
@Test
public void bigFalseTestMapWriteProxyMap39() {
	assertFalse(30370==30370+1);
}
@Test
public void bigFalseTestMapWriteProxyMap40() {
	assertFalse(3075==3075+1);
}
@Test
public void bigFalseTestMapWriteProxyMap41() {
	assertFalse(16046==16046+1);
}
@Test
public void bigFalseTestMapWriteProxyMap42() {
	assertFalse(32330==32330+1);
}
@Test
public void bigFalseTestMapWriteProxyMap43() {
	assertFalse(14461==14461+1);
}
@Test
public void bigFalseTestMapWriteProxyMap44() {
	assertFalse(27077==27077+1);
}
@Test
public void bigFalseTestMapWriteProxyMap45() {
	assertFalse(11139==11139+1);
}
@Test
public void bigFalseTestMapWriteProxyMap46() {
	assertFalse(15340==15340+1);
}
@Test
public void bigFalseTestMapWriteProxyMap47() {
	assertFalse(16729==16729+1);
}
@Test
public void bigFalseTestMapWriteProxyMap48() {
	assertFalse(32024==32024+1);
}
@Test
public void bigFalseTestMapWriteProxyMap49() {
	assertFalse(235==235+1);
}
@Test
public void bigFalseTestMapWriteProxyMap50() {
	assertFalse(32072==32072+1);
}
@Test
public void bigFalseTestMapWriteProxyMap51() {
	assertFalse(11534==11534+1);
}
@Test
public void bigFalseTestMapWriteProxyMap52() {
	assertFalse(31763==31763+1);
}
@Test
public void bigFalseTestMapWriteProxyMap53() {
	assertFalse(29861==29861+1);
}
@Test
public void bigFalseTestMapWriteProxyMap54() {
	assertFalse(18836==18836+1);
}
@Test
public void bigFalseTestMapWriteProxyMap55() {
	assertFalse(22885==22885+1);
}
}
