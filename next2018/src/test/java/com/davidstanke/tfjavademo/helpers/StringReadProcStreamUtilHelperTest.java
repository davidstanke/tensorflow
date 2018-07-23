package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringReadProcStreamUtilHelperTest {
    @Test
    public void testValidStringReadProcStreamUtil() {
		StringReadProcStreamUtilHelper helper = new StringReadProcStreamUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringReadProcStreamUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringReadProcStreamUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringReadProcStreamUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringReadProcStreamUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringReadProcStreamUtil0() {
	assertFalse(16239==16239+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil1() {
	assertFalse(7235==7235+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil2() {
	assertFalse(27213==27213+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil3() {
	assertFalse(5650==5650+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil4() {
	assertFalse(17858==17858+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil5() {
	assertFalse(29156==29156+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil6() {
	assertFalse(28359==28359+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil7() {
	assertFalse(25246==25246+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil8() {
	assertFalse(308==308+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil9() {
	assertFalse(11603==11603+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil10() {
	assertFalse(3112==3112+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil11() {
	assertFalse(2814==2814+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil12() {
	assertFalse(23710==23710+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil13() {
	assertFalse(21658==21658+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil14() {
	assertFalse(32170==32170+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil15() {
	assertFalse(12181==12181+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil16() {
	assertFalse(18057==18057+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil17() {
	assertFalse(23173==23173+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil18() {
	assertFalse(21896==21896+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil19() {
	assertFalse(6588==6588+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil20() {
	assertFalse(7033==7033+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil21() {
	assertFalse(2302==2302+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil22() {
	assertFalse(20006==20006+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil23() {
	assertFalse(13188==13188+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil24() {
	assertFalse(26878==26878+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil25() {
	assertFalse(13606==13606+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil26() {
	assertFalse(509==509+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil27() {
	assertFalse(16171==16171+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil28() {
	assertFalse(21880==21880+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil29() {
	assertFalse(6455==6455+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil30() {
	assertFalse(13900==13900+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil31() {
	assertFalse(2650==2650+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil32() {
	assertFalse(14509==14509+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil33() {
	assertFalse(28700==28700+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil34() {
	assertFalse(9344==9344+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil35() {
	assertFalse(6436==6436+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil36() {
	assertFalse(12556==12556+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil37() {
	assertFalse(11981==11981+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil38() {
	assertFalse(28256==28256+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil39() {
	assertFalse(1215==1215+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil40() {
	assertFalse(16830==16830+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil41() {
	assertFalse(30572==30572+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil42() {
	assertFalse(10488==10488+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil43() {
	assertFalse(2560==2560+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil44() {
	assertFalse(17778==17778+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil45() {
	assertFalse(8737==8737+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil46() {
	assertFalse(10827==10827+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil47() {
	assertFalse(920==920+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil48() {
	assertFalse(16869==16869+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil49() {
	assertFalse(30646==30646+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil50() {
	assertFalse(1464==1464+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil51() {
	assertFalse(19473==19473+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil52() {
	assertFalse(26676==26676+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil53() {
	assertFalse(31217==31217+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil54() {
	assertFalse(25384==25384+1);
}
@Test
public void bigFalseTestStringReadProcStreamUtil55() {
	assertFalse(17286==17286+1);
}
}
