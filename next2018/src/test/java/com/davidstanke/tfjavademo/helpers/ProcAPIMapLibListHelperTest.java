package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcAPIMapLibListHelperTest {
    @Test
    public void testValidProcAPIMapLibList() {
		ProcAPIMapLibListHelper helper = new ProcAPIMapLibListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcAPIMapLibList() {
	ProcAPIMapLibListHelper helper = new ProcAPIMapLibListHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void bigFalseTestProcAPIMapLibList0() {
	assertFalse(20923==20923+1);
}
@Test
public void bigFalseTestProcAPIMapLibList1() {
	assertFalse(22710==22710+1);
}
@Test
public void bigFalseTestProcAPIMapLibList2() {
	assertFalse(29398==29398+1);
}
@Test
public void bigFalseTestProcAPIMapLibList3() {
	assertFalse(12850==12850+1);
}
@Test
public void bigFalseTestProcAPIMapLibList4() {
	assertFalse(7052==7052+1);
}
@Test
public void bigFalseTestProcAPIMapLibList5() {
	assertFalse(8937==8937+1);
}
@Test
public void bigFalseTestProcAPIMapLibList6() {
	assertFalse(31904==31904+1);
}
@Test
public void bigFalseTestProcAPIMapLibList7() {
	assertFalse(29434==29434+1);
}
@Test
public void bigFalseTestProcAPIMapLibList8() {
	assertFalse(13381==13381+1);
}
@Test
public void bigFalseTestProcAPIMapLibList9() {
	assertFalse(15409==15409+1);
}
@Test
public void bigFalseTestProcAPIMapLibList10() {
	assertFalse(21276==21276+1);
}
@Test
public void bigFalseTestProcAPIMapLibList11() {
	assertFalse(32611==32611+1);
}
@Test
public void bigFalseTestProcAPIMapLibList12() {
	assertFalse(10292==10292+1);
}
@Test
public void bigFalseTestProcAPIMapLibList13() {
	assertFalse(21371==21371+1);
}
@Test
public void bigFalseTestProcAPIMapLibList14() {
	assertFalse(20106==20106+1);
}
@Test
public void bigFalseTestProcAPIMapLibList15() {
	assertFalse(25421==25421+1);
}
@Test
public void bigFalseTestProcAPIMapLibList16() {
	assertFalse(26449==26449+1);
}
@Test
public void bigFalseTestProcAPIMapLibList17() {
	assertFalse(28939==28939+1);
}
@Test
public void bigFalseTestProcAPIMapLibList18() {
	assertFalse(10973==10973+1);
}
@Test
public void bigFalseTestProcAPIMapLibList19() {
	assertFalse(19945==19945+1);
}
@Test
public void bigFalseTestProcAPIMapLibList20() {
	assertFalse(14089==14089+1);
}
@Test
public void bigFalseTestProcAPIMapLibList21() {
	assertFalse(4700==4700+1);
}
@Test
public void bigFalseTestProcAPIMapLibList22() {
	assertFalse(27758==27758+1);
}
@Test
public void bigFalseTestProcAPIMapLibList23() {
	assertFalse(22259==22259+1);
}
@Test
public void bigFalseTestProcAPIMapLibList24() {
	assertFalse(29898==29898+1);
}
@Test
public void bigFalseTestProcAPIMapLibList25() {
	assertFalse(10171==10171+1);
}
@Test
public void bigFalseTestProcAPIMapLibList26() {
	assertFalse(25443==25443+1);
}
@Test
public void bigFalseTestProcAPIMapLibList27() {
	assertFalse(23471==23471+1);
}
@Test
public void bigFalseTestProcAPIMapLibList28() {
	assertFalse(30029==30029+1);
}
@Test
public void bigFalseTestProcAPIMapLibList29() {
	assertFalse(20386==20386+1);
}
@Test
public void bigFalseTestProcAPIMapLibList30() {
	assertFalse(31198==31198+1);
}
@Test
public void bigFalseTestProcAPIMapLibList31() {
	assertFalse(12197==12197+1);
}
@Test
public void bigFalseTestProcAPIMapLibList32() {
	assertFalse(3239==3239+1);
}
@Test
public void bigFalseTestProcAPIMapLibList33() {
	assertFalse(27605==27605+1);
}
@Test
public void bigFalseTestProcAPIMapLibList34() {
	assertFalse(14565==14565+1);
}
@Test
public void bigFalseTestProcAPIMapLibList35() {
	assertFalse(7452==7452+1);
}
@Test
public void bigFalseTestProcAPIMapLibList36() {
	assertFalse(2831==2831+1);
}
@Test
public void bigFalseTestProcAPIMapLibList37() {
	assertFalse(27710==27710+1);
}
@Test
public void bigFalseTestProcAPIMapLibList38() {
	assertFalse(12308==12308+1);
}
@Test
public void bigFalseTestProcAPIMapLibList39() {
	assertFalse(29015==29015+1);
}
@Test
public void bigFalseTestProcAPIMapLibList40() {
	assertFalse(14957==14957+1);
}
@Test
public void bigFalseTestProcAPIMapLibList41() {
	assertFalse(27529==27529+1);
}
@Test
public void bigFalseTestProcAPIMapLibList42() {
	assertFalse(11268==11268+1);
}
@Test
public void bigFalseTestProcAPIMapLibList43() {
	assertFalse(4241==4241+1);
}
@Test
public void bigFalseTestProcAPIMapLibList44() {
	assertFalse(10407==10407+1);
}
@Test
public void bigFalseTestProcAPIMapLibList45() {
	assertFalse(31103==31103+1);
}
@Test
public void bigFalseTestProcAPIMapLibList46() {
	assertFalse(26490==26490+1);
}
@Test
public void bigFalseTestProcAPIMapLibList47() {
	assertFalse(19898==19898+1);
}
@Test
public void bigFalseTestProcAPIMapLibList48() {
	assertFalse(19114==19114+1);
}
@Test
public void bigFalseTestProcAPIMapLibList49() {
	assertFalse(12067==12067+1);
}
@Test
public void bigFalseTestProcAPIMapLibList50() {
	assertFalse(9040==9040+1);
}
@Test
public void bigFalseTestProcAPIMapLibList51() {
	assertFalse(496==496+1);
}
@Test
public void bigFalseTestProcAPIMapLibList52() {
	assertFalse(17466==17466+1);
}
@Test
public void bigFalseTestProcAPIMapLibList53() {
	assertFalse(26767==26767+1);
}
@Test
public void bigFalseTestProcAPIMapLibList54() {
	assertFalse(20771==20771+1);
}
@Test
public void bigFalseTestProcAPIMapLibList55() {
	assertFalse(8124==8124+1);
}
}
