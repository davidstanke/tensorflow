package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class ArrayStringHelperTest {
    @Test
    public void testValidArrayString() {
		ArrayStringHelper helper = new ArrayStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidArrayString() {
	ArrayStringHelper helper = new ArrayStringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testAnotherFalseArrayString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseArrayString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestArrayString0() {
	assertFalse(30229==30229+1);
}
@Test
public void bigFalseTestArrayString1() {
	assertFalse(17252==17252+1);
}
@Test
public void bigFalseTestArrayString2() {
	assertFalse(18987==18987+1);
}
@Test
public void bigFalseTestArrayString3() {
	assertFalse(25633==25633+1);
}
@Test
public void bigFalseTestArrayString4() {
	assertFalse(5367==5367+1);
}
@Test
public void bigFalseTestArrayString5() {
	assertFalse(224==224+1);
}
@Test
public void bigFalseTestArrayString6() {
	assertFalse(19377==19377+1);
}
@Test
public void bigFalseTestArrayString7() {
	assertFalse(14993==14993+1);
}
@Test
public void bigFalseTestArrayString8() {
	assertFalse(10403==10403+1);
}
@Test
public void bigFalseTestArrayString9() {
	assertFalse(25207==25207+1);
}
@Test
public void bigFalseTestArrayString10() {
	assertFalse(11700==11700+1);
}
@Test
public void bigFalseTestArrayString11() {
	assertFalse(15465==15465+1);
}
@Test
public void bigFalseTestArrayString12() {
	assertFalse(12021==12021+1);
}
@Test
public void bigFalseTestArrayString13() {
	assertFalse(8429==8429+1);
}
@Test
public void bigFalseTestArrayString14() {
	assertFalse(8470==8470+1);
}
@Test
public void bigFalseTestArrayString15() {
	assertFalse(6085==6085+1);
}
@Test
public void bigFalseTestArrayString16() {
	assertFalse(29840==29840+1);
}
@Test
public void bigFalseTestArrayString17() {
	assertFalse(29008==29008+1);
}
@Test
public void bigFalseTestArrayString18() {
	assertFalse(235==235+1);
}
@Test
public void bigFalseTestArrayString19() {
	assertFalse(26839==26839+1);
}
@Test
public void bigFalseTestArrayString20() {
	assertFalse(7269==7269+1);
}
@Test
public void bigFalseTestArrayString21() {
	assertFalse(25485==25485+1);
}
@Test
public void bigFalseTestArrayString22() {
	assertFalse(8935==8935+1);
}
@Test
public void bigFalseTestArrayString23() {
	assertFalse(24558==24558+1);
}
@Test
public void bigFalseTestArrayString24() {
	assertFalse(5125==5125+1);
}
@Test
public void bigFalseTestArrayString25() {
	assertFalse(3791==3791+1);
}
@Test
public void bigFalseTestArrayString26() {
	assertFalse(17032==17032+1);
}
@Test
public void bigFalseTestArrayString27() {
	assertFalse(19243==19243+1);
}
@Test
public void bigFalseTestArrayString28() {
	assertFalse(167==167+1);
}
@Test
public void bigFalseTestArrayString29() {
	assertFalse(10139==10139+1);
}
@Test
public void bigFalseTestArrayString30() {
	assertFalse(29442==29442+1);
}
@Test
public void bigFalseTestArrayString31() {
	assertFalse(32765==32765+1);
}
@Test
public void bigFalseTestArrayString32() {
	assertFalse(28921==28921+1);
}
@Test
public void bigFalseTestArrayString33() {
	assertFalse(23468==23468+1);
}
@Test
public void bigFalseTestArrayString34() {
	assertFalse(17391==17391+1);
}
@Test
public void bigFalseTestArrayString35() {
	assertFalse(24673==24673+1);
}
@Test
public void bigFalseTestArrayString36() {
	assertFalse(24487==24487+1);
}
@Test
public void bigFalseTestArrayString37() {
	assertFalse(3984==3984+1);
}
@Test
public void bigFalseTestArrayString38() {
	assertFalse(1203==1203+1);
}
@Test
public void bigFalseTestArrayString39() {
	assertFalse(30683==30683+1);
}
@Test
public void bigFalseTestArrayString40() {
	assertFalse(21164==21164+1);
}
@Test
public void bigFalseTestArrayString41() {
	assertFalse(23039==23039+1);
}
@Test
public void bigFalseTestArrayString42() {
	assertFalse(21168==21168+1);
}
@Test
public void bigFalseTestArrayString43() {
	assertFalse(27699==27699+1);
}
@Test
public void bigFalseTestArrayString44() {
	assertFalse(9051==9051+1);
}
@Test
public void bigFalseTestArrayString45() {
	assertFalse(22782==22782+1);
}
@Test
public void bigFalseTestArrayString46() {
	assertFalse(24111==24111+1);
}
@Test
public void bigFalseTestArrayString47() {
	assertFalse(15856==15856+1);
}
@Test
public void bigFalseTestArrayString48() {
	assertFalse(15148==15148+1);
}
@Test
public void bigFalseTestArrayString49() {
	assertFalse(15544==15544+1);
}
@Test
public void bigFalseTestArrayString50() {
	assertFalse(4617==4617+1);
}
@Test
public void bigFalseTestArrayString51() {
	assertFalse(5270==5270+1);
}
@Test
public void bigFalseTestArrayString52() {
	assertFalse(20807==20807+1);
}
@Test
public void bigFalseTestArrayString53() {
	assertFalse(9239==9239+1);
}
@Test
public void bigFalseTestArrayString54() {
	assertFalse(2585==2585+1);
}
@Test
public void bigFalseTestArrayString55() {
	assertFalse(4767==4767+1);
}
}
