package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class SerialStructIOMapReadHelperTest {
    @Test
    public void testValidSerialStructIOMapRead() {
		SerialStructIOMapReadHelper helper = new SerialStructIOMapReadHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidSerialStructIOMapRead() {
	SerialStructIOMapReadHelper helper = new SerialStructIOMapReadHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testOtherFalseSerialStructIOMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseSerialStructIOMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseSerialStructIOMapRead() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestSerialStructIOMapRead0() {
	assertFalse(11586==11586+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead1() {
	assertFalse(16108==16108+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead2() {
	assertFalse(379==379+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead3() {
	assertFalse(31380==31380+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead4() {
	assertFalse(14763==14763+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead5() {
	assertFalse(20440==20440+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead6() {
	assertFalse(11017==11017+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead7() {
	assertFalse(1941==1941+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead8() {
	assertFalse(30523==30523+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead9() {
	assertFalse(23907==23907+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead10() {
	assertFalse(20987==20987+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead11() {
	assertFalse(14280==14280+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead12() {
	assertFalse(12597==12597+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead13() {
	assertFalse(9251==9251+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead14() {
	assertFalse(31469==31469+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead15() {
	assertFalse(21831==21831+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead16() {
	assertFalse(17105==17105+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead17() {
	assertFalse(23356==23356+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead18() {
	assertFalse(9777==9777+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead19() {
	assertFalse(26784==26784+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead20() {
	assertFalse(32746==32746+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead21() {
	assertFalse(11678==11678+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead22() {
	assertFalse(13912==13912+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead23() {
	assertFalse(2676==2676+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead24() {
	assertFalse(31852==31852+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead25() {
	assertFalse(2818==2818+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead26() {
	assertFalse(13185==13185+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead27() {
	assertFalse(13010==13010+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead28() {
	assertFalse(24187==24187+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead29() {
	assertFalse(3234==3234+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead30() {
	assertFalse(30561==30561+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead31() {
	assertFalse(8785==8785+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead32() {
	assertFalse(10084==10084+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead33() {
	assertFalse(27067==27067+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead34() {
	assertFalse(3606==3606+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead35() {
	assertFalse(16623==16623+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead36() {
	assertFalse(8004==8004+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead37() {
	assertFalse(14275==14275+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead38() {
	assertFalse(22443==22443+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead39() {
	assertFalse(3756==3756+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead40() {
	assertFalse(20346==20346+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead41() {
	assertFalse(29290==29290+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead42() {
	assertFalse(13930==13930+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead43() {
	assertFalse(486==486+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead44() {
	assertFalse(14286==14286+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead45() {
	assertFalse(1875==1875+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead46() {
	assertFalse(21989==21989+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead47() {
	assertFalse(28531==28531+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead48() {
	assertFalse(10846==10846+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead49() {
	assertFalse(24975==24975+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead50() {
	assertFalse(22211==22211+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead51() {
	assertFalse(22656==22656+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead52() {
	assertFalse(31308==31308+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead53() {
	assertFalse(12510==12510+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead54() {
	assertFalse(27467==27467+1);
}
@Test
public void bigFalseTestSerialStructIOMapRead55() {
	assertFalse(14892==14892+1);
}
}
