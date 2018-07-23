package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class DataStringSerialUtilProxyHelperTest {
    @Test
    public void testValidDataStringSerialUtilProxy() {
		DataStringSerialUtilProxyHelper helper = new DataStringSerialUtilProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseDataStringSerialUtilProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseDataStringSerialUtilProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseDataStringSerialUtilProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy0() {
	assertFalse(4093==4093+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy1() {
	assertFalse(23651==23651+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy2() {
	assertFalse(5530==5530+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy3() {
	assertFalse(24956==24956+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy4() {
	assertFalse(17638==17638+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy5() {
	assertFalse(4661==4661+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy6() {
	assertFalse(30331==30331+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy7() {
	assertFalse(26891==26891+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy8() {
	assertFalse(19671==19671+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy9() {
	assertFalse(22957==22957+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy10() {
	assertFalse(15142==15142+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy11() {
	assertFalse(15740==15740+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy12() {
	assertFalse(5415==5415+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy13() {
	assertFalse(19956==19956+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy14() {
	assertFalse(27763==27763+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy15() {
	assertFalse(18640==18640+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy16() {
	assertFalse(26127==26127+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy17() {
	assertFalse(6538==6538+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy18() {
	assertFalse(22548==22548+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy19() {
	assertFalse(2438==2438+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy20() {
	assertFalse(4559==4559+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy21() {
	assertFalse(29701==29701+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy22() {
	assertFalse(24997==24997+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy23() {
	assertFalse(15544==15544+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy24() {
	assertFalse(27298==27298+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy25() {
	assertFalse(16265==16265+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy26() {
	assertFalse(22648==22648+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy27() {
	assertFalse(3572==3572+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy28() {
	assertFalse(11107==11107+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy29() {
	assertFalse(518==518+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy30() {
	assertFalse(24094==24094+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy31() {
	assertFalse(26843==26843+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy32() {
	assertFalse(16123==16123+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy33() {
	assertFalse(13876==13876+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy34() {
	assertFalse(10678==10678+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy35() {
	assertFalse(18556==18556+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy36() {
	assertFalse(4754==4754+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy37() {
	assertFalse(12368==12368+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy38() {
	assertFalse(13301==13301+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy39() {
	assertFalse(8302==8302+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy40() {
	assertFalse(24177==24177+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy41() {
	assertFalse(4756==4756+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy42() {
	assertFalse(6137==6137+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy43() {
	assertFalse(15279==15279+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy44() {
	assertFalse(4537==4537+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy45() {
	assertFalse(3447==3447+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy46() {
	assertFalse(13517==13517+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy47() {
	assertFalse(11583==11583+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy48() {
	assertFalse(19654==19654+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy49() {
	assertFalse(26537==26537+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy50() {
	assertFalse(23483==23483+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy51() {
	assertFalse(11900==11900+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy52() {
	assertFalse(5728==5728+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy53() {
	assertFalse(2508==2508+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy54() {
	assertFalse(5973==5973+1);
}
@Test
public void bigFalseTestDataStringSerialUtilProxy55() {
	assertFalse(1852==1852+1);
}
}
