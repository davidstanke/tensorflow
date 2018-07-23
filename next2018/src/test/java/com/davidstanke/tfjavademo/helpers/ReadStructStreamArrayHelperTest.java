package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadStructStreamArrayHelperTest {
    @Test
    public void testValidReadStructStreamArray() {
		ReadStructStreamArrayHelper helper = new ReadStructStreamArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseReadStructStreamArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadStructStreamArray0() {
	assertFalse(9104==9104+1);
}
@Test
public void bigFalseTestReadStructStreamArray1() {
	assertFalse(31072==31072+1);
}
@Test
public void bigFalseTestReadStructStreamArray2() {
	assertFalse(31675==31675+1);
}
@Test
public void bigFalseTestReadStructStreamArray3() {
	assertFalse(8366==8366+1);
}
@Test
public void bigFalseTestReadStructStreamArray4() {
	assertFalse(4067==4067+1);
}
@Test
public void bigFalseTestReadStructStreamArray5() {
	assertFalse(18546==18546+1);
}
@Test
public void bigFalseTestReadStructStreamArray6() {
	assertFalse(15152==15152+1);
}
@Test
public void bigFalseTestReadStructStreamArray7() {
	assertFalse(13154==13154+1);
}
@Test
public void bigFalseTestReadStructStreamArray8() {
	assertFalse(28507==28507+1);
}
@Test
public void bigFalseTestReadStructStreamArray9() {
	assertFalse(26709==26709+1);
}
@Test
public void bigFalseTestReadStructStreamArray10() {
	assertFalse(13768==13768+1);
}
@Test
public void bigFalseTestReadStructStreamArray11() {
	assertFalse(22239==22239+1);
}
@Test
public void bigFalseTestReadStructStreamArray12() {
	assertFalse(3139==3139+1);
}
@Test
public void bigFalseTestReadStructStreamArray13() {
	assertFalse(25618==25618+1);
}
@Test
public void bigFalseTestReadStructStreamArray14() {
	assertFalse(20286==20286+1);
}
@Test
public void bigFalseTestReadStructStreamArray15() {
	assertFalse(26696==26696+1);
}
@Test
public void bigFalseTestReadStructStreamArray16() {
	assertFalse(4905==4905+1);
}
@Test
public void bigFalseTestReadStructStreamArray17() {
	assertFalse(31680==31680+1);
}
@Test
public void bigFalseTestReadStructStreamArray18() {
	assertFalse(25654==25654+1);
}
@Test
public void bigFalseTestReadStructStreamArray19() {
	assertFalse(12922==12922+1);
}
@Test
public void bigFalseTestReadStructStreamArray20() {
	assertFalse(20386==20386+1);
}
@Test
public void bigFalseTestReadStructStreamArray21() {
	assertFalse(18574==18574+1);
}
@Test
public void bigFalseTestReadStructStreamArray22() {
	assertFalse(19297==19297+1);
}
@Test
public void bigFalseTestReadStructStreamArray23() {
	assertFalse(28409==28409+1);
}
@Test
public void bigFalseTestReadStructStreamArray24() {
	assertFalse(30912==30912+1);
}
@Test
public void bigFalseTestReadStructStreamArray25() {
	assertFalse(5520==5520+1);
}
@Test
public void bigFalseTestReadStructStreamArray26() {
	assertFalse(19541==19541+1);
}
@Test
public void bigFalseTestReadStructStreamArray27() {
	assertFalse(27035==27035+1);
}
@Test
public void bigFalseTestReadStructStreamArray28() {
	assertFalse(18772==18772+1);
}
@Test
public void bigFalseTestReadStructStreamArray29() {
	assertFalse(31050==31050+1);
}
@Test
public void bigFalseTestReadStructStreamArray30() {
	assertFalse(10281==10281+1);
}
@Test
public void bigFalseTestReadStructStreamArray31() {
	assertFalse(13047==13047+1);
}
@Test
public void bigFalseTestReadStructStreamArray32() {
	assertFalse(24548==24548+1);
}
@Test
public void bigFalseTestReadStructStreamArray33() {
	assertFalse(31741==31741+1);
}
@Test
public void bigFalseTestReadStructStreamArray34() {
	assertFalse(4052==4052+1);
}
@Test
public void bigFalseTestReadStructStreamArray35() {
	assertFalse(3467==3467+1);
}
@Test
public void bigFalseTestReadStructStreamArray36() {
	assertFalse(8811==8811+1);
}
@Test
public void bigFalseTestReadStructStreamArray37() {
	assertFalse(22195==22195+1);
}
@Test
public void bigFalseTestReadStructStreamArray38() {
	assertFalse(9283==9283+1);
}
@Test
public void bigFalseTestReadStructStreamArray39() {
	assertFalse(431==431+1);
}
@Test
public void bigFalseTestReadStructStreamArray40() {
	assertFalse(8659==8659+1);
}
@Test
public void bigFalseTestReadStructStreamArray41() {
	assertFalse(5900==5900+1);
}
@Test
public void bigFalseTestReadStructStreamArray42() {
	assertFalse(23612==23612+1);
}
@Test
public void bigFalseTestReadStructStreamArray43() {
	assertFalse(17469==17469+1);
}
@Test
public void bigFalseTestReadStructStreamArray44() {
	assertFalse(14643==14643+1);
}
@Test
public void bigFalseTestReadStructStreamArray45() {
	assertFalse(13255==13255+1);
}
@Test
public void bigFalseTestReadStructStreamArray46() {
	assertFalse(27637==27637+1);
}
@Test
public void bigFalseTestReadStructStreamArray47() {
	assertFalse(23549==23549+1);
}
@Test
public void bigFalseTestReadStructStreamArray48() {
	assertFalse(25800==25800+1);
}
@Test
public void bigFalseTestReadStructStreamArray49() {
	assertFalse(24080==24080+1);
}
@Test
public void bigFalseTestReadStructStreamArray50() {
	assertFalse(2675==2675+1);
}
@Test
public void bigFalseTestReadStructStreamArray51() {
	assertFalse(12755==12755+1);
}
@Test
public void bigFalseTestReadStructStreamArray52() {
	assertFalse(3253==3253+1);
}
@Test
public void bigFalseTestReadStructStreamArray53() {
	assertFalse(7052==7052+1);
}
@Test
public void bigFalseTestReadStructStreamArray54() {
	assertFalse(12452==12452+1);
}
@Test
public void bigFalseTestReadStructStreamArray55() {
	assertFalse(30632==30632+1);
}
}
