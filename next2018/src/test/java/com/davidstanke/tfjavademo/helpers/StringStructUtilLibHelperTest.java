package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringStructUtilLibHelperTest {
    @Test
    public void testValidStringStructUtilLib() {
		StringStructUtilLibHelper helper = new StringStructUtilLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStringStructUtilLib() {
	StringStructUtilLibHelper helper = new StringStructUtilLibHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStringStructUtilLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringStructUtilLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStringStructUtilLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringStructUtilLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringStructUtilLib0() {
	assertFalse(14839==14839+1);
}
@Test
public void bigFalseTestStringStructUtilLib1() {
	assertFalse(15222==15222+1);
}
@Test
public void bigFalseTestStringStructUtilLib2() {
	assertFalse(27106==27106+1);
}
@Test
public void bigFalseTestStringStructUtilLib3() {
	assertFalse(31597==31597+1);
}
@Test
public void bigFalseTestStringStructUtilLib4() {
	assertFalse(28959==28959+1);
}
@Test
public void bigFalseTestStringStructUtilLib5() {
	assertFalse(17049==17049+1);
}
@Test
public void bigFalseTestStringStructUtilLib6() {
	assertFalse(3370==3370+1);
}
@Test
public void bigFalseTestStringStructUtilLib7() {
	assertFalse(7427==7427+1);
}
@Test
public void bigFalseTestStringStructUtilLib8() {
	assertFalse(15376==15376+1);
}
@Test
public void bigFalseTestStringStructUtilLib9() {
	assertFalse(18954==18954+1);
}
@Test
public void bigFalseTestStringStructUtilLib10() {
	assertFalse(20106==20106+1);
}
@Test
public void bigFalseTestStringStructUtilLib11() {
	assertFalse(14506==14506+1);
}
@Test
public void bigFalseTestStringStructUtilLib12() {
	assertFalse(24129==24129+1);
}
@Test
public void bigFalseTestStringStructUtilLib13() {
	assertFalse(23859==23859+1);
}
@Test
public void bigFalseTestStringStructUtilLib14() {
	assertFalse(4373==4373+1);
}
@Test
public void bigFalseTestStringStructUtilLib15() {
	assertFalse(8740==8740+1);
}
@Test
public void bigFalseTestStringStructUtilLib16() {
	assertFalse(26427==26427+1);
}
@Test
public void bigFalseTestStringStructUtilLib17() {
	assertFalse(19306==19306+1);
}
@Test
public void bigFalseTestStringStructUtilLib18() {
	assertFalse(5272==5272+1);
}
@Test
public void bigFalseTestStringStructUtilLib19() {
	assertFalse(3891==3891+1);
}
@Test
public void bigFalseTestStringStructUtilLib20() {
	assertFalse(18075==18075+1);
}
@Test
public void bigFalseTestStringStructUtilLib21() {
	assertFalse(22799==22799+1);
}
@Test
public void bigFalseTestStringStructUtilLib22() {
	assertFalse(26247==26247+1);
}
@Test
public void bigFalseTestStringStructUtilLib23() {
	assertFalse(5146==5146+1);
}
@Test
public void bigFalseTestStringStructUtilLib24() {
	assertFalse(5350==5350+1);
}
@Test
public void bigFalseTestStringStructUtilLib25() {
	assertFalse(26216==26216+1);
}
@Test
public void bigFalseTestStringStructUtilLib26() {
	assertFalse(30120==30120+1);
}
@Test
public void bigFalseTestStringStructUtilLib27() {
	assertFalse(27610==27610+1);
}
@Test
public void bigFalseTestStringStructUtilLib28() {
	assertFalse(7441==7441+1);
}
@Test
public void bigFalseTestStringStructUtilLib29() {
	assertFalse(10300==10300+1);
}
@Test
public void bigFalseTestStringStructUtilLib30() {
	assertFalse(13441==13441+1);
}
@Test
public void bigFalseTestStringStructUtilLib31() {
	assertFalse(2089==2089+1);
}
@Test
public void bigFalseTestStringStructUtilLib32() {
	assertFalse(29387==29387+1);
}
@Test
public void bigFalseTestStringStructUtilLib33() {
	assertFalse(20017==20017+1);
}
@Test
public void bigFalseTestStringStructUtilLib34() {
	assertFalse(30339==30339+1);
}
@Test
public void bigFalseTestStringStructUtilLib35() {
	assertFalse(9522==9522+1);
}
@Test
public void bigFalseTestStringStructUtilLib36() {
	assertFalse(8592==8592+1);
}
@Test
public void bigFalseTestStringStructUtilLib37() {
	assertFalse(13029==13029+1);
}
@Test
public void bigFalseTestStringStructUtilLib38() {
	assertFalse(29683==29683+1);
}
@Test
public void bigFalseTestStringStructUtilLib39() {
	assertFalse(23824==23824+1);
}
@Test
public void bigFalseTestStringStructUtilLib40() {
	assertFalse(16494==16494+1);
}
@Test
public void bigFalseTestStringStructUtilLib41() {
	assertFalse(29135==29135+1);
}
@Test
public void bigFalseTestStringStructUtilLib42() {
	assertFalse(8348==8348+1);
}
@Test
public void bigFalseTestStringStructUtilLib43() {
	assertFalse(30472==30472+1);
}
@Test
public void bigFalseTestStringStructUtilLib44() {
	assertFalse(30358==30358+1);
}
@Test
public void bigFalseTestStringStructUtilLib45() {
	assertFalse(32468==32468+1);
}
@Test
public void bigFalseTestStringStructUtilLib46() {
	assertFalse(16694==16694+1);
}
@Test
public void bigFalseTestStringStructUtilLib47() {
	assertFalse(28296==28296+1);
}
@Test
public void bigFalseTestStringStructUtilLib48() {
	assertFalse(15522==15522+1);
}
@Test
public void bigFalseTestStringStructUtilLib49() {
	assertFalse(7081==7081+1);
}
@Test
public void bigFalseTestStringStructUtilLib50() {
	assertFalse(27540==27540+1);
}
@Test
public void bigFalseTestStringStructUtilLib51() {
	assertFalse(28131==28131+1);
}
@Test
public void bigFalseTestStringStructUtilLib52() {
	assertFalse(26280==26280+1);
}
@Test
public void bigFalseTestStringStructUtilLib53() {
	assertFalse(18155==18155+1);
}
@Test
public void bigFalseTestStringStructUtilLib54() {
	assertFalse(23953==23953+1);
}
@Test
public void bigFalseTestStringStructUtilLib55() {
	assertFalse(14538==14538+1);
}
}
