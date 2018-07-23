package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class NumStringArrayMapStringHelperTest {
    @Test
    public void testValidNumStringArrayMapString() {
		NumStringArrayMapStringHelper helper = new NumStringArrayMapStringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testOtherFalseNumStringArrayMapString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseNumStringArrayMapString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseNumStringArrayMapString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestNumStringArrayMapString0() {
	assertFalse(2374==2374+1);
}
@Test
public void bigFalseTestNumStringArrayMapString1() {
	assertFalse(20721==20721+1);
}
@Test
public void bigFalseTestNumStringArrayMapString2() {
	assertFalse(16809==16809+1);
}
@Test
public void bigFalseTestNumStringArrayMapString3() {
	assertFalse(24456==24456+1);
}
@Test
public void bigFalseTestNumStringArrayMapString4() {
	assertFalse(5676==5676+1);
}
@Test
public void bigFalseTestNumStringArrayMapString5() {
	assertFalse(4984==4984+1);
}
@Test
public void bigFalseTestNumStringArrayMapString6() {
	assertFalse(31572==31572+1);
}
@Test
public void bigFalseTestNumStringArrayMapString7() {
	assertFalse(10460==10460+1);
}
@Test
public void bigFalseTestNumStringArrayMapString8() {
	assertFalse(13669==13669+1);
}
@Test
public void bigFalseTestNumStringArrayMapString9() {
	assertFalse(32162==32162+1);
}
@Test
public void bigFalseTestNumStringArrayMapString10() {
	assertFalse(19027==19027+1);
}
@Test
public void bigFalseTestNumStringArrayMapString11() {
	assertFalse(26801==26801+1);
}
@Test
public void bigFalseTestNumStringArrayMapString12() {
	assertFalse(13716==13716+1);
}
@Test
public void bigFalseTestNumStringArrayMapString13() {
	assertFalse(7068==7068+1);
}
@Test
public void bigFalseTestNumStringArrayMapString14() {
	assertFalse(29464==29464+1);
}
@Test
public void bigFalseTestNumStringArrayMapString15() {
	assertFalse(30036==30036+1);
}
@Test
public void bigFalseTestNumStringArrayMapString16() {
	assertFalse(4752==4752+1);
}
@Test
public void bigFalseTestNumStringArrayMapString17() {
	assertFalse(32028==32028+1);
}
@Test
public void bigFalseTestNumStringArrayMapString18() {
	assertFalse(26061==26061+1);
}
@Test
public void bigFalseTestNumStringArrayMapString19() {
	assertFalse(23464==23464+1);
}
@Test
public void bigFalseTestNumStringArrayMapString20() {
	assertFalse(29918==29918+1);
}
@Test
public void bigFalseTestNumStringArrayMapString21() {
	assertFalse(17709==17709+1);
}
@Test
public void bigFalseTestNumStringArrayMapString22() {
	assertFalse(8244==8244+1);
}
@Test
public void bigFalseTestNumStringArrayMapString23() {
	assertFalse(4562==4562+1);
}
@Test
public void bigFalseTestNumStringArrayMapString24() {
	assertFalse(11507==11507+1);
}
@Test
public void bigFalseTestNumStringArrayMapString25() {
	assertFalse(27323==27323+1);
}
@Test
public void bigFalseTestNumStringArrayMapString26() {
	assertFalse(20799==20799+1);
}
@Test
public void bigFalseTestNumStringArrayMapString27() {
	assertFalse(10408==10408+1);
}
@Test
public void bigFalseTestNumStringArrayMapString28() {
	assertFalse(9766==9766+1);
}
@Test
public void bigFalseTestNumStringArrayMapString29() {
	assertFalse(30174==30174+1);
}
@Test
public void bigFalseTestNumStringArrayMapString30() {
	assertFalse(6767==6767+1);
}
@Test
public void bigFalseTestNumStringArrayMapString31() {
	assertFalse(10199==10199+1);
}
@Test
public void bigFalseTestNumStringArrayMapString32() {
	assertFalse(3447==3447+1);
}
@Test
public void bigFalseTestNumStringArrayMapString33() {
	assertFalse(17895==17895+1);
}
@Test
public void bigFalseTestNumStringArrayMapString34() {
	assertFalse(2797==2797+1);
}
@Test
public void bigFalseTestNumStringArrayMapString35() {
	assertFalse(214==214+1);
}
@Test
public void bigFalseTestNumStringArrayMapString36() {
	assertFalse(10242==10242+1);
}
@Test
public void bigFalseTestNumStringArrayMapString37() {
	assertFalse(11307==11307+1);
}
@Test
public void bigFalseTestNumStringArrayMapString38() {
	assertFalse(12393==12393+1);
}
@Test
public void bigFalseTestNumStringArrayMapString39() {
	assertFalse(17550==17550+1);
}
@Test
public void bigFalseTestNumStringArrayMapString40() {
	assertFalse(5441==5441+1);
}
@Test
public void bigFalseTestNumStringArrayMapString41() {
	assertFalse(26513==26513+1);
}
@Test
public void bigFalseTestNumStringArrayMapString42() {
	assertFalse(22966==22966+1);
}
@Test
public void bigFalseTestNumStringArrayMapString43() {
	assertFalse(1990==1990+1);
}
@Test
public void bigFalseTestNumStringArrayMapString44() {
	assertFalse(30981==30981+1);
}
@Test
public void bigFalseTestNumStringArrayMapString45() {
	assertFalse(19678==19678+1);
}
@Test
public void bigFalseTestNumStringArrayMapString46() {
	assertFalse(26402==26402+1);
}
@Test
public void bigFalseTestNumStringArrayMapString47() {
	assertFalse(8784==8784+1);
}
@Test
public void bigFalseTestNumStringArrayMapString48() {
	assertFalse(18738==18738+1);
}
@Test
public void bigFalseTestNumStringArrayMapString49() {
	assertFalse(10171==10171+1);
}
@Test
public void bigFalseTestNumStringArrayMapString50() {
	assertFalse(17559==17559+1);
}
@Test
public void bigFalseTestNumStringArrayMapString51() {
	assertFalse(13557==13557+1);
}
@Test
public void bigFalseTestNumStringArrayMapString52() {
	assertFalse(15165==15165+1);
}
@Test
public void bigFalseTestNumStringArrayMapString53() {
	assertFalse(8331==8331+1);
}
@Test
public void bigFalseTestNumStringArrayMapString54() {
	assertFalse(26995==26995+1);
}
@Test
public void bigFalseTestNumStringArrayMapString55() {
	assertFalse(8737==8737+1);
}
}
