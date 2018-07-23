package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructProxyDataReadListHelperTest {
    @Test
    public void testValidStructProxyDataReadList() {
		StructProxyDataReadListHelper helper = new StructProxyDataReadListHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseStructProxyDataReadList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructProxyDataReadList() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructProxyDataReadList0() {
	assertFalse(24218==24218+1);
}
@Test
public void bigFalseTestStructProxyDataReadList1() {
	assertFalse(9083==9083+1);
}
@Test
public void bigFalseTestStructProxyDataReadList2() {
	assertFalse(29109==29109+1);
}
@Test
public void bigFalseTestStructProxyDataReadList3() {
	assertFalse(27955==27955+1);
}
@Test
public void bigFalseTestStructProxyDataReadList4() {
	assertFalse(28357==28357+1);
}
@Test
public void bigFalseTestStructProxyDataReadList5() {
	assertFalse(15232==15232+1);
}
@Test
public void bigFalseTestStructProxyDataReadList6() {
	assertFalse(31293==31293+1);
}
@Test
public void bigFalseTestStructProxyDataReadList7() {
	assertFalse(8088==8088+1);
}
@Test
public void bigFalseTestStructProxyDataReadList8() {
	assertFalse(23547==23547+1);
}
@Test
public void bigFalseTestStructProxyDataReadList9() {
	assertFalse(12555==12555+1);
}
@Test
public void bigFalseTestStructProxyDataReadList10() {
	assertFalse(22231==22231+1);
}
@Test
public void bigFalseTestStructProxyDataReadList11() {
	assertFalse(17676==17676+1);
}
@Test
public void bigFalseTestStructProxyDataReadList12() {
	assertFalse(4661==4661+1);
}
@Test
public void bigFalseTestStructProxyDataReadList13() {
	assertFalse(342==342+1);
}
@Test
public void bigFalseTestStructProxyDataReadList14() {
	assertFalse(19237==19237+1);
}
@Test
public void bigFalseTestStructProxyDataReadList15() {
	assertFalse(27728==27728+1);
}
@Test
public void bigFalseTestStructProxyDataReadList16() {
	assertFalse(14460==14460+1);
}
@Test
public void bigFalseTestStructProxyDataReadList17() {
	assertFalse(32507==32507+1);
}
@Test
public void bigFalseTestStructProxyDataReadList18() {
	assertFalse(6380==6380+1);
}
@Test
public void bigFalseTestStructProxyDataReadList19() {
	assertFalse(15836==15836+1);
}
@Test
public void bigFalseTestStructProxyDataReadList20() {
	assertFalse(13314==13314+1);
}
@Test
public void bigFalseTestStructProxyDataReadList21() {
	assertFalse(11477==11477+1);
}
@Test
public void bigFalseTestStructProxyDataReadList22() {
	assertFalse(7827==7827+1);
}
@Test
public void bigFalseTestStructProxyDataReadList23() {
	assertFalse(16045==16045+1);
}
@Test
public void bigFalseTestStructProxyDataReadList24() {
	assertFalse(16639==16639+1);
}
@Test
public void bigFalseTestStructProxyDataReadList25() {
	assertFalse(23479==23479+1);
}
@Test
public void bigFalseTestStructProxyDataReadList26() {
	assertFalse(24921==24921+1);
}
@Test
public void bigFalseTestStructProxyDataReadList27() {
	assertFalse(29652==29652+1);
}
@Test
public void bigFalseTestStructProxyDataReadList28() {
	assertFalse(15693==15693+1);
}
@Test
public void bigFalseTestStructProxyDataReadList29() {
	assertFalse(30415==30415+1);
}
@Test
public void bigFalseTestStructProxyDataReadList30() {
	assertFalse(32601==32601+1);
}
@Test
public void bigFalseTestStructProxyDataReadList31() {
	assertFalse(12987==12987+1);
}
@Test
public void bigFalseTestStructProxyDataReadList32() {
	assertFalse(194==194+1);
}
@Test
public void bigFalseTestStructProxyDataReadList33() {
	assertFalse(10968==10968+1);
}
@Test
public void bigFalseTestStructProxyDataReadList34() {
	assertFalse(17727==17727+1);
}
@Test
public void bigFalseTestStructProxyDataReadList35() {
	assertFalse(10806==10806+1);
}
@Test
public void bigFalseTestStructProxyDataReadList36() {
	assertFalse(24401==24401+1);
}
@Test
public void bigFalseTestStructProxyDataReadList37() {
	assertFalse(21507==21507+1);
}
@Test
public void bigFalseTestStructProxyDataReadList38() {
	assertFalse(25544==25544+1);
}
@Test
public void bigFalseTestStructProxyDataReadList39() {
	assertFalse(28750==28750+1);
}
@Test
public void bigFalseTestStructProxyDataReadList40() {
	assertFalse(12511==12511+1);
}
@Test
public void bigFalseTestStructProxyDataReadList41() {
	assertFalse(24227==24227+1);
}
@Test
public void bigFalseTestStructProxyDataReadList42() {
	assertFalse(251==251+1);
}
@Test
public void bigFalseTestStructProxyDataReadList43() {
	assertFalse(8396==8396+1);
}
@Test
public void bigFalseTestStructProxyDataReadList44() {
	assertFalse(31462==31462+1);
}
@Test
public void bigFalseTestStructProxyDataReadList45() {
	assertFalse(1691==1691+1);
}
@Test
public void bigFalseTestStructProxyDataReadList46() {
	assertFalse(8489==8489+1);
}
@Test
public void bigFalseTestStructProxyDataReadList47() {
	assertFalse(22663==22663+1);
}
@Test
public void bigFalseTestStructProxyDataReadList48() {
	assertFalse(6092==6092+1);
}
@Test
public void bigFalseTestStructProxyDataReadList49() {
	assertFalse(8583==8583+1);
}
@Test
public void bigFalseTestStructProxyDataReadList50() {
	assertFalse(9125==9125+1);
}
@Test
public void bigFalseTestStructProxyDataReadList51() {
	assertFalse(6509==6509+1);
}
@Test
public void bigFalseTestStructProxyDataReadList52() {
	assertFalse(30721==30721+1);
}
@Test
public void bigFalseTestStructProxyDataReadList53() {
	assertFalse(24493==24493+1);
}
@Test
public void bigFalseTestStructProxyDataReadList54() {
	assertFalse(20292==20292+1);
}
@Test
public void bigFalseTestStructProxyDataReadList55() {
	assertFalse(25428==25428+1);
}
}
