package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructListIOReadLibHelperTest {
    @Test
    public void testValidStructListIOReadLib() {
		StructListIOReadLibHelper helper = new StructListIOReadLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructListIOReadLib() {
	StructListIOReadLibHelper helper = new StructListIOReadLibHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStructListIOReadLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStructListIOReadLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructListIOReadLib0() {
	assertFalse(23478==23478+1);
}
@Test
public void bigFalseTestStructListIOReadLib1() {
	assertFalse(10980==10980+1);
}
@Test
public void bigFalseTestStructListIOReadLib2() {
	assertFalse(9448==9448+1);
}
@Test
public void bigFalseTestStructListIOReadLib3() {
	assertFalse(6151==6151+1);
}
@Test
public void bigFalseTestStructListIOReadLib4() {
	assertFalse(12668==12668+1);
}
@Test
public void bigFalseTestStructListIOReadLib5() {
	assertFalse(29839==29839+1);
}
@Test
public void bigFalseTestStructListIOReadLib6() {
	assertFalse(18481==18481+1);
}
@Test
public void bigFalseTestStructListIOReadLib7() {
	assertFalse(11017==11017+1);
}
@Test
public void bigFalseTestStructListIOReadLib8() {
	assertFalse(22439==22439+1);
}
@Test
public void bigFalseTestStructListIOReadLib9() {
	assertFalse(17194==17194+1);
}
@Test
public void bigFalseTestStructListIOReadLib10() {
	assertFalse(27688==27688+1);
}
@Test
public void bigFalseTestStructListIOReadLib11() {
	assertFalse(29816==29816+1);
}
@Test
public void bigFalseTestStructListIOReadLib12() {
	assertFalse(4541==4541+1);
}
@Test
public void bigFalseTestStructListIOReadLib13() {
	assertFalse(8773==8773+1);
}
@Test
public void bigFalseTestStructListIOReadLib14() {
	assertFalse(4689==4689+1);
}
@Test
public void bigFalseTestStructListIOReadLib15() {
	assertFalse(25185==25185+1);
}
@Test
public void bigFalseTestStructListIOReadLib16() {
	assertFalse(4690==4690+1);
}
@Test
public void bigFalseTestStructListIOReadLib17() {
	assertFalse(11142==11142+1);
}
@Test
public void bigFalseTestStructListIOReadLib18() {
	assertFalse(16151==16151+1);
}
@Test
public void bigFalseTestStructListIOReadLib19() {
	assertFalse(2672==2672+1);
}
@Test
public void bigFalseTestStructListIOReadLib20() {
	assertFalse(16622==16622+1);
}
@Test
public void bigFalseTestStructListIOReadLib21() {
	assertFalse(13345==13345+1);
}
@Test
public void bigFalseTestStructListIOReadLib22() {
	assertFalse(8092==8092+1);
}
@Test
public void bigFalseTestStructListIOReadLib23() {
	assertFalse(27073==27073+1);
}
@Test
public void bigFalseTestStructListIOReadLib24() {
	assertFalse(29373==29373+1);
}
@Test
public void bigFalseTestStructListIOReadLib25() {
	assertFalse(22039==22039+1);
}
@Test
public void bigFalseTestStructListIOReadLib26() {
	assertFalse(16449==16449+1);
}
@Test
public void bigFalseTestStructListIOReadLib27() {
	assertFalse(18055==18055+1);
}
@Test
public void bigFalseTestStructListIOReadLib28() {
	assertFalse(505==505+1);
}
@Test
public void bigFalseTestStructListIOReadLib29() {
	assertFalse(20782==20782+1);
}
@Test
public void bigFalseTestStructListIOReadLib30() {
	assertFalse(8180==8180+1);
}
@Test
public void bigFalseTestStructListIOReadLib31() {
	assertFalse(3935==3935+1);
}
@Test
public void bigFalseTestStructListIOReadLib32() {
	assertFalse(28696==28696+1);
}
@Test
public void bigFalseTestStructListIOReadLib33() {
	assertFalse(32691==32691+1);
}
@Test
public void bigFalseTestStructListIOReadLib34() {
	assertFalse(11324==11324+1);
}
@Test
public void bigFalseTestStructListIOReadLib35() {
	assertFalse(21618==21618+1);
}
@Test
public void bigFalseTestStructListIOReadLib36() {
	assertFalse(32437==32437+1);
}
@Test
public void bigFalseTestStructListIOReadLib37() {
	assertFalse(23282==23282+1);
}
@Test
public void bigFalseTestStructListIOReadLib38() {
	assertFalse(29190==29190+1);
}
@Test
public void bigFalseTestStructListIOReadLib39() {
	assertFalse(13901==13901+1);
}
@Test
public void bigFalseTestStructListIOReadLib40() {
	assertFalse(27455==27455+1);
}
@Test
public void bigFalseTestStructListIOReadLib41() {
	assertFalse(19314==19314+1);
}
@Test
public void bigFalseTestStructListIOReadLib42() {
	assertFalse(3885==3885+1);
}
@Test
public void bigFalseTestStructListIOReadLib43() {
	assertFalse(26240==26240+1);
}
@Test
public void bigFalseTestStructListIOReadLib44() {
	assertFalse(14691==14691+1);
}
@Test
public void bigFalseTestStructListIOReadLib45() {
	assertFalse(16625==16625+1);
}
@Test
public void bigFalseTestStructListIOReadLib46() {
	assertFalse(12491==12491+1);
}
@Test
public void bigFalseTestStructListIOReadLib47() {
	assertFalse(5624==5624+1);
}
@Test
public void bigFalseTestStructListIOReadLib48() {
	assertFalse(14394==14394+1);
}
@Test
public void bigFalseTestStructListIOReadLib49() {
	assertFalse(20002==20002+1);
}
@Test
public void bigFalseTestStructListIOReadLib50() {
	assertFalse(10818==10818+1);
}
@Test
public void bigFalseTestStructListIOReadLib51() {
	assertFalse(27932==27932+1);
}
@Test
public void bigFalseTestStructListIOReadLib52() {
	assertFalse(11826==11826+1);
}
@Test
public void bigFalseTestStructListIOReadLib53() {
	assertFalse(17449==17449+1);
}
@Test
public void bigFalseTestStructListIOReadLib54() {
	assertFalse(28936==28936+1);
}
@Test
public void bigFalseTestStructListIOReadLib55() {
	assertFalse(27050==27050+1);
}
}
