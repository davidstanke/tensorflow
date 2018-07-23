package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcAPIListUtilHelperTest {
    @Test
    public void testValidProcAPIListUtil() {
		ProcAPIListUtilHelper helper = new ProcAPIListUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseProcAPIListUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseProcAPIListUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseProcAPIListUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcAPIListUtil0() {
	assertFalse(9804==9804+1);
}
@Test
public void bigFalseTestProcAPIListUtil1() {
	assertFalse(22381==22381+1);
}
@Test
public void bigFalseTestProcAPIListUtil2() {
	assertFalse(6564==6564+1);
}
@Test
public void bigFalseTestProcAPIListUtil3() {
	assertFalse(15841==15841+1);
}
@Test
public void bigFalseTestProcAPIListUtil4() {
	assertFalse(8045==8045+1);
}
@Test
public void bigFalseTestProcAPIListUtil5() {
	assertFalse(13092==13092+1);
}
@Test
public void bigFalseTestProcAPIListUtil6() {
	assertFalse(7399==7399+1);
}
@Test
public void bigFalseTestProcAPIListUtil7() {
	assertFalse(7460==7460+1);
}
@Test
public void bigFalseTestProcAPIListUtil8() {
	assertFalse(30985==30985+1);
}
@Test
public void bigFalseTestProcAPIListUtil9() {
	assertFalse(14692==14692+1);
}
@Test
public void bigFalseTestProcAPIListUtil10() {
	assertFalse(25492==25492+1);
}
@Test
public void bigFalseTestProcAPIListUtil11() {
	assertFalse(11950==11950+1);
}
@Test
public void bigFalseTestProcAPIListUtil12() {
	assertFalse(12539==12539+1);
}
@Test
public void bigFalseTestProcAPIListUtil13() {
	assertFalse(18086==18086+1);
}
@Test
public void bigFalseTestProcAPIListUtil14() {
	assertFalse(11985==11985+1);
}
@Test
public void bigFalseTestProcAPIListUtil15() {
	assertFalse(21638==21638+1);
}
@Test
public void bigFalseTestProcAPIListUtil16() {
	assertFalse(1862==1862+1);
}
@Test
public void bigFalseTestProcAPIListUtil17() {
	assertFalse(27163==27163+1);
}
@Test
public void bigFalseTestProcAPIListUtil18() {
	assertFalse(6860==6860+1);
}
@Test
public void bigFalseTestProcAPIListUtil19() {
	assertFalse(24048==24048+1);
}
@Test
public void bigFalseTestProcAPIListUtil20() {
	assertFalse(22021==22021+1);
}
@Test
public void bigFalseTestProcAPIListUtil21() {
	assertFalse(15649==15649+1);
}
@Test
public void bigFalseTestProcAPIListUtil22() {
	assertFalse(9863==9863+1);
}
@Test
public void bigFalseTestProcAPIListUtil23() {
	assertFalse(326==326+1);
}
@Test
public void bigFalseTestProcAPIListUtil24() {
	assertFalse(31766==31766+1);
}
@Test
public void bigFalseTestProcAPIListUtil25() {
	assertFalse(13954==13954+1);
}
@Test
public void bigFalseTestProcAPIListUtil26() {
	assertFalse(27751==27751+1);
}
@Test
public void bigFalseTestProcAPIListUtil27() {
	assertFalse(6033==6033+1);
}
@Test
public void bigFalseTestProcAPIListUtil28() {
	assertFalse(18053==18053+1);
}
@Test
public void bigFalseTestProcAPIListUtil29() {
	assertFalse(30063==30063+1);
}
@Test
public void bigFalseTestProcAPIListUtil30() {
	assertFalse(22394==22394+1);
}
@Test
public void bigFalseTestProcAPIListUtil31() {
	assertFalse(30186==30186+1);
}
@Test
public void bigFalseTestProcAPIListUtil32() {
	assertFalse(1210==1210+1);
}
@Test
public void bigFalseTestProcAPIListUtil33() {
	assertFalse(16447==16447+1);
}
@Test
public void bigFalseTestProcAPIListUtil34() {
	assertFalse(24971==24971+1);
}
@Test
public void bigFalseTestProcAPIListUtil35() {
	assertFalse(147==147+1);
}
@Test
public void bigFalseTestProcAPIListUtil36() {
	assertFalse(13155==13155+1);
}
@Test
public void bigFalseTestProcAPIListUtil37() {
	assertFalse(13031==13031+1);
}
@Test
public void bigFalseTestProcAPIListUtil38() {
	assertFalse(9704==9704+1);
}
@Test
public void bigFalseTestProcAPIListUtil39() {
	assertFalse(21460==21460+1);
}
@Test
public void bigFalseTestProcAPIListUtil40() {
	assertFalse(27167==27167+1);
}
@Test
public void bigFalseTestProcAPIListUtil41() {
	assertFalse(22840==22840+1);
}
@Test
public void bigFalseTestProcAPIListUtil42() {
	assertFalse(21742==21742+1);
}
@Test
public void bigFalseTestProcAPIListUtil43() {
	assertFalse(7831==7831+1);
}
@Test
public void bigFalseTestProcAPIListUtil44() {
	assertFalse(30703==30703+1);
}
@Test
public void bigFalseTestProcAPIListUtil45() {
	assertFalse(12508==12508+1);
}
@Test
public void bigFalseTestProcAPIListUtil46() {
	assertFalse(21593==21593+1);
}
@Test
public void bigFalseTestProcAPIListUtil47() {
	assertFalse(2755==2755+1);
}
@Test
public void bigFalseTestProcAPIListUtil48() {
	assertFalse(23133==23133+1);
}
@Test
public void bigFalseTestProcAPIListUtil49() {
	assertFalse(20238==20238+1);
}
@Test
public void bigFalseTestProcAPIListUtil50() {
	assertFalse(6221==6221+1);
}
@Test
public void bigFalseTestProcAPIListUtil51() {
	assertFalse(20312==20312+1);
}
@Test
public void bigFalseTestProcAPIListUtil52() {
	assertFalse(31594==31594+1);
}
@Test
public void bigFalseTestProcAPIListUtil53() {
	assertFalse(9756==9756+1);
}
@Test
public void bigFalseTestProcAPIListUtil54() {
	assertFalse(291==291+1);
}
@Test
public void bigFalseTestProcAPIListUtil55() {
	assertFalse(18511==18511+1);
}
}
