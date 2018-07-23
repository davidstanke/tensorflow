package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumStringSerialUtilStreamHelperTest {
    @Test
    public void testValidNumStringSerialUtilStream() {
		NumStringSerialUtilStreamHelper helper = new NumStringSerialUtilStreamHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidNumStringSerialUtilStream() {
	NumStringSerialUtilStreamHelper helper = new NumStringSerialUtilStreamHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseNumStringSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseNumStringSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseNumStringSerialUtilStream() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStringSerialUtilStream0() {
	assertFalse(8273==8273+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream1() {
	assertFalse(21595==21595+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream2() {
	assertFalse(18806==18806+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream3() {
	assertFalse(5295==5295+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream4() {
	assertFalse(17313==17313+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream5() {
	assertFalse(28563==28563+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream6() {
	assertFalse(9107==9107+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream7() {
	assertFalse(21346==21346+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream8() {
	assertFalse(13444==13444+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream9() {
	assertFalse(4390==4390+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream10() {
	assertFalse(12876==12876+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream11() {
	assertFalse(29525==29525+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream12() {
	assertFalse(17417==17417+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream13() {
	assertFalse(28684==28684+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream14() {
	assertFalse(9262==9262+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream15() {
	assertFalse(7863==7863+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream16() {
	assertFalse(2688==2688+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream17() {
	assertFalse(1511==1511+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream18() {
	assertFalse(14954==14954+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream19() {
	assertFalse(28876==28876+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream20() {
	assertFalse(31668==31668+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream21() {
	assertFalse(29831==29831+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream22() {
	assertFalse(11637==11637+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream23() {
	assertFalse(21589==21589+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream24() {
	assertFalse(744==744+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream25() {
	assertFalse(14394==14394+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream26() {
	assertFalse(16224==16224+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream27() {
	assertFalse(23741==23741+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream28() {
	assertFalse(25234==25234+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream29() {
	assertFalse(13012==13012+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream30() {
	assertFalse(6133==6133+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream31() {
	assertFalse(1544==1544+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream32() {
	assertFalse(21465==21465+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream33() {
	assertFalse(23425==23425+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream34() {
	assertFalse(18069==18069+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream35() {
	assertFalse(1915==1915+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream36() {
	assertFalse(8656==8656+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream37() {
	assertFalse(8013==8013+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream38() {
	assertFalse(1492==1492+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream39() {
	assertFalse(9484==9484+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream40() {
	assertFalse(15472==15472+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream41() {
	assertFalse(15984==15984+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream42() {
	assertFalse(7377==7377+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream43() {
	assertFalse(11144==11144+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream44() {
	assertFalse(32599==32599+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream45() {
	assertFalse(12891==12891+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream46() {
	assertFalse(31319==31319+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream47() {
	assertFalse(902==902+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream48() {
	assertFalse(10307==10307+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream49() {
	assertFalse(26755==26755+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream50() {
	assertFalse(26037==26037+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream51() {
	assertFalse(1807==1807+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream52() {
	assertFalse(14669==14669+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream53() {
	assertFalse(24048==24048+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream54() {
	assertFalse(24925==24925+1);
}
@Test
public void bigFalseTestNumStringSerialUtilStream55() {
	assertFalse(1546==1546+1);
}
}
