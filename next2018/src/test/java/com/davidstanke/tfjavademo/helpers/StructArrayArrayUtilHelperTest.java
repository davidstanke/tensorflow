package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StructArrayArrayUtilHelperTest {
    @Test
    public void testValidStructArrayArrayUtil() {
		StructArrayArrayUtilHelper helper = new StructArrayArrayUtilHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidStructArrayArrayUtil() {
	StructArrayArrayUtilHelper helper = new StructArrayArrayUtilHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseStructArrayArrayUtil() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStructArrayArrayUtil0() {
	assertFalse(19238==19238+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil1() {
	assertFalse(16913==16913+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil2() {
	assertFalse(21072==21072+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil3() {
	assertFalse(23246==23246+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil4() {
	assertFalse(23367==23367+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil5() {
	assertFalse(4127==4127+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil6() {
	assertFalse(1374==1374+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil7() {
	assertFalse(27585==27585+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil8() {
	assertFalse(5325==5325+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil9() {
	assertFalse(22520==22520+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil10() {
	assertFalse(18645==18645+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil11() {
	assertFalse(13513==13513+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil12() {
	assertFalse(28382==28382+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil13() {
	assertFalse(27307==27307+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil14() {
	assertFalse(9018==9018+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil15() {
	assertFalse(2311==2311+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil16() {
	assertFalse(11026==11026+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil17() {
	assertFalse(17057==17057+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil18() {
	assertFalse(11173==11173+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil19() {
	assertFalse(25532==25532+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil20() {
	assertFalse(27106==27106+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil21() {
	assertFalse(7579==7579+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil22() {
	assertFalse(25096==25096+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil23() {
	assertFalse(10408==10408+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil24() {
	assertFalse(6607==6607+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil25() {
	assertFalse(14957==14957+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil26() {
	assertFalse(16448==16448+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil27() {
	assertFalse(3619==3619+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil28() {
	assertFalse(11602==11602+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil29() {
	assertFalse(13948==13948+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil30() {
	assertFalse(20446==20446+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil31() {
	assertFalse(3324==3324+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil32() {
	assertFalse(17286==17286+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil33() {
	assertFalse(18168==18168+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil34() {
	assertFalse(20658==20658+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil35() {
	assertFalse(29205==29205+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil36() {
	assertFalse(12183==12183+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil37() {
	assertFalse(18906==18906+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil38() {
	assertFalse(15387==15387+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil39() {
	assertFalse(28091==28091+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil40() {
	assertFalse(2794==2794+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil41() {
	assertFalse(27293==27293+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil42() {
	assertFalse(12561==12561+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil43() {
	assertFalse(15558==15558+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil44() {
	assertFalse(15882==15882+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil45() {
	assertFalse(22204==22204+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil46() {
	assertFalse(5359==5359+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil47() {
	assertFalse(18292==18292+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil48() {
	assertFalse(11350==11350+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil49() {
	assertFalse(15854==15854+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil50() {
	assertFalse(29953==29953+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil51() {
	assertFalse(20998==20998+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil52() {
	assertFalse(28267==28267+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil53() {
	assertFalse(6692==6692+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil54() {
	assertFalse(29906==29906+1);
}
@Test
public void bigFalseTestStructArrayArrayUtil55() {
	assertFalse(6936==6936+1);
}
}
