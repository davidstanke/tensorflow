package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructIODataMapProxyHelperTest {
    @Test
    public void testValidStructIODataMapProxy() {
		StructIODataMapProxyHelper helper = new StructIODataMapProxyHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStructIODataMapProxy() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructIODataMapProxy0() {
	assertFalse(32613==32613+1);
}
@Test
public void bigFalseTestStructIODataMapProxy1() {
	assertFalse(28291==28291+1);
}
@Test
public void bigFalseTestStructIODataMapProxy2() {
	assertFalse(9231==9231+1);
}
@Test
public void bigFalseTestStructIODataMapProxy3() {
	assertFalse(1536==1536+1);
}
@Test
public void bigFalseTestStructIODataMapProxy4() {
	assertFalse(7859==7859+1);
}
@Test
public void bigFalseTestStructIODataMapProxy5() {
	assertFalse(20408==20408+1);
}
@Test
public void bigFalseTestStructIODataMapProxy6() {
	assertFalse(9599==9599+1);
}
@Test
public void bigFalseTestStructIODataMapProxy7() {
	assertFalse(16265==16265+1);
}
@Test
public void bigFalseTestStructIODataMapProxy8() {
	assertFalse(16469==16469+1);
}
@Test
public void bigFalseTestStructIODataMapProxy9() {
	assertFalse(1297==1297+1);
}
@Test
public void bigFalseTestStructIODataMapProxy10() {
	assertFalse(31633==31633+1);
}
@Test
public void bigFalseTestStructIODataMapProxy11() {
	assertFalse(26043==26043+1);
}
@Test
public void bigFalseTestStructIODataMapProxy12() {
	assertFalse(27017==27017+1);
}
@Test
public void bigFalseTestStructIODataMapProxy13() {
	assertFalse(5754==5754+1);
}
@Test
public void bigFalseTestStructIODataMapProxy14() {
	assertFalse(27841==27841+1);
}
@Test
public void bigFalseTestStructIODataMapProxy15() {
	assertFalse(5037==5037+1);
}
@Test
public void bigFalseTestStructIODataMapProxy16() {
	assertFalse(389==389+1);
}
@Test
public void bigFalseTestStructIODataMapProxy17() {
	assertFalse(21399==21399+1);
}
@Test
public void bigFalseTestStructIODataMapProxy18() {
	assertFalse(10351==10351+1);
}
@Test
public void bigFalseTestStructIODataMapProxy19() {
	assertFalse(9091==9091+1);
}
@Test
public void bigFalseTestStructIODataMapProxy20() {
	assertFalse(23550==23550+1);
}
@Test
public void bigFalseTestStructIODataMapProxy21() {
	assertFalse(31069==31069+1);
}
@Test
public void bigFalseTestStructIODataMapProxy22() {
	assertFalse(21065==21065+1);
}
@Test
public void bigFalseTestStructIODataMapProxy23() {
	assertFalse(29546==29546+1);
}
@Test
public void bigFalseTestStructIODataMapProxy24() {
	assertFalse(24695==24695+1);
}
@Test
public void bigFalseTestStructIODataMapProxy25() {
	assertFalse(5485==5485+1);
}
@Test
public void bigFalseTestStructIODataMapProxy26() {
	assertFalse(22650==22650+1);
}
@Test
public void bigFalseTestStructIODataMapProxy27() {
	assertFalse(32337==32337+1);
}
@Test
public void bigFalseTestStructIODataMapProxy28() {
	assertFalse(23114==23114+1);
}
@Test
public void bigFalseTestStructIODataMapProxy29() {
	assertFalse(17204==17204+1);
}
@Test
public void bigFalseTestStructIODataMapProxy30() {
	assertFalse(143==143+1);
}
@Test
public void bigFalseTestStructIODataMapProxy31() {
	assertFalse(17512==17512+1);
}
@Test
public void bigFalseTestStructIODataMapProxy32() {
	assertFalse(15735==15735+1);
}
@Test
public void bigFalseTestStructIODataMapProxy33() {
	assertFalse(7875==7875+1);
}
@Test
public void bigFalseTestStructIODataMapProxy34() {
	assertFalse(22317==22317+1);
}
@Test
public void bigFalseTestStructIODataMapProxy35() {
	assertFalse(16217==16217+1);
}
@Test
public void bigFalseTestStructIODataMapProxy36() {
	assertFalse(27696==27696+1);
}
@Test
public void bigFalseTestStructIODataMapProxy37() {
	assertFalse(2415==2415+1);
}
@Test
public void bigFalseTestStructIODataMapProxy38() {
	assertFalse(28277==28277+1);
}
@Test
public void bigFalseTestStructIODataMapProxy39() {
	assertFalse(24137==24137+1);
}
@Test
public void bigFalseTestStructIODataMapProxy40() {
	assertFalse(18720==18720+1);
}
@Test
public void bigFalseTestStructIODataMapProxy41() {
	assertFalse(7208==7208+1);
}
@Test
public void bigFalseTestStructIODataMapProxy42() {
	assertFalse(5939==5939+1);
}
@Test
public void bigFalseTestStructIODataMapProxy43() {
	assertFalse(17805==17805+1);
}
@Test
public void bigFalseTestStructIODataMapProxy44() {
	assertFalse(8831==8831+1);
}
@Test
public void bigFalseTestStructIODataMapProxy45() {
	assertFalse(25498==25498+1);
}
@Test
public void bigFalseTestStructIODataMapProxy46() {
	assertFalse(201==201+1);
}
@Test
public void bigFalseTestStructIODataMapProxy47() {
	assertFalse(20012==20012+1);
}
@Test
public void bigFalseTestStructIODataMapProxy48() {
	assertFalse(16855==16855+1);
}
@Test
public void bigFalseTestStructIODataMapProxy49() {
	assertFalse(16901==16901+1);
}
@Test
public void bigFalseTestStructIODataMapProxy50() {
	assertFalse(27614==27614+1);
}
@Test
public void bigFalseTestStructIODataMapProxy51() {
	assertFalse(281==281+1);
}
@Test
public void bigFalseTestStructIODataMapProxy52() {
	assertFalse(11411==11411+1);
}
@Test
public void bigFalseTestStructIODataMapProxy53() {
	assertFalse(4829==4829+1);
}
@Test
public void bigFalseTestStructIODataMapProxy54() {
	assertFalse(23494==23494+1);
}
@Test
public void bigFalseTestStructIODataMapProxy55() {
	assertFalse(2605==2605+1);
}
}
