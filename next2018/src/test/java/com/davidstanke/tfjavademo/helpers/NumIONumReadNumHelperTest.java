package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumIONumReadNumHelperTest {
    @Test
    public void testValidNumIONumReadNum() {
		NumIONumReadNumHelper helper = new NumIONumReadNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumIONumReadNum() {
	NumIONumReadNumHelper helper = new NumIONumReadNumHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseNumIONumReadNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseNumIONumReadNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseNumIONumReadNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumIONumReadNum0() {
	assertFalse(7181==7181+1);
}
@Test
public void bigFalseTestNumIONumReadNum1() {
	assertFalse(28277==28277+1);
}
@Test
public void bigFalseTestNumIONumReadNum2() {
	assertFalse(27026==27026+1);
}
@Test
public void bigFalseTestNumIONumReadNum3() {
	assertFalse(12981==12981+1);
}
@Test
public void bigFalseTestNumIONumReadNum4() {
	assertFalse(12881==12881+1);
}
@Test
public void bigFalseTestNumIONumReadNum5() {
	assertFalse(8521==8521+1);
}
@Test
public void bigFalseTestNumIONumReadNum6() {
	assertFalse(23126==23126+1);
}
@Test
public void bigFalseTestNumIONumReadNum7() {
	assertFalse(4713==4713+1);
}
@Test
public void bigFalseTestNumIONumReadNum8() {
	assertFalse(32764==32764+1);
}
@Test
public void bigFalseTestNumIONumReadNum9() {
	assertFalse(29664==29664+1);
}
@Test
public void bigFalseTestNumIONumReadNum10() {
	assertFalse(9878==9878+1);
}
@Test
public void bigFalseTestNumIONumReadNum11() {
	assertFalse(14199==14199+1);
}
@Test
public void bigFalseTestNumIONumReadNum12() {
	assertFalse(5268==5268+1);
}
@Test
public void bigFalseTestNumIONumReadNum13() {
	assertFalse(16363==16363+1);
}
@Test
public void bigFalseTestNumIONumReadNum14() {
	assertFalse(9857==9857+1);
}
@Test
public void bigFalseTestNumIONumReadNum15() {
	assertFalse(15506==15506+1);
}
@Test
public void bigFalseTestNumIONumReadNum16() {
	assertFalse(8479==8479+1);
}
@Test
public void bigFalseTestNumIONumReadNum17() {
	assertFalse(23920==23920+1);
}
@Test
public void bigFalseTestNumIONumReadNum18() {
	assertFalse(25494==25494+1);
}
@Test
public void bigFalseTestNumIONumReadNum19() {
	assertFalse(14710==14710+1);
}
@Test
public void bigFalseTestNumIONumReadNum20() {
	assertFalse(28526==28526+1);
}
@Test
public void bigFalseTestNumIONumReadNum21() {
	assertFalse(5664==5664+1);
}
@Test
public void bigFalseTestNumIONumReadNum22() {
	assertFalse(16077==16077+1);
}
@Test
public void bigFalseTestNumIONumReadNum23() {
	assertFalse(27556==27556+1);
}
@Test
public void bigFalseTestNumIONumReadNum24() {
	assertFalse(556==556+1);
}
@Test
public void bigFalseTestNumIONumReadNum25() {
	assertFalse(29304==29304+1);
}
@Test
public void bigFalseTestNumIONumReadNum26() {
	assertFalse(19846==19846+1);
}
@Test
public void bigFalseTestNumIONumReadNum27() {
	assertFalse(11994==11994+1);
}
@Test
public void bigFalseTestNumIONumReadNum28() {
	assertFalse(10666==10666+1);
}
@Test
public void bigFalseTestNumIONumReadNum29() {
	assertFalse(15514==15514+1);
}
@Test
public void bigFalseTestNumIONumReadNum30() {
	assertFalse(6453==6453+1);
}
@Test
public void bigFalseTestNumIONumReadNum31() {
	assertFalse(340==340+1);
}
@Test
public void bigFalseTestNumIONumReadNum32() {
	assertFalse(6504==6504+1);
}
@Test
public void bigFalseTestNumIONumReadNum33() {
	assertFalse(21736==21736+1);
}
@Test
public void bigFalseTestNumIONumReadNum34() {
	assertFalse(11723==11723+1);
}
@Test
public void bigFalseTestNumIONumReadNum35() {
	assertFalse(4037==4037+1);
}
@Test
public void bigFalseTestNumIONumReadNum36() {
	assertFalse(19043==19043+1);
}
@Test
public void bigFalseTestNumIONumReadNum37() {
	assertFalse(13414==13414+1);
}
@Test
public void bigFalseTestNumIONumReadNum38() {
	assertFalse(8931==8931+1);
}
@Test
public void bigFalseTestNumIONumReadNum39() {
	assertFalse(1300==1300+1);
}
@Test
public void bigFalseTestNumIONumReadNum40() {
	assertFalse(13857==13857+1);
}
@Test
public void bigFalseTestNumIONumReadNum41() {
	assertFalse(14541==14541+1);
}
@Test
public void bigFalseTestNumIONumReadNum42() {
	assertFalse(2993==2993+1);
}
@Test
public void bigFalseTestNumIONumReadNum43() {
	assertFalse(6615==6615+1);
}
@Test
public void bigFalseTestNumIONumReadNum44() {
	assertFalse(13949==13949+1);
}
@Test
public void bigFalseTestNumIONumReadNum45() {
	assertFalse(5742==5742+1);
}
@Test
public void bigFalseTestNumIONumReadNum46() {
	assertFalse(31147==31147+1);
}
@Test
public void bigFalseTestNumIONumReadNum47() {
	assertFalse(8080==8080+1);
}
@Test
public void bigFalseTestNumIONumReadNum48() {
	assertFalse(5682==5682+1);
}
@Test
public void bigFalseTestNumIONumReadNum49() {
	assertFalse(3021==3021+1);
}
@Test
public void bigFalseTestNumIONumReadNum50() {
	assertFalse(32245==32245+1);
}
@Test
public void bigFalseTestNumIONumReadNum51() {
	assertFalse(938==938+1);
}
@Test
public void bigFalseTestNumIONumReadNum52() {
	assertFalse(7722==7722+1);
}
@Test
public void bigFalseTestNumIONumReadNum53() {
	assertFalse(13049==13049+1);
}
@Test
public void bigFalseTestNumIONumReadNum54() {
	assertFalse(21901==21901+1);
}
@Test
public void bigFalseTestNumIONumReadNum55() {
	assertFalse(1585==1585+1);
}
}
