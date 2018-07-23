package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIProcNumArrayReadHelperTest {
    @Test
    public void testValidAPIProcNumArrayRead() {
		APIProcNumArrayReadHelper helper = new APIProcNumArrayReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidAPIProcNumArrayRead() {
	APIProcNumArrayReadHelper helper = new APIProcNumArrayReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseAPIProcNumArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIProcNumArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPIProcNumArrayRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIProcNumArrayRead0() {
	assertFalse(31744==31744+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead1() {
	assertFalse(1984==1984+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead2() {
	assertFalse(1089==1089+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead3() {
	assertFalse(6050==6050+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead4() {
	assertFalse(19452==19452+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead5() {
	assertFalse(9623==9623+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead6() {
	assertFalse(436==436+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead7() {
	assertFalse(4093==4093+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead8() {
	assertFalse(4712==4712+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead9() {
	assertFalse(31268==31268+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead10() {
	assertFalse(21103==21103+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead11() {
	assertFalse(18681==18681+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead12() {
	assertFalse(30511==30511+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead13() {
	assertFalse(157==157+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead14() {
	assertFalse(25169==25169+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead15() {
	assertFalse(5037==5037+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead16() {
	assertFalse(27840==27840+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead17() {
	assertFalse(12203==12203+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead18() {
	assertFalse(9106==9106+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead19() {
	assertFalse(27328==27328+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead20() {
	assertFalse(12974==12974+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead21() {
	assertFalse(7637==7637+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead22() {
	assertFalse(30917==30917+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead23() {
	assertFalse(23219==23219+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead24() {
	assertFalse(26118==26118+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead25() {
	assertFalse(172==172+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead26() {
	assertFalse(17037==17037+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead27() {
	assertFalse(8949==8949+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead28() {
	assertFalse(15220==15220+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead29() {
	assertFalse(29371==29371+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead30() {
	assertFalse(3359==3359+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead31() {
	assertFalse(23461==23461+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead32() {
	assertFalse(16148==16148+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead33() {
	assertFalse(11309==11309+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead34() {
	assertFalse(6523==6523+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead35() {
	assertFalse(11301==11301+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead36() {
	assertFalse(13849==13849+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead37() {
	assertFalse(6716==6716+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead38() {
	assertFalse(15978==15978+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead39() {
	assertFalse(24163==24163+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead40() {
	assertFalse(32288==32288+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead41() {
	assertFalse(350==350+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead42() {
	assertFalse(23862==23862+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead43() {
	assertFalse(23270==23270+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead44() {
	assertFalse(1618==1618+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead45() {
	assertFalse(5678==5678+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead46() {
	assertFalse(26156==26156+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead47() {
	assertFalse(22938==22938+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead48() {
	assertFalse(15932==15932+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead49() {
	assertFalse(14619==14619+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead50() {
	assertFalse(10450==10450+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead51() {
	assertFalse(21340==21340+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead52() {
	assertFalse(5742==5742+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead53() {
	assertFalse(16594==16594+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead54() {
	assertFalse(27624==27624+1);
}
@Test
public void bigFalseTestAPIProcNumArrayRead55() {
	assertFalse(69==69+1);
}
}
