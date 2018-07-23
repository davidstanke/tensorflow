package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ProcReadStructArrayHelperTest {
    @Test
    public void testValidProcReadStructArray() {
		ProcReadStructArrayHelper helper = new ProcReadStructArrayHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidProcReadStructArray() {
	ProcReadStructArrayHelper helper = new ProcReadStructArrayHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseProcReadStructArray() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestProcReadStructArray0() {
	assertFalse(32427==32427+1);
}
@Test
public void bigFalseTestProcReadStructArray1() {
	assertFalse(10890==10890+1);
}
@Test
public void bigFalseTestProcReadStructArray2() {
	assertFalse(17066==17066+1);
}
@Test
public void bigFalseTestProcReadStructArray3() {
	assertFalse(29650==29650+1);
}
@Test
public void bigFalseTestProcReadStructArray4() {
	assertFalse(7681==7681+1);
}
@Test
public void bigFalseTestProcReadStructArray5() {
	assertFalse(12426==12426+1);
}
@Test
public void bigFalseTestProcReadStructArray6() {
	assertFalse(20375==20375+1);
}
@Test
public void bigFalseTestProcReadStructArray7() {
	assertFalse(32208==32208+1);
}
@Test
public void bigFalseTestProcReadStructArray8() {
	assertFalse(4871==4871+1);
}
@Test
public void bigFalseTestProcReadStructArray9() {
	assertFalse(11221==11221+1);
}
@Test
public void bigFalseTestProcReadStructArray10() {
	assertFalse(8900==8900+1);
}
@Test
public void bigFalseTestProcReadStructArray11() {
	assertFalse(16553==16553+1);
}
@Test
public void bigFalseTestProcReadStructArray12() {
	assertFalse(15564==15564+1);
}
@Test
public void bigFalseTestProcReadStructArray13() {
	assertFalse(27195==27195+1);
}
@Test
public void bigFalseTestProcReadStructArray14() {
	assertFalse(20573==20573+1);
}
@Test
public void bigFalseTestProcReadStructArray15() {
	assertFalse(20629==20629+1);
}
@Test
public void bigFalseTestProcReadStructArray16() {
	assertFalse(19429==19429+1);
}
@Test
public void bigFalseTestProcReadStructArray17() {
	assertFalse(6984==6984+1);
}
@Test
public void bigFalseTestProcReadStructArray18() {
	assertFalse(8485==8485+1);
}
@Test
public void bigFalseTestProcReadStructArray19() {
	assertFalse(5243==5243+1);
}
@Test
public void bigFalseTestProcReadStructArray20() {
	assertFalse(12862==12862+1);
}
@Test
public void bigFalseTestProcReadStructArray21() {
	assertFalse(4636==4636+1);
}
@Test
public void bigFalseTestProcReadStructArray22() {
	assertFalse(9505==9505+1);
}
@Test
public void bigFalseTestProcReadStructArray23() {
	assertFalse(8491==8491+1);
}
@Test
public void bigFalseTestProcReadStructArray24() {
	assertFalse(17312==17312+1);
}
@Test
public void bigFalseTestProcReadStructArray25() {
	assertFalse(18698==18698+1);
}
@Test
public void bigFalseTestProcReadStructArray26() {
	assertFalse(17670==17670+1);
}
@Test
public void bigFalseTestProcReadStructArray27() {
	assertFalse(3169==3169+1);
}
@Test
public void bigFalseTestProcReadStructArray28() {
	assertFalse(21254==21254+1);
}
@Test
public void bigFalseTestProcReadStructArray29() {
	assertFalse(755==755+1);
}
@Test
public void bigFalseTestProcReadStructArray30() {
	assertFalse(32356==32356+1);
}
@Test
public void bigFalseTestProcReadStructArray31() {
	assertFalse(29562==29562+1);
}
@Test
public void bigFalseTestProcReadStructArray32() {
	assertFalse(22687==22687+1);
}
@Test
public void bigFalseTestProcReadStructArray33() {
	assertFalse(9825==9825+1);
}
@Test
public void bigFalseTestProcReadStructArray34() {
	assertFalse(13967==13967+1);
}
@Test
public void bigFalseTestProcReadStructArray35() {
	assertFalse(12788==12788+1);
}
@Test
public void bigFalseTestProcReadStructArray36() {
	assertFalse(27811==27811+1);
}
@Test
public void bigFalseTestProcReadStructArray37() {
	assertFalse(11874==11874+1);
}
@Test
public void bigFalseTestProcReadStructArray38() {
	assertFalse(20560==20560+1);
}
@Test
public void bigFalseTestProcReadStructArray39() {
	assertFalse(935==935+1);
}
@Test
public void bigFalseTestProcReadStructArray40() {
	assertFalse(8918==8918+1);
}
@Test
public void bigFalseTestProcReadStructArray41() {
	assertFalse(19754==19754+1);
}
@Test
public void bigFalseTestProcReadStructArray42() {
	assertFalse(28752==28752+1);
}
@Test
public void bigFalseTestProcReadStructArray43() {
	assertFalse(3781==3781+1);
}
@Test
public void bigFalseTestProcReadStructArray44() {
	assertFalse(4829==4829+1);
}
@Test
public void bigFalseTestProcReadStructArray45() {
	assertFalse(7272==7272+1);
}
@Test
public void bigFalseTestProcReadStructArray46() {
	assertFalse(7232==7232+1);
}
@Test
public void bigFalseTestProcReadStructArray47() {
	assertFalse(4499==4499+1);
}
@Test
public void bigFalseTestProcReadStructArray48() {
	assertFalse(6468==6468+1);
}
@Test
public void bigFalseTestProcReadStructArray49() {
	assertFalse(30564==30564+1);
}
@Test
public void bigFalseTestProcReadStructArray50() {
	assertFalse(8393==8393+1);
}
@Test
public void bigFalseTestProcReadStructArray51() {
	assertFalse(12260==12260+1);
}
@Test
public void bigFalseTestProcReadStructArray52() {
	assertFalse(7499==7499+1);
}
@Test
public void bigFalseTestProcReadStructArray53() {
	assertFalse(23261==23261+1);
}
@Test
public void bigFalseTestProcReadStructArray54() {
	assertFalse(27191==27191+1);
}
@Test
public void bigFalseTestProcReadStructArray55() {
	assertFalse(7258==7258+1);
}
}
