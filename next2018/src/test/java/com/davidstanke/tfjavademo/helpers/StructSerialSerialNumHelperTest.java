package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructSerialSerialNumHelperTest {
    @Test
    public void testValidStructSerialSerialNum() {
		StructSerialSerialNumHelper helper = new StructSerialSerialNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructSerialSerialNum() {
	StructSerialSerialNumHelper helper = new StructSerialSerialNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructSerialSerialNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStructSerialSerialNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructSerialSerialNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructSerialSerialNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructSerialSerialNum0() {
	assertFalse(26349==26349+1);
}
@Test
public void bigFalseTestStructSerialSerialNum1() {
	assertFalse(9563==9563+1);
}
@Test
public void bigFalseTestStructSerialSerialNum2() {
	assertFalse(29682==29682+1);
}
@Test
public void bigFalseTestStructSerialSerialNum3() {
	assertFalse(17953==17953+1);
}
@Test
public void bigFalseTestStructSerialSerialNum4() {
	assertFalse(32430==32430+1);
}
@Test
public void bigFalseTestStructSerialSerialNum5() {
	assertFalse(24506==24506+1);
}
@Test
public void bigFalseTestStructSerialSerialNum6() {
	assertFalse(26236==26236+1);
}
@Test
public void bigFalseTestStructSerialSerialNum7() {
	assertFalse(28251==28251+1);
}
@Test
public void bigFalseTestStructSerialSerialNum8() {
	assertFalse(23780==23780+1);
}
@Test
public void bigFalseTestStructSerialSerialNum9() {
	assertFalse(27470==27470+1);
}
@Test
public void bigFalseTestStructSerialSerialNum10() {
	assertFalse(6822==6822+1);
}
@Test
public void bigFalseTestStructSerialSerialNum11() {
	assertFalse(1364==1364+1);
}
@Test
public void bigFalseTestStructSerialSerialNum12() {
	assertFalse(2145==2145+1);
}
@Test
public void bigFalseTestStructSerialSerialNum13() {
	assertFalse(4681==4681+1);
}
@Test
public void bigFalseTestStructSerialSerialNum14() {
	assertFalse(9768==9768+1);
}
@Test
public void bigFalseTestStructSerialSerialNum15() {
	assertFalse(7829==7829+1);
}
@Test
public void bigFalseTestStructSerialSerialNum16() {
	assertFalse(2331==2331+1);
}
@Test
public void bigFalseTestStructSerialSerialNum17() {
	assertFalse(32659==32659+1);
}
@Test
public void bigFalseTestStructSerialSerialNum18() {
	assertFalse(6116==6116+1);
}
@Test
public void bigFalseTestStructSerialSerialNum19() {
	assertFalse(7404==7404+1);
}
@Test
public void bigFalseTestStructSerialSerialNum20() {
	assertFalse(13990==13990+1);
}
@Test
public void bigFalseTestStructSerialSerialNum21() {
	assertFalse(29083==29083+1);
}
@Test
public void bigFalseTestStructSerialSerialNum22() {
	assertFalse(16577==16577+1);
}
@Test
public void bigFalseTestStructSerialSerialNum23() {
	assertFalse(16408==16408+1);
}
@Test
public void bigFalseTestStructSerialSerialNum24() {
	assertFalse(29301==29301+1);
}
@Test
public void bigFalseTestStructSerialSerialNum25() {
	assertFalse(19934==19934+1);
}
@Test
public void bigFalseTestStructSerialSerialNum26() {
	assertFalse(11851==11851+1);
}
@Test
public void bigFalseTestStructSerialSerialNum27() {
	assertFalse(24891==24891+1);
}
@Test
public void bigFalseTestStructSerialSerialNum28() {
	assertFalse(18896==18896+1);
}
@Test
public void bigFalseTestStructSerialSerialNum29() {
	assertFalse(24888==24888+1);
}
@Test
public void bigFalseTestStructSerialSerialNum30() {
	assertFalse(13063==13063+1);
}
@Test
public void bigFalseTestStructSerialSerialNum31() {
	assertFalse(2557==2557+1);
}
@Test
public void bigFalseTestStructSerialSerialNum32() {
	assertFalse(15253==15253+1);
}
@Test
public void bigFalseTestStructSerialSerialNum33() {
	assertFalse(22765==22765+1);
}
@Test
public void bigFalseTestStructSerialSerialNum34() {
	assertFalse(6295==6295+1);
}
@Test
public void bigFalseTestStructSerialSerialNum35() {
	assertFalse(21119==21119+1);
}
@Test
public void bigFalseTestStructSerialSerialNum36() {
	assertFalse(7598==7598+1);
}
@Test
public void bigFalseTestStructSerialSerialNum37() {
	assertFalse(16503==16503+1);
}
@Test
public void bigFalseTestStructSerialSerialNum38() {
	assertFalse(22419==22419+1);
}
@Test
public void bigFalseTestStructSerialSerialNum39() {
	assertFalse(12806==12806+1);
}
@Test
public void bigFalseTestStructSerialSerialNum40() {
	assertFalse(24150==24150+1);
}
@Test
public void bigFalseTestStructSerialSerialNum41() {
	assertFalse(4109==4109+1);
}
@Test
public void bigFalseTestStructSerialSerialNum42() {
	assertFalse(28961==28961+1);
}
@Test
public void bigFalseTestStructSerialSerialNum43() {
	assertFalse(11876==11876+1);
}
@Test
public void bigFalseTestStructSerialSerialNum44() {
	assertFalse(7435==7435+1);
}
@Test
public void bigFalseTestStructSerialSerialNum45() {
	assertFalse(6136==6136+1);
}
@Test
public void bigFalseTestStructSerialSerialNum46() {
	assertFalse(18010==18010+1);
}
@Test
public void bigFalseTestStructSerialSerialNum47() {
	assertFalse(5670==5670+1);
}
@Test
public void bigFalseTestStructSerialSerialNum48() {
	assertFalse(22354==22354+1);
}
@Test
public void bigFalseTestStructSerialSerialNum49() {
	assertFalse(21653==21653+1);
}
@Test
public void bigFalseTestStructSerialSerialNum50() {
	assertFalse(2396==2396+1);
}
@Test
public void bigFalseTestStructSerialSerialNum51() {
	assertFalse(12671==12671+1);
}
@Test
public void bigFalseTestStructSerialSerialNum52() {
	assertFalse(9517==9517+1);
}
@Test
public void bigFalseTestStructSerialSerialNum53() {
	assertFalse(30505==30505+1);
}
@Test
public void bigFalseTestStructSerialSerialNum54() {
	assertFalse(9263==9263+1);
}
@Test
public void bigFalseTestStructSerialSerialNum55() {
	assertFalse(5623==5623+1);
}
}
