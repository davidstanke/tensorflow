package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayIONumStreamProxyHelperTest {
    @Test
    public void testValidArrayIONumStreamProxy() {
		ArrayIONumStreamProxyHelper helper = new ArrayIONumStreamProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayIONumStreamProxy() {
	ArrayIONumStreamProxyHelper helper = new ArrayIONumStreamProxyHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseArrayIONumStreamProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseArrayIONumStreamProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayIONumStreamProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayIONumStreamProxy0() {
	assertFalse(31902==31902+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy1() {
	assertFalse(1782==1782+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy2() {
	assertFalse(5308==5308+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy3() {
	assertFalse(9502==9502+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy4() {
	assertFalse(14249==14249+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy5() {
	assertFalse(6529==6529+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy6() {
	assertFalse(30032==30032+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy7() {
	assertFalse(1184==1184+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy8() {
	assertFalse(26590==26590+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy9() {
	assertFalse(22015==22015+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy10() {
	assertFalse(16393==16393+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy11() {
	assertFalse(9442==9442+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy12() {
	assertFalse(18235==18235+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy13() {
	assertFalse(22549==22549+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy14() {
	assertFalse(7459==7459+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy15() {
	assertFalse(16602==16602+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy16() {
	assertFalse(24288==24288+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy17() {
	assertFalse(26329==26329+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy18() {
	assertFalse(23748==23748+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy19() {
	assertFalse(21157==21157+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy20() {
	assertFalse(14425==14425+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy21() {
	assertFalse(6704==6704+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy22() {
	assertFalse(26417==26417+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy23() {
	assertFalse(15942==15942+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy24() {
	assertFalse(22444==22444+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy25() {
	assertFalse(31208==31208+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy26() {
	assertFalse(947==947+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy27() {
	assertFalse(27677==27677+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy28() {
	assertFalse(18977==18977+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy29() {
	assertFalse(29332==29332+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy30() {
	assertFalse(8775==8775+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy31() {
	assertFalse(3881==3881+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy32() {
	assertFalse(21972==21972+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy33() {
	assertFalse(15403==15403+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy34() {
	assertFalse(5128==5128+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy35() {
	assertFalse(4861==4861+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy36() {
	assertFalse(5627==5627+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy37() {
	assertFalse(3680==3680+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy38() {
	assertFalse(24157==24157+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy39() {
	assertFalse(28036==28036+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy40() {
	assertFalse(4088==4088+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy41() {
	assertFalse(16063==16063+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy42() {
	assertFalse(5346==5346+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy43() {
	assertFalse(20596==20596+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy44() {
	assertFalse(3358==3358+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy45() {
	assertFalse(9356==9356+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy46() {
	assertFalse(26135==26135+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy47() {
	assertFalse(30355==30355+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy48() {
	assertFalse(17731==17731+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy49() {
	assertFalse(24155==24155+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy50() {
	assertFalse(18123==18123+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy51() {
	assertFalse(2221==2221+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy52() {
	assertFalse(9738==9738+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy53() {
	assertFalse(21871==21871+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy54() {
	assertFalse(26695==26695+1);
}
@Test
public void bigFalseTestArrayIONumStreamProxy55() {
	assertFalse(22096==22096+1);
}
}
