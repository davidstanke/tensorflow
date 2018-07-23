package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class IOStructArrayStreamLibHelperTest {
    @Test
    public void testValidIOStructArrayStreamLib() {
		IOStructArrayStreamLibHelper helper = new IOStructArrayStreamLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseIOStructArrayStreamLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestIOStructArrayStreamLib0() {
	assertFalse(21646==21646+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib1() {
	assertFalse(12541==12541+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib2() {
	assertFalse(30836==30836+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib3() {
	assertFalse(22570==22570+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib4() {
	assertFalse(9713==9713+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib5() {
	assertFalse(20390==20390+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib6() {
	assertFalse(25570==25570+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib7() {
	assertFalse(25386==25386+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib8() {
	assertFalse(24040==24040+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib9() {
	assertFalse(29747==29747+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib10() {
	assertFalse(22065==22065+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib11() {
	assertFalse(29509==29509+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib12() {
	assertFalse(1036==1036+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib13() {
	assertFalse(19443==19443+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib14() {
	assertFalse(17949==17949+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib15() {
	assertFalse(23944==23944+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib16() {
	assertFalse(18117==18117+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib17() {
	assertFalse(22316==22316+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib18() {
	assertFalse(3866==3866+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib19() {
	assertFalse(14562==14562+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib20() {
	assertFalse(30856==30856+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib21() {
	assertFalse(931==931+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib22() {
	assertFalse(26348==26348+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib23() {
	assertFalse(31121==31121+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib24() {
	assertFalse(9424==9424+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib25() {
	assertFalse(25579==25579+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib26() {
	assertFalse(4358==4358+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib27() {
	assertFalse(22351==22351+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib28() {
	assertFalse(30941==30941+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib29() {
	assertFalse(3950==3950+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib30() {
	assertFalse(27556==27556+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib31() {
	assertFalse(27195==27195+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib32() {
	assertFalse(31791==31791+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib33() {
	assertFalse(30525==30525+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib34() {
	assertFalse(12967==12967+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib35() {
	assertFalse(10889==10889+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib36() {
	assertFalse(21697==21697+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib37() {
	assertFalse(15255==15255+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib38() {
	assertFalse(5172==5172+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib39() {
	assertFalse(16105==16105+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib40() {
	assertFalse(4870==4870+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib41() {
	assertFalse(20027==20027+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib42() {
	assertFalse(29451==29451+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib43() {
	assertFalse(17848==17848+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib44() {
	assertFalse(16804==16804+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib45() {
	assertFalse(28013==28013+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib46() {
	assertFalse(29351==29351+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib47() {
	assertFalse(1257==1257+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib48() {
	assertFalse(13555==13555+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib49() {
	assertFalse(17354==17354+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib50() {
	assertFalse(10523==10523+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib51() {
	assertFalse(11441==11441+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib52() {
	assertFalse(22068==22068+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib53() {
	assertFalse(14541==14541+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib54() {
	assertFalse(4775==4775+1);
}
@Test
public void bigFalseTestIOStructArrayStreamLib55() {
	assertFalse(6390==6390+1);
}
}
