package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APIProcSerialAPIReadHelperTest {
    @Test
    public void testValidAPIProcSerialAPIRead() {
		APIProcSerialAPIReadHelper helper = new APIProcSerialAPIReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseAPIProcSerialAPIRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead0() {
	assertFalse(28543==28543+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead1() {
	assertFalse(16552==16552+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead2() {
	assertFalse(3664==3664+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead3() {
	assertFalse(10011==10011+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead4() {
	assertFalse(7664==7664+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead5() {
	assertFalse(16767==16767+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead6() {
	assertFalse(31488==31488+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead7() {
	assertFalse(25291==25291+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead8() {
	assertFalse(22149==22149+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead9() {
	assertFalse(14926==14926+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead10() {
	assertFalse(31645==31645+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead11() {
	assertFalse(1318==1318+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead12() {
	assertFalse(17057==17057+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead13() {
	assertFalse(27135==27135+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead14() {
	assertFalse(27862==27862+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead15() {
	assertFalse(30792==30792+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead16() {
	assertFalse(5488==5488+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead17() {
	assertFalse(13026==13026+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead18() {
	assertFalse(3226==3226+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead19() {
	assertFalse(31473==31473+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead20() {
	assertFalse(16067==16067+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead21() {
	assertFalse(19033==19033+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead22() {
	assertFalse(11862==11862+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead23() {
	assertFalse(9744==9744+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead24() {
	assertFalse(28591==28591+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead25() {
	assertFalse(14149==14149+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead26() {
	assertFalse(30443==30443+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead27() {
	assertFalse(16147==16147+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead28() {
	assertFalse(19683==19683+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead29() {
	assertFalse(19251==19251+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead30() {
	assertFalse(23665==23665+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead31() {
	assertFalse(25328==25328+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead32() {
	assertFalse(27341==27341+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead33() {
	assertFalse(583==583+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead34() {
	assertFalse(26030==26030+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead35() {
	assertFalse(22003==22003+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead36() {
	assertFalse(28524==28524+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead37() {
	assertFalse(30180==30180+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead38() {
	assertFalse(25940==25940+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead39() {
	assertFalse(1094==1094+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead40() {
	assertFalse(30195==30195+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead41() {
	assertFalse(20001==20001+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead42() {
	assertFalse(11518==11518+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead43() {
	assertFalse(32578==32578+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead44() {
	assertFalse(4131==4131+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead45() {
	assertFalse(24043==24043+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead46() {
	assertFalse(29673==29673+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead47() {
	assertFalse(888==888+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead48() {
	assertFalse(358==358+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead49() {
	assertFalse(22010==22010+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead50() {
	assertFalse(28018==28018+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead51() {
	assertFalse(21373==21373+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead52() {
	assertFalse(4010==4010+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead53() {
	assertFalse(14965==14965+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead54() {
	assertFalse(19283==19283+1);
}
@Test
public void bigFalseTestAPIProcSerialAPIRead55() {
	assertFalse(29561==29561+1);
}
}
