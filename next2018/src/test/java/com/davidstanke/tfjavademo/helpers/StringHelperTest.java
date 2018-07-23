package com.davidstanke.tfjavademo.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

public class StringHelperTest {
    @Test
    public void testValidString() {
		StringHelper helper = new StringHelper();
		assertEquals(helper.help(),"valid");
    }
@Test
public void testDoubleValidString() {
	StringHelper helper = new StringHelper();
	assertEquals(helper.help() + helper.help(),"validvalid");
}
@Test
public void testFalseString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testOtherFalseString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testAnotherFalseString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void testThisFalseString() {
	assertFalse(1==2);
	assertFalse(2==3);
	assertFalse(1==3);
}
@Test
public void bigFalseTestString0() {
	assertFalse(24726==24726+1);
}
@Test
public void bigFalseTestString1() {
	assertFalse(12702==12702+1);
}
@Test
public void bigFalseTestString2() {
	assertFalse(20497==20497+1);
}
@Test
public void bigFalseTestString3() {
	assertFalse(10836==10836+1);
}
@Test
public void bigFalseTestString4() {
	assertFalse(5122==5122+1);
}
@Test
public void bigFalseTestString5() {
	assertFalse(29155==29155+1);
}
@Test
public void bigFalseTestString6() {
	assertFalse(28931==28931+1);
}
@Test
public void bigFalseTestString7() {
	assertFalse(19443==19443+1);
}
@Test
public void bigFalseTestString8() {
	assertFalse(24540==24540+1);
}
@Test
public void bigFalseTestString9() {
	assertFalse(12552==12552+1);
}
@Test
public void bigFalseTestString10() {
	assertFalse(32316==32316+1);
}
@Test
public void bigFalseTestString11() {
	assertFalse(25519==25519+1);
}
@Test
public void bigFalseTestString12() {
	assertFalse(21917==21917+1);
}
@Test
public void bigFalseTestString13() {
	assertFalse(32035==32035+1);
}
@Test
public void bigFalseTestString14() {
	assertFalse(5311==5311+1);
}
@Test
public void bigFalseTestString15() {
	assertFalse(21191==21191+1);
}
@Test
public void bigFalseTestString16() {
	assertFalse(19399==19399+1);
}
@Test
public void bigFalseTestString17() {
	assertFalse(24265==24265+1);
}
@Test
public void bigFalseTestString18() {
	assertFalse(13535==13535+1);
}
@Test
public void bigFalseTestString19() {
	assertFalse(11466==11466+1);
}
@Test
public void bigFalseTestString20() {
	assertFalse(745==745+1);
}
@Test
public void bigFalseTestString21() {
	assertFalse(24668==24668+1);
}
@Test
public void bigFalseTestString22() {
	assertFalse(1441==1441+1);
}
@Test
public void bigFalseTestString23() {
	assertFalse(28096==28096+1);
}
@Test
public void bigFalseTestString24() {
	assertFalse(7760==7760+1);
}
@Test
public void bigFalseTestString25() {
	assertFalse(15896==15896+1);
}
@Test
public void bigFalseTestString26() {
	assertFalse(29135==29135+1);
}
@Test
public void bigFalseTestString27() {
	assertFalse(26393==26393+1);
}
@Test
public void bigFalseTestString28() {
	assertFalse(27789==27789+1);
}
@Test
public void bigFalseTestString29() {
	assertFalse(2781==2781+1);
}
@Test
public void bigFalseTestString30() {
	assertFalse(31452==31452+1);
}
@Test
public void bigFalseTestString31() {
	assertFalse(3929==3929+1);
}
@Test
public void bigFalseTestString32() {
	assertFalse(15275==15275+1);
}
@Test
public void bigFalseTestString33() {
	assertFalse(21946==21946+1);
}
@Test
public void bigFalseTestString34() {
	assertFalse(23931==23931+1);
}
@Test
public void bigFalseTestString35() {
	assertFalse(8321==8321+1);
}
@Test
public void bigFalseTestString36() {
	assertFalse(13613==13613+1);
}
@Test
public void bigFalseTestString37() {
	assertFalse(7229==7229+1);
}
@Test
public void bigFalseTestString38() {
	assertFalse(25598==25598+1);
}
@Test
public void bigFalseTestString39() {
	assertFalse(12604==12604+1);
}
@Test
public void bigFalseTestString40() {
	assertFalse(32201==32201+1);
}
@Test
public void bigFalseTestString41() {
	assertFalse(5501==5501+1);
}
@Test
public void bigFalseTestString42() {
	assertFalse(623==623+1);
}
@Test
public void bigFalseTestString43() {
	assertFalse(13519==13519+1);
}
@Test
public void bigFalseTestString44() {
	assertFalse(5351==5351+1);
}
@Test
public void bigFalseTestString45() {
	assertFalse(8675==8675+1);
}
@Test
public void bigFalseTestString46() {
	assertFalse(6256==6256+1);
}
@Test
public void bigFalseTestString47() {
	assertFalse(3517==3517+1);
}
@Test
public void bigFalseTestString48() {
	assertFalse(12248==12248+1);
}
@Test
public void bigFalseTestString49() {
	assertFalse(27581==27581+1);
}
@Test
public void bigFalseTestString50() {
	assertFalse(29906==29906+1);
}
@Test
public void bigFalseTestString51() {
	assertFalse(7997==7997+1);
}
@Test
public void bigFalseTestString52() {
	assertFalse(3287==3287+1);
}
@Test
public void bigFalseTestString53() {
	assertFalse(1153==1153+1);
}
@Test
public void bigFalseTestString54() {
	assertFalse(30456==30456+1);
}
@Test
public void bigFalseTestString55() {
	assertFalse(2397==2397+1);
}
}
