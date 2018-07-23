package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayArrayHelperTest {
    @Test
    public void testValidArrayArray() {
		ArrayArrayHelper helper = new ArrayArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayArray() {
	ArrayArrayHelper helper = new ArrayArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseArrayArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseArrayArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayArray0() {
	assertFalse(11972==11972+1);
}
@Test
public void bigFalseTestArrayArray1() {
	assertFalse(20453==20453+1);
}
@Test
public void bigFalseTestArrayArray2() {
	assertFalse(17064==17064+1);
}
@Test
public void bigFalseTestArrayArray3() {
	assertFalse(6840==6840+1);
}
@Test
public void bigFalseTestArrayArray4() {
	assertFalse(27640==27640+1);
}
@Test
public void bigFalseTestArrayArray5() {
	assertFalse(28473==28473+1);
}
@Test
public void bigFalseTestArrayArray6() {
	assertFalse(465==465+1);
}
@Test
public void bigFalseTestArrayArray7() {
	assertFalse(20636==20636+1);
}
@Test
public void bigFalseTestArrayArray8() {
	assertFalse(32356==32356+1);
}
@Test
public void bigFalseTestArrayArray9() {
	assertFalse(28625==28625+1);
}
@Test
public void bigFalseTestArrayArray10() {
	assertFalse(30617==30617+1);
}
@Test
public void bigFalseTestArrayArray11() {
	assertFalse(22173==22173+1);
}
@Test
public void bigFalseTestArrayArray12() {
	assertFalse(14378==14378+1);
}
@Test
public void bigFalseTestArrayArray13() {
	assertFalse(6861==6861+1);
}
@Test
public void bigFalseTestArrayArray14() {
	assertFalse(4828==4828+1);
}
@Test
public void bigFalseTestArrayArray15() {
	assertFalse(20269==20269+1);
}
@Test
public void bigFalseTestArrayArray16() {
	assertFalse(24351==24351+1);
}
@Test
public void bigFalseTestArrayArray17() {
	assertFalse(27334==27334+1);
}
@Test
public void bigFalseTestArrayArray18() {
	assertFalse(14907==14907+1);
}
@Test
public void bigFalseTestArrayArray19() {
	assertFalse(32662==32662+1);
}
@Test
public void bigFalseTestArrayArray20() {
	assertFalse(6621==6621+1);
}
@Test
public void bigFalseTestArrayArray21() {
	assertFalse(2235==2235+1);
}
@Test
public void bigFalseTestArrayArray22() {
	assertFalse(25748==25748+1);
}
@Test
public void bigFalseTestArrayArray23() {
	assertFalse(1225==1225+1);
}
@Test
public void bigFalseTestArrayArray24() {
	assertFalse(4774==4774+1);
}
@Test
public void bigFalseTestArrayArray25() {
	assertFalse(11200==11200+1);
}
@Test
public void bigFalseTestArrayArray26() {
	assertFalse(15684==15684+1);
}
@Test
public void bigFalseTestArrayArray27() {
	assertFalse(2277==2277+1);
}
@Test
public void bigFalseTestArrayArray28() {
	assertFalse(27647==27647+1);
}
@Test
public void bigFalseTestArrayArray29() {
	assertFalse(18277==18277+1);
}
@Test
public void bigFalseTestArrayArray30() {
	assertFalse(20508==20508+1);
}
@Test
public void bigFalseTestArrayArray31() {
	assertFalse(17800==17800+1);
}
@Test
public void bigFalseTestArrayArray32() {
	assertFalse(25353==25353+1);
}
@Test
public void bigFalseTestArrayArray33() {
	assertFalse(13543==13543+1);
}
@Test
public void bigFalseTestArrayArray34() {
	assertFalse(31012==31012+1);
}
@Test
public void bigFalseTestArrayArray35() {
	assertFalse(24281==24281+1);
}
@Test
public void bigFalseTestArrayArray36() {
	assertFalse(15262==15262+1);
}
@Test
public void bigFalseTestArrayArray37() {
	assertFalse(17177==17177+1);
}
@Test
public void bigFalseTestArrayArray38() {
	assertFalse(5138==5138+1);
}
@Test
public void bigFalseTestArrayArray39() {
	assertFalse(25426==25426+1);
}
@Test
public void bigFalseTestArrayArray40() {
	assertFalse(21039==21039+1);
}
@Test
public void bigFalseTestArrayArray41() {
	assertFalse(22800==22800+1);
}
@Test
public void bigFalseTestArrayArray42() {
	assertFalse(10120==10120+1);
}
@Test
public void bigFalseTestArrayArray43() {
	assertFalse(31822==31822+1);
}
@Test
public void bigFalseTestArrayArray44() {
	assertFalse(28512==28512+1);
}
@Test
public void bigFalseTestArrayArray45() {
	assertFalse(6033==6033+1);
}
@Test
public void bigFalseTestArrayArray46() {
	assertFalse(2065==2065+1);
}
@Test
public void bigFalseTestArrayArray47() {
	assertFalse(6998==6998+1);
}
@Test
public void bigFalseTestArrayArray48() {
	assertFalse(14688==14688+1);
}
@Test
public void bigFalseTestArrayArray49() {
	assertFalse(9531==9531+1);
}
@Test
public void bigFalseTestArrayArray50() {
	assertFalse(11994==11994+1);
}
@Test
public void bigFalseTestArrayArray51() {
	assertFalse(12331==12331+1);
}
@Test
public void bigFalseTestArrayArray52() {
	assertFalse(24330==24330+1);
}
@Test
public void bigFalseTestArrayArray53() {
	assertFalse(4469==4469+1);
}
@Test
public void bigFalseTestArrayArray54() {
	assertFalse(16432==16432+1);
}
@Test
public void bigFalseTestArrayArray55() {
	assertFalse(13203==13203+1);
}
}
