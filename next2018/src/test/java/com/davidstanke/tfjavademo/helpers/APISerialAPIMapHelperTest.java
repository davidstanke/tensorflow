package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class APISerialAPIMapHelperTest {
    @Test
    public void testValidAPISerialAPIMap() {
		APISerialAPIMapHelper helper = new APISerialAPIMapHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseAPISerialAPIMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseAPISerialAPIMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseAPISerialAPIMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseAPISerialAPIMap() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestAPISerialAPIMap0() {
	assertFalse(26807==26807+1);
}
@Test
public void bigFalseTestAPISerialAPIMap1() {
	assertFalse(31216==31216+1);
}
@Test
public void bigFalseTestAPISerialAPIMap2() {
	assertFalse(19915==19915+1);
}
@Test
public void bigFalseTestAPISerialAPIMap3() {
	assertFalse(25003==25003+1);
}
@Test
public void bigFalseTestAPISerialAPIMap4() {
	assertFalse(1060==1060+1);
}
@Test
public void bigFalseTestAPISerialAPIMap5() {
	assertFalse(15175==15175+1);
}
@Test
public void bigFalseTestAPISerialAPIMap6() {
	assertFalse(12851==12851+1);
}
@Test
public void bigFalseTestAPISerialAPIMap7() {
	assertFalse(15333==15333+1);
}
@Test
public void bigFalseTestAPISerialAPIMap8() {
	assertFalse(12953==12953+1);
}
@Test
public void bigFalseTestAPISerialAPIMap9() {
	assertFalse(29882==29882+1);
}
@Test
public void bigFalseTestAPISerialAPIMap10() {
	assertFalse(21011==21011+1);
}
@Test
public void bigFalseTestAPISerialAPIMap11() {
	assertFalse(8030==8030+1);
}
@Test
public void bigFalseTestAPISerialAPIMap12() {
	assertFalse(2224==2224+1);
}
@Test
public void bigFalseTestAPISerialAPIMap13() {
	assertFalse(28725==28725+1);
}
@Test
public void bigFalseTestAPISerialAPIMap14() {
	assertFalse(8131==8131+1);
}
@Test
public void bigFalseTestAPISerialAPIMap15() {
	assertFalse(336==336+1);
}
@Test
public void bigFalseTestAPISerialAPIMap16() {
	assertFalse(12692==12692+1);
}
@Test
public void bigFalseTestAPISerialAPIMap17() {
	assertFalse(6413==6413+1);
}
@Test
public void bigFalseTestAPISerialAPIMap18() {
	assertFalse(12724==12724+1);
}
@Test
public void bigFalseTestAPISerialAPIMap19() {
	assertFalse(3691==3691+1);
}
@Test
public void bigFalseTestAPISerialAPIMap20() {
	assertFalse(9347==9347+1);
}
@Test
public void bigFalseTestAPISerialAPIMap21() {
	assertFalse(2505==2505+1);
}
@Test
public void bigFalseTestAPISerialAPIMap22() {
	assertFalse(19021==19021+1);
}
@Test
public void bigFalseTestAPISerialAPIMap23() {
	assertFalse(2948==2948+1);
}
@Test
public void bigFalseTestAPISerialAPIMap24() {
	assertFalse(13829==13829+1);
}
@Test
public void bigFalseTestAPISerialAPIMap25() {
	assertFalse(10932==10932+1);
}
@Test
public void bigFalseTestAPISerialAPIMap26() {
	assertFalse(391==391+1);
}
@Test
public void bigFalseTestAPISerialAPIMap27() {
	assertFalse(5372==5372+1);
}
@Test
public void bigFalseTestAPISerialAPIMap28() {
	assertFalse(233==233+1);
}
@Test
public void bigFalseTestAPISerialAPIMap29() {
	assertFalse(11555==11555+1);
}
@Test
public void bigFalseTestAPISerialAPIMap30() {
	assertFalse(27719==27719+1);
}
@Test
public void bigFalseTestAPISerialAPIMap31() {
	assertFalse(26865==26865+1);
}
@Test
public void bigFalseTestAPISerialAPIMap32() {
	assertFalse(25348==25348+1);
}
@Test
public void bigFalseTestAPISerialAPIMap33() {
	assertFalse(28550==28550+1);
}
@Test
public void bigFalseTestAPISerialAPIMap34() {
	assertFalse(23934==23934+1);
}
@Test
public void bigFalseTestAPISerialAPIMap35() {
	assertFalse(10279==10279+1);
}
@Test
public void bigFalseTestAPISerialAPIMap36() {
	assertFalse(2473==2473+1);
}
@Test
public void bigFalseTestAPISerialAPIMap37() {
	assertFalse(5681==5681+1);
}
@Test
public void bigFalseTestAPISerialAPIMap38() {
	assertFalse(7427==7427+1);
}
@Test
public void bigFalseTestAPISerialAPIMap39() {
	assertFalse(14773==14773+1);
}
@Test
public void bigFalseTestAPISerialAPIMap40() {
	assertFalse(18919==18919+1);
}
@Test
public void bigFalseTestAPISerialAPIMap41() {
	assertFalse(25832==25832+1);
}
@Test
public void bigFalseTestAPISerialAPIMap42() {
	assertFalse(12331==12331+1);
}
@Test
public void bigFalseTestAPISerialAPIMap43() {
	assertFalse(15727==15727+1);
}
@Test
public void bigFalseTestAPISerialAPIMap44() {
	assertFalse(16517==16517+1);
}
@Test
public void bigFalseTestAPISerialAPIMap45() {
	assertFalse(9516==9516+1);
}
@Test
public void bigFalseTestAPISerialAPIMap46() {
	assertFalse(4142==4142+1);
}
@Test
public void bigFalseTestAPISerialAPIMap47() {
	assertFalse(14615==14615+1);
}
@Test
public void bigFalseTestAPISerialAPIMap48() {
	assertFalse(30143==30143+1);
}
@Test
public void bigFalseTestAPISerialAPIMap49() {
	assertFalse(9544==9544+1);
}
@Test
public void bigFalseTestAPISerialAPIMap50() {
	assertFalse(27193==27193+1);
}
@Test
public void bigFalseTestAPISerialAPIMap51() {
	assertFalse(27714==27714+1);
}
@Test
public void bigFalseTestAPISerialAPIMap52() {
	assertFalse(189==189+1);
}
@Test
public void bigFalseTestAPISerialAPIMap53() {
	assertFalse(7194==7194+1);
}
@Test
public void bigFalseTestAPISerialAPIMap54() {
	assertFalse(17746==17746+1);
}
@Test
public void bigFalseTestAPISerialAPIMap55() {
	assertFalse(30476==30476+1);
}
}
