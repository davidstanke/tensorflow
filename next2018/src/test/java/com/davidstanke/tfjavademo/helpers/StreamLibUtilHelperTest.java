package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamLibUtilHelperTest {
    @Test
    public void testValidStreamLibUtil() {
		StreamLibUtilHelper helper = new StreamLibUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStreamLibUtil() {
	StreamLibUtilHelper helper = new StreamLibUtilHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseStreamLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStreamLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStreamLibUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamLibUtil0() {
	assertFalse(7020==7020+1);
}
@Test
public void bigFalseTestStreamLibUtil1() {
	assertFalse(27537==27537+1);
}
@Test
public void bigFalseTestStreamLibUtil2() {
	assertFalse(1096==1096+1);
}
@Test
public void bigFalseTestStreamLibUtil3() {
	assertFalse(8312==8312+1);
}
@Test
public void bigFalseTestStreamLibUtil4() {
	assertFalse(26471==26471+1);
}
@Test
public void bigFalseTestStreamLibUtil5() {
	assertFalse(9571==9571+1);
}
@Test
public void bigFalseTestStreamLibUtil6() {
	assertFalse(7420==7420+1);
}
@Test
public void bigFalseTestStreamLibUtil7() {
	assertFalse(3500==3500+1);
}
@Test
public void bigFalseTestStreamLibUtil8() {
	assertFalse(9763==9763+1);
}
@Test
public void bigFalseTestStreamLibUtil9() {
	assertFalse(32053==32053+1);
}
@Test
public void bigFalseTestStreamLibUtil10() {
	assertFalse(12339==12339+1);
}
@Test
public void bigFalseTestStreamLibUtil11() {
	assertFalse(22278==22278+1);
}
@Test
public void bigFalseTestStreamLibUtil12() {
	assertFalse(3717==3717+1);
}
@Test
public void bigFalseTestStreamLibUtil13() {
	assertFalse(11045==11045+1);
}
@Test
public void bigFalseTestStreamLibUtil14() {
	assertFalse(3520==3520+1);
}
@Test
public void bigFalseTestStreamLibUtil15() {
	assertFalse(25843==25843+1);
}
@Test
public void bigFalseTestStreamLibUtil16() {
	assertFalse(13694==13694+1);
}
@Test
public void bigFalseTestStreamLibUtil17() {
	assertFalse(27125==27125+1);
}
@Test
public void bigFalseTestStreamLibUtil18() {
	assertFalse(29942==29942+1);
}
@Test
public void bigFalseTestStreamLibUtil19() {
	assertFalse(1480==1480+1);
}
@Test
public void bigFalseTestStreamLibUtil20() {
	assertFalse(17637==17637+1);
}
@Test
public void bigFalseTestStreamLibUtil21() {
	assertFalse(23228==23228+1);
}
@Test
public void bigFalseTestStreamLibUtil22() {
	assertFalse(27878==27878+1);
}
@Test
public void bigFalseTestStreamLibUtil23() {
	assertFalse(18249==18249+1);
}
@Test
public void bigFalseTestStreamLibUtil24() {
	assertFalse(17423==17423+1);
}
@Test
public void bigFalseTestStreamLibUtil25() {
	assertFalse(30545==30545+1);
}
@Test
public void bigFalseTestStreamLibUtil26() {
	assertFalse(25687==25687+1);
}
@Test
public void bigFalseTestStreamLibUtil27() {
	assertFalse(23799==23799+1);
}
@Test
public void bigFalseTestStreamLibUtil28() {
	assertFalse(20020==20020+1);
}
@Test
public void bigFalseTestStreamLibUtil29() {
	assertFalse(16242==16242+1);
}
@Test
public void bigFalseTestStreamLibUtil30() {
	assertFalse(21890==21890+1);
}
@Test
public void bigFalseTestStreamLibUtil31() {
	assertFalse(7965==7965+1);
}
@Test
public void bigFalseTestStreamLibUtil32() {
	assertFalse(21121==21121+1);
}
@Test
public void bigFalseTestStreamLibUtil33() {
	assertFalse(3256==3256+1);
}
@Test
public void bigFalseTestStreamLibUtil34() {
	assertFalse(27026==27026+1);
}
@Test
public void bigFalseTestStreamLibUtil35() {
	assertFalse(28313==28313+1);
}
@Test
public void bigFalseTestStreamLibUtil36() {
	assertFalse(14844==14844+1);
}
@Test
public void bigFalseTestStreamLibUtil37() {
	assertFalse(14651==14651+1);
}
@Test
public void bigFalseTestStreamLibUtil38() {
	assertFalse(22494==22494+1);
}
@Test
public void bigFalseTestStreamLibUtil39() {
	assertFalse(2411==2411+1);
}
@Test
public void bigFalseTestStreamLibUtil40() {
	assertFalse(3868==3868+1);
}
@Test
public void bigFalseTestStreamLibUtil41() {
	assertFalse(1285==1285+1);
}
@Test
public void bigFalseTestStreamLibUtil42() {
	assertFalse(31972==31972+1);
}
@Test
public void bigFalseTestStreamLibUtil43() {
	assertFalse(7167==7167+1);
}
@Test
public void bigFalseTestStreamLibUtil44() {
	assertFalse(804==804+1);
}
@Test
public void bigFalseTestStreamLibUtil45() {
	assertFalse(26167==26167+1);
}
@Test
public void bigFalseTestStreamLibUtil46() {
	assertFalse(25861==25861+1);
}
@Test
public void bigFalseTestStreamLibUtil47() {
	assertFalse(6970==6970+1);
}
@Test
public void bigFalseTestStreamLibUtil48() {
	assertFalse(27971==27971+1);
}
@Test
public void bigFalseTestStreamLibUtil49() {
	assertFalse(12285==12285+1);
}
@Test
public void bigFalseTestStreamLibUtil50() {
	assertFalse(18179==18179+1);
}
@Test
public void bigFalseTestStreamLibUtil51() {
	assertFalse(13126==13126+1);
}
@Test
public void bigFalseTestStreamLibUtil52() {
	assertFalse(8045==8045+1);
}
@Test
public void bigFalseTestStreamLibUtil53() {
	assertFalse(15411==15411+1);
}
@Test
public void bigFalseTestStreamLibUtil54() {
	assertFalse(10810==10810+1);
}
@Test
public void bigFalseTestStreamLibUtil55() {
	assertFalse(22302==22302+1);
}
}
