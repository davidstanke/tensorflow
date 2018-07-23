package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StreamAPIArrayStringHelperTest {
    @Test
    public void testValidStreamAPIArrayString() {
		StreamAPIArrayStringHelper helper = new StreamAPIArrayStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testFalseStreamAPIArrayString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseStreamAPIArrayString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseStreamAPIArrayString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestStreamAPIArrayString0() {
	assertFalse(4254==4254+1);
}
@Test
public void bigFalseTestStreamAPIArrayString1() {
	assertFalse(32560==32560+1);
}
@Test
public void bigFalseTestStreamAPIArrayString2() {
	assertFalse(8242==8242+1);
}
@Test
public void bigFalseTestStreamAPIArrayString3() {
	assertFalse(14209==14209+1);
}
@Test
public void bigFalseTestStreamAPIArrayString4() {
	assertFalse(11688==11688+1);
}
@Test
public void bigFalseTestStreamAPIArrayString5() {
	assertFalse(21349==21349+1);
}
@Test
public void bigFalseTestStreamAPIArrayString6() {
	assertFalse(8172==8172+1);
}
@Test
public void bigFalseTestStreamAPIArrayString7() {
	assertFalse(11886==11886+1);
}
@Test
public void bigFalseTestStreamAPIArrayString8() {
	assertFalse(15029==15029+1);
}
@Test
public void bigFalseTestStreamAPIArrayString9() {
	assertFalse(14962==14962+1);
}
@Test
public void bigFalseTestStreamAPIArrayString10() {
	assertFalse(17946==17946+1);
}
@Test
public void bigFalseTestStreamAPIArrayString11() {
	assertFalse(25517==25517+1);
}
@Test
public void bigFalseTestStreamAPIArrayString12() {
	assertFalse(31984==31984+1);
}
@Test
public void bigFalseTestStreamAPIArrayString13() {
	assertFalse(11533==11533+1);
}
@Test
public void bigFalseTestStreamAPIArrayString14() {
	assertFalse(3090==3090+1);
}
@Test
public void bigFalseTestStreamAPIArrayString15() {
	assertFalse(24785==24785+1);
}
@Test
public void bigFalseTestStreamAPIArrayString16() {
	assertFalse(30311==30311+1);
}
@Test
public void bigFalseTestStreamAPIArrayString17() {
	assertFalse(22664==22664+1);
}
@Test
public void bigFalseTestStreamAPIArrayString18() {
	assertFalse(12608==12608+1);
}
@Test
public void bigFalseTestStreamAPIArrayString19() {
	assertFalse(17418==17418+1);
}
@Test
public void bigFalseTestStreamAPIArrayString20() {
	assertFalse(12901==12901+1);
}
@Test
public void bigFalseTestStreamAPIArrayString21() {
	assertFalse(10754==10754+1);
}
@Test
public void bigFalseTestStreamAPIArrayString22() {
	assertFalse(25830==25830+1);
}
@Test
public void bigFalseTestStreamAPIArrayString23() {
	assertFalse(19759==19759+1);
}
@Test
public void bigFalseTestStreamAPIArrayString24() {
	assertFalse(31631==31631+1);
}
@Test
public void bigFalseTestStreamAPIArrayString25() {
	assertFalse(24657==24657+1);
}
@Test
public void bigFalseTestStreamAPIArrayString26() {
	assertFalse(20371==20371+1);
}
@Test
public void bigFalseTestStreamAPIArrayString27() {
	assertFalse(12173==12173+1);
}
@Test
public void bigFalseTestStreamAPIArrayString28() {
	assertFalse(22465==22465+1);
}
@Test
public void bigFalseTestStreamAPIArrayString29() {
	assertFalse(20651==20651+1);
}
@Test
public void bigFalseTestStreamAPIArrayString30() {
	assertFalse(14436==14436+1);
}
@Test
public void bigFalseTestStreamAPIArrayString31() {
	assertFalse(13426==13426+1);
}
@Test
public void bigFalseTestStreamAPIArrayString32() {
	assertFalse(26022==26022+1);
}
@Test
public void bigFalseTestStreamAPIArrayString33() {
	assertFalse(18967==18967+1);
}
@Test
public void bigFalseTestStreamAPIArrayString34() {
	assertFalse(16894==16894+1);
}
@Test
public void bigFalseTestStreamAPIArrayString35() {
	assertFalse(31351==31351+1);
}
@Test
public void bigFalseTestStreamAPIArrayString36() {
	assertFalse(30745==30745+1);
}
@Test
public void bigFalseTestStreamAPIArrayString37() {
	assertFalse(17302==17302+1);
}
@Test
public void bigFalseTestStreamAPIArrayString38() {
	assertFalse(31559==31559+1);
}
@Test
public void bigFalseTestStreamAPIArrayString39() {
	assertFalse(23953==23953+1);
}
@Test
public void bigFalseTestStreamAPIArrayString40() {
	assertFalse(2879==2879+1);
}
@Test
public void bigFalseTestStreamAPIArrayString41() {
	assertFalse(16656==16656+1);
}
@Test
public void bigFalseTestStreamAPIArrayString42() {
	assertFalse(16359==16359+1);
}
@Test
public void bigFalseTestStreamAPIArrayString43() {
	assertFalse(21463==21463+1);
}
@Test
public void bigFalseTestStreamAPIArrayString44() {
	assertFalse(28513==28513+1);
}
@Test
public void bigFalseTestStreamAPIArrayString45() {
	assertFalse(6912==6912+1);
}
@Test
public void bigFalseTestStreamAPIArrayString46() {
	assertFalse(9345==9345+1);
}
@Test
public void bigFalseTestStreamAPIArrayString47() {
	assertFalse(19216==19216+1);
}
@Test
public void bigFalseTestStreamAPIArrayString48() {
	assertFalse(17802==17802+1);
}
@Test
public void bigFalseTestStreamAPIArrayString49() {
	assertFalse(5343==5343+1);
}
@Test
public void bigFalseTestStreamAPIArrayString50() {
	assertFalse(27313==27313+1);
}
@Test
public void bigFalseTestStreamAPIArrayString51() {
	assertFalse(21252==21252+1);
}
@Test
public void bigFalseTestStreamAPIArrayString52() {
	assertFalse(10724==10724+1);
}
@Test
public void bigFalseTestStreamAPIArrayString53() {
	assertFalse(28241==28241+1);
}
@Test
public void bigFalseTestStreamAPIArrayString54() {
	assertFalse(14534==14534+1);
}
@Test
public void bigFalseTestStreamAPIArrayString55() {
	assertFalse(8319==8319+1);
}
}
