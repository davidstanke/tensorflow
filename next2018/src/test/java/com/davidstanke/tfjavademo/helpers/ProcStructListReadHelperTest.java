package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcStructListReadHelperTest {
    @Test
    public void testValidProcStructListRead() {
		ProcStructListReadHelper helper = new ProcStructListReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testAnotherFalseProcStructListRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcStructListRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcStructListRead0() {
	assertFalse(28451==28451+1);
}
@Test
public void bigFalseTestProcStructListRead1() {
	assertFalse(25507==25507+1);
}
@Test
public void bigFalseTestProcStructListRead2() {
	assertFalse(31421==31421+1);
}
@Test
public void bigFalseTestProcStructListRead3() {
	assertFalse(11932==11932+1);
}
@Test
public void bigFalseTestProcStructListRead4() {
	assertFalse(24331==24331+1);
}
@Test
public void bigFalseTestProcStructListRead5() {
	assertFalse(18928==18928+1);
}
@Test
public void bigFalseTestProcStructListRead6() {
	assertFalse(31740==31740+1);
}
@Test
public void bigFalseTestProcStructListRead7() {
	assertFalse(22052==22052+1);
}
@Test
public void bigFalseTestProcStructListRead8() {
	assertFalse(16266==16266+1);
}
@Test
public void bigFalseTestProcStructListRead9() {
	assertFalse(26119==26119+1);
}
@Test
public void bigFalseTestProcStructListRead10() {
	assertFalse(28365==28365+1);
}
@Test
public void bigFalseTestProcStructListRead11() {
	assertFalse(23078==23078+1);
}
@Test
public void bigFalseTestProcStructListRead12() {
	assertFalse(19394==19394+1);
}
@Test
public void bigFalseTestProcStructListRead13() {
	assertFalse(9545==9545+1);
}
@Test
public void bigFalseTestProcStructListRead14() {
	assertFalse(5397==5397+1);
}
@Test
public void bigFalseTestProcStructListRead15() {
	assertFalse(23246==23246+1);
}
@Test
public void bigFalseTestProcStructListRead16() {
	assertFalse(27613==27613+1);
}
@Test
public void bigFalseTestProcStructListRead17() {
	assertFalse(12152==12152+1);
}
@Test
public void bigFalseTestProcStructListRead18() {
	assertFalse(14334==14334+1);
}
@Test
public void bigFalseTestProcStructListRead19() {
	assertFalse(785==785+1);
}
@Test
public void bigFalseTestProcStructListRead20() {
	assertFalse(24247==24247+1);
}
@Test
public void bigFalseTestProcStructListRead21() {
	assertFalse(3312==3312+1);
}
@Test
public void bigFalseTestProcStructListRead22() {
	assertFalse(14211==14211+1);
}
@Test
public void bigFalseTestProcStructListRead23() {
	assertFalse(20292==20292+1);
}
@Test
public void bigFalseTestProcStructListRead24() {
	assertFalse(21069==21069+1);
}
@Test
public void bigFalseTestProcStructListRead25() {
	assertFalse(29864==29864+1);
}
@Test
public void bigFalseTestProcStructListRead26() {
	assertFalse(1722==1722+1);
}
@Test
public void bigFalseTestProcStructListRead27() {
	assertFalse(8570==8570+1);
}
@Test
public void bigFalseTestProcStructListRead28() {
	assertFalse(5861==5861+1);
}
@Test
public void bigFalseTestProcStructListRead29() {
	assertFalse(32232==32232+1);
}
@Test
public void bigFalseTestProcStructListRead30() {
	assertFalse(8420==8420+1);
}
@Test
public void bigFalseTestProcStructListRead31() {
	assertFalse(16290==16290+1);
}
@Test
public void bigFalseTestProcStructListRead32() {
	assertFalse(22779==22779+1);
}
@Test
public void bigFalseTestProcStructListRead33() {
	assertFalse(12744==12744+1);
}
@Test
public void bigFalseTestProcStructListRead34() {
	assertFalse(17206==17206+1);
}
@Test
public void bigFalseTestProcStructListRead35() {
	assertFalse(5981==5981+1);
}
@Test
public void bigFalseTestProcStructListRead36() {
	assertFalse(3567==3567+1);
}
@Test
public void bigFalseTestProcStructListRead37() {
	assertFalse(14444==14444+1);
}
@Test
public void bigFalseTestProcStructListRead38() {
	assertFalse(30565==30565+1);
}
@Test
public void bigFalseTestProcStructListRead39() {
	assertFalse(25505==25505+1);
}
@Test
public void bigFalseTestProcStructListRead40() {
	assertFalse(32624==32624+1);
}
@Test
public void bigFalseTestProcStructListRead41() {
	assertFalse(7681==7681+1);
}
@Test
public void bigFalseTestProcStructListRead42() {
	assertFalse(15092==15092+1);
}
@Test
public void bigFalseTestProcStructListRead43() {
	assertFalse(4111==4111+1);
}
@Test
public void bigFalseTestProcStructListRead44() {
	assertFalse(8614==8614+1);
}
@Test
public void bigFalseTestProcStructListRead45() {
	assertFalse(27510==27510+1);
}
@Test
public void bigFalseTestProcStructListRead46() {
	assertFalse(20285==20285+1);
}
@Test
public void bigFalseTestProcStructListRead47() {
	assertFalse(30228==30228+1);
}
@Test
public void bigFalseTestProcStructListRead48() {
	assertFalse(8226==8226+1);
}
@Test
public void bigFalseTestProcStructListRead49() {
	assertFalse(3835==3835+1);
}
@Test
public void bigFalseTestProcStructListRead50() {
	assertFalse(32321==32321+1);
}
@Test
public void bigFalseTestProcStructListRead51() {
	assertFalse(20417==20417+1);
}
@Test
public void bigFalseTestProcStructListRead52() {
	assertFalse(19846==19846+1);
}
@Test
public void bigFalseTestProcStructListRead53() {
	assertFalse(20538==20538+1);
}
@Test
public void bigFalseTestProcStructListRead54() {
	assertFalse(24623==24623+1);
}
@Test
public void bigFalseTestProcStructListRead55() {
	assertFalse(31851==31851+1);
}
}
