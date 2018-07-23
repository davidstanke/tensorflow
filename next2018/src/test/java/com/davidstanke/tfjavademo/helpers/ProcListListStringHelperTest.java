package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcListListStringHelperTest {
    @Test
    public void testValidProcListListString() {
		ProcListListStringHelper helper = new ProcListListStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcListListString() {
	ProcListListStringHelper helper = new ProcListListStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseProcListListString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcListListString0() {
	assertFalse(18302==18302+1);
}
@Test
public void bigFalseTestProcListListString1() {
	assertFalse(30891==30891+1);
}
@Test
public void bigFalseTestProcListListString2() {
	assertFalse(31510==31510+1);
}
@Test
public void bigFalseTestProcListListString3() {
	assertFalse(17540==17540+1);
}
@Test
public void bigFalseTestProcListListString4() {
	assertFalse(27721==27721+1);
}
@Test
public void bigFalseTestProcListListString5() {
	assertFalse(27528==27528+1);
}
@Test
public void bigFalseTestProcListListString6() {
	assertFalse(945==945+1);
}
@Test
public void bigFalseTestProcListListString7() {
	assertFalse(27811==27811+1);
}
@Test
public void bigFalseTestProcListListString8() {
	assertFalse(16902==16902+1);
}
@Test
public void bigFalseTestProcListListString9() {
	assertFalse(32442==32442+1);
}
@Test
public void bigFalseTestProcListListString10() {
	assertFalse(29822==29822+1);
}
@Test
public void bigFalseTestProcListListString11() {
	assertFalse(32041==32041+1);
}
@Test
public void bigFalseTestProcListListString12() {
	assertFalse(32361==32361+1);
}
@Test
public void bigFalseTestProcListListString13() {
	assertFalse(19407==19407+1);
}
@Test
public void bigFalseTestProcListListString14() {
	assertFalse(10565==10565+1);
}
@Test
public void bigFalseTestProcListListString15() {
	assertFalse(30589==30589+1);
}
@Test
public void bigFalseTestProcListListString16() {
	assertFalse(6990==6990+1);
}
@Test
public void bigFalseTestProcListListString17() {
	assertFalse(16209==16209+1);
}
@Test
public void bigFalseTestProcListListString18() {
	assertFalse(16688==16688+1);
}
@Test
public void bigFalseTestProcListListString19() {
	assertFalse(16749==16749+1);
}
@Test
public void bigFalseTestProcListListString20() {
	assertFalse(21092==21092+1);
}
@Test
public void bigFalseTestProcListListString21() {
	assertFalse(10504==10504+1);
}
@Test
public void bigFalseTestProcListListString22() {
	assertFalse(20574==20574+1);
}
@Test
public void bigFalseTestProcListListString23() {
	assertFalse(26057==26057+1);
}
@Test
public void bigFalseTestProcListListString24() {
	assertFalse(10136==10136+1);
}
@Test
public void bigFalseTestProcListListString25() {
	assertFalse(5106==5106+1);
}
@Test
public void bigFalseTestProcListListString26() {
	assertFalse(7718==7718+1);
}
@Test
public void bigFalseTestProcListListString27() {
	assertFalse(17086==17086+1);
}
@Test
public void bigFalseTestProcListListString28() {
	assertFalse(11844==11844+1);
}
@Test
public void bigFalseTestProcListListString29() {
	assertFalse(8707==8707+1);
}
@Test
public void bigFalseTestProcListListString30() {
	assertFalse(31787==31787+1);
}
@Test
public void bigFalseTestProcListListString31() {
	assertFalse(16884==16884+1);
}
@Test
public void bigFalseTestProcListListString32() {
	assertFalse(29972==29972+1);
}
@Test
public void bigFalseTestProcListListString33() {
	assertFalse(26525==26525+1);
}
@Test
public void bigFalseTestProcListListString34() {
	assertFalse(548==548+1);
}
@Test
public void bigFalseTestProcListListString35() {
	assertFalse(30311==30311+1);
}
@Test
public void bigFalseTestProcListListString36() {
	assertFalse(17596==17596+1);
}
@Test
public void bigFalseTestProcListListString37() {
	assertFalse(717==717+1);
}
@Test
public void bigFalseTestProcListListString38() {
	assertFalse(14952==14952+1);
}
@Test
public void bigFalseTestProcListListString39() {
	assertFalse(15366==15366+1);
}
@Test
public void bigFalseTestProcListListString40() {
	assertFalse(7516==7516+1);
}
@Test
public void bigFalseTestProcListListString41() {
	assertFalse(27211==27211+1);
}
@Test
public void bigFalseTestProcListListString42() {
	assertFalse(2876==2876+1);
}
@Test
public void bigFalseTestProcListListString43() {
	assertFalse(13581==13581+1);
}
@Test
public void bigFalseTestProcListListString44() {
	assertFalse(7854==7854+1);
}
@Test
public void bigFalseTestProcListListString45() {
	assertFalse(12336==12336+1);
}
@Test
public void bigFalseTestProcListListString46() {
	assertFalse(26845==26845+1);
}
@Test
public void bigFalseTestProcListListString47() {
	assertFalse(16675==16675+1);
}
@Test
public void bigFalseTestProcListListString48() {
	assertFalse(18165==18165+1);
}
@Test
public void bigFalseTestProcListListString49() {
	assertFalse(13429==13429+1);
}
@Test
public void bigFalseTestProcListListString50() {
	assertFalse(7244==7244+1);
}
@Test
public void bigFalseTestProcListListString51() {
	assertFalse(18995==18995+1);
}
@Test
public void bigFalseTestProcListListString52() {
	assertFalse(13477==13477+1);
}
@Test
public void bigFalseTestProcListListString53() {
	assertFalse(815==815+1);
}
@Test
public void bigFalseTestProcListListString54() {
	assertFalse(10972==10972+1);
}
@Test
public void bigFalseTestProcListListString55() {
	assertFalse(778==778+1);
}
}
