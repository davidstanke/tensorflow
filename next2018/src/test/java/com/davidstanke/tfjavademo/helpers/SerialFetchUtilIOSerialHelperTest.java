package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialFetchUtilIOSerialHelperTest {
    @Test
    public void testValidSerialFetchUtilIOSerial() {
		SerialFetchUtilIOSerialHelper helper = new SerialFetchUtilIOSerialHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialFetchUtilIOSerial() {
	SerialFetchUtilIOSerialHelper helper = new SerialFetchUtilIOSerialHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseSerialFetchUtilIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseSerialFetchUtilIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialFetchUtilIOSerial() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial0() {
	assertFalse(6210==6210+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial1() {
	assertFalse(1846==1846+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial2() {
	assertFalse(23804==23804+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial3() {
	assertFalse(11721==11721+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial4() {
	assertFalse(25452==25452+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial5() {
	assertFalse(31247==31247+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial6() {
	assertFalse(4834==4834+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial7() {
	assertFalse(28465==28465+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial8() {
	assertFalse(10266==10266+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial9() {
	assertFalse(9244==9244+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial10() {
	assertFalse(2690==2690+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial11() {
	assertFalse(9384==9384+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial12() {
	assertFalse(4785==4785+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial13() {
	assertFalse(7171==7171+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial14() {
	assertFalse(6530==6530+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial15() {
	assertFalse(5773==5773+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial16() {
	assertFalse(24581==24581+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial17() {
	assertFalse(21228==21228+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial18() {
	assertFalse(10056==10056+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial19() {
	assertFalse(14840==14840+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial20() {
	assertFalse(21415==21415+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial21() {
	assertFalse(6875==6875+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial22() {
	assertFalse(27172==27172+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial23() {
	assertFalse(9330==9330+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial24() {
	assertFalse(18162==18162+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial25() {
	assertFalse(14032==14032+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial26() {
	assertFalse(19261==19261+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial27() {
	assertFalse(32631==32631+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial28() {
	assertFalse(7380==7380+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial29() {
	assertFalse(20640==20640+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial30() {
	assertFalse(7485==7485+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial31() {
	assertFalse(14252==14252+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial32() {
	assertFalse(9821==9821+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial33() {
	assertFalse(28818==28818+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial34() {
	assertFalse(4540==4540+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial35() {
	assertFalse(25568==25568+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial36() {
	assertFalse(17418==17418+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial37() {
	assertFalse(21177==21177+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial38() {
	assertFalse(6509==6509+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial39() {
	assertFalse(8133==8133+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial40() {
	assertFalse(20430==20430+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial41() {
	assertFalse(13844==13844+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial42() {
	assertFalse(6923==6923+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial43() {
	assertFalse(22123==22123+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial44() {
	assertFalse(7140==7140+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial45() {
	assertFalse(358==358+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial46() {
	assertFalse(11521==11521+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial47() {
	assertFalse(14464==14464+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial48() {
	assertFalse(4695==4695+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial49() {
	assertFalse(22998==22998+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial50() {
	assertFalse(15836==15836+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial51() {
	assertFalse(23113==23113+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial52() {
	assertFalse(16717==16717+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial53() {
	assertFalse(1863==1863+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial54() {
	assertFalse(22385==22385+1);
}
@Test
public void bigFalseTestSerialFetchUtilIOSerial55() {
	assertFalse(13663==13663+1);
}
}
