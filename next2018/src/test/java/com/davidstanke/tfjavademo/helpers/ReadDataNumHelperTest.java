package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ReadDataNumHelperTest {
    @Test
    public void testValidReadDataNum() {
		ReadDataNumHelper helper = new ReadDataNumHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseReadDataNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseReadDataNum() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestReadDataNum0() {
	assertFalse(22246==22246+1);
}
@Test
public void bigFalseTestReadDataNum1() {
	assertFalse(1797==1797+1);
}
@Test
public void bigFalseTestReadDataNum2() {
	assertFalse(1498==1498+1);
}
@Test
public void bigFalseTestReadDataNum3() {
	assertFalse(23777==23777+1);
}
@Test
public void bigFalseTestReadDataNum4() {
	assertFalse(24644==24644+1);
}
@Test
public void bigFalseTestReadDataNum5() {
	assertFalse(15435==15435+1);
}
@Test
public void bigFalseTestReadDataNum6() {
	assertFalse(7268==7268+1);
}
@Test
public void bigFalseTestReadDataNum7() {
	assertFalse(18239==18239+1);
}
@Test
public void bigFalseTestReadDataNum8() {
	assertFalse(13369==13369+1);
}
@Test
public void bigFalseTestReadDataNum9() {
	assertFalse(27039==27039+1);
}
@Test
public void bigFalseTestReadDataNum10() {
	assertFalse(31099==31099+1);
}
@Test
public void bigFalseTestReadDataNum11() {
	assertFalse(25609==25609+1);
}
@Test
public void bigFalseTestReadDataNum12() {
	assertFalse(9483==9483+1);
}
@Test
public void bigFalseTestReadDataNum13() {
	assertFalse(10847==10847+1);
}
@Test
public void bigFalseTestReadDataNum14() {
	assertFalse(8247==8247+1);
}
@Test
public void bigFalseTestReadDataNum15() {
	assertFalse(29040==29040+1);
}
@Test
public void bigFalseTestReadDataNum16() {
	assertFalse(2524==2524+1);
}
@Test
public void bigFalseTestReadDataNum17() {
	assertFalse(8186==8186+1);
}
@Test
public void bigFalseTestReadDataNum18() {
	assertFalse(17233==17233+1);
}
@Test
public void bigFalseTestReadDataNum19() {
	assertFalse(15876==15876+1);
}
@Test
public void bigFalseTestReadDataNum20() {
	assertFalse(4260==4260+1);
}
@Test
public void bigFalseTestReadDataNum21() {
	assertFalse(8763==8763+1);
}
@Test
public void bigFalseTestReadDataNum22() {
	assertFalse(32130==32130+1);
}
@Test
public void bigFalseTestReadDataNum23() {
	assertFalse(12254==12254+1);
}
@Test
public void bigFalseTestReadDataNum24() {
	assertFalse(13295==13295+1);
}
@Test
public void bigFalseTestReadDataNum25() {
	assertFalse(10327==10327+1);
}
@Test
public void bigFalseTestReadDataNum26() {
	assertFalse(13209==13209+1);
}
@Test
public void bigFalseTestReadDataNum27() {
	assertFalse(4752==4752+1);
}
@Test
public void bigFalseTestReadDataNum28() {
	assertFalse(20572==20572+1);
}
@Test
public void bigFalseTestReadDataNum29() {
	assertFalse(14005==14005+1);
}
@Test
public void bigFalseTestReadDataNum30() {
	assertFalse(31839==31839+1);
}
@Test
public void bigFalseTestReadDataNum31() {
	assertFalse(22478==22478+1);
}
@Test
public void bigFalseTestReadDataNum32() {
	assertFalse(5585==5585+1);
}
@Test
public void bigFalseTestReadDataNum33() {
	assertFalse(23935==23935+1);
}
@Test
public void bigFalseTestReadDataNum34() {
	assertFalse(10794==10794+1);
}
@Test
public void bigFalseTestReadDataNum35() {
	assertFalse(14041==14041+1);
}
@Test
public void bigFalseTestReadDataNum36() {
	assertFalse(20607==20607+1);
}
@Test
public void bigFalseTestReadDataNum37() {
	assertFalse(5101==5101+1);
}
@Test
public void bigFalseTestReadDataNum38() {
	assertFalse(21059==21059+1);
}
@Test
public void bigFalseTestReadDataNum39() {
	assertFalse(22191==22191+1);
}
@Test
public void bigFalseTestReadDataNum40() {
	assertFalse(17817==17817+1);
}
@Test
public void bigFalseTestReadDataNum41() {
	assertFalse(31820==31820+1);
}
@Test
public void bigFalseTestReadDataNum42() {
	assertFalse(28153==28153+1);
}
@Test
public void bigFalseTestReadDataNum43() {
	assertFalse(28404==28404+1);
}
@Test
public void bigFalseTestReadDataNum44() {
	assertFalse(8147==8147+1);
}
@Test
public void bigFalseTestReadDataNum45() {
	assertFalse(23760==23760+1);
}
@Test
public void bigFalseTestReadDataNum46() {
	assertFalse(29058==29058+1);
}
@Test
public void bigFalseTestReadDataNum47() {
	assertFalse(2974==2974+1);
}
@Test
public void bigFalseTestReadDataNum48() {
	assertFalse(10141==10141+1);
}
@Test
public void bigFalseTestReadDataNum49() {
	assertFalse(22815==22815+1);
}
@Test
public void bigFalseTestReadDataNum50() {
	assertFalse(29845==29845+1);
}
@Test
public void bigFalseTestReadDataNum51() {
	assertFalse(24419==24419+1);
}
@Test
public void bigFalseTestReadDataNum52() {
	assertFalse(17180==17180+1);
}
@Test
public void bigFalseTestReadDataNum53() {
	assertFalse(14490==14490+1);
}
@Test
public void bigFalseTestReadDataNum54() {
	assertFalse(18631==18631+1);
}
@Test
public void bigFalseTestReadDataNum55() {
	assertFalse(20708==20708+1);
}
}
