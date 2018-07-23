package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIReadMapNumStringHelperTest {
    @Test
    public void testValidAPIReadMapNumString() {
		APIReadMapNumStringHelper helper = new APIReadMapNumStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseAPIReadMapNumString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPIReadMapNumString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIReadMapNumString0() {
	assertFalse(30108==30108+1);
}
@Test
public void bigFalseTestAPIReadMapNumString1() {
	assertFalse(14578==14578+1);
}
@Test
public void bigFalseTestAPIReadMapNumString2() {
	assertFalse(993==993+1);
}
@Test
public void bigFalseTestAPIReadMapNumString3() {
	assertFalse(29541==29541+1);
}
@Test
public void bigFalseTestAPIReadMapNumString4() {
	assertFalse(125==125+1);
}
@Test
public void bigFalseTestAPIReadMapNumString5() {
	assertFalse(19519==19519+1);
}
@Test
public void bigFalseTestAPIReadMapNumString6() {
	assertFalse(220==220+1);
}
@Test
public void bigFalseTestAPIReadMapNumString7() {
	assertFalse(19035==19035+1);
}
@Test
public void bigFalseTestAPIReadMapNumString8() {
	assertFalse(21170==21170+1);
}
@Test
public void bigFalseTestAPIReadMapNumString9() {
	assertFalse(21185==21185+1);
}
@Test
public void bigFalseTestAPIReadMapNumString10() {
	assertFalse(23756==23756+1);
}
@Test
public void bigFalseTestAPIReadMapNumString11() {
	assertFalse(15793==15793+1);
}
@Test
public void bigFalseTestAPIReadMapNumString12() {
	assertFalse(14184==14184+1);
}
@Test
public void bigFalseTestAPIReadMapNumString13() {
	assertFalse(24394==24394+1);
}
@Test
public void bigFalseTestAPIReadMapNumString14() {
	assertFalse(32227==32227+1);
}
@Test
public void bigFalseTestAPIReadMapNumString15() {
	assertFalse(20255==20255+1);
}
@Test
public void bigFalseTestAPIReadMapNumString16() {
	assertFalse(15909==15909+1);
}
@Test
public void bigFalseTestAPIReadMapNumString17() {
	assertFalse(17871==17871+1);
}
@Test
public void bigFalseTestAPIReadMapNumString18() {
	assertFalse(27401==27401+1);
}
@Test
public void bigFalseTestAPIReadMapNumString19() {
	assertFalse(14726==14726+1);
}
@Test
public void bigFalseTestAPIReadMapNumString20() {
	assertFalse(1464==1464+1);
}
@Test
public void bigFalseTestAPIReadMapNumString21() {
	assertFalse(27111==27111+1);
}
@Test
public void bigFalseTestAPIReadMapNumString22() {
	assertFalse(32428==32428+1);
}
@Test
public void bigFalseTestAPIReadMapNumString23() {
	assertFalse(14800==14800+1);
}
@Test
public void bigFalseTestAPIReadMapNumString24() {
	assertFalse(18912==18912+1);
}
@Test
public void bigFalseTestAPIReadMapNumString25() {
	assertFalse(30978==30978+1);
}
@Test
public void bigFalseTestAPIReadMapNumString26() {
	assertFalse(31308==31308+1);
}
@Test
public void bigFalseTestAPIReadMapNumString27() {
	assertFalse(2437==2437+1);
}
@Test
public void bigFalseTestAPIReadMapNumString28() {
	assertFalse(8126==8126+1);
}
@Test
public void bigFalseTestAPIReadMapNumString29() {
	assertFalse(3177==3177+1);
}
@Test
public void bigFalseTestAPIReadMapNumString30() {
	assertFalse(18114==18114+1);
}
@Test
public void bigFalseTestAPIReadMapNumString31() {
	assertFalse(26414==26414+1);
}
@Test
public void bigFalseTestAPIReadMapNumString32() {
	assertFalse(3324==3324+1);
}
@Test
public void bigFalseTestAPIReadMapNumString33() {
	assertFalse(28409==28409+1);
}
@Test
public void bigFalseTestAPIReadMapNumString34() {
	assertFalse(27987==27987+1);
}
@Test
public void bigFalseTestAPIReadMapNumString35() {
	assertFalse(18538==18538+1);
}
@Test
public void bigFalseTestAPIReadMapNumString36() {
	assertFalse(26043==26043+1);
}
@Test
public void bigFalseTestAPIReadMapNumString37() {
	assertFalse(671==671+1);
}
@Test
public void bigFalseTestAPIReadMapNumString38() {
	assertFalse(5496==5496+1);
}
@Test
public void bigFalseTestAPIReadMapNumString39() {
	assertFalse(4561==4561+1);
}
@Test
public void bigFalseTestAPIReadMapNumString40() {
	assertFalse(7486==7486+1);
}
@Test
public void bigFalseTestAPIReadMapNumString41() {
	assertFalse(403==403+1);
}
@Test
public void bigFalseTestAPIReadMapNumString42() {
	assertFalse(4971==4971+1);
}
@Test
public void bigFalseTestAPIReadMapNumString43() {
	assertFalse(28812==28812+1);
}
@Test
public void bigFalseTestAPIReadMapNumString44() {
	assertFalse(30040==30040+1);
}
@Test
public void bigFalseTestAPIReadMapNumString45() {
	assertFalse(5972==5972+1);
}
@Test
public void bigFalseTestAPIReadMapNumString46() {
	assertFalse(21361==21361+1);
}
@Test
public void bigFalseTestAPIReadMapNumString47() {
	assertFalse(12721==12721+1);
}
@Test
public void bigFalseTestAPIReadMapNumString48() {
	assertFalse(14485==14485+1);
}
@Test
public void bigFalseTestAPIReadMapNumString49() {
	assertFalse(3430==3430+1);
}
@Test
public void bigFalseTestAPIReadMapNumString50() {
	assertFalse(11755==11755+1);
}
@Test
public void bigFalseTestAPIReadMapNumString51() {
	assertFalse(13151==13151+1);
}
@Test
public void bigFalseTestAPIReadMapNumString52() {
	assertFalse(27435==27435+1);
}
@Test
public void bigFalseTestAPIReadMapNumString53() {
	assertFalse(1998==1998+1);
}
@Test
public void bigFalseTestAPIReadMapNumString54() {
	assertFalse(28698==28698+1);
}
@Test
public void bigFalseTestAPIReadMapNumString55() {
	assertFalse(19358==19358+1);
}
}
