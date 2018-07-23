package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumNumAsyncStringProcHelperTest {
    @Test
    public void testValidNumNumAsyncStringProc() {
		NumNumAsyncStringProcHelper helper = new NumNumAsyncStringProcHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumNumAsyncStringProc() {
	NumNumAsyncStringProcHelper helper = new NumNumAsyncStringProcHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseNumNumAsyncStringProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseNumNumAsyncStringProc() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumNumAsyncStringProc0() {
	assertFalse(17760==17760+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc1() {
	assertFalse(16907==16907+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc2() {
	assertFalse(25169==25169+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc3() {
	assertFalse(21730==21730+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc4() {
	assertFalse(7292==7292+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc5() {
	assertFalse(26519==26519+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc6() {
	assertFalse(21990==21990+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc7() {
	assertFalse(89==89+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc8() {
	assertFalse(16515==16515+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc9() {
	assertFalse(14381==14381+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc10() {
	assertFalse(5618==5618+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc11() {
	assertFalse(9664==9664+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc12() {
	assertFalse(7648==7648+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc13() {
	assertFalse(24834==24834+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc14() {
	assertFalse(22162==22162+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc15() {
	assertFalse(14773==14773+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc16() {
	assertFalse(11212==11212+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc17() {
	assertFalse(17580==17580+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc18() {
	assertFalse(20226==20226+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc19() {
	assertFalse(25453==25453+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc20() {
	assertFalse(10398==10398+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc21() {
	assertFalse(20349==20349+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc22() {
	assertFalse(11462==11462+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc23() {
	assertFalse(28273==28273+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc24() {
	assertFalse(20184==20184+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc25() {
	assertFalse(13730==13730+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc26() {
	assertFalse(3486==3486+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc27() {
	assertFalse(7193==7193+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc28() {
	assertFalse(20205==20205+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc29() {
	assertFalse(30464==30464+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc30() {
	assertFalse(11303==11303+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc31() {
	assertFalse(4297==4297+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc32() {
	assertFalse(6611==6611+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc33() {
	assertFalse(17610==17610+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc34() {
	assertFalse(11089==11089+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc35() {
	assertFalse(22766==22766+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc36() {
	assertFalse(18509==18509+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc37() {
	assertFalse(9442==9442+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc38() {
	assertFalse(11396==11396+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc39() {
	assertFalse(16824==16824+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc40() {
	assertFalse(10998==10998+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc41() {
	assertFalse(28405==28405+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc42() {
	assertFalse(7313==7313+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc43() {
	assertFalse(405==405+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc44() {
	assertFalse(20236==20236+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc45() {
	assertFalse(32597==32597+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc46() {
	assertFalse(25435==25435+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc47() {
	assertFalse(27761==27761+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc48() {
	assertFalse(1026==1026+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc49() {
	assertFalse(15253==15253+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc50() {
	assertFalse(25154==25154+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc51() {
	assertFalse(12206==12206+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc52() {
	assertFalse(11716==11716+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc53() {
	assertFalse(17638==17638+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc54() {
	assertFalse(27987==27987+1);
}
@Test
public void bigFalseTestNumNumAsyncStringProc55() {
	assertFalse(20965==20965+1);
}
}
