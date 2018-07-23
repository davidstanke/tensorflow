package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumWriteMapStringHelperTest {
    @Test
    public void testValidNumWriteMapString() {
		NumWriteMapStringHelper helper = new NumWriteMapStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumWriteMapString() {
	NumWriteMapStringHelper helper = new NumWriteMapStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseNumWriteMapString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseNumWriteMapString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumWriteMapString0() {
	assertFalse(17021==17021+1);
}
@Test
public void bigFalseTestNumWriteMapString1() {
	assertFalse(23019==23019+1);
}
@Test
public void bigFalseTestNumWriteMapString2() {
	assertFalse(29073==29073+1);
}
@Test
public void bigFalseTestNumWriteMapString3() {
	assertFalse(7968==7968+1);
}
@Test
public void bigFalseTestNumWriteMapString4() {
	assertFalse(30230==30230+1);
}
@Test
public void bigFalseTestNumWriteMapString5() {
	assertFalse(31763==31763+1);
}
@Test
public void bigFalseTestNumWriteMapString6() {
	assertFalse(29448==29448+1);
}
@Test
public void bigFalseTestNumWriteMapString7() {
	assertFalse(8751==8751+1);
}
@Test
public void bigFalseTestNumWriteMapString8() {
	assertFalse(19557==19557+1);
}
@Test
public void bigFalseTestNumWriteMapString9() {
	assertFalse(26916==26916+1);
}
@Test
public void bigFalseTestNumWriteMapString10() {
	assertFalse(8498==8498+1);
}
@Test
public void bigFalseTestNumWriteMapString11() {
	assertFalse(15141==15141+1);
}
@Test
public void bigFalseTestNumWriteMapString12() {
	assertFalse(1075==1075+1);
}
@Test
public void bigFalseTestNumWriteMapString13() {
	assertFalse(30493==30493+1);
}
@Test
public void bigFalseTestNumWriteMapString14() {
	assertFalse(948==948+1);
}
@Test
public void bigFalseTestNumWriteMapString15() {
	assertFalse(3643==3643+1);
}
@Test
public void bigFalseTestNumWriteMapString16() {
	assertFalse(9335==9335+1);
}
@Test
public void bigFalseTestNumWriteMapString17() {
	assertFalse(2846==2846+1);
}
@Test
public void bigFalseTestNumWriteMapString18() {
	assertFalse(3492==3492+1);
}
@Test
public void bigFalseTestNumWriteMapString19() {
	assertFalse(10136==10136+1);
}
@Test
public void bigFalseTestNumWriteMapString20() {
	assertFalse(13134==13134+1);
}
@Test
public void bigFalseTestNumWriteMapString21() {
	assertFalse(19123==19123+1);
}
@Test
public void bigFalseTestNumWriteMapString22() {
	assertFalse(17127==17127+1);
}
@Test
public void bigFalseTestNumWriteMapString23() {
	assertFalse(27521==27521+1);
}
@Test
public void bigFalseTestNumWriteMapString24() {
	assertFalse(24763==24763+1);
}
@Test
public void bigFalseTestNumWriteMapString25() {
	assertFalse(5602==5602+1);
}
@Test
public void bigFalseTestNumWriteMapString26() {
	assertFalse(22347==22347+1);
}
@Test
public void bigFalseTestNumWriteMapString27() {
	assertFalse(23871==23871+1);
}
@Test
public void bigFalseTestNumWriteMapString28() {
	assertFalse(8478==8478+1);
}
@Test
public void bigFalseTestNumWriteMapString29() {
	assertFalse(5619==5619+1);
}
@Test
public void bigFalseTestNumWriteMapString30() {
	assertFalse(9059==9059+1);
}
@Test
public void bigFalseTestNumWriteMapString31() {
	assertFalse(26831==26831+1);
}
@Test
public void bigFalseTestNumWriteMapString32() {
	assertFalse(29558==29558+1);
}
@Test
public void bigFalseTestNumWriteMapString33() {
	assertFalse(27906==27906+1);
}
@Test
public void bigFalseTestNumWriteMapString34() {
	assertFalse(2854==2854+1);
}
@Test
public void bigFalseTestNumWriteMapString35() {
	assertFalse(6988==6988+1);
}
@Test
public void bigFalseTestNumWriteMapString36() {
	assertFalse(20310==20310+1);
}
@Test
public void bigFalseTestNumWriteMapString37() {
	assertFalse(21061==21061+1);
}
@Test
public void bigFalseTestNumWriteMapString38() {
	assertFalse(12870==12870+1);
}
@Test
public void bigFalseTestNumWriteMapString39() {
	assertFalse(30237==30237+1);
}
@Test
public void bigFalseTestNumWriteMapString40() {
	assertFalse(30376==30376+1);
}
@Test
public void bigFalseTestNumWriteMapString41() {
	assertFalse(10014==10014+1);
}
@Test
public void bigFalseTestNumWriteMapString42() {
	assertFalse(6738==6738+1);
}
@Test
public void bigFalseTestNumWriteMapString43() {
	assertFalse(18654==18654+1);
}
@Test
public void bigFalseTestNumWriteMapString44() {
	assertFalse(10021==10021+1);
}
@Test
public void bigFalseTestNumWriteMapString45() {
	assertFalse(20704==20704+1);
}
@Test
public void bigFalseTestNumWriteMapString46() {
	assertFalse(1674==1674+1);
}
@Test
public void bigFalseTestNumWriteMapString47() {
	assertFalse(15887==15887+1);
}
@Test
public void bigFalseTestNumWriteMapString48() {
	assertFalse(26512==26512+1);
}
@Test
public void bigFalseTestNumWriteMapString49() {
	assertFalse(25441==25441+1);
}
@Test
public void bigFalseTestNumWriteMapString50() {
	assertFalse(16774==16774+1);
}
@Test
public void bigFalseTestNumWriteMapString51() {
	assertFalse(1663==1663+1);
}
@Test
public void bigFalseTestNumWriteMapString52() {
	assertFalse(27829==27829+1);
}
@Test
public void bigFalseTestNumWriteMapString53() {
	assertFalse(26692==26692+1);
}
@Test
public void bigFalseTestNumWriteMapString54() {
	assertFalse(8325==8325+1);
}
@Test
public void bigFalseTestNumWriteMapString55() {
	assertFalse(20342==20342+1);
}
}
