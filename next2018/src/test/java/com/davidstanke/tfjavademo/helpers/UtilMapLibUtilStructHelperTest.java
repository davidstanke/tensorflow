package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class UtilMapLibUtilStructHelperTest {
    @Test
    public void testValidUtilMapLibUtilStruct() {
		UtilMapLibUtilStructHelper helper = new UtilMapLibUtilStructHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidUtilMapLibUtilStruct() {
	UtilMapLibUtilStructHelper helper = new UtilMapLibUtilStructHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseUtilMapLibUtilStruct() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct0() {
	assertFalse(30792==30792+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct1() {
	assertFalse(28146==28146+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct2() {
	assertFalse(30385==30385+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct3() {
	assertFalse(3052==3052+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct4() {
	assertFalse(19991==19991+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct5() {
	assertFalse(30335==30335+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct6() {
	assertFalse(30018==30018+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct7() {
	assertFalse(2331==2331+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct8() {
	assertFalse(21130==21130+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct9() {
	assertFalse(18226==18226+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct10() {
	assertFalse(23242==23242+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct11() {
	assertFalse(12097==12097+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct12() {
	assertFalse(32059==32059+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct13() {
	assertFalse(5384==5384+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct14() {
	assertFalse(13992==13992+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct15() {
	assertFalse(19038==19038+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct16() {
	assertFalse(18946==18946+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct17() {
	assertFalse(5868==5868+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct18() {
	assertFalse(17978==17978+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct19() {
	assertFalse(17838==17838+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct20() {
	assertFalse(8429==8429+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct21() {
	assertFalse(5128==5128+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct22() {
	assertFalse(13119==13119+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct23() {
	assertFalse(16601==16601+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct24() {
	assertFalse(16896==16896+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct25() {
	assertFalse(2766==2766+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct26() {
	assertFalse(23534==23534+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct27() {
	assertFalse(19423==19423+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct28() {
	assertFalse(12461==12461+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct29() {
	assertFalse(15556==15556+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct30() {
	assertFalse(210==210+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct31() {
	assertFalse(30145==30145+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct32() {
	assertFalse(23314==23314+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct33() {
	assertFalse(11027==11027+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct34() {
	assertFalse(29804==29804+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct35() {
	assertFalse(6640==6640+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct36() {
	assertFalse(30965==30965+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct37() {
	assertFalse(20431==20431+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct38() {
	assertFalse(10375==10375+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct39() {
	assertFalse(6263==6263+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct40() {
	assertFalse(24191==24191+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct41() {
	assertFalse(8197==8197+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct42() {
	assertFalse(13657==13657+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct43() {
	assertFalse(25831==25831+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct44() {
	assertFalse(16060==16060+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct45() {
	assertFalse(8837==8837+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct46() {
	assertFalse(13918==13918+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct47() {
	assertFalse(6150==6150+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct48() {
	assertFalse(6606==6606+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct49() {
	assertFalse(10100==10100+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct50() {
	assertFalse(6388==6388+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct51() {
	assertFalse(28726==28726+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct52() {
	assertFalse(21236==21236+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct53() {
	assertFalse(27792==27792+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct54() {
	assertFalse(14519==14519+1);
}
@Test
public void bigFalseTestUtilMapLibUtilStruct55() {
	assertFalse(27815==27815+1);
}
}
