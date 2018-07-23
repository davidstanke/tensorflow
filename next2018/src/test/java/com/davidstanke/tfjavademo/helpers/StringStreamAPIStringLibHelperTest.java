package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringStreamAPIStringLibHelperTest {
    @Test
    public void testValidStringStreamAPIStringLib() {
		StringStreamAPIStringLibHelper helper = new StringStreamAPIStringLibHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStringStreamAPIStringLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseStringStreamAPIStringLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStringStreamAPIStringLib() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStringStreamAPIStringLib0() {
	assertFalse(22370==22370+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib1() {
	assertFalse(4717==4717+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib2() {
	assertFalse(21873==21873+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib3() {
	assertFalse(32158==32158+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib4() {
	assertFalse(4338==4338+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib5() {
	assertFalse(1342==1342+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib6() {
	assertFalse(11421==11421+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib7() {
	assertFalse(22737==22737+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib8() {
	assertFalse(27155==27155+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib9() {
	assertFalse(29126==29126+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib10() {
	assertFalse(22037==22037+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib11() {
	assertFalse(29070==29070+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib12() {
	assertFalse(18997==18997+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib13() {
	assertFalse(9578==9578+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib14() {
	assertFalse(4696==4696+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib15() {
	assertFalse(23373==23373+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib16() {
	assertFalse(18463==18463+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib17() {
	assertFalse(3106==3106+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib18() {
	assertFalse(16393==16393+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib19() {
	assertFalse(18020==18020+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib20() {
	assertFalse(9203==9203+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib21() {
	assertFalse(26816==26816+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib22() {
	assertFalse(31814==31814+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib23() {
	assertFalse(20279==20279+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib24() {
	assertFalse(25830==25830+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib25() {
	assertFalse(17921==17921+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib26() {
	assertFalse(27848==27848+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib27() {
	assertFalse(5150==5150+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib28() {
	assertFalse(5819==5819+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib29() {
	assertFalse(27733==27733+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib30() {
	assertFalse(4031==4031+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib31() {
	assertFalse(15892==15892+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib32() {
	assertFalse(25348==25348+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib33() {
	assertFalse(26734==26734+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib34() {
	assertFalse(11627==11627+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib35() {
	assertFalse(26661==26661+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib36() {
	assertFalse(536==536+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib37() {
	assertFalse(28298==28298+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib38() {
	assertFalse(18298==18298+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib39() {
	assertFalse(4502==4502+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib40() {
	assertFalse(16339==16339+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib41() {
	assertFalse(9857==9857+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib42() {
	assertFalse(8741==8741+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib43() {
	assertFalse(1745==1745+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib44() {
	assertFalse(4112==4112+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib45() {
	assertFalse(11406==11406+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib46() {
	assertFalse(17161==17161+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib47() {
	assertFalse(27927==27927+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib48() {
	assertFalse(28391==28391+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib49() {
	assertFalse(21213==21213+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib50() {
	assertFalse(453==453+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib51() {
	assertFalse(23780==23780+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib52() {
	assertFalse(2215==2215+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib53() {
	assertFalse(28632==28632+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib54() {
	assertFalse(1625==1625+1);
}
@Test
public void bigFalseTestStringStreamAPIStringLib55() {
	assertFalse(14113==14113+1);
}
}
