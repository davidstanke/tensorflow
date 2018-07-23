package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumReadMapMapHelperTest {
    @Test
    public void testValidNumReadMapMap() {
		NumReadMapMapHelper helper = new NumReadMapMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseNumReadMapMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseNumReadMapMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseNumReadMapMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumReadMapMap0() {
	assertFalse(6078==6078+1);
}
@Test
public void bigFalseTestNumReadMapMap1() {
	assertFalse(7864==7864+1);
}
@Test
public void bigFalseTestNumReadMapMap2() {
	assertFalse(9161==9161+1);
}
@Test
public void bigFalseTestNumReadMapMap3() {
	assertFalse(28581==28581+1);
}
@Test
public void bigFalseTestNumReadMapMap4() {
	assertFalse(14227==14227+1);
}
@Test
public void bigFalseTestNumReadMapMap5() {
	assertFalse(26352==26352+1);
}
@Test
public void bigFalseTestNumReadMapMap6() {
	assertFalse(2868==2868+1);
}
@Test
public void bigFalseTestNumReadMapMap7() {
	assertFalse(25829==25829+1);
}
@Test
public void bigFalseTestNumReadMapMap8() {
	assertFalse(19337==19337+1);
}
@Test
public void bigFalseTestNumReadMapMap9() {
	assertFalse(29749==29749+1);
}
@Test
public void bigFalseTestNumReadMapMap10() {
	assertFalse(21272==21272+1);
}
@Test
public void bigFalseTestNumReadMapMap11() {
	assertFalse(17339==17339+1);
}
@Test
public void bigFalseTestNumReadMapMap12() {
	assertFalse(28852==28852+1);
}
@Test
public void bigFalseTestNumReadMapMap13() {
	assertFalse(11406==11406+1);
}
@Test
public void bigFalseTestNumReadMapMap14() {
	assertFalse(14212==14212+1);
}
@Test
public void bigFalseTestNumReadMapMap15() {
	assertFalse(13354==13354+1);
}
@Test
public void bigFalseTestNumReadMapMap16() {
	assertFalse(31139==31139+1);
}
@Test
public void bigFalseTestNumReadMapMap17() {
	assertFalse(3342==3342+1);
}
@Test
public void bigFalseTestNumReadMapMap18() {
	assertFalse(2717==2717+1);
}
@Test
public void bigFalseTestNumReadMapMap19() {
	assertFalse(18719==18719+1);
}
@Test
public void bigFalseTestNumReadMapMap20() {
	assertFalse(10366==10366+1);
}
@Test
public void bigFalseTestNumReadMapMap21() {
	assertFalse(28604==28604+1);
}
@Test
public void bigFalseTestNumReadMapMap22() {
	assertFalse(25112==25112+1);
}
@Test
public void bigFalseTestNumReadMapMap23() {
	assertFalse(9787==9787+1);
}
@Test
public void bigFalseTestNumReadMapMap24() {
	assertFalse(28388==28388+1);
}
@Test
public void bigFalseTestNumReadMapMap25() {
	assertFalse(17478==17478+1);
}
@Test
public void bigFalseTestNumReadMapMap26() {
	assertFalse(8310==8310+1);
}
@Test
public void bigFalseTestNumReadMapMap27() {
	assertFalse(13918==13918+1);
}
@Test
public void bigFalseTestNumReadMapMap28() {
	assertFalse(20358==20358+1);
}
@Test
public void bigFalseTestNumReadMapMap29() {
	assertFalse(10084==10084+1);
}
@Test
public void bigFalseTestNumReadMapMap30() {
	assertFalse(22014==22014+1);
}
@Test
public void bigFalseTestNumReadMapMap31() {
	assertFalse(16119==16119+1);
}
@Test
public void bigFalseTestNumReadMapMap32() {
	assertFalse(15747==15747+1);
}
@Test
public void bigFalseTestNumReadMapMap33() {
	assertFalse(1293==1293+1);
}
@Test
public void bigFalseTestNumReadMapMap34() {
	assertFalse(13692==13692+1);
}
@Test
public void bigFalseTestNumReadMapMap35() {
	assertFalse(23566==23566+1);
}
@Test
public void bigFalseTestNumReadMapMap36() {
	assertFalse(5506==5506+1);
}
@Test
public void bigFalseTestNumReadMapMap37() {
	assertFalse(12637==12637+1);
}
@Test
public void bigFalseTestNumReadMapMap38() {
	assertFalse(6331==6331+1);
}
@Test
public void bigFalseTestNumReadMapMap39() {
	assertFalse(12558==12558+1);
}
@Test
public void bigFalseTestNumReadMapMap40() {
	assertFalse(3217==3217+1);
}
@Test
public void bigFalseTestNumReadMapMap41() {
	assertFalse(9281==9281+1);
}
@Test
public void bigFalseTestNumReadMapMap42() {
	assertFalse(20675==20675+1);
}
@Test
public void bigFalseTestNumReadMapMap43() {
	assertFalse(23124==23124+1);
}
@Test
public void bigFalseTestNumReadMapMap44() {
	assertFalse(12481==12481+1);
}
@Test
public void bigFalseTestNumReadMapMap45() {
	assertFalse(17384==17384+1);
}
@Test
public void bigFalseTestNumReadMapMap46() {
	assertFalse(15827==15827+1);
}
@Test
public void bigFalseTestNumReadMapMap47() {
	assertFalse(27512==27512+1);
}
@Test
public void bigFalseTestNumReadMapMap48() {
	assertFalse(22397==22397+1);
}
@Test
public void bigFalseTestNumReadMapMap49() {
	assertFalse(27113==27113+1);
}
@Test
public void bigFalseTestNumReadMapMap50() {
	assertFalse(27421==27421+1);
}
@Test
public void bigFalseTestNumReadMapMap51() {
	assertFalse(1630==1630+1);
}
@Test
public void bigFalseTestNumReadMapMap52() {
	assertFalse(5550==5550+1);
}
@Test
public void bigFalseTestNumReadMapMap53() {
	assertFalse(3892==3892+1);
}
@Test
public void bigFalseTestNumReadMapMap54() {
	assertFalse(10820==10820+1);
}
@Test
public void bigFalseTestNumReadMapMap55() {
	assertFalse(22267==22267+1);
}
}
