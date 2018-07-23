package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructMapMapReadHelperTest {
    @Test
    public void testValidStructMapMapRead() {
		StructMapMapReadHelper helper = new StructMapMapReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructMapMapRead() {
	StructMapMapReadHelper helper = new StructMapMapReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStructMapMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStructMapMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructMapMapRead0() {
	assertFalse(1310==1310+1);
}
@Test
public void bigFalseTestStructMapMapRead1() {
	assertFalse(10596==10596+1);
}
@Test
public void bigFalseTestStructMapMapRead2() {
	assertFalse(31750==31750+1);
}
@Test
public void bigFalseTestStructMapMapRead3() {
	assertFalse(6316==6316+1);
}
@Test
public void bigFalseTestStructMapMapRead4() {
	assertFalse(14807==14807+1);
}
@Test
public void bigFalseTestStructMapMapRead5() {
	assertFalse(6547==6547+1);
}
@Test
public void bigFalseTestStructMapMapRead6() {
	assertFalse(15579==15579+1);
}
@Test
public void bigFalseTestStructMapMapRead7() {
	assertFalse(15853==15853+1);
}
@Test
public void bigFalseTestStructMapMapRead8() {
	assertFalse(14708==14708+1);
}
@Test
public void bigFalseTestStructMapMapRead9() {
	assertFalse(27907==27907+1);
}
@Test
public void bigFalseTestStructMapMapRead10() {
	assertFalse(2223==2223+1);
}
@Test
public void bigFalseTestStructMapMapRead11() {
	assertFalse(5436==5436+1);
}
@Test
public void bigFalseTestStructMapMapRead12() {
	assertFalse(21014==21014+1);
}
@Test
public void bigFalseTestStructMapMapRead13() {
	assertFalse(4059==4059+1);
}
@Test
public void bigFalseTestStructMapMapRead14() {
	assertFalse(32432==32432+1);
}
@Test
public void bigFalseTestStructMapMapRead15() {
	assertFalse(14716==14716+1);
}
@Test
public void bigFalseTestStructMapMapRead16() {
	assertFalse(24563==24563+1);
}
@Test
public void bigFalseTestStructMapMapRead17() {
	assertFalse(16281==16281+1);
}
@Test
public void bigFalseTestStructMapMapRead18() {
	assertFalse(17==17+1);
}
@Test
public void bigFalseTestStructMapMapRead19() {
	assertFalse(14139==14139+1);
}
@Test
public void bigFalseTestStructMapMapRead20() {
	assertFalse(31204==31204+1);
}
@Test
public void bigFalseTestStructMapMapRead21() {
	assertFalse(10922==10922+1);
}
@Test
public void bigFalseTestStructMapMapRead22() {
	assertFalse(11633==11633+1);
}
@Test
public void bigFalseTestStructMapMapRead23() {
	assertFalse(23472==23472+1);
}
@Test
public void bigFalseTestStructMapMapRead24() {
	assertFalse(23212==23212+1);
}
@Test
public void bigFalseTestStructMapMapRead25() {
	assertFalse(28108==28108+1);
}
@Test
public void bigFalseTestStructMapMapRead26() {
	assertFalse(20235==20235+1);
}
@Test
public void bigFalseTestStructMapMapRead27() {
	assertFalse(30579==30579+1);
}
@Test
public void bigFalseTestStructMapMapRead28() {
	assertFalse(4873==4873+1);
}
@Test
public void bigFalseTestStructMapMapRead29() {
	assertFalse(2852==2852+1);
}
@Test
public void bigFalseTestStructMapMapRead30() {
	assertFalse(5027==5027+1);
}
@Test
public void bigFalseTestStructMapMapRead31() {
	assertFalse(4350==4350+1);
}
@Test
public void bigFalseTestStructMapMapRead32() {
	assertFalse(20605==20605+1);
}
@Test
public void bigFalseTestStructMapMapRead33() {
	assertFalse(14110==14110+1);
}
@Test
public void bigFalseTestStructMapMapRead34() {
	assertFalse(21036==21036+1);
}
@Test
public void bigFalseTestStructMapMapRead35() {
	assertFalse(17127==17127+1);
}
@Test
public void bigFalseTestStructMapMapRead36() {
	assertFalse(17625==17625+1);
}
@Test
public void bigFalseTestStructMapMapRead37() {
	assertFalse(5897==5897+1);
}
@Test
public void bigFalseTestStructMapMapRead38() {
	assertFalse(14906==14906+1);
}
@Test
public void bigFalseTestStructMapMapRead39() {
	assertFalse(16859==16859+1);
}
@Test
public void bigFalseTestStructMapMapRead40() {
	assertFalse(31374==31374+1);
}
@Test
public void bigFalseTestStructMapMapRead41() {
	assertFalse(19822==19822+1);
}
@Test
public void bigFalseTestStructMapMapRead42() {
	assertFalse(7978==7978+1);
}
@Test
public void bigFalseTestStructMapMapRead43() {
	assertFalse(18010==18010+1);
}
@Test
public void bigFalseTestStructMapMapRead44() {
	assertFalse(8627==8627+1);
}
@Test
public void bigFalseTestStructMapMapRead45() {
	assertFalse(28723==28723+1);
}
@Test
public void bigFalseTestStructMapMapRead46() {
	assertFalse(18963==18963+1);
}
@Test
public void bigFalseTestStructMapMapRead47() {
	assertFalse(22068==22068+1);
}
@Test
public void bigFalseTestStructMapMapRead48() {
	assertFalse(8662==8662+1);
}
@Test
public void bigFalseTestStructMapMapRead49() {
	assertFalse(17524==17524+1);
}
@Test
public void bigFalseTestStructMapMapRead50() {
	assertFalse(32363==32363+1);
}
@Test
public void bigFalseTestStructMapMapRead51() {
	assertFalse(10695==10695+1);
}
@Test
public void bigFalseTestStructMapMapRead52() {
	assertFalse(31875==31875+1);
}
@Test
public void bigFalseTestStructMapMapRead53() {
	assertFalse(23581==23581+1);
}
@Test
public void bigFalseTestStructMapMapRead54() {
	assertFalse(7545==7545+1);
}
@Test
public void bigFalseTestStructMapMapRead55() {
	assertFalse(10486==10486+1);
}
}
